package work;

/*
8.分析以下需求，并用代码实现(每个小需求都需要封装成方法)
	1.判断两个数据是否相等(整数和小数)
	2.获取两个数中较大的值(整数和小数)
	3.获取两个数中较小的值(整数和小数)
	4.能否用一个方法实现2和3的两个功能
*/
public class Demo04 {
	public static void main(String[] args) {
		/*equals(1,2);
		equals(1,1);
		equals(1.1,1.2);
		equals(1.1,1.1);*/
		
		System.out.println(getMax(1,2));
	}
	
	//2.获取两个数中较大的值(整数和小数)
	public static int getMax(int i, int j) {
		return i > j ? i : j;
	} 
	
	public static double getMax(double i, double j) {
		return i > j ? i : j;
	} 
	
	//1.判断两个数据是否相等(整数和小数)
	public static void equals(int i, int j) {
		if(i == j) {
			System.out.println("相等");
		} else {
			System.out.println("不相等");
		}
		//return;
	} 
	
	public static void aaa(double i, double j) {
		if(i == j) {
			System.out.println("相等");
		} else {
			System.out.println("不相等");
		}
		//return;
	} 
}
