package com.map;

import com.map.Outer.Inner;

public class Demo08 {
	public static void main(String[] args) {
		//Outer.Inner oi = new Outer.Inner();
		Inner in = new Inner();
		
		//Map.Entry entry
	}
}

class Outer {
	static class Inner {
		
	}
}

/*
interface Map<K,V> {
 	static class Entry<K,V> {
 	}
}

Map<String, String> map = new HashMap<>();
*/