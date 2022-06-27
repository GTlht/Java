package function;

public class Demo12 {
	public static void main(String[] args) {
		int i = 1;
		int j = 2;
		System.out.println(i + "..." + j);//1,2
		aaa(i, j);
		System.out.println(i + "..." + j);//1,2
	}
	
	public static void aaa(int i, int j) {
		System.out.println(i + "..." + j);//1,2
		i = i + 1;
		j = i + j;
		System.out.println(i + "..." + j);//2,4
	}
}
