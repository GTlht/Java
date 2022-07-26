package com.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class Demo03 {
	public static void main(String[] args) {
		/*MyCallable mc = new MyCallable();
		
		FutureTask<String> ft1 = new FutureTask<>(mc);
		Thread t1 = new Thread(ft1);
		t1.start();
		
		FutureTask<String> ft2 = new FutureTask<>(mc);
		Thread t2 = new Thread(ft2);
		t2.start();*/
	}
}

/*class MyCallable implements Callable<String> {
	@Override
	public String call() throws Exception {
		for(int i = 1; i <= 100; i++) {
			System.out.println(i);
		}
		
		return "约吗";
	}
}*/