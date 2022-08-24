package com.lambda;

public class Demo10 {
	public static void main(String[] args) {
		/*J j = new J() {
			public Person show(String name) {
				return new Person(name);
			}
		};
		Person p = j.show("tom");
		System.out.println(p);*/
		
		/*J j = (String name) -> {return new Person(name);};
		Person p = j.show("jerry");
		System.out.println(p);*/
		
		/*J j = name -> new Person(name);
		Person p = j.show("rose");
		System.out.println(p);*/
		
		J j = Person::new;
		Person p = j.show("jack");
		System.out.println(p);
	}
}

interface J {
	public Person show(String name);
}

class Person {
	private String name;

	public Person(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
}