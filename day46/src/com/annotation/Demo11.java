package com.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;

public class Demo11 {
	public static void main(String[] args) throws Exception {
		//获取字节码文件对象
		Class clazz = Class.forName("com.annotation.B");
		
		//获取成员变量的对象
		Field iField = clazz.getDeclaredField("i");
		
		//获取注解对象
		B_anno b_anno = iField.getAnnotation(B_anno.class);
		
		//获取属性值
		String name = b_anno.name();
		int age = b_anno.age();
		
		System.out.println(name + "..." + age);
	}
}

@Retention(RetentionPolicy.RUNTIME)
@interface B_anno {
	String name();
	int age();
}

class B {
	@B_anno(name="jerry",age=19)
	int i;
}
