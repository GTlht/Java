package com.work;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
5.分析以下需求，并用代码实现
	项目根路径下有个questions.txt文件内容如下：
		5+5
		150-25
		155*155
		2555/5
	要求：读取内容计算出结果，将结果写入到results.txt文件中
		5+5=10
		//....
*/

public class Demo05 {
	public static void main(String[] args) throws IOException {
		//创建高效字符输入流对象
		BufferedReader br = new BufferedReader(new FileReader("questions.txt"));
		//创建高效字符输出流对象
		BufferedWriter bw = new BufferedWriter(new FileWriter("result.txt"));
		//一次读取一行
		String line = null;
		while((line = br.readLine()) != null) {
			int result = 0;
			if(line.contains("+")) {
				String[] strs = line.split("\\+");
				result = Integer.parseInt(strs[0]) + Integer.parseInt(strs[1]);
			} else if(line.contains("-")) {
				String[] strs = line.split("-");
				result = Integer.parseInt(strs[0]) - Integer.parseInt(strs[1]);
			} else if(line.contains("*")) {
				String[] strs = line.split("\\*");
				result = Integer.parseInt(strs[0]) * Integer.parseInt(strs[1]);
			} else {
				String[] strs = line.split("/");
				result = Integer.parseInt(strs[0]) / Integer.parseInt(strs[1]);
			}
			//写出数据
			bw.write(line + "=" + result);
			//换行
			bw.newLine();
		}
		
		//释放资源
		bw.close();
		br.close();
	}
}
