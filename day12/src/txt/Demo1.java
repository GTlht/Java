package txt;

import java.util.Scanner;

/*1.������֪�û��������룬���ó���ʵ��ģ���û���¼���ܹ������λ��ᣬ��¼�ɹ�֮�������Ӧ��ʾ��	*/
public class Demo1 {
	static String user;
	static String paw;
	public static void main(String[] args) {
		System.out.println("+++++++++++++++++++++++++ע��ҳ��+++++++++++++++++++++++++++++");
		login();
		System.out.println("++++++++++++++++++++++++++��¼ҳ��++++++++++++++++++++++++++++");
		if(regiest()) {
			System.out.println("��½�ɹ���");
		}else {
			System.out.println("�˺Ż��������");
		}
	}
	public static void login() {
		
		System.out.println("�����û�����");
		Scanner sc=new Scanner(System.in);
		user=sc.next();
		System.out.println("�������룺");
		paw=sc.next();
		
	}
	public static boolean regiest() {
		System.out.println("�����û�����");
		Scanner sc=new Scanner(System.in);
		String user1=sc.next();
		System.out.println("�������룺");
		String paw1=sc.next();
		if(user.equals(user1)&&paw.equals(paw1)) {
			return true;
		}
		return false;
	}

}
