package txt;

import java.util.Scanner;

/*7.需求：键盘接收一个字符串，程序判断出该字符串是否是对称字符串，并在控制台打印是或不是
			对称字符串：123321,111
			非对称字符串：123123
			*/
public class Demo7 {
	public static void main(String[] args) {
		System.out.println("请输入字符串：");
		String str=new Scanner(System.in).next();
		char[] arr=str.toCharArray();
		char[]arr2=arr;
		int left=0;
		int right=arr.length-1;
		char temp;
		while(left<right) {
			temp=arr[left];
			arr[left]=arr[right];
			arr[right]=temp;
			left++;
			right--;
		}
		String str1=new String(arr);
		if(str1.equals(str)) {
			System.out.println("是");
		}else {
			System.out.println("不是");
		}
	}

}
