package com.work;

/*
8. 分析以下需求，并用代码实现
	1.定义Person类
		属性：
			姓名name、性别gender、年龄age、国籍nationality；
		方法：
			吃饭eat、睡觉sleep，工作work。
	2.根据人类，创建一个学生类Student
		增加属性：
			学校school、学号stuNumber；
		重写工作方法（学生的工作是学习）。	
	3.根据人类，创建一个工人类Worker
		增加属性：
			单位unit、工龄workAge；
		重写工作方法（工人的工作是盖房子）。
	4.根据学生类，创建一个学生干部类 StudentLeader
		增加属性：
			职务job；
		增加方法：开会meeting（学生干部喜欢开会!）。
	5.编写测试类分别对上述3类具体人物进行测试。

	6.要求运行结果:
		学生需要学习!
		工人的工作是盖房子!
		学生干部喜欢开会!
 */

public class Demo05 {
	public static void main(String[] args) {
		//String job, String school, String stuNumber, String name, String gender, int age, String nationality
		StudentLeader sl = new StudentLeader("会长", "樱兰高校", "9527", "张三", "男", 18, "中国");
		sl.show();
	}
}

class Person {
	private String name;
	private String gender;
	private int age;
	private String nationality;
	
	public Person() {}

	public Person(String name, String gender, int age, String nationality) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.nationality = nationality;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	
	public void eat() {
		System.out.println("吃");
	}
	
	public void sleep() {
		System.out.println("睡");
	}
	
	public void work() {
		System.out.println("工作");
	}
}

class Student extends Person {
	private String school;
	private String stuNumber;
	
	public Student() {}

	/*public Student(String school, String stuNumber) {
		this.school = school;
		this.stuNumber = stuNumber;
	}*/

	public Student(String school, String stuNumber, String name, String gender, int age, String nationality) {
		super(name, gender, age, nationality);
		this.school = school;
		this.stuNumber = stuNumber;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getStuNumber() {
		return stuNumber;
	}

	public void setStuNumber(String stuNumber) {
		this.stuNumber = stuNumber;
	}
	
	@Override
	public void work() {
		System.out.println("学生的工作是学习");
	}
}

class Worker extends Person {
	private String unit;
	private int workAge;
	
	public Worker() {}

	public Worker(String unit, int workAge, String name, String gender, int age, String nationality) {
		super(name, gender, age, nationality);
		this.unit = unit;
		this.workAge = workAge;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public int getWorkAge() {
		return workAge;
	}

	public void setWorkAge(int workAge) {
		this.workAge = workAge;
	}
	
	@Override
	public void work() {
		System.out.println("工人的工作是盖房子");
	}
}

class StudentLeader extends Student {
	private String job;
	
	public StudentLeader() {}
	
	public StudentLeader(String job, String school, String stuNumber, String name, String gender, int age, String nationality) {
		super(school, stuNumber, name, gender, age, nationality);
		this.job = job;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}
	
	public void meeting() {
		System.out.println("学生干部喜欢开会!");
	}
	
	public void show() {
		System.out.println(getName() + "..." + getAge() + "..." + getGender() + "..." + getNationality() + "..." + getSchool() + "..." + getStuNumber() + "..." + job);
	}
}
