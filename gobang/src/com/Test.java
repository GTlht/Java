package com;

public class Test {
	public static void main(String[] args) {
//		Zi z=new Zi();
//		z.aaa();
		Fu f=new Fu(9);
	}

}
class Fu{
	final private int i;
	private int b;
	
	public Fu(int b) {
		this.b=b;
	}

	public Fu() {
		this.i = 0;
		
	}
	
	public final void aaa() {
		System.out.println("∏∏¿‡∑Ω∑®");
	}
}
//class Zi extends Fu{
//	
//}