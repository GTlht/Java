package txt;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

/*1.请用户从控制台输入信息，程序将信息存储到文件Info.txt中。
 * 可以输入多条信息，每条信息存储一行。当用户输入：”886”时，程序结束。*/
public class Demo1 {
	public static void main(String[] args) throws Exception {
		FileOutputStream fos=new FileOutputStream("info.txt",true);
		byte[] bs=new byte[5];
		int len=0;
		Scanner sc=new Scanner(System.in);
		String input=null;
		while(!"886".equals(input)) {
			System.out.println("请输入信息:");
			input=sc.next();
			bs = input.getBytes();
			fos.write(bs);
			fos.write('\r');
			fos.write('\n');
		}
		System.out.println("结束！");
		fos.close();
		
	}

}
