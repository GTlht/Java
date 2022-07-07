package com.bigdecimal;

import java.math.BigDecimal;

public class Demo02 {
	public static void main(String[] args) {
		//public BigDecimal(int val)：将 int 转换为 BigDecimal
		//public BigDecimal(double val)：将 double 转换为 BigDecimal
		
		/*BigDecimal bd1 = new BigDecimal(22);
		System.out.println(bd1);//22
		
		BigDecimal bd2 = new BigDecimal(22.0);
		System.out.println(bd2);//22
		
		BigDecimal bd3 = new BigDecimal(0.1);
		System.out.println(bd3);//0.1000000000000000055511151231257827021181583404541015625*/
		
		//public BigDecimal(String val)
		BigDecimal bd1 = new BigDecimal("22");
		System.out.println(bd1);//22
		
		BigDecimal bd2 = new BigDecimal("22.0");
		System.out.println(bd2);//22.0
		
		BigDecimal bd3 = new BigDecimal("0.1");
		System.out.println(bd3);//0.1
	}
}
