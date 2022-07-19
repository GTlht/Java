package com.decorative;

public class Demo02 {
	public static void main(String[] args) {
		Tony tony = new Tony();
		tony.eat();
		tony.sleep();
		tony.drink();
		tony.run();
		tony.jump();
		
		System.out.println("---------------------------");
		
		Ironman ironman = new Ironman(tony);
		ironman.eat();
		ironman.sleep();
		ironman.drink();
		ironman.run();
		ironman.jump();
	}
}

abstract class Person {
	public abstract void eat();
	
	public abstract void drink();

	public abstract void sleep();
	
	public abstract void run();
	
	public abstract void jump();
}

class Tony extends Person {
	@Override
	public void eat() {
		System.out.println("吃肉");
	}

	@Override
	public void drink() {
		System.out.println("喝牛奶");
	}

	@Override
	public void sleep() {
		System.out.println("睡觉");
	}

	@Override
	public void run() {
		System.out.println("正常跑");
	}

	@Override
	public void jump() {
		System.out.println("正常跳");
	}
}

class Ironman extends Person {
	private Person person;
	
	public Ironman(Person person) {
		this.person = person;
	}
	
	@Override
	public void eat() {//功能没有增强
		person.eat();
	}

	@Override
	public void drink() {//功能没有增强
		person.drink();
	}

	@Override
	public void sleep() {//功能没有增强
		person.sleep();
	}

	@Override
	public void run() {//功能增强
		System.out.println("超级跑");
	}

	@Override
	public void jump() {//功能增强
		System.out.println("超级跳");
	}
} 
