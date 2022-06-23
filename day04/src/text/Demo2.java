package text;

import java.util.Scanner;

/*2. 判断春夏秋冬(ifelse/swtich)
	需求：键盘录入一个数(代表月份)，判断该数字是哪个季节
	春天：3,4,5
	夏天：6,7,8
	秋天：9,10,11
	冬天：12,1,2
	*/
public class Demo2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean flase=false;
		
		do {
		System.out.println("请输入月份：");
		int input=sc.nextInt();
		switch(input) {
		case 3:
		case 4:
		case 5:
			System.out.println("春天");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("夏天");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("秋天");
			break;
		case 12:
		case 1:
		case 2:
			System.out.println("冬天");
			break;
			default:
				System.out.println("输入错误！请重新输入！");
				flase=true;
				break;
			
		}
		
		}while(flase);
		
	}

}
