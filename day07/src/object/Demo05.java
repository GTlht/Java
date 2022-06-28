package object;

public class Demo05 {
	public static void main(String[] args) {
		Tiger t1 = new Tiger();
		System.out.println(t1.name + "..." + t1.age);//null...0
		t1.name = "tom";
		t1.age = 19;
		System.out.println(t1.name + "..." + t1.age);//tom...19
		t1.eat();
		t1.drink();
		
		Tiger t2 = t1;
		System.out.println(t2.name + "..." + t2.age);//tom...19
		t2.name = "jerry";
		t2.age = 20;
		System.out.println(t2.name + "..." + t2.age);//jerry..20
		
		System.out.println(t1.name + "..." + t1.age);//jerry...20
	}
}

class Tiger {
	String name;
	int age;
	
	public void eat() {
		System.out.println("吃肉");
	}
	
	public void drink() {
		System.out.println("喝水");
	}
}
