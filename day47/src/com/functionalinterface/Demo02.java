package com.functionalinterface;

public class Demo02 {
	public static void main(String[] args) {
		/*show(new Runnable() {
			public void run() {
				System.out.println("约吗");
			}
		});*/
		
		//show(() -> {System.out.println("约吗");});
		
		show(() -> System.out.println("约吗"));
		
	}
	
	public static void show(Runnable runnable) {
		Thread t = new Thread(runnable);
		t.start();
	}
}
