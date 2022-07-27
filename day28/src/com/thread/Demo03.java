package com.thread;

public class Demo03 {
	public static void main(String[] args) {
		Print1 p = new Print1();
		
		//创建一个线程
		new Thread(new Runnable() {
			@Override
			public void run() {
				while(true) {
					p.print1();
				}
			}
		}).start();
		
		//创建一个线程
		new Thread(new Runnable() {
			@Override
			public void run() {
				while(true) {
					p.print2();
				}
			}
		}).start();
	}
}

class Print1 {
	private Object obj = new Object();
	private boolean flag = false;
	
	public void print1() {
		synchronized(obj) {
			if(!flag) {
				try {
					obj.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			System.out.print("约");
			System.out.print("吗");
			System.out.println();
			
			flag = false;
			obj.notify();
		}
	}
	
	public void print2() {
		synchronized(obj) {
			if(flag) {
				try {
					obj.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			System.out.print("滚");
			System.out.print("犊");
			System.out.print("子");
			System.out.println();
			
			flag = true;
			obj.notify();
		}
	}
}

/*class Print1 {
	private Object obj = new Object();
	
	public void print1() {
		synchronized(obj) {
			System.out.print("约");
			System.out.print("吗");
			System.out.println();
		}
	}
	
	public void print2() {
		synchronized(obj) {
			System.out.print("滚");
			System.out.print("犊");
			System.out.print("子");
			System.out.println();
		}
	}
}*/
