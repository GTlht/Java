package com.properties;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Demo04 {
	public static void main(String[] args) throws Exception {
		//创建容器
		Properties p = new Properties();
		
		//添加元素
		p.setProperty("tom", "18");
		p.setProperty("jerry", "19");
		p.setProperty("rose", "20");
		
		System.out.println(p);
		
		//public void store(OutputStream out,String comments)
		p.store(new FileOutputStream("a.txt"), null);
		//p.store(new FileOutputStream("a.txt"), "abcde");
		//p.store(new FileOutputStream("a.txt"), "约吗");
		
	}
}
