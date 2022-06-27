package function;

public class Demo02 {
	public static void main(String[] args) {
		//需求：打印九九乘法表
		/*for(int i = 1; i <= 9; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(i + "*" + j + "=" + i*j + "\t");
			}
			System.out.println();
		}*/
		print(9);
		
		//需求：打印八八乘法表
		/*for(int i = 1; i <= 8; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(i + "*" + j + "=" + i*j + "\t");
			}
			System.out.println();
		}*/
		print(8);
		
		//需求：打印七七乘法表
		/*for(int i = 1; i <= 7; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(i + "*" + j + "=" + i*j + "\t");
			}
			System.out.println();
		}*/
		print(7);
	}
	
	//打印几几乘法表
	public static void print(int num) {
		for(int i = 1; i <= num; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(i + "*" + j + "=" + i*j + "\t");
			}
			System.out.println();
		}
	}
}
