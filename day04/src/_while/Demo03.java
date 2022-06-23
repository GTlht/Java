package _while;

//题三：在控制台上打印出1-10的数字和(累加和思想)？
public class Demo03 {
	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		while(i <= 10) {
			sum = sum + i;
			i++;
		}
		System.out.println(sum);
	}
}
