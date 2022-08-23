package com.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class Demo10 {
	public static void main(String[] args) throws Exception {
		//获取字节码文件对象
		Class clazz = Class.forName("com.annotation.A");
		
		//获取注解对象
		//Annotation annotation = clazz.getAnnotation(A_anno.class);
		A_anno a_anno = (A_anno)clazz.getAnnotation(A_anno.class);
		
		//获取属性值
		String name = a_anno.name();
		int age = a_anno.age();
		
		System.out.println(name + "..." + age);
	}
}

@Retention(RetentionPolicy.RUNTIME)
@interface A_anno {
	String name();
	int age();
}

@A_anno(name="tom",age=18)
class A {
	
}