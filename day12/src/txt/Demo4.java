package txt;

import java.util.Scanner;

/*4.�������ַ�������ʽ�Ӽ��̽���һ���ֻ��ţ����м���λ�������Σ�����Ч��Ϊ��156****1234*/
public class Demo4 {
	public static void main(String[] args) {
		System.out.println("�������ֻ��ţ�");
		String str=new Scanner(System.in).next();
		String subStr=str.substring(2, 6);
		String replaceStr=str.replaceAll(subStr, "****");
		System.out.println(replaceStr);
	}

}
