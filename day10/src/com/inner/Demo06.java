package com.inner;

public class Demo06 {
	public static void main(String[] args) {
		//需求：创建Person对象
		Person p = new Person();
		
		//需求：创建Person的匿名对象
		new Person();
		
		//需求：创建Person的子类对象
		//Student s = new Student();
		
		//需求：创建Person的匿名的子类对象
		//new Student();
		
		//需求：创建Person的匿名的子类对象(不能额外自己添加新的类)
		new Person() {
			
		};
	}
}

class Person {
	
}

/*class Student extends Person {
	
}*/
