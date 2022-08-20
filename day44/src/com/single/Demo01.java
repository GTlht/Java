package com.single;

public class Demo01 {
	public static void main(String[] args) {
		/*for(int i = 1; i <= 100; i++) {
			new Thread() {
				public void run() {
					Singleton s = Singleton.getInstance();
					System.out.println(s);
				}
			}.start();
		}*/
	}
}

//单例设计模式：方式一
/*class Singleton {
	private static final Singleton singleton = new Singleton();
	
	private Singleton() {}
	
	//提供一个方法，让外界获取到该类的对象
	public static Singleton getInstance() {
		return singleton;
	}
}*/