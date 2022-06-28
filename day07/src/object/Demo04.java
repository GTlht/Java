package object;

public class Demo04 {
	public static void main(String[] args) {
		Cat c = new Cat();
		System.out.println(c.name + "..." + c.age);
		c.name = "tom";
		c.age = 18;
		System.out.println(c.name + "..." + c.age);
		c.eat();
		c.drink();
		
		c = new Cat();
		System.out.println(c.name + "..." + c.age);
		c.name = "jerry";
		c.age = 20;
		System.out.println(c.name + "..." + c.age);
	}
}

class Cat {
	String name;
	int age;
	
	public void eat() {
		System.out.println("吃鱼");
	}
	
	public void drink() {
		System.out.println("喝奶");
	}
}
