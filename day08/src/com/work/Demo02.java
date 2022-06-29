package com.work;
/*
2.分析以下需求，并用代码实现
  动物类:
	属性:年龄
	行为:喝水,吃东西
	行为:游泳方法
  狗类:
 	行为:吃饭(啃骨头)和 游泳(狗刨)
  羊类:
 	行为:吃饭(羊啃草)
  青蛙类:
  	行为:吃饭(吃虫子)和 游泳(蛙泳)
  饲养员类:
  	行为:饲养动物:包括吃饭和喝水
*/
public class Demo02 {
	public static void main(String[] args) {
		
	}
}

class Animal {
	private int age;
	
	public void setAge(int a) {
		age = a;
	}
	
	public int getAge() {
		return age;
	}
	
	public void drink() {
		System.out.println("喝水");
	}
	
	public void eat() {
		System.out.println("吃");
	}
	
	public void swimming() {
		System.out.println("游泳");
	}
}

/*class Dog {
	public void eat() {
		System.out.println("吃骨头");
	}
	
	public void swimming() {
		System.out.println("狗刨");
	}
}

class Sheep {
	public void eat() {
		System.out.println("吃草");
	}
}*/

class Frog {
	public void eat() {
		System.out.println("吃虫子");
	}
	
	public void swimming() {
		System.out.println("蛙泳");
	}
}

class Feeder {
	//行为:饲养动物:包括吃饭和喝水
	public void feed(Animal animal) {
		animal.eat();
		animal.drink();
	}
}

