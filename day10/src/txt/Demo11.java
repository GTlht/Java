package txt;
/*11、根据需求，完成如下代码（按照标准格式写），并在测试类中进行测试。
	需求一：
		已知猫类和狗类：
			属性:毛的颜色,腿的个数
			行为:吃饭
			猫特有行为:抓老鼠catchMouse
			狗特有行为:看家lookHome

	需求二：
		已知接口Play中有一个方法playGame()，再测试类中如何调用该方法？

	需求三：
		已知动物类（姓名，年龄，吃饭，睡觉），它有两个子类，分别是猫类和狗类。
		不同的是猫吃鱼，狗吃肉。
		经过马戏团的培训后，部分猫会跳高，部分狗也会跳高。
		请写代码实现。
		*/
public class Demo11 {
	//需求二
	public static void main(String[] args) {
		new Play() {
			public void playGame() {
				System.out.println("玩游戏");
			}
		}.playGame();
		
		
		
		
		
		
	}

}
//需求一
class Dog{
	private String color;
	private int leg;
	
	public Dog() {
		super();
		
	}

	public Dog(String color, int leg) {
		super();
		this.color = color;
		this.leg = leg;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getLeg() {
		return leg;
	}

	public void setLeg(int leg) {
		this.leg = leg;
	}

	public void eat() {
		System.out.println("吃饭");
	}
	public void lookHome() {
		System.out.println("看家");
	}
}
class Cat{
	private String color;
	private int leg;
	
	public Cat() {
		super();
		
	}

	public Cat(String color, int leg) {
		super();
		this.color = color;
		this.leg = leg;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getLeg() {
		return leg;
	}

	public void setLeg(int leg) {
		this.leg = leg;
	}

	public void eat() {
		System.out.println("吃饭");
	}
	public void lookHome() {
		System.out.println("抓老鼠");
	}
}
//需求二
interface Play{
	void playGame();
}
//需求三
class Animal{
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
	public Animal(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Animal() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void eat() {
		System.out.println("吃饭");
	}
	public void sleep() {
		System.out.println("睡觉");
	}
}
class Cat1 extends Animal implements Train{
	@Override
	public void eat() {
		System.out.println("吃鱼");
	}

	@Override
	public void jump() {
		System.out.println("马戏团学会了跳高");
		
	}
}
class Dog1 extends Animal implements Train{
	@Override
	public void eat() {
		System.out.println("吃肉");
	}

	@Override
	public void jump() {
		System.out.println("马戏团学会了跳高");
	}
}
interface Train{
	void jump();
}