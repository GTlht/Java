package break_continue;

public class Demo01 {
	public static void main(String[] args) {
		/*for(int i = 1; i <= 10; i++) {
			if(i == 2) {
				break;
			}
			System.out.println(i);
		}*/
		
		for(int i = 1; i <= 10; i++) {
			if(i == 2) {
				continue;//结束本次循环，继续下一次循环
			}
			System.out.println(i);
		}
	}
}
