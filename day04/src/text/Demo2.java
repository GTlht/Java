package text;

import java.util.Scanner;

/*2. �жϴ����ﶬ(ifelse/swtich)
	���󣺼���¼��һ����(�����·�)���жϸ��������ĸ�����
	���죺3,4,5
	���죺6,7,8
	���죺9,10,11
	���죺12,1,2
	*/
public class Demo2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean flase=false;
		
		do {
		System.out.println("�������·ݣ�");
		int input=sc.nextInt();
		switch(input) {
		case 3:
		case 4:
		case 5:
			System.out.println("����");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("����");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("����");
			break;
		case 12:
		case 1:
		case 2:
			System.out.println("����");
			break;
			default:
				System.out.println("����������������룡");
				flase=true;
				break;
			
		}
		
		}while(flase);
		
	}

}
