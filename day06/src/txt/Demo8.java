package txt;
/*分析以下需求，并用代码实现(每个小需求都需要封装成方法)
	1.判断两个数据是否相等(整数和小数)
	2.获取两个数中较大的值(整数和小数)
	3.获取两个数中较小的值(整数和小数)
	4.能否用一个方法实现2和3的两个功能*/
public class Demo8 {
	public static void main(String[] args) {
		//1.判断两个数据是否相等(整数和小数)
		int a=9;
		double b=3.8;
		if(isDeng(a,b)) {
			System.out.println("相等");
		}else {
			System.out.println("不相等");
		}
		//2.获取两个数中较大的值(整数和小数)
		System.out.println("较大值是"+getMax(a,b));
		//3.获取两个数中较小的值(整数和小数)
		System.out.println("较小值是"+getMin(a,b));
		//4.能否用一个方法实现2和3的两个功能
		getZui(a,b);
	}
	//1.判断两个数据是否相等(整数和小数)
	public static boolean isDeng(int i,double j) {
		if(i==j) {
			return true;
		}else {
			return false;
		}
	}
	
	//2.获取两个数中较大的值(整数和小数)
	public static Object getMax(int a,double b) {
		return (a>b? a:b);
	}
	
	//3.获取两个数中较小的值(整数和小数)
	public static Object getMin(int a,double b) {
		return (a<b? a:b);
	} 
	//4.能否用一个方法实现2和3的两个功能
	public static void getZui(int a,double b) {
		if(a>b) {
			System.out.println("较大值是："+a+"  较小值是："+b);
		}
	} 

}
