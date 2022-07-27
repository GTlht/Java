package com.thread;

import java.util.concurrent.locks.ReentrantLock;

public class Demo02 {
	public static void main(String[] args) {
		Print p = new Print();
		
		//创建一个线程
		new Thread(new Runnable() {
			@Override
			public void run() {
				while(true) {
					p.print1();
					//Print.print1();
				}
			}
		}).start();
		
		//创建一个线程
		new Thread(new Runnable() {
			@Override
			public void run() {
				while(true) {
					p.print2();
					//Print.print2();
				}
			}
		}).start();
	}
}

class Print {
	private ReentrantLock lock = new ReentrantLock();
	
	public void print1() {
		lock.lock();
		System.out.print("蜗");
		System.out.print("牛");
		System.out.print("学");
		System.out.print("院");
		System.out.println();
		lock.unlock();
	}
	
	public void print2() {
		lock.lock();
		System.out.print("J");
		System.out.print("a");
		System.out.print("v");
		System.out.print("a");
		System.out.print("9");
		System.out.print("2");
		System.out.print("期");
		System.out.println();
		lock.unlock();
	}
}

/*class Print {
	//private static Object obj = new Object();
	
	public static synchronized void print1() {
		System.out.print("蜗");
		System.out.print("牛");
		System.out.print("学");
		System.out.print("院");
		System.out.println();
	}
	
	public static void print2() {
		synchronized(Print.class) {
			System.out.print("J");
			System.out.print("a");
			System.out.print("v");
			System.out.print("a");
			System.out.print("9");
			System.out.print("2");
			System.out.print("期");
			System.out.println();
		}
	}
}*/

/*class Print {
	public static synchronized void print1() {
		System.out.print("蜗");
		System.out.print("牛");
		System.out.print("学");
		System.out.print("院");
		System.out.println();
	}
	
	public static synchronized void print2() {
		System.out.print("J");
		System.out.print("a");
		System.out.print("v");
		System.out.print("a");
		System.out.print("9");
		System.out.print("2");
		System.out.print("期");
		System.out.println();
	}
}*/

/*class Print {
	private Object obj = new Object();
	
	public synchronized void print1() {
		System.out.print("蜗");
		System.out.print("牛");
		System.out.print("学");
		System.out.print("院");
		System.out.println();
	}
	
	public void print2() {
		synchronized(this) {
			System.out.print("J");
			System.out.print("a");
			System.out.print("v");
			System.out.print("a");
			System.out.print("9");
			System.out.print("2");
			System.out.print("期");
			System.out.println();
		}
	}
}*/

/*class Print {
	public synchronized void print1() {
		System.out.print("蜗");
		System.out.print("牛");
		System.out.print("学");
		System.out.print("院");
		System.out.println();
	}
	
	public synchronized void print2() {
		System.out.print("J");
		System.out.print("a");
		System.out.print("v");
		System.out.print("a");
		System.out.print("9");
		System.out.print("2");
		System.out.print("期");
		System.out.println();
	}
}*/

/*class Print {
	private Object obj = new Object();
	
	public void print1() {
		synchronized(obj) {
			System.out.print("蜗");
			System.out.print("牛");
			System.out.print("学");
			System.out.print("院");
			System.out.println();
		}
	}
	
	public void print2() {
		synchronized(obj) {
			System.out.print("J");
			System.out.print("a");
			System.out.print("v");
			System.out.print("a");
			System.out.print("9");
			System.out.print("2");
			System.out.print("期");
			System.out.println();
		}
	}
}*/

/*class Print {
	public void print1() {
		System.out.print("蜗");
		System.out.print("牛");
		System.out.print("学");
		System.out.print("院");
		System.out.println();
	}
	
	public void print2() {
		System.out.print("J");
		System.out.print("a");
		System.out.print("v");
		System.out.print("a");
		System.out.print("9");
		System.out.print("2");
		System.out.print("期");
		System.out.println();
	}
}*/