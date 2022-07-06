package txt;
/*7.已知一个字符数组arr,其中里面有{'a','s','d','f','a','d','2','3','8'},根据里面的元素随机生成一个长度为5的字符串，然后将该字符串去重后反序输出。
	打印格式：
		随机生成一个长度为5的字符串:s2aas
		去除重复后：s2a
		去除重复并倒序后：a2s	
		*/
public class Demo7 {
	public static void main(String[] args) {
		char[] arr={'a','s','d','f','a','d','2','3','8'};
		String str = "";
		for(int i=0;i<5;i++) {
			int rand=(int)(Math.random()*9);
			str+=arr[rand];
		}
		System.out.println("随机生成一个长度为5的字符串:"+str);
		StringBuilder str1=new StringBuilder(str);
		for(int i=0;i<str1.length();i++) {
			for(int j=i+1;j<str1.length();j++) {
				if(str1.charAt(i)==str1.charAt(j)) {
					str1.replace(j, j+1, "");
					j=i;
				}
			}
		}
		System.out.println("去除重复后："+str1);
		System.out.println("去除重复并倒序后："+str1.reverse());
	}

}
