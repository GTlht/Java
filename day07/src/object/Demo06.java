package object;

public class Demo06 {
	public static void main(String[] args) {
		A a = new A();
		a.aaa();
	}
}

class A {
	int i = 1;
	
	public void aaa() {
		int i = 2;
		System.out.println(i);//2
	}
}