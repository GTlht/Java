package txt;
/*10.��������д����
	�����������󣬲��ô���ʵ��
	1.è��Cat		
		����:
			ë����ɫcolor
			Ʒ��breed
		��Ϊ:
			�Է�eat()
			ץ����catchMouse()
	2.����Dog
		����:
			ë����ɫcolor
			Ʒ��breed
		��Ϊ:
			�Է�()
			����lookHome()
	Ҫ��:
		1.��������Ҫ����Cat���Dog��,����Ҫ˽��,���ɿղΡ��вι��죬setter��getter����
		2.���������,��main�����д�������Ķ��󲢸����Ը�ֵ(��ʾ���ַ���:setter�����͹��췽��)
		3.���ó�Ա����,��ӡ��ʽ����:
			��ɫ�Ĳ�˹è���ڳ���.....
			��ɫ�Ĳ�˹è���ڴ�����....
			��ɫ�Ĳ������ڿй�ͷ.....
			��ɫ�Ĳ������ڿ���.....	
*/
public class Demo10 {
	public static void main(String[] args) {
		Cat c=new Cat("��ɫ","��˹è");
		c.eat();
		c.catchMouse();
		
		Dog d=new Dog();
		d.setColor("��ɫ");
		d.setBreed("����");
		d.eat();
		d.lookHome();
	}

}
class Cat{
	private String color;
	private String breed;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public Cat(String color, String breed) {
		this.color = color;
		this.breed = breed;
	}
	public Cat() {
		
	}
	public void eat() {
		System.out.println(color+"��"+breed+"���ڿй�ͷ.....");
	}
	public void catchMouse() {
		System.out.println(color+"��"+breed+"���ڴ�����....");
	}
}
class Dog{
	private String color;
	private String breed;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public Dog(String color, String breed) {
		this.color = color;
		this.breed = breed;
	}
	public Dog() {
		
	}
	public void eat() {
		System.out.println(color+"��"+breed+"���ڳ���.....");
	}
	public void lookHome() {
		System.out.println(color+"��"+breed+"���ڿ���.....");
	}
}