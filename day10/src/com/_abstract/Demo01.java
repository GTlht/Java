package com._abstract;

public class Demo01 {
	public static void main(String[] args) {

	}
}

/*
abstract class Person {
	public abstract void eat();
}
*/

abstract class Person {
	public void eat() {
		
	}
	
	public abstract void drink();
	public abstract void sleep();
}

/*class Student extends Person {
	public void drink() {}
	public void sleep() {}
}*/
abstract class Student extends Person {
	
}