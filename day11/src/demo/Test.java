package demo;

public class Test {
	public static void main(String[] args) {
		Zi z=new Zi();
		System.out.println(z.a);
		z.a=10;
		Fu f=new Fu();
		System.out.println(f.a);
		int i=9;
		int sum=0;
		System.out.println(sum-=i);
	}
}
class Fu{
	static int a=9;
}
class Zi extends Fu{
	
}