package com.reflect;

import java.lang.reflect.Method;

public class Demo04 {
	public static void main(String[] args) throws Exception {
		//获取字节码文件对象
		Class clazz = Class.forName("com.reflect.Student");
		
		//通过字节码文件对象来获取对象
		Student s = (Student)clazz.newInstance();
		
		/*//public Method getMethod(String name, Class<?>... parameterTypes)
		Method eatMethod = clazz.getMethod("eat");
		
		//public Object invoke(Object obj,Object... args)
		eatMethod.invoke(s);*/
		
		/*//public Method getDeclaredMethod(String name,Class<?>... parameterTypes)
		Method drinkMethod = clazz.getDeclaredMethod("drink");
		drinkMethod.invoke(s);*/
		
		/*Method sleepMethod = clazz.getDeclaredMethod("sleep");
		sleepMethod.setAccessible(true);
		sleepMethod.invoke(s);*/
		
		System.out.println(s);
		
		Method setNameMethod = clazz.getMethod("setName", String.class);
		setNameMethod.invoke(s, "tom");
		
		System.out.println(s);
		
		Method getNameMethod = clazz.getMethod("getName");
		Object returnValue = getNameMethod.invoke(s);
		System.out.println(returnValue);
		
	}
}

class Student {
	private String name;
	
	public void eat() {
		System.out.println("吃肉");
	}
	
	void drink() {
		System.out.println("喝奶");
	}
	
	private void sleep() {
		System.out.println("睡觉");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}
}
