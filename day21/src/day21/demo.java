package day21;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class demo {
	public static void main(String[] args) {
	//byte[] b= {97,98,99,100,101};
//		FileOutputStream fo=new FileOutputStream(new File("aaa"));
//		fo.write(b);
//		fo.write('\n');
//		fo.write(98);
		
		//FileInputStream fis=new FileInputStream(new File("a.txt"));
//		int by=0;
//		while((by=fis.read())!=-1) {
//			System.out.print((char)by);
//		}
//		int len=0;
//		byte[] by=new byte[5];
//		//System.out.println(fis.read(by));
//		while((len=fis.read(by))!=-1) {
//			System.out.print(new String(by,0,len));
//		}
//	    int b=0;
//		FileInputStream fis=new FileInputStream("a.txt");
//		FileOutputStream fos=new FileOutputStream("b.txt");
//		while((b=fis.read())!=-1) {
//			fos.write(b);
//		}
//		fis.close();
//		fos.close();
		FileInputStream fis = null;
		FileOutputStream fos=null;
		try {
		fis=new FileInputStream("a.txt");
		fos=new FileOutputStream("b.txt");
		byte[] by=new byte[2];
		int len=0;
		while((len=fis.read(by))!=-1) {
			fos.write(by, 0, len);
		}
		}catch(Exception e){
			try {
				fis.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				fos.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}	
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
