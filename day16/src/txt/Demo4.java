package txt;

import java.util.Arrays;

/*4.分析以下需求，并用代码实现	
	1.按照以下描述完成类的定义。
		学生类
			属性：
				姓名name
				年龄age
				成绩score
			行为：
				吃饭eat()
				stuty(String content)(content:表示学习的内容)
	2.定义学生工具StudentsTool,有四个方法,描述如下
		public void listStudents(Student[] arr):遍历打印学生信息
		public int getMaxScore(Student[] arr):获取学生成绩的最高分
		public Student getMaxStudent(Student[] arr):获取成绩最高的学员
		public int getAverageScore(Student[] arr):获取学生成绩的平均值
		public int getCount(Student[] arr):获取不及格的学员数量
	3.定义测试类TestStudentTool，在main方法中首先创建长度为5的Student数组并初始化数据,再创建StudentsTool类的对象,并调用以上方法	*/
public class Demo4 {
	public static void main(String[] args) {
		Student2[] arr=new Student2[5];
		arr[0]=new Student2("张三",12,88);
		arr[1]=new Student2("tom",11,93);
		arr[2]=new Student2("里斯",113,95);
		arr[3]=new Student2("大炮",10,53);
		arr[4]=new Student2("库里四",111,60);
		
		StudentsTool sto=new StudentsTool();
		sto.listStudents(arr);
		System.out.println(sto.getMaxScore(arr));
		System.out.println(sto.getMaxStudent(arr));
		System.out.println(sto.getAverageScore(arr));
		System.out.println(sto.getCount(arr));
	}

}
class StudentsTool{
	public void listStudents(Student2[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	public int getMaxScore(Student2[] arr) {
		int max=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i].getScore()>max) {
				max=arr[i].getScore();
			}
		}
		return max;
	}
	public Student2 getMaxStudent(Student2[] arr) {
		int max=getMaxScore(arr);
		for(int i=0;i<arr.length;i++) {
			if(arr[i].getScore()==max) {
				return arr[i];
			}
		}
		return null;
	}
	public int getAverageScore(Student2[] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i].getScore();
		}
		return sum/arr.length;
	}
	public int getCount(Student2[] arr) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i].getScore()<60) {
				count++;
			}
		}
		return count;
	}
	
}
class Student2{
	private String name;
	private int age ;
	private int score;
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
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public Student2(String name, int age, int score) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
	}
	public Student2() {
		super();
	}
	@Override
	public String toString() {
		return "Student2 [name=" + name + ", age=" + age + ", score=" + score + "]";
	}
	public void stuty(String content) {
		System.out.println("学习"+content);
	}
	public void eat() {
		System.out.println("吃东西");
	}
	
}
