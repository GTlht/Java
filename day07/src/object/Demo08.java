package object;

public class Demo08 {
	public static void main(String[] args) {
		/*Person p = new Person();
		
		Pig pig = new Pig();
		pig.name = "烤乳猪";
		
		p.eat(pig);*/
		
		new Person().eat(new Pig());
		
	}
}

class Person {
	public void eat(Pig pig) {
		System.out.println("喜欢吃" + pig.name);
	}
}

class Pig {
	String name = "烤乳猪";
}