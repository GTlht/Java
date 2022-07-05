package txt;

import java.util.Scanner;

/*5.需求：键盘录入一个字符串，如果字符串中包含(TMD),则使用***替换*/
public class Demo5 {
	public static void main(String[] args) {
		System.out.println("请输入字符串：");
		String str=new Scanner(System.in).next();
		String replaceStr=str.replaceAll("TMD", "***");
		System.out.println(replaceStr);
	}

}
