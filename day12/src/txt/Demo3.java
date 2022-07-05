package txt;

import java.util.Scanner;

/*3.需求: 键盘录入一个字符串，统计该字符串中大写字母字符，小写字母字符，数字字符出现的次数(不考虑其他字符)*/
public class Demo3 {
	public static void main(String[] args) {
		int upChar=0;
		int lowChar=0;
		int numChar=0;
		System.out.println("请输入字符串：");
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
		System.out.println("大写字母："+upChar+" 小写字母："+lowChar+" 数字"+numChar);
	}

}
