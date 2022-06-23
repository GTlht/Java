package _for;

//题四：在控制台上打印出1-100之间的所有的偶数？
public class Demo04 {
	public static void main(String[] args) {
		for(int i = 1; i <= 100; i++) {
			//判断i是偶数
			/*if(i % 2 == 0) {
				System.out.println(i);
			}*/
			
			if(i % 2 != 1) {
				System.out.println(i);
			}
		}
	}
}
