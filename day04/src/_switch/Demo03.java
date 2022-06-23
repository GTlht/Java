package _switch;

public class Demo03 {
	public static void main(String[] args) {
		int i = 1;
		//局部代码块
		{
			//int i = 1;
			System.out.println(i);
		}
		
		System.out.println(i);
		//十万行代码，没有一行用到变量i
	}
}
