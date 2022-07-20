package com.work;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

/*
7.分析以下需求，并用代码实现
	实现一个验证码小程序，要求如下：
	1. 在项目根目录下新建一个文件：data.txt,键盘录入3个字符串验证码，并存入data.txt中，要求一个验证码占一行；
	2. 键盘录入一个需要被校验的验证码，如果输入的验证码在data.txt中存在：在控制台提示验证成功，如果不存在控制台提示验证失败
*/

public class Demo07 {
	public static void main(String[] args) throws Exception {
		//键盘录入
		Scanner sc = new Scanner(System.in);
		
		//创建高效字符输出流对象
		BufferedWriter bw = new BufferedWriter(new FileWriter("data.txt"));
	
		//循环3次
		for(int i = 1; i <= 3; i++) {
			String code = sc.next();
			bw.write(code);
			bw.newLine();
		}
		
		//释放资源
		bw.close();
		
		//创建高效字符输入流对象
		BufferedReader br = new BufferedReader(new FileReader("data.txt"));
		
		//创建容器
		ArrayList<String> al = new ArrayList<>();
		
		//一次读取一行
		String line = null;
		while((line = br.readLine()) != null) {
			//将验证码存储到容器中
			al.add(line);
		}
		
		//键盘录入一个验证码
		System.out.println("请录入一个验证码：");
		String code = sc.next();
		
		//标记
		boolean flag = false;
		
		//遍历容器
		for (String str : al) {
			//判断
			if(str.equals(code)) {
				System.out.println("验证成功~");
				flag = true;
				break;
			}
		}
		
		if(!flag) {
			System.out.println("验证失败~");
		}
	}
}
