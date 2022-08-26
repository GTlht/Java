package com.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Demo01 {
	/*public static void main(String[] args) {
		System.out.println("约吗");
	}*/
	
	@Before
	public void before() {
		System.out.println("开启");
	}
	
	@After
	public void after() {
		System.out.println("结束");
	}
	
	@Test
	public void aaa() {
		System.out.println("约吗");
	}
	
	@Test
	public void bbb() {
		System.out.println("滚犊子");
	}
}
