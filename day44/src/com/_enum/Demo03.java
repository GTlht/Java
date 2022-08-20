package com._enum;

public class Demo03 {
	public static void main(String[] args) {
		//byte,short,int,char,String,枚举
		MyEnum me2 = MyEnum.ME2;
		
		switch(me2) {
			case ME1:
				System.out.println("在吗");
				break;
			case ME2:
				System.out.println("约吗");
				break;
			case ME3:
				System.out.println("滚犊子");
				break;
		}
	}
}

enum MyEnum {
	ME1, ME2, ME3
}