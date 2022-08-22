package com.reflect;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Properties;

//模拟框架，通过反射技术来实现我们可以随意的指定某个类和某个方法(空参),就可以执行该类中的方法？
public class Demo07 {
	public static void main(String[] args) throws Exception {
		//加载配置文件
		Properties p = new Properties();
		p.load(Demo07.class.getClassLoader().getResourceAsStream("aaa.properties"));
		
		//获取数据
		String className = p.getProperty("className");
		String methodName = p.getProperty("methodName");
		
		//获取字节码文件对象
		Class clazz = Class.forName(className);
		
		//获取对象
		Object obj = clazz.newInstance();
		
		//获取成员方法对象
		Method method = clazz.getMethod(methodName);
		
		//调用该对象的该方法
		method.invoke(obj);
	}
}

class A {
	public void printA() {
		System.out.println("约吗");
	}
	
	public void print() {
		System.out.println("在吗");
	}
}

class B {
	public void printB() {
		System.out.println("滚犊子");
	}
	
	public void print() {
		System.out.println("臭不要脸");
	}
}
