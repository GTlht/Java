package txt;

import java.util.Scanner;

/*2.����һ���������÷����Ĺ����Ǵ�ӡ�����˷���*/
public class Demo2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		print(input);
		
	}
	public static void print(int input) {
		for(int i=1;i<=input;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i+"*"+j+"="+i*j+"\t");
			}
			System.out.println();
		}
	}

}
