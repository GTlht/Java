package com.work;

/*

3.分析以下需求，并用代码实现
	1.项目经理类Manager 
		属性：
			姓名name
			工号id
			工资salary
			奖金bonus
		行为：
			工作work()
	2.程序员类Coder
		属性：
			姓名name
			工号id
			工资salary
		行为：
			工作work()
 */
public class Demo03 {
	public static void main(String[] args) {
		Manager m = new Manager();
		m.setName("tom");
		m.setId(9527);
		m.setSalary(10000);
		m.setBonus(20000);
		//System.out.println(m.getName() + "" + m.getId() + "" + m.getSalary() + "" +m.getBonus());
		m.show();
	}
}

class Manager {
	private String name;
	private int id;
	private int salary;
	private int bonus;
	
	public void setName(String n) {
		name = n;
	}
	
	public String getName() {
		return name;
	}
	
	public void setId(int i) {
		id = i;
	} 
	
	public int getId() {
		return id;
	}
	
	public void setSalary(int s) {
		salary = s;
	} 
	
	public int getSalary() {
		return salary;
	}
	
	public void setBonus(int b) {
		bonus = b;
	}
	
	public int getBonus() {
		return bonus;
	}
	
	public void work() {
		System.out.println("谈业务");
	}
	
	public void show() {
		System.out.println(name + "..." + id + "..." + salary + "..." + bonus);
	}
}

