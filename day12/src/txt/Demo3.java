package txt;

import java.util.Scanner;

/*3.����: ����¼��һ���ַ�����ͳ�Ƹ��ַ����д�д��ĸ�ַ���Сд��ĸ�ַ��������ַ����ֵĴ���(�����������ַ�)*/
public class Demo3 {
	public static void main(String[] args) {
		int upChar=0;
		int lowChar=0;
		int numChar=0;
		System.out.println("�������ַ�����");
		String str=new Scanner(System.in).next();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>=65&&str.charAt(i)<=90) {
				upChar++;
			}else if(str.charAt(i)>=97&&str.charAt(i)<=122) {
				lowChar++;
			}else if(str.charAt(i)>=48&&str.charAt(i)<=57){
				numChar++;
			}
		}
		System.out.println("��д��ĸ��"+upChar+" Сд��ĸ��"+lowChar+" ����"+numChar);
	}

}
