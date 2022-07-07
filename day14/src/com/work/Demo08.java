package com.work;

/*

7.已知一个字符数组arr,其中里面有{'a','s','d','f','a','d','2','3','8'},根据里面的元素随机生成一个长度为5的字符串，然后将该字符串去重后反序输出。
	打印格式：
		随机生成一个长度为5的字符串:s2aas
		去除重复后：s2a
		去除重复并倒序后：a2s
*/
public class Demo08 {
	public static void main(String[] args) {
		char[] chs = {'a','s','d','f','a','d','2','3','8'};
		
		String s = "";
		for(int i = 1; i <= 5; i++) {
			int num = (int)(Math.random() * 9);
			s += chs[num];
		}
		
		System.out.println(s);
		
		String newS = "";
		for(int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if(newS.contains(ch + "")) {
				
			} else {
				newS += ch;
			}
		}
		
		System.out.println(newS);
		
		System.out.println(new StringBuilder(newS).reverse());
	}
}
