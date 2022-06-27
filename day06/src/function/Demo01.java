package function;

public class Demo01 {
	public static void main(String[] args) {
		//需求：获取1和2个整数的和的功能
		/*int a = 1;
		int b = 2;
		int sum = a + b;
		System.out.println(sum);*/
		int sum = getSum(1,2);
		System.out.println(sum);
		
		//需求：获取3和4整数的和的功能
		/*a = 3;
		b = 4;
		sum = a + b;
		System.out.println(sum);*/
		sum = getSum(3,4);
		System.out.println(sum);
		
		//需求：获取5和6整数的和功能
		/*a = 5;
		b = 6;
		sum = a + b;
		System.out.println(sum);*/
		sum = getSum(5,6);
		System.out.println(sum);
	}
	
	//求和方法
	public static int getSum(int i, int j) {
		int sum = i + j;
		return sum;
	}
}
