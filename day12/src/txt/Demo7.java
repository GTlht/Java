package txt;

import java.util.Scanner;

/*7.���󣺼��̽���һ���ַ����������жϳ����ַ����Ƿ��ǶԳ��ַ��������ڿ���̨��ӡ�ǻ���
			�Գ��ַ�����123321,111
			�ǶԳ��ַ�����123123
			*/
public class Demo7 {
	public static void main(String[] args) {
		System.out.println("�������ַ�����");
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
			System.out.println("��");
		}else {
			System.out.println("����");
		}
	}

}
