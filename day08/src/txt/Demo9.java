package txt;
/*9.��������д����
	�����������󣬲��ô���ʵ��
	1.��ʦ��Teacher
		����:
			����name
			����age
			��������content
		��Ϊ:
			�Է�
			����
	2.ѧ����Student
		����:
			����name
			����age
			ѧϰ����content
		��Ϊ:
			�Է�eat()
			ѧϰstudy()
	Ҫ��:
		1.��������Ҫ����Teacher���Student��,����Ҫ˽��,���ɿղΡ��вι��죬setter��getter����
		2.���������,��main�����д�������Ķ��󲢸����Ը�ֵ(��ʾ���ַ���:setter�����͹��췽��)
		3.���ó�Ա����,��ӡ��ʽ����:
			����Ϊ30��С����ʦ���ڳԷ�....
			����Ϊ30��С����ʦ���ڿ��ܵĽ���JavaSE����������֪ʶ........("JavaSE���������"������ʦ���ε�����)	
			����Ϊ18�ĺ���ͬѧ���ڳԷ�....			
			����Ϊ18�ĺ���ͬѧ����ר����־��������������֪ʶ....("�������"����ѧ��ѧϰ������)*/
public class Demo9 {
	public static void main(String[] args) {
		Teacher1 t=new Teacher1("С��",30,"javaS�������");
		Student2 s=new Student2();
		s.setName("����");
		s.setAge(18);
		s.setContent("�������");
		t.eat();
		t.teach();
		s.eat();
		s.study();

	}
	
}
class Teacher1{
	private String name;
	private int age;
	private String content;
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
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Teacher1(String name, int age, String content) {
		this.name = name;
		this.age = age;
		this.content = content;
	}
	public Teacher1() {
		
	}
	public void eat() {
		System.out.println("����Ϊ"+age+"��"+name+"��ʦ���ڳԷ�....");
	}
	public void teach() {
		System.out.println("����Ϊ"+age+"��"+name+"��ʦ���ڿ��ܵĽ���"+content+"��֪ʶ........	");
	}
}
class Student2{
	private String name;
	private int age;
	private String content;
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
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Student2(String name, int age, String content) {
		this.name = name;
		this.age = age;
		this.content = content;
	}
	public Student2() {
		
	}
	public void eat() {
		System.out.println("����Ϊ"+age+"��"+name+"ͬѧ���ڳԷ�....	");
	}
	public void study() {
		System.out.println("����Ϊ"+age+"��"+name+"ͬѧ����ר����־������"+content+"��֪ʶ....");
	}
	
}