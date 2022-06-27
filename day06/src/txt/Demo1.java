package txt;

import java.util.Scanner;

/*1.定义一个方法，该方法的功能是打印两个数的和*/
public class Demo1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println(getSum(a,b));
		
	}
	public static int getSum(int a,int b) {
		return a+b;
	}

}
