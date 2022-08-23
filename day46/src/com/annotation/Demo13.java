package com.annotation;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Properties;

public class Demo13 {
	public static void main(String[] args) throws Exception {
		//加载配置
		Properties p = new Properties();
		p.load(Demo13.class.getClassLoader().getResourceAsStream("aaa.properties"));
		
		//获取数据
		String className = p.getProperty("className");
		String methodName = p.getProperty("methodName");
		
		//获取字节码文件对象
		Class clazz = Class.forName(className);
		
		//获取方法对象
		Method method = clazz.getMethod(methodName);
		
		//调用方法
		method.invoke(clazz.newInstance());
	}
}

class Pig {
	public void eat() {
		System.out.println("吃肉");
	}
}
