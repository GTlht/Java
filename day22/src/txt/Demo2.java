package txt;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
2.从控制台接收3名学员的信息，每条进行存储到一个Student对象中，将多个Student对象存储到一个集合中。
输入完毕后，将所有学员信息存储到文件Student.txt中。每名学员信息存储一行，多个属性值中间用逗号隔开。*/
public class Demo2 {
	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		int count=0;
		List<Student> list=new ArrayList<Student>();
		FileOutputStream fos=new FileOutputStream("student.txt");
		while(count<3) {
			System.out.println("请输入第"+(count+1)+"个学生姓名：");
			String name=sc.next();
			System.out.println("请输入第"+(count+1)+"个学生年龄：");
			int age=sc.nextInt();
			System.out.println("请输入第"+(count+1)+"个学生性别：");
			String sex=sc.next();
			list.add(new Student(name,age,sex));
			count++;
		}
		for (Student s : list) {
			byte[] bs = s.toString().getBytes();//已重写toString()
			fos.write(bs);
			fos.write('\r');
			fos.write('\n');
		}
		fos.close();
		
	}

}
class Student{
	private String name;
	private int age;
	private String sex;
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
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Student(String name, int age, String sex) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return  name + ", " + age + ", " + sex ;
	}
	
}