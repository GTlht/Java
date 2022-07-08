package com.exception;

public class Demo12 {
	public static void main(String[] args) {
		Person p = new Person();
		p.eat("折耳根");
		//p.eat("极品牛肉");
	}
}

class Person {
	public void eat(String food) {
		if(food.endsWith("肉")) {
			System.out.println("我很开心，因为我吃到了" + food);
		} else {
			//System.out.println("我很不开心，因为我吃到了" + food);
			/*Exception e = new Exception();
			throw e;*/
			/*RuntimeException re = new RuntimeException();
			throw re;*/
			/*RuntimeException re = new RuntimeException("没有给我吃肉");
			throw re;*/
			//throw new MyException("没有给我吃肉");
			throw new NotEatMeetException("没有给我吃肉");
		}
	}
}
