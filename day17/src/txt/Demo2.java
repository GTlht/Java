package txt;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/*2.分析以下需求，并用代码实现：
	(1)定义一个Person类型(属性私有、空参有参构造、set、get方法、toString方法、equals方法、hashCode方法)，
		包含三个属性：姓名(String name)、年龄(int age)
	(2)List集合中存储多个Person对象,获取年龄最大的Person对象并打印信息
	(3)思路
		a.定义一个Person类型的变量, 先记住第一个元素
		b.循环遍历集合
		c.用每一个元素和变量比较年龄, 如果集合中的元素比变量记住的年龄大
		d.用变量记住这个年龄较大的元素
		e.返回变量记住的元素*/
public class Demo2 {
	public static void main(String[] args) {
		List<Person> list=new ArrayList<Person>();
		list.add(new Person("nn",18));
		list.add(new Person("hfh",19));
		list.add(new Person("juijk",25));
		System.out.println(list);
		int max=list.get(0).getAge();
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getAge()>max) {
				max=list.get(i).getAge();
			}
		}
		System.out.println(max);
	}

}
class Person{
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
	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return age == other.age && Objects.equals(name, other.name);
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
}