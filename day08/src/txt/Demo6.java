package txt;
/*6.根据需求写代码
一、有以下数据：
    1.三个老师信息：
	教师编号 	               姓名	性别	年龄	科目
	t001				薛之谦	男	26	Java
	t002				张碧晨	女	24	IOS
	t003				张杰    	男  28	 Java
	2.存储两个科目信息：
	课程编号		名称	创建时间		课程描述
	s001		Java	2020-02-08	Java学科，包含JavaSE和JavaEE
	s002		IOS	2020-02-09	IOS系统开发
二、请分别定义两个类；
三、创建MainApp类中，包含main()方法，创建相应对象，通过构造方法给成员变量赋值。
四、打印每个对象的所有属性。
要求：每个类要按照封装的原则进行定义。并提供无参和全参的构造方法。*/
public class Demo6 {
	public static void main(String[] args) {
		Teacher t=new Teacher("t001","薛之谦","男",26,"java");
		Course c=new Course("s001","java","2020-02-08","java学科，包含javaSE和javaEE");
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









