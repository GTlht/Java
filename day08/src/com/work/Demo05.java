package com.work;

/*
5.分析以下需求，并用代码实现
	1.猫类Cat		
		属性:
			毛的颜色color
			品种breed
		行为:
			吃饭eat()
			抓老鼠catchMouse()

	2.狗类Dog
		属性:
			毛的颜色color
			品种breed
		行为:
			吃饭()
			看家lookHome()
 */
public class Demo05 {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.setColor("黄色");
		dog.setBreed("撒皮");
		System.out.println(dog.getColor() + "..." + dog.getBreed());
		dog.eat();
		dog.lookHome();
	}
}

class Dog {
	private String color;
	private String breed;
	
	public String getColor() {
		return color;
	}
	public void setColor(String c) {
		color = c;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String b) {
		breed = b;
	}
	public void eat() {
		System.out.println("吃骨头");
	}
	public void lookHome() {
		System.out.println("看家");
	}
}
