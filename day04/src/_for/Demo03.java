package _for;

//题三：在控制台上打印出1-10的数字和(累加和思想)？
//1+2+3+4...+10
public class Demo03 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			//每循环一次加一个数
			sum = sum + i;
		}
		System.out.println(sum);
	}
}
