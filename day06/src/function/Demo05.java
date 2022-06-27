package function;

public class Demo05 {
	public static void main(String[] args) {
		int a = getSum(1, 2);
		System.out.println(a);
	}
	
	public static int getSum(int i, int j) {
		int sum = i + j;
		return sum;
	}
}
