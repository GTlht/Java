package com.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@AAA(className="com.annotation.Pig", methodName="eat")
public class Demo14 {
	public static void main(String[] args) throws Exception {
		//获取字节码文件对象
		Class clazz = Class.forName("com.annotation.Demo14");
		
		//获取注解对象
		AAA aaa = (AAA)clazz.getAnnotation(AAA.class);
		
		//获取属性值
		String className = aaa.className();
		String methodName = aaa.methodName();
		
		//获取字节码文件对象
		Class clazz1 = Class.forName(className);
		
		//获取方法对象
		Method method = clazz1.getMethod(methodName);
		
		//调用方法
		method.invoke(clazz1.newInstance());
	}
}

@Retention(RetentionPolicy.RUNTIME)
@interface AAA {
	String className();
	String methodName();
}