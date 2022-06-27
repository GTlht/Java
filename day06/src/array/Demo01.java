package array;

public class Demo01 {
	public static void main(String[] args) {
		//1.创建容器
		int[][] arr = new int[2][];
		
		/*System.out.println(arr[0]);
		System.out.println(arr[1]);*/
	
		//2.存储数据
		int[] arr_1 = new int[3];
		arr_1[0] = 1;
		arr_1[1] = 2;
		arr_1[2] = 3;
		arr[0] = arr_1;
		
		int[] arr_2 = new int[2];
		arr_2[0] = 4;
		arr_2[1] = 5;
		arr[1] = arr_2;
	
		//3.获取数据
		System.out.println(arr);//[[I@7852e922
		System.out.println(arr[0]);//[I@4e25154f
		System.out.println(arr[0][0]);//1
		System.out.println(arr[0][1]);//2
		System.out.println(arr[0][2]);//3
		System.out.println(arr[1]);//[I@70dea4e
		System.out.println(arr[1][0]);//4
		System.out.println(arr[1][1]);//5
	}
}
