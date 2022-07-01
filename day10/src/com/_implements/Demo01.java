package com._implements;

public class Demo01 {
	public static void main(String[] args) {
		InterImpl ii = new InterImpl();
		ii.print();
	}
}

interface Inter {
	//public abstract void eat();
}

class InterImpl implements Inter {
	public void print() {
		System.out.println("明天是周六，好开心~");
	}
}
