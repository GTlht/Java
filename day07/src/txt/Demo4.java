package txt;
/*4.分析以下需求，并用代码实现
	1.老师类Teacher
		属性:
			姓名name
			年龄age
		行为:
			吃饭
			讲课
	2.学生类Student
		属性:
			姓名name
			年龄age
		行为:
			吃饭eat()
			学习study()*/
public class Demo4 {
	public static void main(String[] args) {
		
	}

}

class Teacher{
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
	public void eat() {
		System.out.println("吃饭");
	}
	public void teac() {
		System.out.println("授课");
	}
}
class Student{
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
	public void eat() {
		System.out.println("吃饭");
	}
	public void study() {
		System.out.println("学习");
	}
}