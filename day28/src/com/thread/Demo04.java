package com.thread;

public class Demo04 {
	public static void main(String[] args) {
		Print2 p = new Print2();
		
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
		
		//创建一个线程
		new Thread(new Runnable() {
			@Override
			public void run() {
				while(true) {
					p.print3();
				}
			}
		}).start();
	}
}


class Print2 {
	private int i = 1;
	private Object obj = new Object();
	
	public void print1() {
		synchronized(obj) {
			for(;i != 1;) {
				try {
					obj.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.print("约");
			System.out.print("吗");
			System.out.println();
			
			i = 2;
			obj.notifyAll();
		}
	}
	
	public void print2() {
		synchronized(obj) {
			for(;i != 2;) {
				try {
					obj.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.print("滚");
			System.out.print("犊");
			System.out.print("子");
			System.out.println();
			
			i = 3;
			obj.notifyAll();
		}
	}
	
	public void print3() {
		synchronized(obj) {
			for(;i != 3;) {
				try {
					obj.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.print("在");
			System.out.print("吗");
			System.out.println();
			
			i = 1;
			obj.notifyAll();
		}
	}
}
