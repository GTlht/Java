package work;

/*

10.分析以下需求，并用代码实现
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
				班级平均分:87
*/
//导包
import java.util.Scanner;

public class Demo06 {
	public static void main(String[] args) {
		//创建对象
		Scanner sc = new Scanner(System.in);
		
		//调用方法，班级人数
		System.out.println("请录入班级人数：");
		int num = sc.nextInt();//2
		
		//创建数组容器
		int[] arr = new int[num];
		
		//遍历，一边遍历一边存储分数
		for(int i = 0; i < arr.length; i++) {
			System.out.println("请录入第" + (i+1) + "个学员的分数：");
			arr[i] = sc.nextInt();
		}
		
		//(1)打印该班级的不及格人数
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] < 60) {
				count++;
			}
		}
		System.out.println("不及格人数为：" + count);
		
		//(2)打印该班级的平均分
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		int avg = sum / num;
		System.out.println("班级平均分为：" + avg);
	}
}
