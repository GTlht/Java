package com.work;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
5.分析以下需求，并用代码实现：
	(1)定义一个学生类Student，属性：姓名(String name)、班级班号(String no)、成绩(double score)
	(2)将若干Student对象存入List集合，并统计每个班级的总分和平均分
		思路：
			a.采用面向对象的思想
			b.不推荐使用Map<String,List<Student>> 操作不方便
			c.推荐使用Map<String，ClassRoom>
*/

public class Demo05 {
	public static void main(String[] args) {
		Student s1 = new Student("tom", "Java92期", 100);
		Student s2 = new Student("jerry", "Java92期", 30);
		
		Student s3 = new Student("rose", "Java93期", 100);
		Student s4 = new Student("jack", "Java93期", 100);
		
		ClassRoom java92 = new ClassRoom("Java92期");
		List<Student> list1 = java92.getStudents();
		list1.add(s1);
		list1.add(s2);
		
		ClassRoom java93 = new ClassRoom("Java93期");
		List<Student> list2 = java93.getStudents();
		list2.add(s3);
		list2.add(s4);
		
		Map<String, ClassRoom> map = new HashMap<>();
		map.put("Java92期", java92);
		map.put("Java93期", java93);
		
		Set<String> set = map.keySet();
		for (String key : set) {
			ClassRoom value = map.get(key);
			System.out.println(value.getSum());
			System.out.println(value.getAvg());
		}
	}
}

class ClassRoom {
	private String no;
	private List<Student> students = new ArrayList<>();
	private double sum;
	private double avg;
	
	public ClassRoom() {
		super();
	}
	
	public ClassRoom(String no) {
		super();
		this.no = no;
	}
	
	public String getNo() {
		return no;
	}
	
	public void setNo(String no) {
		this.no = no;
	}
	
	public List<Student> getStudents() {
		return students;
	}
	
	@Override
	public String toString() {
		return "ClassRoom [no=" + no + ", students=" + students + "]";
	}
	
	public double getSum() {
		double sum = 0;
		//遍历学生集合
		for (Student student : students) {
			sum = student.getScore() + sum;
		}
		this.sum = sum;
		return sum;
	}
	
	public double getAvg() {
		avg = sum/students.size();
		return avg;
	}
}

class Student {
	private String name;
	private String no;
	private double score;
	public Student() {
		super();
	}
	public Student(String name, String no, double score) {
		super();
		this.name = name;
		this.no = no;
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", no=" + no + ", score=" + score + "]";
	}
}
