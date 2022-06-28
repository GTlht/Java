package work;

public class Demo01 {
	public static void main(String[] args) {
		int[] arr = {1,2,6,4,5};
		int max = ddd(arr);
		System.out.println(max);
	}
	
	//6.定义一个方法，该方法的功能是获取数组中元素的最大值
	public static int ddd(int[] arr) {
		int max = 0;
		for(int i = 1; i < arr.length; i++) {
			if(arr[max] < arr[i]) {
				max = i;
			}
		}
		return arr[max];
	}
	
	//5.定义一个方法，该方法的功能是遍历数组
	public static void ccc(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		return;
	}
	
	//4.定义一个方法，该方法的功能是打印n到m之间的所有的奇数
	public static void bbb(int n, int m) {
		for(int i = n; i <= m; i++) {
			if(i % 2 == 1) {
				System.out.println(i);
			}
		}
		return;
	}
	
	//3.定义一个方法，该方法的功能是判断某个变量是奇数还是偶数
	public static void aaa(int num) {
		if(num % 2 == 0) {
			System.out.println(num + "是偶数");
		} else {
			System.out.println(num + "是奇数");
		}
		return;
	}
}
