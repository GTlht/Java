package com.work;

public class Demo11 {
	public static void main(String[] args) {
		int x = 1,y = 1;
		if(x++==2 & ++y==2)	{//false & true    x=2,y=2
			x =7;
		}
		System.out.println("x="+x+",y="+y); //x=2,y=2
		
		int a = 1,b = 1;

		if(a++==2 && ++b==2) {//false &&     a=2
			a =7;
		}
		System.out.println("a="+a+",b="+b);//a=2,b=1
	}
}
