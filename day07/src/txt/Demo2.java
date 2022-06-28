package txt;
/*2.分析以下需求，并用代码实现
  动物类:
	属性:年龄
	行为:喝水,吃东西
	行为:游泳方法
  狗类:
 	行为:吃饭(啃骨头)和 游泳(狗刨)
  羊类:
 	行为:吃饭(羊啃草)
  青蛙类:
  	行为:吃饭(吃虫子)和 游泳(蛙泳)
  饲养员类:
  	行为:饲养动物:包括吃饭和喝水
  	*/
public class Demo2 {
	public static void main(String[] args) {
		
	}

}
class Animal{
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public void drink() {
		System.out.println("喝水");
	}
	public void eat() {
		System.out.println("吃东西");
	}
	public void swim() {
		System.out.println("游泳方式");
	}
}
class Dog{
	
	public void eat() {
		System.out.println("啃骨头");
	}
	public void swim() {
		System.out.println("狗刨");
	}
	
}
class Sheep{
	public void eat() {
		System.out.println("羊啃草");
	}
}
class frog{
	public void eat() {
		System.out.println("吃虫子");
	}
	public void swim() {
		System.out.println("蛙泳");
	}
}
class feeder{
	public void drink() {
		System.out.println("喝水");
	}
	public void eat() {
		System.out.println("吃东西");
	}
	public void feed() {
		
		System.out.println("喂养动物");
	}
}