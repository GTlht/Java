package txt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/*3.一个学科中有若干班级，每一个班级又有若干学生。
  请使用集合嵌套之ArrayList嵌套ArrayList描述这种关系，要求如下：
	1、学生类有两个属性，姓名和年龄，并定义有参构造、无参构造、setter和getter方法
	2、向班级集合中添加若干学生（至少两个学生）。
	3、向学科集合中添加所有班级（至少两个班级）。
	4、使用两种方式遍历学科集合并打印出所有学生。*/
public class Demo3 {
	public static void main(String[] args) {
		ArrayList<ArrayList<Student>> grade=new ArrayList<ArrayList<Student>>();
		ArrayList<Student> stu=new ArrayList<Student>();
		stu.add(new Student("张三",12));
		stu.add(new Student("里斯",13));
		Collections.addAll(grade, stu);
		//System.out.println(grade);
		System.out.println("第一种");
		for (ArrayList<Student> gr : grade) {
			for (Student st : gr) {
				System.out.println(st);
			}
			
		}
		System.out.println("第二种");
		Iterator<ArrayList<Student>> It=grade.iterator();
		ArrayList temp=null;
		while(It.hasNext()) {
			Iterator<Student>  it=It.next().iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
			}
		}
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
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
}
