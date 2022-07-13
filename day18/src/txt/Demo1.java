package txt;

import java.util.TreeSet;

/*1.分析以下需求，并用代码实现：
	(1)定义一个员工类Employee，包含三个属性：姓名(String name)、年龄(int age)、工资(int salary)
	(2)创建5个对象装入TreeSet，按照工资从高到底排序输出结果(工资相同，按照年龄从低到高，工资和年龄都相同，
		按照姓名字典顺序排列，但是不能去重(姓名、年龄、工资都相同))*/
public class Demo1 {
	public static void main(String[] args) {
		TreeSet<Employee> set=new TreeSet<Employee>();
		set.add(new Employee("zhangsan",24,8888));
		set.add(new Employee("zhangsan",26,8888));
		set.add(new Employee("ahangsan",24,8888));
		set.add(new Employee("ahangsan",24,9888));
		set.add(new Employee("ahangsan",24,8888));
	for (Employee e : set) {
		System.out.println(e);
	}
	}

}
class Employee implements Comparable<Employee> {
	private String name;
	private int age;
	private int salary;
	
	public Employee(String name, int age, int salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}

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

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		int num=o.getSalary()-this.getSalary();
		int num1=(num==0?this.getAge()-o.getAge():num);
		int num2=(num1==0?this.getName().compareTo(o.getName()):num1);
		return num2==0?1:num2;
	}
	
}