package com.code_block;

public class Demo04 {
	public static void main(String[] args) {
		Zi zi = new Zi();
	}
}

class Fu {
	static {
		System.out.println("fu...静态代码块...");
	}
	
	{
		System.out.println("fu...构造代码块...");
	}
	
	public Fu() {
		System.out.println("fu...构造方法...");
	}
}

class Zi extends Fu {
	static {
		System.out.println("zi...静态代码块...");
	}
	
	{
		System.out.println("zi...构造代码块...");
	}
	
	public Zi() {
		/*super();
		构造代码块()*/
		System.out.println("zi...构造方法...");
	}
}