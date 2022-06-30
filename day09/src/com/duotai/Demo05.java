package com.duotai;

public class Demo05 {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		Pig pig = new Pig();
		Bird bird = new Bird();
		Panada panada = new Panada();
		
		Person p = new Person();
		p.feed(dog);
		p.feed(cat);
		p.feed(pig);
		p.feed(bird);
		p.feed(panada);
	}
}

class Animal {
	public void eat() {
		System.out.println("吃");
	}
	
	public void drink() {
		System.out.println("喝");
	}
}

class Dog extends Animal {
	public void eat() {
		System.out.println("吃骨头");
	}
	
	public void drink() {
		System.out.println("喝水");
	}
	
	public void swimming() {
		System.out.println("狗刨");
	}
}

class Cat extends Animal {
	public void eat() {
		System.out.println("吃排骨肉");
	}
	
	public void drink() {
		System.out.println("喝奶");
	}
}

class Pig extends Animal {
	public void eat() {
		System.out.println("吃白菜");
	}
	
	public void drink() {
		System.out.println("喝水");
	}
	
	public void gong() {
		System.out.println("拱树");
	}
}

class Panada extends Animal {
	public void eat() {
		System.out.println("吃竹子");
	}
	
	public void drink() {
		System.out.println("喝可乐");
	}
}

class Bird extends Animal {
	public void eat() {
		System.out.println("吃虫子");
	}
	
	public void drink() {
		System.out.println("喝甘露");
	}
	
	public void fly() {
		System.out.println("飞行");
	}
}

class Person {
	/*//饲养狗
	public void feed(Dog dog) {
		dog.eat();
		dog.drink();
	}
	
	//饲养猫
	public void feed(Cat cat) {
		cat.eat();
		cat.drink();
	}
	
	//饲养猪
	public void feed(Pig pig) {
		pig.eat();
		pig.drink();
	}
	
	//饲养鸟
	public void feed(Bird bird) {
		bird.eat();
		bird.drink();
	}*/
	
	//饲养动物
	public void feed(Animal animal) {
		animal.eat();
		animal.drink();
		if(animal instanceof Dog) {//判断是狗
			Dog dog = (Dog)animal;
			dog.swimming();
		} else if(animal instanceof Pig) {//判断是猪
			Pig pig = (Pig)animal;
			pig.gong();
		} else if(animal instanceof Bird) {//判断是鸟
			Bird bird = (Bird)animal;
			bird.fly();
		}
	}
}