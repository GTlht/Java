package txt;
/*11����������������´��루���ձ�׼��ʽд�������ڲ������н��в��ԡ�
	����һ��
		��֪è��͹��ࣺ
			����:ë����ɫ,�ȵĸ���
			��Ϊ:�Է�
			è������Ϊ:ץ����catchMouse
			��������Ϊ:����lookHome

	�������
		��֪�ӿ�Play����һ������playGame()���ٲ���������ε��ø÷�����

	��������
		��֪�����ࣨ���������䣬�Է���˯�����������������࣬�ֱ���è��͹��ࡣ
		��ͬ����è���㣬�����⡣
		������Ϸ�ŵ���ѵ�󣬲���è�����ߣ����ֹ�Ҳ�����ߡ�
		��д����ʵ�֡�
		*/
public class Demo11 {
	//�����
	public static void main(String[] args) {
		new Play() {
			public void playGame() {
				System.out.println("����Ϸ");
			}
		}.playGame();
		
		
		
		
		
		
	}

}
//����һ
class Dog{
	private String color;
	private int leg;
	
	public Dog() {
		super();
		
	}

	public Dog(String color, int leg) {
		super();
		this.color = color;
		this.leg = leg;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getLeg() {
		return leg;
	}

	public void setLeg(int leg) {
		this.leg = leg;
	}

	public void eat() {
		System.out.println("�Է�");
	}
	public void lookHome() {
		System.out.println("����");
	}
}
class Cat{
	private String color;
	private int leg;
	
	public Cat() {
		super();
		
	}

	public Cat(String color, int leg) {
		super();
		this.color = color;
		this.leg = leg;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getLeg() {
		return leg;
	}

	public void setLeg(int leg) {
		this.leg = leg;
	}

	public void eat() {
		System.out.println("�Է�");
	}
	public void lookHome() {
		System.out.println("ץ����");
	}
}
//�����
interface Play{
	void playGame();
}
//������
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
	public Animal(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Animal() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void eat() {
		System.out.println("�Է�");
	}
	public void sleep() {
		System.out.println("˯��");
	}
}
class Cat1 extends Animal implements Train{
	@Override
	public void eat() {
		System.out.println("����");
	}

	@Override
	public void jump() {
		System.out.println("��Ϸ��ѧ��������");
		
	}
}
class Dog1 extends Animal implements Train{
	@Override
	public void eat() {
		System.out.println("����");
	}

	@Override
	public void jump() {
		System.out.println("��Ϸ��ѧ��������");
	}
}
interface Train{
	void jump();
}