package text;

import java.util.Scanner;

/*
 *3. 考试奖励
	需求：键盘录入一个分数，判断该分数是优秀，还是良，还是及格，还是不及格
	优秀：100-90
	良：89-70
	及格：69-60
	不及格：60-
	*/
public class Demo3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入分数：");
		double input=sc.nextDouble();
		if(input>=90&&input<=100) {
			System.out.println("成绩优秀");
		}else if(input>=70&&input<90) {
			System.out.println("成绩良");
		}else if (input>=60&&input<70) {
			System.out.println("成绩及格");
		}else {
			System.out.println("成绩不及格");
		}
		
	}

}
