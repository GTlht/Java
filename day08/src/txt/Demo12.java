package txt;
/*8. �����������󣬲��ô���ʵ��
	1.����Person��
		���ԣ�
			����name���Ա�gender������age������nationality��
		������
			�Է�eat��˯��sleep������work��
	2.�������࣬����һ��ѧ����Student
		�������ԣ�
			ѧУschool��ѧ��stuNumber��
		��д����������ѧ���Ĺ�����ѧϰ����	
	3.�������࣬����һ��������Worker
		�������ԣ�
			��λunit������workAge��
		��д�������������˵Ĺ����ǸǷ��ӣ���
	4.����ѧ���࣬����һ��ѧ���ɲ��� StudentLeader
		�������ԣ�
			ְ��job��
		���ӷ���������meeting��ѧ���ɲ�ϲ������!����
	5.��д������ֱ������3�����������в��ԡ�

	6.Ҫ�����н��:
		ѧ����Ҫѧϰ!
		���˵Ĺ����ǸǷ���!
		ѧ���ɲ�ϲ������!
 * */
public class Demo12 {
	public static void main(String[] args) {
		Student3 s=new Student3();
		s.work();
		Worker w=new Worker();
		w.work();
		StudentLeader sl=new StudentLeader();
		sl.meeting();
	}

}
class Person1{
	 String name;
	 String gender;
	 int age;
	 String nationnality;
	public Person1(String name, String gender, int age, String nationnality) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.nationnality = nationnality;
	}
	public Person1() {
		
	}
	public void eat() {
		System.out.println("�Է�");
	}
	public void sleep() {
		System.out.println("˯��");
	}
	public void work() {
		System.out.println("����");
	}
}
class Student3 extends Person1{
	String school;
	String stuNumber;
	
	public Student3(String name, String gender, int age, String nationnality, String school, String stuNumber) {
		super(name, gender, age, nationnality);
		this.school = school;
		this.stuNumber = stuNumber;
	}

	public Student3() {
		
	}

	public Student3(String name, String gender, int age, String nationnality) {
		super(name, gender, age, nationnality);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void work() {
		System.out.println("ѧ���Ĺ�����ѧϰ");
	}
}
class Worker extends Person1{
	String unit;
	int workAge;
	public Worker(String name, String gender, int age, String nationnality, String unit, int workAge) {
		super(name, gender, age, nationnality);
		this.unit = unit;
		this.workAge = workAge;
	}
	public Worker() {
		super();
	}
	@Override
	public void work() {
		System.out.println("���˵Ĺ����ǸǷ���");
	}
}
class  StudentLeader extends Person1{
	String job;

	public StudentLeader(String name, String gender, int age, String nationnality, String job) {
		super(name, gender, age, nationnality);
		this.job = job;
	}

	public StudentLeader() {
		
	}

	public void meeting() {
		System.out.println("ѧ���ɲ�ϲ�����ᣡ");
	}
	
}