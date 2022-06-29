package txt;
/*9.根据描述写代码
	分析以下需求，并用代码实现
	1.老师类Teacher
		属性:
			姓名name
			年龄age
			讲课内容content
		行为:
			吃饭
			讲课
	2.学生类Student
		属性:
			姓名name
			年龄age
			学习内容content
		行为:
			吃饭eat()
			学习study()
	要求:
		1.按照以上要求定义Teacher类和Student类,属性要私有,生成空参、有参构造，setter和getter方法
		2.定义测试类,在main方法中创建该类的对象并给属性赋值(演示两种方法:setter方法和构造方法)
		3.调用成员方法,打印格式如下:
			年龄为30的小刚老师正在吃饭....
			年龄为30的小刚老师正在亢奋的讲着JavaSE中面向对象的知识........("JavaSE中面向对象"代表老师讲课的内容)	
			年龄为18的韩光同学正在吃饭....			
			年龄为18的韩光同学正在专心致志的听着面向对象的知识....("面向对象"代表学生学习的内容)*/
public class Demo9 {
	public static void main(String[] args) {
		Teacher1 t=new Teacher1("小刚",30,"javaS面向对象");
		Student2 s=new Student2();
		s.setName("韩光");
		s.setAge(18);
		s.setContent("面向对象");
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
		System.out.println("年龄为"+age+"的"+name+"老师正在吃饭....");
	}
	public void teach() {
		System.out.println("年龄为"+age+"的"+name+"老师正在亢奋的讲着"+content+"的知识........	");
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
		System.out.println("年龄为"+age+"的"+name+"同学正在吃饭....	");
	}
	public void study() {
		System.out.println("年龄为"+age+"的"+name+"同学正在专心致志的听着"+content+"的知识....");
	}
	
}