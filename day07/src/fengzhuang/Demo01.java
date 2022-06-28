package fengzhuang;

public class Demo01 {
	public static void main(String[] args) {
		Person p = new Person();
		//p.name = "tom";
		p.setName("tom");
		//p.age = -18;
		p.setAge(17);//给age属性设置值
		//System.out.println(p.name);//获取到name属性值并且打印出来
		System.out.println(p.getName());
		//System.out.println(p.age);
		System.out.println(p.getAge());//获取到age属性值并且打印出来
	}
}

class Person {
	private String name;
	private int age;
	/*String name;
	int age;*/
	
	public void setAge(int a) {
		if(a <= 0) {
			System.out.println("滚犊子");
		} else {
			age = a;
		}
	}
	
	public int getAge() {
		return age;
	}
	
	public void setName(String n) {
		name = n;
	}
	
	public String getName() {
		return name;
	}
}
