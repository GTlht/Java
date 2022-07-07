package com.work;

/*
6.定义String getStr(char[] chs)静态方法，方法内要求：获取长度为5的随机字符串，字符串由随机的4个大写英文字母和1个0-9之间（包含0和9）的整数组成
	定义main方法，方法内完成：
	（1）定义长度为26，元素值为26个大写英文字母的数组chs
	（2）传递数组chs调用getStr(char[] chs)方法，获取返回值,并在控制台打印返回值
*/

public class Demo07 {
	public static void main(String[] args) {
		char[] chs = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		System.out.println(getStr(chs));
	}
	
	public static String getStr(char[] chs) {
		//随机生成一个0-9之间的数字
		int a = (int)(Math.random() * 10);
		
		String s = "";
		//0-25
		for(int i = 1; i <= 4; i++) {
			int num = (int)(Math.random() * 26);
			char ch = chs[num];
			s += ch;
		}
		
		s += a;
		
		return s;
	}
}
