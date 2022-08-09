package com.jdbc;

public class Demo02 {
	public static void main(String[] args) throws Exception {
		Class clazz = Pig.class;
		Class clazz1 = Class.forName("com.jdbc.Pig");
	}
}

class Pig {}
