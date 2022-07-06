package txt;
/*1.分析以下需求，并用代码实现：
	(1)模拟Arrays.toString(int[] arr);方法，自己封装一个public static String toString(int[] arr);
	(2)如果int类型数组arr为null，toString方法返回字符串"null"
	(3)如果int类型数组arr长度为0，toString方法返回字符串"[]"
	(4)如果int类型数组arr的内容为{1,2,3,4,5},toString方法返回字符串"[1, 2, 3, 4, 5]"*/
public class Demo1 {
	public static void main(String[] args) {
		int arr[]={1,2,3,4,5};
		System.out.println(Arrays.toString(arr));
		
	}

}
class Arrays{
	public static String toString(int[] arr) {
		if(arr==null) {
			return null;
		}
		if(arr.length==0) {
			return "[]";
		}
		String temp="[";
		for(int i=0;i<arr.length;i++) {
			if(i<arr.length-1) {
				temp+=arr[i]+",";
			}else {
				temp+=arr[i]+"]";
			}
		}
		return temp;
	}
}