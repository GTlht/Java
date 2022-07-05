package txt;

import java.util.Scanner;

/*6.需求：以字符串的形式从键盘录入学生信息，例如："张三,23" 从该字符串中切割出有效数据，封装为Student学生对象*/
public class Demo6 {
	public static void main(String[] args) {
		System.out.println("请输入学生信息：（例：张三，23）");
		String str=new Scanner(System.in).next();
		String[] arr=new String[2];
		arr=str.split(",");
		//System.out.println(arr[0]+"  "+arr[1]);
		Student s=new Student(arr[0], Integer.parseInt(arr[1]));
		System.out.println(s);
	}

}
class Student{
	private String name;
	private int age;
	public Student(String name, int age) {
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
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
	
}