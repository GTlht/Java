package txt;

import java.util.Scanner;

/*5.���󣺼���¼��һ���ַ���������ַ����а���(TMD),��ʹ��***�滻*/
public class Demo5 {
	public static void main(String[] args) {
		System.out.println("�������ַ�����");
		String str=new Scanner(System.in).next();
		String replaceStr=str.replaceAll("TMD", "***");
		System.out.println(replaceStr);
	}

}
