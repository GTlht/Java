package com.printwriter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Demo04 {
	public static void main(String[] args) throws IOException {
		//public PrintWriter(Writer out,boolean autoFlush)
		PrintWriter pw = new PrintWriter(new FileWriter("b.txt"), true);
		
		//写出一个数据
		//pw.write("约吗");
		pw.println("约吗");
		
		//刷新
		//pw.flush();
		
	}
}
/*
class System {
	public static final PrintStream out = new PrintStream();
	public static final InputStream in = new FileInputStream();
	private System {
	
	}
}

class Demo {
	public static void main(String[] args) {
		PrintStream ps = System.out;//标准输出流
		ps.println();
		
		System.out.println();
		
		InputStream is = System.in;//标准输入流
		Scanner sc = new Scanner(is);
		
		Scanner sc = new Scanner(System.in);
	}
}
*/