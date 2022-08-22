package com.reflect;

import java.lang.reflect.Method;
import java.util.ArrayList;

/*
已知有一个ArrayList集合，泛型为String，要求通过反射技术，可以实现向集合中存储Integer类型的数据
*/
public class Demo06 {
	public static void main(String[] args) throws Exception {
		//创建容器
		ArrayList<String> al = new ArrayList<>();
		
		//添加元素
		al.add("aaa");
		al.add("bbb");
		al.add("ccc");
		
		System.out.println(al);
		
		//获取字节码文件对象
		Class clazz = al.getClass();
		
		//获取add方法名的成员方法对象
		Method addMethod = clazz.getMethod("add", Object.class);
		
		//调用该方法
		addMethod.invoke(al, 11);
		addMethod.invoke(al, 22);
		addMethod.invoke(al, 33);
		addMethod.invoke(al, true);
		
		System.out.println(al);
		
		for (Object obj : al) {
			System.out.println(obj);
		}
	}
}
