package txt;

import java.util.Scanner;

/*1.����һ���������÷����Ĺ����Ǵ�ӡ�������ĺ�*/
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
