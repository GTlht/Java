package txt;

import java.util.ArrayList;
import java.util.List;

/*6.创建学生对象(Student类),包含学生信息(姓名和年龄),创建对应get、set方法,有参构造和无参构造。
  1、向List集合添加学生信息。
  2、把List集合中学生姓李的同学打印到控制台：(格式为：姓名为：李四,年龄为：24)*/
public class Demo6 {

	public static void main(String[] args) {
		List<Student> stu=new ArrayList<Student>();
		stu.add(new Student("张三",15));
		stu.add(new Student("李四",15));
		stu.add(new Student("王二",12));
		stu.add(new Student("李斯",11));
		System.out.println(stu);
		System.out.println("姓李的同学：");
		for (Student s : stu) {
			if(s.getName().startsWith("李")) {
				System.out.println(s);
			}
		}
	}
}
