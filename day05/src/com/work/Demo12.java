package com.work;

public class Demo12 {
	public static void main(String[] args) {
		int x = 1,y = 1;
		if(x++==1 | ++y==1)	{//true | false    x=2,y=2
			x =7;//x=7
		}
		System.out.println("x="+x+",y="+y);//7,2
		
		int a = 1,b = 1;

		if(a++==1 || ++b==1) {//true ||     a=2
			a =7;//a=7
		}
		System.out.println("a="+a+",b="+b);//7,1
	}
}
