package text;
/*16.从任意一个数字开始报数，当你要报的数字是包含7或者7的倍数时都要说过，
需求，使用程序在控制台打印出1-100之间的满足逢七必过规则的数据*/
public class Demo16 {
	public static void main(String[] args) {
		for(int i=1;i<=100;i++) {
			int a=i%7;
			int ge=i%10;
			int shi=i/10;
			int bai=i/100;
			if(a==0) {
				System.out.println(i);
			}else if(ge==7) {
				System.out.println(i);
			}else if(shi==7) {
				System.out.println(i);
			}else if(bai==7) {
				System.out.println(i);
			}
		}
	}

}
