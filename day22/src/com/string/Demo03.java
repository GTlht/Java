package com.string;

import java.io.UnsupportedEncodingException;

public class Demo03 {
	public static void main(String[] args) throws UnsupportedEncodingException {
		/*//public String(byte[] bytes)
		//byte[] bys = {-25, -70, -90, -27, -112, -105};
		byte[] bys = {-44, -68, -62, -16};
		String str = new String(bys);
		System.out.println(str);*/
		
		//public String(byte[] bytes,String charsetName)
		//byte[] bys = {-25, -70, -90, -27, -112, -105};
		byte[] bys = {-44, -68, -62, -16};
		//String str = new String(bys, "utf-8");
		String str = new String(bys, "gbk");
		System.out.println(str);
	}
}
