package com.reflect;

import java.lang.reflect.Field;

public class Demo03 {
	public static void main(String[] args) throws Exception {	
		//获取字节码文件对象
		Class clazz = Class.forName("com.reflect.Dog");
		
		//获取对象
		Dog dog = (Dog)clazz.newInstance();
		
		/*//public Field getField(String name)
		Field nameField = clazz.getField("name");
		
		//public void set(Object obj,Object value)
		nameField.set(dog, "tom");
		
		//public Object get(Object obj)
		Object nameValue = nameField.get(dog);
		System.out.println(nameValue);*/
		
		/*//public Field getDeclaredField(String name)
		Field ageField = clazz.getDeclaredField("age");
		ageField.set(dog, 18);*/
		
		/*Field sexField = clazz.getDeclaredField("sex");
		sexField.setAccessible(true);
		sexField.set(dog, "公");*/
		
		Field nameField = clazz.getDeclaredField("name");
		nameField.set(dog, "tom");
		Field ageField = clazz.getDeclaredField("age");
		ageField.set(dog, 18);
		Field sexField = clazz.getDeclaredField("sex");
		sexField.setAccessible(true);
		sexField.set(dog, "母");
		
		System.out.println(dog);
	}
}

class Dog {
	public String name;
	int age;
	private String sex;
	
	@Override
	public String toString() {
		return "Dog [name=" + name + ", age=" + age + ", sex=" + sex + "]";
	}
}