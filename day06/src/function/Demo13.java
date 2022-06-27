package function;

public class Demo13 {
	public static void main(String[] args) {
		int[] arr = {11,12};
		System.out.println(arr);//0x001
		System.out.println(arr[0]);//11
		System.out.println(arr[1]);//12
		aaa(arr);
		System.out.println(arr);//0x001
		System.out.println(arr[0]);//15
		System.out.println(arr[1]);//16
	}
	
	public static void aaa(int[] arr) {
		System.out.println(arr);//0x001
		System.out.println(arr[0]);//11
		System.out.println(arr[1]);//12
		
		arr[0] = 15;
		arr[1] = 16;
		
		System.out.println(arr[0]);//15
		System.out.println(arr[1]);//16
	}
}
