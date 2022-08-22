package com.reflect;

public class Demo01 {
	public static void main(String[] args) throws Exception {
		/*//获取字节码文件对象
		Class clazz1 = Person.class;
		System.out.println(clazz1);
		
		//获取字节码文件对象
		Person p = new Person();
		Class clazz2 = p.getClass();
		System.out.println(clazz2);
		
		//获取字节码文件对象
		Class clazz3 = Class.forName("com.reflect.Person");
		System.out.println(clazz3);
		
		System.out.println(clazz1 == clazz2);
		System.out.println(clazz2 == clazz3);*/
		
		Class clazz = Class.forName("com.reflect.Person");
		//public T newInstance()
		Person p = (Person)clazz.newInstance();
		System.out.println(p);
	}
}

class Person {
	private String name;
	private int age;
	
	public Person() {}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
}
