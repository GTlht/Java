package com.work;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
请用户从控制台输入信息，程序将信息存储到文件Info.txt中。
可以输入多条信息，每条信息存储一行。当用户输入：”886”时，程序结束。
*/
public class Demo01 {
	public static void main(String[] args) throws IOException {
		//键盘录入
		Scanner sc = new Scanner(System.in);
		
		//创建高效字符输出流
		BufferedWriter bw = new BufferedWriter(new FileWriter("info.txt"));
		
		//持续录入
		while(true) {
			String str = sc.next();
			
			//判断是否结束
			if("886".equals(str)) {
				break;
			}
			
			//将数据写到文件中
			bw.write(str);
			//换行
			bw.newLine();
		}
		
		//释放资源
		bw.close();
		System.out.println("录入完成~");
	}
}
