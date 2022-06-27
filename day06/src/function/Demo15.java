package function;

public class Demo15 {
	public static void main(String[] args) {
		aaa();
	}
	
	public static void aaa() {}
	
	//public static void aaa() {}//编译报错，因为方法完全相同，不能构成方法重载
	
	public static void aaa(int i) {}
	
	public static void aaa(int i, int j) {}
	
	public static void aaa(double d) {}
	
	//public static void aaa(int a, int b) {}//编译报错，不能构成重载
	
	public static void aaa(int a, double b) {}
	
	public static void aaa(double a, int b) {}
	
	public static int aaa(int a, int b, int c) {
		return 1;
	}
	
	/*public static int aaa() {//编译报错
		return 1;
	}*/
}
