package txt;

import java.util.Scanner;

/*9.�����������󣬲��ô���ʵ��
	1.����¼�볤���εĳ��Ϳ�
		���巽������ó����ε��ܳ�,����main�����д�ӡ�ܳ�
	2.����¼�볤���εĳ��Ϳ�
		���巽������ó����ε����,����main�����д�ӡ���
	3.����¼��Բ�İ뾶
		���巽�������Բ���ܳ�,����main�����д�ӡ�ܳ�
	4.����¼��Բ�İ뾶
		���巽�������Բ�����,����main�����д�ӡ���*/
public class Demo9 {
	public static void main(String[] args) {
		Scanner  sc=new Scanner(System.in);
		System.out.println("��������εĳ���");
		double l=sc.nextDouble();
		System.out.println("��������εĿ�");
		double d=sc.nextDouble();
		System.out.println("������Բ�İ뾶��");
		double r=sc.nextDouble();
		//�����ܳ�
		System.out.println("���ε��ܳ���"+recGir(l,d));
		//�������
		System.out.println("���ε��ܳ���"+recAre(l,d));
		//Բ���ܳ�
		System.out.println("Բ���ܳ���"+recGir(r));
		//Բ�����
		System.out.println("Բ�������"+recAre(r));
	}
	//�����ܳ�
	public static double recGir(double a,double b) {
		return (a+b)*2;
	}
	//�������
	public static double recAre(double a,double b) {
		return a*b;
	}
	//Բ���ܳ�
	public static double recGir(double r) {
		return 3.14*r*2;
	}
	//Բ�����
	public static double recAre(double r) {
		return 3.14*r*r;
	}
	

}
