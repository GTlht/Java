package txt;
/*4. ��������������ɴ���(���ձ�׼��ʽд)��Ȼ���ڲ������в��ԡ�
	����һ��
		�ֻ���Phone
			����:Ʒ��brand,�۸�price
			��Ϊ:��绰call,������sendMessage,����Ϸ,playGame
	�������
		����Person
			����:����name,����age,�Ա�gender
			��Ϊ:ѧϰstudy,˯��sleep

	��������
		������Animal
			����:����name,����age
			��Ϊ:�Է�eat
	�����ģ�
		����Dog
			����:����name,����age
			��Ϊ:�Է�eat������lookHome
	�����壺
		è��Cat
			����:����name,����age
			��Ϊ:�Է�eat��ץ����catchMouse
	��������
		ѧ����Student
			����:���ĳɼ�chinese����ѧ�ɼ�math��Ӣ��ɼ�english
			��Ϊ:���ܳɼ��ķ���getSum()*/
public class Demo4 {
	public static void main(String[] args) {
		Phone p=new Phone("��Ϊ",12000.0);
		System.out.println(p.getBrand()+"..."+p.getPrice());
		p.setBrand("����");
		p.setPrice(999);
		System.out.println(p.getBrand()+"..."+p.getPrice());
		Person p1=new Person("����",18,"��");
		System.out.println(p1.getName()+"..."+p1.getAge()+"..."+p1.getGender());
		p1.setName("����");
		p1.setAge(22);
		p1.setGender("Ů");
		System.out.println(p1.getName()+"..."+p1.getAge()+"..."+p1.getGender());
	    Animal ani=new Animal("��",5);
	    System.out.println(ani.getName()+"..."+ani.getAge());
	    ani.setName("��");
	    ani.setAge(3);
	    System.out.println(ani.getName()+"..."+ani.getAge());
	    Student s=new Student(85,89.5,93);
	   System.out.println( s.avg());
	}

}
class Phone{
	private String brand;
	private double price;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public Phone(String brand, double price) {
		this.brand = brand;
		this.price = price;
	}
	public Phone() {
		
	}
	public void call() {
		System.out.println("��绰");
	}
	public void sendMessage() {
		System.out.println("������");
	}
	public void playGame() {
		System.out.println("����Ϸ");
	}
}
class Person{
	private String name;
	private int age;
	private String gender;
	
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Person(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	public Person() {
		
	}
	public void study() {
		System.out.println("ѧϰ");
	}
	public void sleep() {
		System.out.println("˯��");
	}
}
class Animal{
	private String name;
	private int age;
	
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

	
	public Animal() {
		
	}

	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void eat() {
		System.out.println("�Զ���");
	}
}
class Student{
	private double math;
	private double chinese;
	private double english;
	public double avg() {
		return (math+chinese+english)/3;
	}
	public double getMath() {
		return math;
	}
	public void setMath(double math) {
		this.math = math;
	}
	public double getChinese() {
		return chinese;
	}
	public void setChinese(double chinese) {
		this.chinese = chinese;
	}
	public double getEnglish() {
		return english;
	}
	public void setEnglish(double english) {
		this.english = english;
	}
	public Student(double math, double chinese, double english) {
		this.math = math;
		this.chinese = chinese;
		this.english = english;
	}
	public Student() {
		
	}
	
}


















