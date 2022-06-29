package txt;
/*8. 分析以下需求，并用代码实现
	1.定义Person类
		属性：
			姓名name、性别gender、年龄age、国籍nationality；
		方法：
			吃饭eat、睡觉sleep，工作work。
	2.根据人类，创建一个学生类Student
		增加属性：
			学校school、学号stuNumber；
		重写工作方法（学生的工作是学习）。	
	3.根据人类，创建一个工人类Worker
		增加属性：
			单位unit、工龄workAge；
		重写工作方法（工人的工作是盖房子）。
	4.根据学生类，创建一个学生干部类 StudentLeader
		增加属性：
			职务job；
		增加方法：开会meeting（学生干部喜欢开会!）。
	5.编写测试类分别对上述3类具体人物进行测试。

	6.要求运行结果:
		学生需要学习!
		工人的工作是盖房子!
		学生干部喜欢开会!
 * */
public class Demo12 {
	public static void main(String[] args) {
		Student3 s=new Student3();
		s.work();
		Worker w=new Worker();
		w.work();
		StudentLeader sl=new StudentLeader();
		sl.meeting();
	}

}
class Person1{
	 String name;
	 String gender;
	 int age;
	 String nationnality;
	public Person1(String name, String gender, int age, String nationnality) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.nationnality = nationnality;
	}
	public Person1() {
		
	}
	public void eat() {
		System.out.println("吃饭");
	}
	public void sleep() {
		System.out.println("睡觉");
	}
	public void work() {
		System.out.println("工作");
	}
}
class Student3 extends Person1{
	String school;
	String stuNumber;
	
	public Student3(String name, String gender, int age, String nationnality, String school, String stuNumber) {
		super(name, gender, age, nationnality);
		this.school = school;
		this.stuNumber = stuNumber;
	}

	public Student3() {
		
	}

	public Student3(String name, String gender, int age, String nationnality) {
		super(name, gender, age, nationnality);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void work() {
		System.out.println("学生的工作是学习");
	}
}
class Worker extends Person1{
	String unit;
	int workAge;
	public Worker(String name, String gender, int age, String nationnality, String unit, int workAge) {
		super(name, gender, age, nationnality);
		this.unit = unit;
		this.workAge = workAge;
	}
	public Worker() {
		super();
	}
	@Override
	public void work() {
		System.out.println("工人的工作是盖房子");
	}
}
class  StudentLeader extends Person1{
	String job;

	public StudentLeader(String name, String gender, int age, String nationnality, String job) {
		super(name, gender, age, nationnality);
		this.job = job;
	}

	public StudentLeader() {
		
	}

	public void meeting() {
		System.out.println("学生干部喜欢开会！");
	}
	
}