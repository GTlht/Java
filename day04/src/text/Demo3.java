package text;

import java.util.Scanner;

/*
 *3. ���Խ���
	���󣺼���¼��һ���������жϸ÷��������㣬�����������Ǽ��񣬻��ǲ�����
	���㣺100-90
	����89-70
	����69-60
	������60-
	*/
public class Demo3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("�����������");
		double input=sc.nextDouble();
		if(input>=90&&input<=100) {
			System.out.println("�ɼ�����");
		}else if(input>=70&&input<90) {
			System.out.println("�ɼ���");
		}else if (input>=60&&input<70) {
			System.out.println("�ɼ�����");
		}else {
			System.out.println("�ɼ�������");
		}
		
	}

}
