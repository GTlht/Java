package txt;
/*5.�����������󣬲��ô���ʵ��
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
*/
public class Demo5 {
public static void main(String[] args) {
	
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
	public void catchMouse() {
		System.out.println("ץ����");
	}
	public void eat() {
		System.out.println("�Զ���");
	}
}

class Dog1{
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
	public void catchMouse() {
		System.out.println("ץ����");
	}
	public void lookHome() {
		System.out.println("����");
	}
}









