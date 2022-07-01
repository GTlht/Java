package txt;
/*	创建饲养员对象,饲养员调用三次饲养方法:饲养狗,饲养羊,饲养青蛙

	要求: 
		1.子类重写父类中的吃东西方法
		2.要求给狗和青蛙添加游泳的方法(实现游泳接口)
		3.饲养员类中定义一个方法,传入动物类对象(父类),
			调用吃饭方法,如果有游泳方法也需进行测试
*/
public class Demo13 {
	public static void main(String[] args) {
		Dog2 d=new Dog2();
		Frog fr=new Frog();
		Sheep s=new Sheep();
		Feeder fe=new Feeder();
		fe.feed(d);
		d.swiming();
		fe.feed(fr);
		fr.swiming();
		fe.feed(s);
	}

}
class Animal1{
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
}
interface Swiming{
	void swiming();
}
class Dog2 extends Animal1 implements Swiming{
	public void eat() {
		System.out.println("狗啃骨头");
	}
	public void swiming() {
		System.out.println("狗会狗刨游泳");
	}
}
class Sheep extends Animal1{
	public void eat() {
		System.out.println("羊啃草");
	}
	
}
class Frog extends Animal1 implements Swiming{
	public void eat() {
		System.out.println("青蛙吃虫子");
	}
	public void swiming() {
		System.out.println("青蛙会蛙泳");
	}
}
class Feeder{
	public void feed(Animal1 animal) {
		animal.drink();
		animal.eat();
	
	}
}