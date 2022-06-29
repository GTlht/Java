package txt;
/*4. 根据如下需求，完成代码(按照标准格式写)，然后在测试类中测试。
	需求一：
		手机类Phone
			属性:品牌brand,价格price
			行为:打电话call,发短信sendMessage,玩游戏,playGame
	需求二：
		人类Person
			属性:姓名name,年龄age,性别gender
			行为:学习study,睡觉sleep

	需求三：
		动物类Animal
			属性:姓名name,年龄age
			行为:吃饭eat
	需求四：
		狗类Dog
			属性:姓名name,年龄age
			行为:吃饭eat，看家lookHome
	需求五：
		猫类Cat
			属性:姓名name,年龄age
			行为:吃饭eat，抓老鼠catchMouse
	需求六：
		学生类Student
			属性:语文成绩chinese，数学成绩math，英语成绩english
			行为:求总成绩的方法getSum()*/
public class Demo4 {
	public static void main(String[] args) {
		Phone p=new Phone("华为",12000.0);
		System.out.println(p.getBrand()+"..."+p.getPrice());
		p.setBrand("三金");
		p.setPrice(999);
		System.out.println(p.getBrand()+"..."+p.getPrice());
		Person p1=new Person("张三",18,"男");
		System.out.println(p1.getName()+"..."+p1.getAge()+"..."+p1.getGender());
		p1.setName("李四");
		p1.setAge(22);
		p1.setGender("女");
		System.out.println(p1.getName()+"..."+p1.getAge()+"..."+p1.getGender());
	    Animal ani=new Animal("羊",5);
	    System.out.println(ani.getName()+"..."+ani.getAge());
	    ani.setName("猪");
	    ani.setAge(3);
	    System.out.println(ani.getName()+"..."+ani.getAge());
	    Student s=new Student(85,89.5,93);
	   System.out.println( s.avg());
	}

}
class Phone{
	private String brand;
	private double price;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public Phone(String brand, double price) {
		this.brand = brand;
		this.price = price;
	}
	public Phone() {
		
	}
	public void call() {
		System.out.println("打电话");
	}
	public void sendMessage() {
		System.out.println("发短信");
	}
	public void playGame() {
		System.out.println("玩游戏");
	}
}
class Person{
	private String name;
	private int age;
	private String gender;
	
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Person(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	public Person() {
		
	}
	public void study() {
		System.out.println("学习");
	}
	public void sleep() {
		System.out.println("睡觉");
	}
}
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

	
	public Animal() {
		
	}

	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void eat() {
		System.out.println("吃东西");
	}
}
class Student{
	private double math;
	private double chinese;
	private double english;
	public double avg() {
		return (math+chinese+english)/3;
	}
	public double getMath() {
		return math;
	}
	public void setMath(double math) {
		this.math = math;
	}
	public double getChinese() {
		return chinese;
	}
	public void setChinese(double chinese) {
		this.chinese = chinese;
	}
	public double getEnglish() {
		return english;
	}
	public void setEnglish(double english) {
		this.english = english;
	}
	public Student(double math, double chinese, double english) {
		this.math = math;
		this.chinese = chinese;
		this.english = english;
	}
	public Student() {
		
	}
	
}


















