package txt;

import java.util.Scanner;

/*7.根据需求写代码
(1)设计，并定义一个学员类：Student，要求有以下属性：
	学员编号（String） 
	姓名（String）
	性别（String）
	身高（double）
	年龄（int）
	使用封装的原则，并提供无参和全参的构造方法。
(2)定义MainApp类，并包含main()方法
(3)程序启动后，应分别提示用户输入学员编号、姓名等信息。
	例如控制台显示：
		请输入学员编号：
		...
		请输入学员姓名：
		...
(4)数据接收到程序中，并定义局部变量存储
(5)创建Student对象，通过构造方法将所有数据存储到Student对象中
(6)打印对象中的每个属性值*/
public class Demo7 {
	public static void main(String[] args) {
		 String id;
		 String name;
		 String sex;
		 double tall;
		 int age;
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入学员编号：");
		id=sc.next();
		System.out.println("请输入学员姓名：");
		name=sc.next();
		System.out.println("请输入学员性别：");
		sex=sc.next();
		System.out.println("请输入学员身高：");
		tall=sc.nextDouble();
		System.out.println("请输入学员年龄：");
		age=sc.nextInt();
		 Student1 s=new Student1(id,name,sex,tall,age);
		System.out.println(s.print());
	}

}
class Student1{
	private String id;
	private String name;
	private String sex;
	private double tall;
	private int age;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public double getTall() {
		return tall;
	}
	public void setTall(double tall) {
		this.tall = tall;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Student1(String id, String name, String sex, double tall, int age) {
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.tall = tall;
		this.age = age;
	}
	public Student1() {
		
	}
	public String print() {
		return "Student [id=" + id + ", name=" + name + ", sex=" +
	sex + ", age=" + age + ", tall=" + tall + "]";
	}
	
}