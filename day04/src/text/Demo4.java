package text;

import java.util.Scanner;

/*4. �ж�������(switch)
	���󣺼���¼��һ�����֣��жϸ����������ڼ�
	1-7
	*/
public class Demo4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean flase=false;
		do {
		System.out.println("������һ������:");
		int input=sc.nextInt();
		switch(input) {
		case 1:
			System.out.println("����һ");
			break;
		case 2:
			System.out.println("���ڶ�");
			break;
		case 3:
			System.out.println("������");
			break;
		case 4:
			System.out.println("������");
			break;
		case 5:
			System.out.println("������");
			break;
		case 6:
			System.out.println("������");
			break;
		case 7:
			System.out.println("������");
			break;
			default:
				System.out.println("�������!");
				flase=true;
				break;
		}
	
			System.out.println("�Ƿ��������Y/N��");
			String bool=sc.next();
			if("Y".equals(bool)||"y".equals(bool)) {
				flase=true;
			}else {
				flase=false;
			}
		
		
		}while(flase);
	}

}
