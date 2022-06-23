package text;
/*
10.在控制台输出所有的水仙花数
*/
public class Demo10 {
	public static void main(String[] args) {
		for(int i=100;i<=999;i++) {
			int ge=i%10;
			int shi=i/10%10;
			int bai=i/100;
			int sum=ge*ge*ge+shi*shi*shi+bai*bai*bai;
			if(sum==i) {
				System.out.println(i);
			}
		}
	}

}
