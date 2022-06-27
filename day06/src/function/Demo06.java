package function;

public class Demo06 {
	public static void main(String[] args) {
		aaa();
	}
	
	public static int aaa() {
		System.out.println("在吗");
		bbb();
		return 1;
	}
	
	public static int bbb() {
		System.out.println("约吗");
		ccc();
		return 1;
	}
	
	public static int ccc() {
		System.out.println("滚犊子");
		return 1;
	}
}
