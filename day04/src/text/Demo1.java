package text;

import java.util.Scanner;

/*1. �ж�����ż��
���󣺼���¼��һ�������жϸ���������������ż��
*/
public class Demo1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("������һ��������");
		int input=sc.nextInt();
		if(input%2==1) {
			System.out.println("�������:"+input+" ��һ������");
		}else {
			System.out.println("�������:"+input+" ����һ������");
		}
	}

}
