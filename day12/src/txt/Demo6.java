package txt;

import java.util.Scanner;

/*6.�������ַ�������ʽ�Ӽ���¼��ѧ����Ϣ�����磺"����,23" �Ӹ��ַ������и����Ч���ݣ���װΪStudentѧ������*/
public class Demo6 {
	public static void main(String[] args) {
		System.out.println("������ѧ����Ϣ��������������23��");
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