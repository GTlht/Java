package _for;

//题五：在控制台上打印出1-10之间的奇数的个数(统计思想)？
public class Demo06 {
	public static void main(String[] args) {
		int count = 0;
		for(int i = 1; i <= 10; i++) {
			//判断是奇数
			if(i % 2 == 1) {
				count++;
			}
		}
		System.out.println(count);
	}
}
