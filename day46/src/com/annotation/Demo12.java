package com.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

public class Demo12 {
	public static void main(String[] args) throws Exception {
		//获取字节码文件对象
		Class clazz = Class.forName("com.annotation.C");
		
		//获取成员方法对象
		Method showMethod = clazz.getMethod("show");
		
		//获取注解对象
		C_anno c_anno = showMethod.getAnnotation(C_anno.class);
		
		//获取属性值
		String name = c_anno.name();
		int age = c_anno.age();
		
		System.out.println(name + "..." + age);
	}
}

@Retention(RetentionPolicy.RUNTIME)
@interface C_anno {
	String name();
	int age();
}

class C {
	@C_anno(name="rose",age=16)
	public void show() {
		
	}
}