package txt;
/*2.分析以下需求，并用代码实现：
	(1)键盘录入一个小数，要求小数点后的小数位最少2位
	(2)定义方法，实现保留小数点后的两位小数(只舍不进)
	(3)如：输入5.6789 输出5.67,输入5.67389 输出5.67
	*/
public class Demo2 {

public static void main(String[] args) {
	double d=5.6789;
	System.out.println(toFixed(d));
	
}
	public static String toFixed(double num) {
		String str=Double.toString(num);
		String [] strArr=new String[2];
		strArr=str.split("\\.");
		//System.out.println(strArr[1]);
		String dec=strArr[1].substring(0,2);
		return strArr[0]+"."+dec;
	}

}
