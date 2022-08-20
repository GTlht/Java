package com.single;

public class Demo04 {
	public static void main(String[] args) {
		for(int i = 1; i <= 100; i++) {
			new Thread() {
				public void run() {
					Singleton s = Singleton.getInstance();
					System.out.println(s);
				}
			}.start();
		}
	}
}

//单例设计模式：方式四
class Singleton {
	private static Singleton singleton;
	
	private Singleton() {}
	
	public static Singleton getInstance() {
		if(singleton == null) {
			synchronized(Singleton.class) {
				if(singleton == null) {
					singleton = new Singleton();
				}
			}
		}
		return singleton;
	}
}
