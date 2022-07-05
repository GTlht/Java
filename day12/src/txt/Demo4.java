package txt;

import java.util.Scanner;

/*4.需求：以字符串的形式从键盘接收一个手机号，将中间四位号码屏蔽，最终效果为：156****1234*/
public class Demo4 {
	public static void main(String[] args) {
		System.out.println("请输入手机号：");
		String str=new Scanner(System.in).next();
		String subStr=str.substring(2, 6);
		String replaceStr=str.replaceAll(subStr, "****");
		System.out.println(replaceStr);
	}

}
