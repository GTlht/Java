package txt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

/*3.程序启动后可以接收三个学员信息，然后可以打印所有学员信息，并找出身高最高的学员，并打印他们的详细信息
	1.定义MainApp类，包含main()方法；
	2.在main()方法中，创建一个可以存储Student对象的集合对象；
	3.从控制台接收以下几个Student对象：
		学号	姓名	性别	年龄	身高	
		a001	黄渤	男		20		1.72		
		a002	孙红雷	男		22		1.78		
		a003	章子怡	女		18		1.64		
		将每个对象添加到集合中(集合中学员学号唯一)；
	4.在MainApp中创建方法，可以打印所有学员信息：
		public static void printAll(ArrayList<Student> stuList){}
	5.在MainApp中创建方法，可以找出身高最高的学员，并打印：
		public static void findMaxHeight(ArrayList<Student>stuList){}
	6.在main()方法中，分别调用三个方法：打印所有学员，找出身高最高的学员；*/
public class demo3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Student1> list=new ArrayList<Student1>();
		int count=0;
		while(count<3) {
		System.out.println("输入学员信息空格隔开");
		String str=sc.nextLine();
		
		String[] s=str.split("\\ ");
		System.out.println(Arrays.toString(s));
		list.add(new Student1(s[0],s[1],s[2],Integer.parseInt(s[3]),Double.parseDouble(s[4])));
		count++;
		}
		System.out.println("打印");
		printAll(list);
		System.out.println("最高身高");
		findMaxHeight(list);
		
	}
	public static void printAll(ArrayList<Student1> list){
		Iterator<Student1> it=list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
	public static void findMaxHeight(ArrayList<Student1> list){
		Iterator<Student1> it=list.iterator();
		Double height=0.0;
		while(it.hasNext()) {
			Student1 s=(Student1)it.next();
			
			if(s.getHight()>height) {
				height=s.getHight();
			}
		}
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getHight()==height) {
				System.out.println(list.get(i));
			}
		}
		
	}

}

class Student1{
	private String id;
	private String name;
	private String sex;
	private int age;
	private double hight;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getHight() {
		return hight;
	}
	public void setHight(double hight) {
		this.hight = hight;
	}
	public Student1(String id, String name, String sex, int age, double hight) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.hight = hight;
	}
	public Student1() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student1 [id=" + id + ", name=" + name + ", sex=" + sex + ", age=" + age + ", hight=" + hight + "]";
	}
	
}