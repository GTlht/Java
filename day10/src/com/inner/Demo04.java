package com.inner;

public class Demo04 {
	public static void main(String[] args) {
		Outer3 outer3 = new Outer3();
		outer3.show();
	}
}

class Outer3 {
    private class Inner3 {
		int i = 2;
		public void print() {
			System.out.println("在吗");
		}
    }
    
    public void show() {
    	Inner3 inner3 = new Inner3();
    	System.out.println(inner3.i);
    	inner3.print();
    }
}
