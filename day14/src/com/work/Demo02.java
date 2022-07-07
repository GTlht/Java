package com.work;

/*
1.分析以下需求，并用代码实现：
	(1)模拟Arrays.toString(int[] arr);方法，自己封装一个public static String toString(int[] arr);
	(2)如果int类型数组arr为null，toString方法返回字符串"null"
	(3)如果int类型数组arr长度为0，toString方法返回字符串"[]"
	(4)如果int类型数组arr的内容为{1,2,3,4,5},toString方法返回字符串"[1, 2, 3, 4, 5]"
*/
public class Demo02 {
	public static void main(String[] args) {
		//int[] arr = null;
		//int[] arr = new int[0];
		int[] arr = {1,2,3,4,5};
		System.out.println(toString(arr));
	}
	
	public static String toString(int[] arr) {
		if(arr == null) {
			return "null";
		} else if(arr.length == 0) {
			return "[]";
		} else {
			/*String str = "[";
			for(int i = 0; i < arr.length; i++) {
				if(i == arr.length - 1) {
					str += arr[i] + "]";
				} else {
					str += arr[i] + ",";
				}
			}
			return str;*/
			
			StringBuilder sb = new StringBuilder();
			sb.append("[");
			for(int i = 0; i < arr.length; i++) {
				if(i == arr.length - 1) {
					sb.append(arr[i]).append("]");
				} else {
					sb.append(arr[i]).append(",");
				}
			}
			
			return sb.toString();
		}
	}
}
