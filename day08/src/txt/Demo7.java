package txt;

import java.util.Scanner;

/*7.��������д����
(1)��ƣ�������һ��ѧԱ�ࣺStudent��Ҫ�����������ԣ�
	ѧԱ��ţ�String�� 
	������String��
	�Ա�String��
	��ߣ�double��
	���䣨int��
	ʹ�÷�װ��ԭ�򣬲��ṩ�޲κ�ȫ�εĹ��췽����
(2)����MainApp�࣬������main()����
(3)����������Ӧ�ֱ���ʾ�û�����ѧԱ��š���������Ϣ��
	�������̨��ʾ��
		������ѧԱ��ţ�
		...
		������ѧԱ������
		...
(4)���ݽ��յ������У�������ֲ������洢
(5)����Student����ͨ�����췽�����������ݴ洢��Student������
(6)��ӡ�����е�ÿ������ֵ*/
public class Demo7 {
	public static void main(String[] args) {
		 String id;
		 String name;
		 String sex;
		 double tall;
		 int age;
		Scanner sc=new Scanner(System.in);
		System.out.println("������ѧԱ��ţ�");
		id=sc.next();
		System.out.println("������ѧԱ������");
		name=sc.next();
		System.out.println("������ѧԱ�Ա�");
		sex=sc.next();
		System.out.println("������ѧԱ��ߣ�");
		tall=sc.nextDouble();
		System.out.println("������ѧԱ���䣺");
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