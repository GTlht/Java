package txt;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

/*1.分析以下需求，并用代码实现：
	(1)定义一个学生类Student，包含属性：姓名(String name)、年龄(int age)
	(2)定义Map集合，用Student对象作为key，用字符串(此表示表示学生的住址)作为value
	(3)利用四种方式遍历Map集合中的内容，格式：key::value*/
public class Demo1 {
	public static void main(String[] args) {
		HashMap<Student, String> map=new HashMap<Student, String>();
		map.put(new Student("lili",12), "beijing");
		map.put(new Student("huahua",13), "chongqing");
		map.put(new Student("huahua",14), "chongqing");
		map.put(new Student("xiaoming",15), "chongqing");
		map.put(new Student("huahua",13), "chongqing");
		Set<Student> keySet=map.keySet();
		for (Student key : keySet) {
			System.out.println(key+"::"+map.get(key));
		}
		System.out.println("++++++++++++++++++++++++++++++++++++++++");
		Set<Entry<Student, String>> entrySet=map.entrySet();
		for (Entry<Student, String> entry : entrySet) {
			System.out.println(entry.getKey()+"::"+entry.getValue());
			
		}
		System.out.println("+++++++++++++++++++++++++++++++++++++");
		Iterator<Entry<Student, String>> it=entrySet.iterator();
		while(it.hasNext()) {
			Entry<Student, String> es=it.next();
			System.out.println(es.getKey()+"::"+es.getValue());
		}
		System.out.println("++++++++++++++++++++++++++++++++++++");
		Iterator<Student> it1=keySet.iterator();
		while(it1.hasNext()) {
			Student key=it1.next();
			System.out.println(key+"::"+map.get(key));
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
