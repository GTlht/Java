package work;

//导包
import java.util.Scanner;

/*
9.分析以下需求，并用代码实现
	1.键盘录入长方形的长和宽
		定义方法计算该长方形的周长,并在main方法中打印周长
	2.键盘录入长方形的长和宽
		定义方法计算该长方形的面积,并在main方法中打印面积
	3.键盘录入圆的半径
		定义方法计算该圆的周长,并在main方法中打印周长
	4.键盘录入圆的半径
		定义方法计算该圆的面积,并在main方法中打印面积
*/


public class Demo05 {
	public static void main(String[] args) {
		//创建对象
		Scanner sc = new Scanner(System.in);
		//调用方法
		System.out.println("请录入长方法的长：");
		int chang = sc.nextInt();
		System.out.println("请录入长方法的宽：");
		int kuan = sc.nextInt();
		
		//获取周长
		System.out.println("长方形的周长为：" + getZhouChang(chang, kuan));
		//获取面积
		System.out.println("长方形的面积为：" + getArea(chang, kuan));
	}
	
	//定义方法计算该长方形的面积,并在main方法中打印面积
	public static int getArea(int chang, int kuan) {
		return chang * kuan;
	}
	
	//定义方法计算该长方形的周长,并在main方法中打印周长
	public static int getZhouChang(int chang, int kuan) {
		return (chang + kuan) * 2;
	}
}
