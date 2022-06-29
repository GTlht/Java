package com.constructor;

public class Demo04 {
	public static void main(String[] args) {
		Cat c = new Cat("tom", 18);
		
		/*c.setName("tom");
		c.setAge(18);*/
		
		System.out.println(c.getName() + "..." + c.getAge());
	}
}

class Cat {
	private String name;
	private int age;
	
	/*public Cat() {}*/
	
	public Cat(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	/*public Cat() {}*/
	
	
}
