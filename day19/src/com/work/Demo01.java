package com.work;

import java.util.Comparator;
import java.util.TreeSet;

/*
1.分析以下需求，并用代码实现：
	(1)定义一个员工类Employee，包含三个属性：姓名(String name)、年龄(int age)、工资(int salary)
	(2)创建5个对象装入TreeSet，按照工资从高到底排序输出结果(工资相同，按照年龄从低到高，工资和年龄都相同，
		按照姓名字典顺序排列，但是不能去重(姓名、年龄、工资都相同))
*/

public class Demo01 {
	public static void main(String[] args) {
		TreeSet<Employee> ts = new TreeSet<>(new Comparator<Employee>() {
			@Override
			public int compare(Employee e1, Employee e2) {
				//比较工资，大到小
				int n1 = e2.getSalary() - e1.getSalary();
				//比较年龄，小到大
				int n2 = n1 == 0 ? e1.getAge() - e2.getAge() : n1;
				//比较姓名，小到大
				int n3 = n2 == 0 ? e1.getName().compareTo(e2.getName()) : n2;
				//不去重
				int n4 = n3 == 0 ? 1 : n3;
				
				return n4;
			}
		});
		
		ts.add(new Employee("tom", 18, 5000));
		ts.add(new Employee("jerry", 19, 6000));
		ts.add(new Employee("rose", 20, 7000));
		ts.add(new Employee("tom", 18, 5000));
		ts.add(new Employee("jack", 23, 7000));
		ts.add(new Employee("tony", 23, 7000));
		
		for (Employee employee : ts) {
			System.out.println(employee);
		}
	}
}

class Employee {
	private String name;
	private int age;
	private int salary;
	
	public Employee() {}

	public Employee(String name, int age, int salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
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

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}	
}