package function;

public class Demo04 {
	public static void main(String[] args) {
		//单独调用
		//getSum(1,2);
		
		//输出调用
		//System.out.println(getSum(1,2));
		
		//赋值调用
		int a = getSum(1,2);
		System.out.println(a);
	}
	
	//需求：定义一个方法，该方法的功能是获取两个整数的和？
	public static int getSum(int i, int j) {
		System.out.println("约吗");
		int sum = i + j;
		return sum;
	}
}
