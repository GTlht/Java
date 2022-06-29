package com.work;

/*

6.分析一下需求,并用代码实现
	
	1.学生类Student
		属性:
			姓名name
			年龄age
			成绩score
		行为:
			吃饭eat()
			学习study()
*/

public class Demo06 {
	public static void main(String[] args) {
		
	}
}

class Student {
	private String name;
	private int age;
	private int score;
	
	public void eat() {
		System.out.println("吃肉");
	}
	
	public void study() {
		System.out.println("学习java");
	}
}

