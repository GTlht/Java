package text;

import java.util.Scanner;

/*1. 判断奇数偶数
需求：键盘录入一个数，判断该数字是奇数还是偶数
*/
public class Demo1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个数整数");
		int input=sc.nextInt();
		if(input%2==1) {
			System.out.println("你输入的:"+input+" 是一个奇数");
		}else {
			System.out.println("你输入的:"+input+" 不是一个奇数");
		}
	}

}
