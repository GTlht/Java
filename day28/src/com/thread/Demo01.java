package com.thread;

public class Demo01 {
	public static void main(String[] args) {
		Ticket t = new Ticket();
		
		Thread t1 = new Thread(t, "窗口1");
		t1.start();
		
		Thread t2 = new Thread(t, "窗口2");
		t2.start();
		
		Thread t3 = new Thread(t, "窗口3");
		t3.start();
	}
}

class Ticket implements Runnable {
	private int tickets = 100;
	private Object obj = new Object();
	
	@Override
	public void run() {
		while(true) {
			synchronized(obj) {
				if(tickets > 0) {
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
					System.out.println(Thread.currentThread().getName() + "...正在出售第..." + tickets + "...张票" );
					tickets--;
				}
			}
		}
	}
}


/*class Ticket implements Runnable {
	private int tickets = 100;
	
	@Override
	public void run() {
		while(true) {
			if(tickets > 0) {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				System.out.println(Thread.currentThread().getName() + "...正在出售第..." + tickets + "...张票" );
				tickets--;
			}
		}
	}
}*/
