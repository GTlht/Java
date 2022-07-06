package txt;
/*6.定义String getStr(char[] chs)静态方法，方法内要求：获取长度为5的随机字符串，字符串由随机的4个大写英文字母和1个0-9之间（包含0和9）的整数组成
	定义main方法，方法内完成：
	（1）定义长度为26，元素值为26个大写英文字母的数组chs
	（2）传递数组chs调用getStr(char[] chs)方法，获取返回值,并在控制台打印返回值*/
public class Demo6 {
	public static void main(String[] args) {
		String str="ZXCVBNMLKJHGFDSAQWERTYUIOP";
		char[] chs=str.toCharArray();
		System.out.println(getStr(chs));
		
	}
	public static String getStr(char[] chs) {
		String str = "";
	for(int i=0;i<4;i++) {
		int rand=(int)(Math.random()*26+1);
		str+=chs[rand];
	}
	return str+(int)(Math.random()*10);
}

}
