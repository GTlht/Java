package txt;
/*8.��������д����
	�����������󣬲��ô���ʵ��
	1.��Ŀ������Manager 
		���ԣ�
			����name
			����id
			����salary
			����bonus
		��Ϊ��
			����work()
	2.����Ա��Coder
		���ԣ�
			����name
			����id
			����salary
		��Ϊ��
			����work()
	Ҫ��:
		1.��������Ҫ����Manager���Coder��,����Ҫ˽��,���ɿղΡ��вι��죬setter��getter����
		2.���������,��main�����д�������Ķ��󲢸����Ը�ֵ(��ʾ���ַ���:setter�����͹��췽��)
		3.���ó�Ա����,��ӡ��ʽ����:
			����Ϊ123��������Ϊ15000����Ϊ6000����Ŀ����һ������Ŭ�������Ź�����,��������,���Ա���ύ�����Ĵ���.....
			����Ϊ135��������Ϊ10000�ĳ���Ա��������Ŭ����д�Ŵ���......������������*/
public class Demo8 {
	public static void main(String[] args) {
		Manager m=new Manager("����",1,8222.5,2000);
		System.out.println(m.getName()+"..."+m.getId()+"..."+m.getSalary()+"..."+m.getBonus());
		m.setName("����");
		m.setId(2);
		m.setSalary(9000.88);
		m.setBonus(3000);
		System.out.println(m.getName()+"..."+m.getId()+"..."+m.getSalary()+"..."+m.getBonus());
		
		Manager m1=new Manager("һ��",123,15000,6000);
		Coder c=new Coder("����",135,10000);
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
		System.out.println("����Ϊ"+id+"��������Ϊ"+salary+"����Ϊ"+bonus+"����Ŀ����"+name+"����Ŭ�������Ź�����,��������,���Ա���ύ�����Ĵ���.....");
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
		System.out.println("����Ϊ"+id+"��������Ϊ"+salary+"�ĳ���Ա"+name+"����Ŭ����д�Ŵ���......������������");
	}
	
}