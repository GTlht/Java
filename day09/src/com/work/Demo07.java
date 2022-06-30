package com.work;

/*
10.根据需求完成代码:
	1.定义动物类
		属性：
			年龄，颜色
		行为:
			eat(String something)方法(无具体行为,不同动物吃的方式和东西不一样,something表示吃的东西)
			生成空参有参构造，set和get方法

	2.定义狗类继承动物类	  
		行为:
			eat(String something)方法,看家lookHome方法(无参数)

	3.定义猫类继承动物类
		行为:eat(String something)方法,逮老鼠catchMouse方法(无参数)

	4.定义Person类
		属性：
			姓名，年龄
		行为：
			keepPet(Dog dog,String something)方法
				功能：喂养宠物狗，something表示喂养的东西
		行为：
			keepPet(Cat cat,String something)方法
				功能：喂养宠物猫，something表示喂养的东西
		生成空参有参构造，set和get方法
		
	5.测试以上方法
*/

public class Demo07 {
	public static void main(String[] args) {
		Dog dog = new Dog(18, "黑色");
		Cat cat = new Cat(19, "咖啡色");
		Person2 p = new Person2("tom", 18);
		p.keepPet(dog, "骨头");
		p.keepPet(cat, "鱼头");
	}
}

class Animal {
	private int age;
	private String color;
	
	public Animal() {}

	public Animal(int age, String color) {
		super();
		this.age = age;
		this.color = color;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public void eat(String something) {
		System.out.println("喜欢吃" + something);
	}
}

class Dog extends Animal {
	public Dog() {}

	public Dog(int age, String color) {
		super(age, color);
	}
	
	public void lookHome() {
		System.out.println("看家");
	}
}

class Cat extends Animal {
	public Cat() {}

	public Cat(int age, String color) {
		super(age, color);
	}
	
	public void catchMouse() {
		System.out.println("抓老鼠");
	}
}

class Person2 {
	private String name;
	private int age;
	
	public Person2() {}

	public Person2(String name, int age) {
		super();
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
	
	public void keepPet(Dog dog,String something) {
		dog.eat(something);
	}
	
	public void keepPet(Cat cat, String something) {
		cat.eat(something);
	}
	
}
