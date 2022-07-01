package com.inner;

public class Demo07 {
	public static void main(String[] args) {
		//创建匿名子类对象
		/*new Animal() {
			
		};*/
		
		/*new Animal() {
			public void eat() {
				System.out.println("吃肉");
			}
		};*/
		
		/*new Animal() {
			public void eat() {
				System.out.println("吃肉");
			}
			
			public void drink() {
				System.out.println("喝水");
			}
		};*/
		
		//new Animal() {}.eat();
		
		/*new Animal() {
			public void eat() {
				System.out.println("吃肉");
			}
		}.eat();*/
		
		/*new Animal() {
			public void drink() {
				System.out.println("喝水");
			}
		}.drink();*/
		
		/*Animal an = new Animal() {};
		an.eat();*/
		
		/*Animal an = new Animal() {
			public void eat() {
				System.out.println("吃肉");
			}
		};
		an.eat();*/
		
		Animal an = new Animal() {
			public void eat() {
				System.out.println("吃肉");
			}
			
			public void drink() {
				System.out.println("喝水");
			}
		};
		an.eat();
		//an.drink();
	}
}

class Animal {
	public void eat() {
		System.out.println("吃");
	}
}
