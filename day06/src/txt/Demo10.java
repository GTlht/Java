package txt;

import java.util.Scanner;

/*10.分析以下需求，并用代码实现
	1.键盘录入班级人数
	2.根据录入的班级人数创建数组
	3.通过键盘录入将班级每个人的分数录入到数组容器中
	4.要求:
		(1)打印该班级的不及格人数
		(2)打印该班级的平均分
		(3)演示格式如下:
			请输入班级人数:
			键盘录入:100
			请输入第一个学员分数
			键盘录入：20
			请输入第二个学员的分数
			键盘录入：98
			控制台输出:
				不及格人数:19
				班级平均分:87*/
public class Demo10 {
	public static void main(String[] args) {
		double[] arr=init();
		System.out.println("不及格人数:"+getFail(arr));
		System.out.println("班级平均分"+getAvg(arr));
	}
	
	//录入班级人数
	public static double[] init() {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入班级人数：");
		int num=sc.nextInt();
		double[] arr=new double[num];
		for(int i=1;i<=num;i++) {
			System.out.println("请输入第"+i+"个学员分数：");
			arr[i-1]=sc.nextDouble();
		}
		return arr;
	}
	//获取不及格人数
	public static int getFail(double[] arr) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<60) {
				count++;
			}
		}
		return count;
	}
	//获取班级平均分
	public static int getAvg(double[] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		return sum/arr.length;
	
	}
}
