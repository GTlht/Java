package txt;
/*2.�����������󣬲��ô���ʵ��
  ������:
	����:����
	��Ϊ:��ˮ,�Զ���
	��Ϊ:��Ӿ����
  ����:
 	��Ϊ:�Է�(�й�ͷ)�� ��Ӿ(����)
  ����:
 	��Ϊ:�Է�(��в�)
  ������:
  	��Ϊ:�Է�(�Գ���)�� ��Ӿ(��Ӿ)
  ����Ա��:
  	��Ϊ:��������:�����Է��ͺ�ˮ
  	*/
public class Demo2 {
	public static void main(String[] args) {
		
	}

}
class Animal{
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public void drink() {
		System.out.println("��ˮ");
	}
	public void eat() {
		System.out.println("�Զ���");
	}
	public void swim() {
		System.out.println("��Ӿ��ʽ");
	}
}
class Dog{
	
	public void eat() {
		System.out.println("�й�ͷ");
	}
	public void swim() {
		System.out.println("����");
	}
	
}
class Sheep{
	public void eat() {
		System.out.println("��в�");
	}
}
class frog{
	public void eat() {
		System.out.println("�Գ���");
	}
	public void swim() {
		System.out.println("��Ӿ");
	}
}
class feeder{
	public void drink() {
		System.out.println("��ˮ");
	}
	public void eat() {
		System.out.println("�Զ���");
	}
	public void feed() {
		
		System.out.println("ι������");
	}
}