package txt;
/*5.分析以下需求，并用代码实现
	1.猫类Cat		
		属性:
			毛的颜色color
			品种breed
		行为:
			吃饭eat()
			抓老鼠catchMouse()

	2.狗类Dog
		属性:
			毛的颜色color
			品种breed
		行为:
			吃饭()
			看家lookHome()
*/
public class Demo5 {
public static void main(String[] args) {
	
}
}

class Cat{
	private String color;
	private String breed;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public void catchMouse() {
		System.out.println("抓老鼠");
	}
	public void eat() {
		System.out.println("吃东西");
	}
}

class Dog1{
	private String color;
	private String breed;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public void catchMouse() {
		System.out.println("抓老鼠");
	}
	public void lookHome() {
		System.out.println("看家");
	}
}









