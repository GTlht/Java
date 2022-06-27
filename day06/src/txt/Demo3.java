package txt;

import java.util.Scanner;

/*3.定义一个方法，该方法的功能是判断某个变量是奇数还是偶数*/
public class Demo3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		boolean flag=judge(input);
		if(flag) {
			System.out.println(input+"是偶数");
		}else {
			System.out.println(input+"是奇数");
		}
	}
	public static boolean judge(int input) {
		if(input%2==0) {
			return true;
		}else {
			return false;
		}
	}

}
