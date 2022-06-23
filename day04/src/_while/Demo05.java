package _while;

//题五：在控制台上打印出1-10之间的奇数的个数(统计思想)？
public class Demo05 {
	public static void main(String[] args) {
		int count = 0;
		int i = 1;
		while(i <= 10) {
			if(i % 2 == 1) {
				count++;
			}
			i++;
		}
		System.out.println(count);
	}
}
