package txt;
/*8.根据描述写代码
	分析以下需求，并用代码实现
	1.项目经理类Manager 
		属性：
			姓名name
			工号id
			工资salary
			奖金bonus
		行为：
			工作work()
	2.程序员类Coder
		属性：
			姓名name
			工号id
			工资salary
		行为：
			工作work()
	要求:
		1.按照以上要求定义Manager类和Coder类,属性要私有,生成空参、有参构造，setter和getter方法
		2.定义测试类,在main方法中创建该类的对象并给属性赋值(演示两种方法:setter方法和构造方法)
		3.调用成员方法,打印格式如下:
			工号为123基本工资为15000奖金为6000的项目经理一龙正在努力的做着管理工作,分配任务,检查员工提交上来的代码.....
			工号为135基本工资为10000的程序员方便正在努力的写着代码......操作步骤描述*/
public class Demo8 {
	public static void main(String[] args) {
		Manager m=new Manager("张三",1,8222.5,2000);
		System.out.println(m.getName()+"..."+m.getId()+"..."+m.getSalary()+"..."+m.getBonus());
		m.setName("李四");
		m.setId(2);
		m.setSalary(9000.88);
		m.setBonus(3000);
		System.out.println(m.getName()+"..."+m.getId()+"..."+m.getSalary()+"..."+m.getBonus());
		
		Manager m1=new Manager("一龙",123,15000,6000);
		Coder c=new Coder("方便",135,10000);
		m1.work();
		c.work();
		
		
	}
	
	

}
class Manager{
	private String name;
	private int id;
	private double salary;
	private double bonus;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	public Manager(String name, int id, double salary, double bonus) {
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.bonus = bonus;
	}
	public Manager() {
		
	}
	public void work() {
		System.out.println("工号为"+id+"基本工资为"+salary+"奖金为"+bonus+"的项目经理"+name+"正在努力的做着管理工作,分配任务,检查员工提交上来的代码.....");
	}
	
}
class Coder{
	private String name;
	private int id;
	private double salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Coder(String name, int id, double salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	public Coder() {
		
	}
	public void work() {
		System.out.println("工号为"+id+"基本工资为"+salary+"的程序员"+name+"正在努力的写着代码......操作步骤描述");
	}
	
}