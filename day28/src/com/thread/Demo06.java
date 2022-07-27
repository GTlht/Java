package com.thread;

public class Demo06 {
	public static void main(String[] args) {
		String s1 = "左筷子";
		String s2 = "右筷子";
		
		new Thread("哲学家A") {
			public void run() {
				while(true) {
					synchronized(s1) {
						System.out.println(getName() + "拿到了" + s1 + ",等待" + s2);
						synchronized(s2) {
							System.out.println(getName() + "拿到了" + s2 + ",开吃");
						}
					}
				}
			}
		}.start();
		
		new Thread("哲学家B") {
			public void run() {
				while(true) {
					synchronized(s2) {
						System.out.println(getName() + "拿到了" + s2 + ",等待" + s1);
						synchronized(s1) {
							System.out.println(getName() + "拿到了" + s1 + ",开吃");
						}
					}
				}
			}
		}.start();
	}
}
