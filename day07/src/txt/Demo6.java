package txt;
/*6.����һ������,���ô���ʵ��
	
	1.ѧ����Student
		����:
			����name
			����age
			�ɼ�score
		��Ϊ:
			�Է�eat()
			ѧϰstudy()*/
public class Demo6 {
	public static void main(String[] args) {
		
	}

}
class Student1{
	private String name;
	private int age;
	private double score;
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