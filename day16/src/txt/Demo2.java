package txt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/*2.请按以下要求编写代码：
	1.定义Student类，包含以下属性：
		学号、姓名、身高
	2.定义MainApp类，包含main()方法；
	3.在main()方法中，创建一个可以存储Student对象的集合对象；
	4.创建以下几个Student对象：
		学号		姓名		身高	
		a001		黄渤		1.72
		a002		孙红雷		1.78
		a003		章子怡		1.64
		a004		杨颖		1.68
	5.将上面几个对象添加到集合中
	6.遍历集合打印每个对象的属性值；
	7.获取并打印集合大小；
	8.获取第3个学员对象，并打印其属性值；
	9.移除掉第4个学员对象；
	10.再次获取并打印集合大小；
	11.将第一个对象替换为以下对象：
		a005	撒贝宁	1.67
	12.遍历集合，打印出身高在1.70以上的学员信息;
	13.遍历集合，打印出“孙”姓的学员信息;*/
public class Demo2 {
	public static void main(String[] args) {
		ArrayList<Student> list=new ArrayList<Student>();
		Collections.addAll(list, new Student("a001","黄渤",1.72),
				new Student("a002","孙红雷",1.782),new Student("a003","章子怡",1.64),
				new Student("a004","杨颖",1.68));
		Iterator it= list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println(list.size());
		System.out.println(list.get(2));
		list.remove(3);
		System.out.println(list.size());
		list.set(0, new Student("a005","撒贝宁",1.67));
		Iterator it1= list.iterator();
		while(it1.hasNext()) {
			Student s=(Student) it1.next();
			if(s.getHight()>1.70) {
			System.out.println(s);
		}
	}
		Iterator it2= list.iterator();
		while(it2.hasNext()) {
			Student s=(Student) it2.next();
			if(s.getName().startsWith("孙")) {
			System.out.println(s);
		}
	}

}
}	
	
class Student{
	private String id;
	private String name;
	private double hight;
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
	public double getHight() {
		return hight;
	}
	public void setHight(double hight) {
		this.hight = hight;
	}
	public Student(String id, String name, double hight) {
		super();
		this.id = id;
		this.name = name;
		this.hight = hight;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", hight=" + hight + "]";
	}
	
}
