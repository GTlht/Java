package txt;

import java.util.Scanner;

/* 
4.����һ���������÷����Ĺ����Ǵ�ӡn��m֮������е�����*/
public class Demo4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		print(n,m);
	}
	public static void print(int n,int m) {
		for(int i=n;i<=m;i++) {
			if(i%2==1) {
				System.out.print(i+" ");
			}
		}
	}

}
