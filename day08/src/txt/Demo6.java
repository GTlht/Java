package txt;
/*6.��������д����
һ�����������ݣ�
    1.������ʦ��Ϣ��
	��ʦ��� 	               ����	�Ա�	����	��Ŀ
	t001				Ѧ֮ǫ	��	26	Java
	t002				�ű̳�	Ů	24	IOS
	t003				�Ž�    	��  28	 Java
	2.�洢������Ŀ��Ϣ��
	�γ̱��		����	����ʱ��		�γ�����
	s001		Java	2020-02-08	Javaѧ�ƣ�����JavaSE��JavaEE
	s002		IOS	2020-02-09	IOSϵͳ����
������ֱ��������ࣻ
��������MainApp���У�����main()������������Ӧ����ͨ�����췽������Ա������ֵ��
�ġ���ӡÿ��������������ԡ�
Ҫ��ÿ����Ҫ���շ�װ��ԭ����ж��塣���ṩ�޲κ�ȫ�εĹ��췽����*/
public class Demo6 {
	public static void main(String[] args) {
		Teacher t=new Teacher("t001","Ѧ֮ǫ","��",26,"java");
		Course c=new Course("s001","java","2020-02-08","javaѧ�ƣ�����javaSE��javaEE");
		System.out.println(t);
		System.out.println(c);
	}

}
class Teacher{
	private String id;
	private String name;
	private String sex;
	private int age;
	private String subject;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public Teacher(String id, String name, String sex, int age, String subject) {
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.subject = subject;
	}
	public Teacher() {
	
	}
	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", sex=" + sex + ", age=" + age + ", subject=" + subject + "]";
	}
	
}

class Course{
	private String id;
	private String name;
	private String time;
	private String comment;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public Course(String id, String name, String time, String comment) {
		this.id = id;
		this.name = name;
		this.time = time;
		this.comment = comment;
	}
	public Course() {
	
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", time=" + time + ", comment=" + comment + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}









