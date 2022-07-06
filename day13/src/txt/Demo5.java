package txt;
/*5.定义一个MyStringUtil工具类，该类中定义三个方法，要求如下：
	(1)public static char[] toCharArray(String str) : 将给定的参数字符串转成对应的字符数组（不能直接调用jdk中的工具类及String类中的tocharArray方法）
	(2)public static String getSingleString(String str) : 去除给定的参数字符串中的重符字符（重复字符只保留一个），将新的字符串返回
	(3)public static boolean isBalancedString(String str): 如果左右两边字符相同则返回true，否则返回false，例如：abccba是对称字符
					  例如：abcdecba不是对称字符*/
public class Demo5 {
	public static void main(String[] args) {
		System.out.println(MyStringUti.getSingleString("afjbuyfb hbafe"));
		System.out.println(MyStringUti.toCharArray("weffg3qr"));
		System.out.println(MyStringUti.isBalancedString("abkcba"));
		System.out.println(MyStringUti.isBalancedString("abccba"));
		
	}

}
class MyStringUti{
	public static char[] toCharArray(String str) {
		char[] c=new char[str.length()];
		for(int i=0;i<str.length();i++) {
			c[i]=str.charAt(i);
		}
		return c;
		
	}
	public static String getSingleString(String str) {
		StringBuilder str1=new StringBuilder(str);
		for(int i=0;i<str1.length();i++) {
			for(int j=i+1;j<str1.length();j++) {
				if(str1.charAt(i)==str1.charAt(j)) {
					str1.replace(j, j+1, "");
					j=i;
				}
			}
		}
		return str1.toString();
	}
	public static boolean isBalancedString(String str) {
		StringBuilder str1=new StringBuilder(str).reverse();
		if(str.equals(str1.toString())) {
			return true;
		}
		return false;
	}
}