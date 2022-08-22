package com.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Demo05 {
	public static void main(String[] args) throws Exception {
		Class clazz = Class.forName("com.reflect.Cat");
		
		/*Field[] fields = clazz.getFields();
		for (Field field : fields) {
			System.out.println(field);
		}*/
		
		/*Field[] fields = clazz.getDeclaredFields();
		for (Field field : fields) {
			System.out.println(field);
		}*/
		
		/*Method[] methods = clazz.getMethods();
		for (Method method : methods) {
			System.out.println(method);
		}*/
		
		Method[] methods = clazz.getDeclaredMethods();
		for (Method method : methods) {
			System.out.println(method);
		}
	}
}

class Cat {
	public String name;
	int age;
	private String sex;
	
	public void eat() {
		System.out.println("吃鱼");
	}
	
	void drink() {
		System.out.println("喝水");
	}
	
	private void sleep() {
		System.out.println("睡觉");
	}
}
