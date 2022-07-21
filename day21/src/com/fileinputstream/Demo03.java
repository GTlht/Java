package com.fileinputstream;

import java.io.FileInputStream;
import java.util.Arrays;

public class Demo03 {
	public static void main(String[] args) throws Exception {
		//创建普通字节输入流对象
		FileInputStream fis = new FileInputStream("a.txt");
		
		/*//public int read(byte[] b)
		byte[] bys = new byte[2];
		int len = fis.read(bys);
		System.out.println(len);
		//System.out.println(Arrays.toString(bys));
		System.out.println(new String(bys));
		
		int len1 = fis.read(bys);
		System.out.println(len1);
		//System.out.println(Arrays.toString(bys));
		System.out.println(new String(bys));
		
		int len2 = fis.read(bys);
		System.out.println(len2);
		//System.out.println(Arrays.toString(bys));
		System.out.println(new String(bys));
		
		int len3 = fis.read(bys);
		System.out.println(len3);
		//System.out.println(Arrays.toString(bys));
		System.out.println(new String(bys));*/
		
		byte[] bys = new byte[1024];
		int len = 0;
		while((len = fis.read(bys)) != -1) {
			//System.out.println(new String(bys));
			System.out.println(new String(bys, 0, len));
		}
	}
}
