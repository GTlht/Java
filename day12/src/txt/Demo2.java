package txt;
/*2.需求: 遍历字符串(两种方式来实现)*/
public class Demo2 {
	public static void main(String[] args) {
		String str="sjdfenrviuaenwo";
		for(int i=0;i<str.length();i++) {
			System.out.print(str.charAt(i)+" ");
		}
	System.out.println("\n++++++++++++++++++++++++++++++++++++++++++");
	String str1="IEYVbuejfneorufhwiefn c";
	int j=0;
	while(j<str.length()) {
		System.out.print(str.charAt(j++)+" ");
	}
	}
}
