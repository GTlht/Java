package com.work;

import java.util.LinkedList;

/*
7.请用LinkedList的集合模拟栈数据结构，并测试
	栈：先进后出
*/

public class Demo07 {
	public static void main(String[] args) {
		Stack stack = new Stack();
		
		//存储数据
		stack.in("aaa");
		stack.in("bbb");
		stack.in("ccc");
		
		//获取数据
		while(!stack.isEmpty()) {
			System.out.println(stack.out());
		}
	}
}

//自定义一个栈
class Stack {
	private LinkedList<String> ll = new LinkedList<String>();
	
	//进栈
	public void in(String str) {
		ll.addLast(str);
	}
	
	//出栈
	public String out() {
		return ll.removeLast();
	}
	
	public boolean isEmpty() {
		return ll.isEmpty();
	}
}
