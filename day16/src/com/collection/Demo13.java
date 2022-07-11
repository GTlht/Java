package com.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo13 {
	public static void main(String[] args) {
		//创建容器
		Collection c = new ArrayList();
		
		//添加元素
		c.add("aaa");
		c.add("bbb");
		c.add("ccc");
		
		//遍历容器
		//Iterator iterator()
		Iterator it = c.iterator();

		while(it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}
	}
}

/*
class ArrayList {
	class Itr extends Object implements Interator {
		public boolean hashNext() {}
		public Object next() {}
	}
	
	public Iterator iterator() {
		return new Itr();
	}
}
*/
