package txt;

import java.util.Scanner;

/* 5.����һ���������÷����Ĺ����Ǳ�������*/
public class Demo5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[10];
		System.out.println("���������������10��Ԫ�أ�");
		for(int i=0;i<10;i++) {
			arr[i]=sc.nextInt();
			}
		print(arr);
	}

	public static void print(int[]arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
