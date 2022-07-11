package txt;

import java.util.ArrayList;
import java.util.Collections;

/*5.分析以下需求，并用代码实现
	1.定义Student类
		属性:
			姓名：String name
			年龄：int age
			成绩：int score
		行为:
			空参构造方法
			有参构造方法
			set和get方法
			toString方法
	2.定义测试类,进行测试
		(1)创建5个学生对象存入ArrayList集合中
		(2)打印最高分的学员姓名、年龄、成绩  [要求封装1个方法  参数是集合对象   返回值类型为Student]
		(3)打印5个学生的总成绩和平均分		 [要求封装两个方法完成]
		(4)打印不及格的学员信息及数量		 [要求封装一个方法完成]*/
public class Demo5 {
	public static void main(String[] args) {
		ArrayList<Student2> list=new ArrayList<Student2>();
		Collections.addAll(list, new Student2("zhangsan",12,89),new Student2("xiaohua",11,98),new Student2("lisi",10,55),
				new Student2("huahua",11,70),new Student2("kangkang",10,52));
		
		System.out.println("最高分"+getMaxStu(list));
		fail(list);
		
	}
	public static Student2 getMaxStu(ArrayList<Student2> list) {
		Student2 max=list.get(0);
		for(int i=1;i<list.size();i++) {
			if(list.get(i).getScore()>max.getScore()) {
				max=list.get(i);
			}
		}
		return max;
	}
	public static int sumStu(ArrayList<Student2> list) {
		int sum=0;
		for(int i=0;i<list.size();i++) {
			sum+=list.get(i).getScore();
		}
		return sum;
	}
	public static int avgStu(ArrayList<Student2> list) {
		return sumStu(list)/list.size();
	}
	public static void fail(ArrayList<Student2> list) {
		int count=0;
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getScore()<60){
				count++;
				System.out.println(list.get(i));
				}
			}
		System.out.println("不及格人数"+count);
	}

}
