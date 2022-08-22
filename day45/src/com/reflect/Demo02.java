package com.reflect;

import java.lang.reflect.Constructor;

public class Demo02 {
	public static void main(String[] args) throws Exception {
		//获取字节码文件对象
		Class clazz = Class.forName("com.reflect.Pig");
		
		/*//public Constructor<T> getConstructor(Class<?>... parameterTypes)
		Constructor con1 = clazz.getConstructor();
		//public T newInstance(Object... initargs)
		Pig pig1 = (Pig)con1.newInstance();
		System.out.println(pig1);
		
		//public Constructor<T> getConstructor(Class<?>... parameterTypes)
		Constructor con2 = clazz.getConstructor(String.class, int.class);
		//public T newInstance(Object... initargs)
		Pig pig2 = (Pig)con2.newInstance("tom", 18);
		System.out.println(pig2);*/
		
		/*//获取构造方法对象
		//public Constructor<T> getDeclaredConstructor(Class<?>... parameterTypes)
		Constructor con = clazz.getDeclaredConstructor(String.class);
		//public void setAccessible(boolean flag)
		con.setAccessible(true);
		Pig p = (Pig)con.newInstance("jerry");
		System.out.println(p);*/
	
		/*//public Constructor<?>[] getConstructors()
		Constructor[] cons = clazz.getConstructors();
		for (Constructor con : cons) {
			System.out.println(con);
		}*/
		
		/*//public Constructor<?>[] getDeclaredConstructors()
		Constructor[] cons = clazz.getDeclaredConstructors();
		for (Constructor con : cons) {
			System.out.println(con);
		}*/
	}
}

class Pig {
	private String name;
	private int age;
	
	public Pig() {}
	
	public Pig(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	private Pig(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Pig [name=" + name + ", age=" + age + "]";
	}
	
	
}
