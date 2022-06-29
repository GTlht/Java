package txt;
/*10.根据需求完成代码:
	1.定义动物类
		属性：
			年龄，颜色
		行为:
			eat(String something)方法(无具体行为,不同动物吃的方式和东西不一样,something表示吃的东西)
			生成空参有参构造，set和get方法

	2.定义狗类继承动物类	  
		行为:
			eat(String something)方法,看家lookHome方法(无参数)

	3.定义猫类继承动物类
		行为:eat(String something)方法,逮老鼠catchMouse方法(无参数)

	4.定义Person类
		属性：
			姓名，年龄
		行为：
			keepPet(Dog dog,String something)方法
				功能：喂养宠物狗，something表示喂养的东西
		行为：
			keepPet(Cat cat,String something)方法
				功能：喂养宠物猫，something表示喂养的东西
		生成空参有参构造，set和get方法
		
	5.测试以上方法*/
public class Demo14 {
public static void main(String[] args) {
	Animal1 a=new Animal1();
	a.eat("草");
	Dog1 d=new Dog1();
	d.eat("骨头");
	Cat1 c=new Cat1();
	c.catchMouse();
	c.eat("鱼");
	Person4 p=new Person4();
	p.keepPet(new Cat1(), "鱼");
	p.keepPet(new Dog1(),"骨头");
	
}
}
class Animal1{
	private int age;
	private String color;
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Animal1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Animal1(int age, String color) {
		super();
		this.age = age;
		this.color = color;
	}

	public void eat(String somthing) {
		System.out.println("吃"+somthing);
	}
}
class Dog1 extends Animal1{
	public void lookHome() {
		System.out.println("看家");
	}
}
class Cat1 extends Animal1{
	public void catchMouse() {
		System.out.println("抓老鼠");
	}
}
class Person4{
	 private String name;
	private int age;
	
	public Person4() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person4(String name, int age) {
		super();
		this.name = name;
		this.age = age;
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
	public void keepPet(Dog1 dog,String something){
		System.out.println("喂养宠物狗"+something);
	}
	public void keepPet(Cat1 cat,String something) {
		System.out.println("喂养宠物猫"+something);
	}
}