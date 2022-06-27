package txt;

import java.util.Scanner;

/*9.分析以下需求，并用代码实现
	1.键盘录入长方形的长和宽
		定义方法计算该长方形的周长,并在main方法中打印周长
	2.键盘录入长方形的长和宽
		定义方法计算该长方形的面积,并在main方法中打印面积
	3.键盘录入圆的半径
		定义方法计算该圆的周长,并在main方法中打印周长
	4.键盘录入圆的半径
		定义方法计算该圆的面积,并在main方法中打印面积*/
public class Demo9 {
	public static void main(String[] args) {
		Scanner  sc=new Scanner(System.in);
		System.out.println("请输入矩形的长：");
		double l=sc.nextDouble();
		System.out.println("请输入矩形的宽：");
		double d=sc.nextDouble();
		System.out.println("请输入圆的半径：");
		double r=sc.nextDouble();
		//矩形周长
		System.out.println("矩形的周长："+recGir(l,d));
		//矩形面积
		System.out.println("矩形的周长："+recAre(l,d));
		//圆的周长
		System.out.println("圆的周长："+recGir(r));
		//圆的面积
		System.out.println("圆的面积："+recAre(r));
	}
	//矩形周长
	public static double recGir(double a,double b) {
		return (a+b)*2;
	}
	//矩形面积
	public static double recAre(double a,double b) {
		return a*b;
	}
	//圆的周长
	public static double recGir(double r) {
		return 3.14*r*2;
	}
	//圆的面积
	public static double recAre(double r) {
		return 3.14*r*r;
	}
	

}
