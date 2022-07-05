package txt;

/*	题一：遍历字符串
		方式一：
		方式二：
		方式三：
		*/
public class Demo10 {
	public static void main(String[] args) {
		System.out.println("+++++++++++++++++第一种+++++++++++");
		String str = "sjdfenrviuaenwo";
		for (int i = 0; i < str.length(); i++) {
			System.out.print(str.charAt(i) + " ");
		}
		System.out.println("\n+++++++++++++++++++第二种+++++++++++++++++++++++");
		 for (int i = 0; i < str.length(); i++) {
	            System.out.print(str.substring(i, i + 1)+ " ");
	        }
		System.out.println("\n++++++++++++++++++第三种+++++++++++++++");
		char[] arr = str.toCharArray();
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}

	}

}
