package com.work;

/*
9.分析以下需求，并用代码实现
	1.定义项目经理类 
		属性：
			姓名 工号 工资 奖金
		行为：
			工作work
	2.定义程序员类
		属性：
			姓名 工号 工资
		行为：
			工作work

	3.要求:向上抽取一个父类,让这两个类都继承这个父类,共有的属性写在父类中，子类重写父类中的方法
	
		编写测试类:完成这两个类的测试
*/

public class Demo06 {
	public static void main(String[] args) {
		
	}
}

class Person1 {
	private String name;
	private int id;
	private int salary;
	
	public Person1() {}
	
	public Person1(String name, int id, int salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public void work() {
		System.out.println("工作");
	}
}

class Manager extends Person1 {
	private int bonus;
	
	public Manager() {}

	public Manager(String name, int id, int salary, int bonus) {
		super(name, id, salary);
		this.bonus = bonus;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	@Override
	public void work() {
		System.out.println("谈客户");
	}
}

class Coder extends Person1 {
	public Coder() {}

	public Coder(String name, int id, int salary) {
		super(name, id, salary);
	}
	
	@Override
	public void work() {
		System.out.println("敲代码");
	}
}
