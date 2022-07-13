package txt;
/*5.从键盘接收一个字符串, 程序对其中所有字符进行排序,例如键盘输入: helloworld,程序打印:dehllloorw
*/
public class Demo5 {
	public static void main(String[] args) {
		String str="helloworld";
		char[] strArr=str.toCharArray();
		for(int i=0;i<strArr.length-1;i++) {
			for(int j=0;j<strArr.length-1-i;j++) {
				if(strArr[j]>strArr[j+1]) {
				char temp=strArr[j];
				strArr[j]=strArr[j+1];
				strArr[j+1]=temp;
				}
				
			}
			System.out.println(strArr);
		}
		//System.out.println(strArr);
//		str=strArr.toString();
//		System.out.println(str);
	}
	

}
