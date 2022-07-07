package com.bigdecimal;

import java.math.BigDecimal;

public class Demo04 {
	public static void main(String[] args) {
		//public BigDecimal divide(BigDecimal divisor,int scale,int roundingMode)
		
		/*BigDecimal bd1 = new BigDecimal("10");
		BigDecimal bd2 = new BigDecimal("3");*/
		BigDecimal bd1 = new BigDecimal("1");
		BigDecimal bd2 = new BigDecimal("8");
		
		//3.3333333333333333333...
		//0.125
		
		BigDecimal result1 = bd1.divide(bd2, 2, BigDecimal.ROUND_DOWN);
		System.out.println(result1);//3.33 0.12
		
		BigDecimal result2 = bd1.divide(bd2, 2, BigDecimal.ROUND_UP);
		System.out.println(result2);//3.34 0.13
		
		BigDecimal result3 = bd1.divide(bd2, 2, BigDecimal.ROUND_HALF_UP);
		System.out.println(result3);//3.33 0.13
		
	}
}
