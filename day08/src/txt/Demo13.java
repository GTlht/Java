package txt;
/*9.分析以下需求，并用代码实现
	1.定义项目经理类 
		属性：
			姓名 工号 工资 奖金
		行为：
			工作work
	2.定义程序员类
		属性：
			姓名 工号 工资
		行为：
			工作work

	3.要求:向上抽取一个父类,让这两个类都继承这个父类,共有的属性写在父类中，子类重写父类中的方法
	
		编写测试类:完成这两个类的测试*/
public class Demo13 {
	public static void main(String[] args) {
		Code1 c=new Code1();
		c.work();
		Manager1 m=new Manager1();
		m.work();
	}

}
class Code1{
	String name;
	int id;
	double salary;
	public void work() {
		System.out.println("程序员工作");
	}
}
class Manager1 extends Code1{
    double bonus;
    @Override
    public void work() {
		System.out.println("项目经理工作");
	}
}














