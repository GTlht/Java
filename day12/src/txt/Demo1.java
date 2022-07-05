package txt;

import java.util.Scanner;

/*1.需求：已知用户名和密码，请用程序实现模拟用户登录，总共给三次机会，登录成功之后给出相应提示。	*/
public class Demo1 {
	static String user;
	static String paw;
	public static void main(String[] args) {
		System.out.println("+++++++++++++++++++++++++注册页面+++++++++++++++++++++++++++++");
		login();
		System.out.println("++++++++++++++++++++++++++登录页面++++++++++++++++++++++++++++");
		if(regiest()) {
			System.out.println("登陆成功！");
		}else {
			System.out.println("账号或密码错误！");
		}
	}
	public static void login() {
		
		System.out.println("输入用户名：");
		Scanner sc=new Scanner(System.in);
		user=sc.next();
		System.out.println("输入密码：");
		paw=sc.next();
		
	}
	public static boolean regiest() {
		System.out.println("输入用户名：");
		Scanner sc=new Scanner(System.in);
		String user1=sc.next();
		System.out.println("输入密码：");
		String paw1=sc.next();
		if(user.equals(user1)&&paw.equals(paw1)) {
			return true;
		}
		return false;
	}

}
