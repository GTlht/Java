package txt;
/*10.����������ɴ���:
	1.���嶯����
		���ԣ�
			���䣬��ɫ
		��Ϊ:
			eat(String something)����(�޾�����Ϊ,��ͬ����Եķ�ʽ�Ͷ�����һ��,something��ʾ�ԵĶ���)
			���ɿղ��вι��죬set��get����

	2.���幷��̳ж�����	  
		��Ϊ:
			eat(String something)����,����lookHome����(�޲���)

	3.����è��̳ж�����
		��Ϊ:eat(String something)����,������catchMouse����(�޲���)

	4.����Person��
		���ԣ�
			����������
		��Ϊ��
			keepPet(Dog dog,String something)����
				���ܣ�ι�����ﹷ��something��ʾι���Ķ���
		��Ϊ��
			keepPet(Cat cat,String something)����
				���ܣ�ι������è��something��ʾι���Ķ���
		���ɿղ��вι��죬set��get����
		
	5.�������Ϸ���*/
public class Demo14 {
public static void main(String[] args) {
	Animal1 a=new Animal1();
	a.eat("��");
	Dog1 d=new Dog1();
	d.eat("��ͷ");
	Cat1 c=new Cat1();
	c.catchMouse();
	c.eat("��");
	Person4 p=new Person4();
	p.keepPet(new Cat1(), "��");
	p.keepPet(new Dog1(),"��ͷ");
	
}
}
class Animal1{
	private int age;
	private String color;
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Animal1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Animal1(int age, String color) {
		super();
		this.age = age;
		this.color = color;
	}

	public void eat(String somthing) {
		System.out.println("��"+somthing);
	}
}
class Dog1 extends Animal1{
	public void lookHome() {
		System.out.println("����");
	}
}
class Cat1 extends Animal1{
	public void catchMouse() {
		System.out.println("ץ����");
	}
}
class Person4{
	 private String name;
	private int age;
	
	public Person4() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person4(String name, int age) {
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
	public void keepPet(Dog1 dog,String something){
		System.out.println("ι�����ﹷ"+something);
	}
	public void keepPet(Cat1 cat,String something) {
		System.out.println("ι������è"+something);
	}
}