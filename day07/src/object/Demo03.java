package object;

public class Demo03 {
	public static void main(String[] args) {
		//创建一条狗
		Dog d1 = new Dog();
		//给属性赋值
		d1.name = "tom";
		d1.age = 18;
		//打印狗的属性
		System.out.println(d1.name + "..." + d1.age);
		//调用狗的方法
		d1.eat();
		d1.drink();
		
		//创建一条狗
		Dog d2 = new Dog();
		//给属性赋值
		d2.name = "jerry";
		d2.age = 19;
		//打印狗的属性
		System.out.println(d2.name + "..." + d2.age);
		//调用狗的方法
		d2.eat();
		d2.drink();
	}
}

class Dog {
	String name;
	int age;
	
	public void eat() {
		System.out.println("吃骨头");
	}
	
	public void drink() {
		System.out.println("喝水");
	}
}
