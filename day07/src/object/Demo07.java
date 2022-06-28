package object;

public class Demo07 {
	public static void main(String[] args) {
		//创建匿名对象
		new Student();
		
		//给属性赋值
		new Student().name = "tom";
		new Student().age = 18;
		
		//打印属性
		System.out.println(new Student().name);
		System.out.println(new Student().age);
		
		//调用方法
		new Student().study();
	}
}

class Student {
	String name;
	int age;
	
	public void study() {
		System.out.println("学习Java");
	}
}
