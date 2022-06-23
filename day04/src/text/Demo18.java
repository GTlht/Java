package text;
/*18.分析以下需求，并用代码实现：
	1.打印1到100之内的整数，但数字中包含9的要跳过
	2.每行输出5个满足条件的数，之间用空格分隔
	3.如：1 2 3 4 5 
	*/
public class Demo18 {
	public static void main(String[] args) {
		int count=0;
		for(int i=1;i<=100;i++) {
			int ge=i%10;
			int shi=i/10;
			int bai=i/100;
			
			if(!(ge==9||shi==9||bai==9)) {
				System.out.print(i+" ");
				count++;
			}
			if(count==5) {
				count=0;
				System.out.println();
			}
		}
	}

}
