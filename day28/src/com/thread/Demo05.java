package com.thread;

public class Demo05 {
	public static void main(String[] args) {
		Print3 p = new Print3();
		
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

class Print3 {
	private boolean flag = false;
	
	public synchronized void print1() {
		if(!flag) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.print("约");
		System.out.print("吗");
		System.out.println();
		
		flag = false;
		this.notify();
	}
	
	public synchronized void print2() {
		if(flag) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.print("滚");
		System.out.print("犊");
		System.out.print("子");
		System.out.println();
		
		flag = true;
		this.notify();
	}
}
