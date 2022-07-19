package com.string;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class Demo02 {
	public static void main(String[] args) throws IOException {
		/*//public byte[] getBytes()
		String str = "约吗";
		byte[] bys = str.getBytes();
		System.out.println(Arrays.toString(bys));*/
		
		//public byte[] getBytes(String charsetName)
		String str = "约吗";
		//byte[] bys = str.getBytes("utf-8");
		byte[] bys = str.getBytes("gbk");
		System.out.println(Arrays.toString(bys));
		//[-25, -70, -90, -27, -112, -105]
		//[-25, -70, -90, -27, -112, -105]
		//[-44, -68, -62, -16]


	}
}
