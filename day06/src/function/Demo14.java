package function;

public class Demo14 {
	public static void main(String[] args) {
		getSum(1,2,3);
	}
	
	//需求：写一个方法，该方法的功能是获取两个整数和
	public static int getSum(int i, int j) {
		return i + j;
	}
	
	//需求：写一个方法，该方法的功能是获取三个整数和
	public static int getSum(int i, int j, int a) {
		return i + j + a;
	}
	
}
