package txt;
/*6.定义一个方法，该方法的功能是获取数组中元素的最大值*/
public class Demo6 {
	public static void main(String[] args) {
		int[] arr= {4,25,85,96,23,4,27};
		System.out.println(getMax(arr));
	}
	public static int getMax(int[]arr) {
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
	}

}
