package demo;

public class Test1 {
	public static void main(String[] args) {
		Animal a=new Animal(9,"ะกรื",5);
		System.out.println(a);
	}

}
class Animal{
	int i;
	String name;
	int age;
	
	public Animal(int i, String name, int age) {
		super();
		this.i = i;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Animal [i=" + i + ", name=" + name + ", age=" + age + "]";
	}
	
}