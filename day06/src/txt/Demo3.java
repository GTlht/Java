package txt;

import java.util.Scanner;

/*3.����һ���������÷����Ĺ������ж�ĳ����������������ż��*/
public class Demo3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		boolean flag=judge(input);
		if(flag) {
			System.out.println(input+"��ż��");
		}else {
			System.out.println(input+"������");
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
