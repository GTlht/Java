package com.work;

/*
5.定义一个MyStringUtil工具类，该类中定义三个方法，要求如下：
	(1)public static char[] toCharArray(String str) : 将给定的参数字符串转成对应的字符数组（不能直接调用jdk中的工具类及String类中的tocharArray方法）
	(2)public static String getSingleString(String str) : 去除给定的参数字符串中的重符字符（重复字符只保留一个），将新的字符串返回
	(3)public static boolean isBalancedString(String str): 如果左右两边字符相同则返回true，否则返回false，例如：abccba是对称字符
					  例如：abcdecba不是对称字符
*/

public class Demo06 {
	public static void main(String[] args) {
		/*char[] chs = MyStringUtil.toCharArray("abcde");
		for(int i = 0; i < chs.length; i++) {
			System.out.print(chs[i] + " ");
		}*/
		
		System.out.println(MyStringUtil.getSingleString("abcabcde"));
	}
}

class MyStringUtil {
	//将字符串转成对应的字符数组
	public static char[] toCharArray(String str) {
		//遍历字符串，得到每一次字符，将每一个字符存储到字符数组中即可
		
		//创建容器
		char[] chs = new char[str.length()];
		//遍历字符串
		for(int i = 0; i < str.length(); i++) {
			//获取字符，存储到容器中
			chs[i] = str.charAt(i);
		}
		
		return chs;
	}
	
	public static String getSingleString(String str) {//str -> "abcabc"
		//创建一个新的字符串
		String s = "";
		
		//遍历参数字符串
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			
			//判断s字符串中是否包含ch
			if(s.contains(ch+"")) {
				//s中已经存在该字符，不能继续拼进去
			} else {
				//s中不存在该字符，要拼进去
				s += ch;
			}
		}
		
		return s;
	}
	
	public static boolean isBalancedString(String str) {
		return true;
	}
}