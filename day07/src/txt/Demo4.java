package txt;
/*4.�����������󣬲��ô���ʵ��
	1.��ʦ��Teacher
		����:
			����name
			����age
		��Ϊ:
			�Է�
			����
	2.ѧ����Student
		����:
			����name
			����age
		��Ϊ:
			�Է�eat()
			ѧϰstudy()*/
public class Demo4 {
	public static void main(String[] args) {
		
	}

}

class Teacher{
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
	public void eat() {
		System.out.println("�Է�");
	}
	public void teac() {
		System.out.println("�ڿ�");
	}
}
class Student{
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
	public void eat() {
		System.out.println("�Է�");
	}
	public void study() {
		System.out.println("ѧϰ");
	}
}