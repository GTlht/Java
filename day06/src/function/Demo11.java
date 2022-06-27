package function;

public class Demo11 {
	public static void main(String[] args) {
		printJiJi(5);
		printJiJi(9);
		printJiJi(4);
	}
	
	//定义一个方法，该方法的功能是打印几几乘法表
	public static void printJiJi(int num) {
		for(int i = 1; i <= num; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(i + "*" + j + "=" + i*j + "\t");
			}
			System.out.println();
		}
		//return;
	}
	
	//定义一个方法，该方法的功能是获取两个数的和
	public static int getSum(int a, int b) {
		int sum = a + b;
		return sum;
	}
	
	//定义一个方法，该方法的功能是打印两个数的和
	public static void aaa(int a, int b) {
		int sum = a + b;
		System.out.println(sum);
		return;
	}
}
