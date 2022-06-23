package text;
/*13.在控制台上输出一个由星星组成的倒着的直角三角形图案*/
public class Demo13 {
	public static void main(String[] args) {
		for(int i=5;i>0;i--) {
			for(int j=i;j>0;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
