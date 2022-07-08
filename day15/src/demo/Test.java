package demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		char[] bigStr="mzmzmzmzmzmzmzmz".toCharArray();
//		char[] smallStr="mzm".toCharArray();
//		int count=0;
//		for(int i=0;i<bigStr.length;i++) {
//			for(int a=0;a<smallStr.length;a++) {
//			if(i<bigStr.length&&bigStr[i]==smallStr[a]) {
//				i++;
//			}else {
//				break;
//			}
//			if(a>=smallStr.length-1) {
//				count++;
//				break;
//			}
//		}
//		
//
//		}
//		System.out.println(count);
//		int i=0;
//		int j=0;
//		
//		while(i<bigStr.length) {
//			while(j<smallStr.length) {
//				if(bigStr[i]==smallStr[j]) {
//					i++;
//					j++;
//				}else {
//					break;
//				}
//			}
//			
//			if(i>=smallStr.length-1) {
//				count++;
//				i++;
//				j=0;
//				
//			}
//		}
//		System.out.println(count);
		int count=0;
		String big="sdmf";
		String small="sdmf";
//		int j=0;
//		while(j<big.length()) {
//			
//		j=big.indexOf(small, j);
//		//System.out.println(j);
//		if(j==-1) {
//			break;
//		}else {
//			big=big.substring(j+small.length());
//			count++;
//		}
//		}
//		System.out.println(count);
		int leng=0;
		String[] sp=big.split(small);
		System.out.println(sp[0]);
		if(!big.endsWith(small)) {
			System.out.println(sp.length-1);
		}else {
		System.out.println(sp.length+"DL");
		}
		
	}
}