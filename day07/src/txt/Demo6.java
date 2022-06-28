package txt;
/*6.分析一下需求,并用代码实现
	
	1.学生类Student
		属性:
			姓名name
			年龄age
			成绩score
		行为:
			吃饭eat()
			学习study()*/
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
		System.out.println("吃饭");
	}
	public void study() {
		System.out.println("学习");
	}
}