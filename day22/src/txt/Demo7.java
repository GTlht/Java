package txt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

/*7.分析以下需求，并用代码实现
	实现一个验证码小程序，要求如下：
	1. 在项目根目录下新建一个文件：data.txt,键盘录入3个字符串验证码，并存入data.txt中，
	要求一个验证码占一行；
	2. 键盘录入一个需要被校验的验证码，如果输入的验证码在data.txt中存在：
	在控制台提示验证成功，如果不存在控制台提示验证失败*/
public class Demo7 {
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new FileReader("data.txt"));
		BufferedWriter bw=new BufferedWriter(new FileWriter("data.txt"));
		
		Scanner sc=new Scanner(System.in);
		int count=0;
		String input=null;
		while(count<3) {
			System.out.println("请输入：");
			input=sc.next();
			bw.write(input);
			bw.newLine();
			bw.flush();
			count++;
		}
		String str=null;
		boolean flag=true;
		System.out.println("输入被验证的码：");
		String input1=sc.next();
		while((str=br.readLine())!=null) {
			if(str.equals(input1)) {
				System.out.println("验证成功");
				flag=false;
				break;
			}
		}
		if(flag) {
			System.out.println("验证失败！");
		}
		br.close();
		bw.close();
	}

}
