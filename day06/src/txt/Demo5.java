package txt;

import java.util.Scanner;

/* 5.定义一个方法，该方法的功能是遍历数组*/
public class Demo5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[10];
		System.out.println("请依次输入数组的10个元素：");
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
