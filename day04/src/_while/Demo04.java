package _while;

//题四：在控制台上打印出1-100之间的所有的偶数？
public class Demo04 {
	public static void main(String[] args) {
		int i = 1;
		while(i <= 100) {
			if(i % 2 == 0) {
				System.out.println(i);
			}
			i++;
		}
	}
}
