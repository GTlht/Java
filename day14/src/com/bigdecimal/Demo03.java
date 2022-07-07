package com.bigdecimal;

import java.math.BigDecimal;

public class Demo03 {
	public static void main(String[] args) {
		/*//public BigDecimal add(BigDecimal augend)
		BigDecimal bd1 = new BigDecimal("0.1");
		BigDecimal bd2 = new BigDecimal("0.2");
		BigDecimal result = bd1.add(bd2);
		System.out.println(result);//0.3*/
		
		/*//public BigDecimal subtract(BigDecimal subtrahend)
		BigDecimal bd1 = new BigDecimal("0.1");
		BigDecimal bd2 = new BigDecimal("0.2");
		BigDecimal result = bd1.subtract(bd2);
		System.out.println(result);//-0.1*/
		
		/*//public BigDecimal multiply(BigDecimal multiplicand)
		BigDecimal bd1 = new BigDecimal("0.1");
		BigDecimal bd2 = new BigDecimal("0.2");
		BigDecimal result = bd1.multiply(bd2);
		System.out.println(result);//0.02*/
		
		/*//public BigDecimal divide(BigDecimal divisor)
		BigDecimal bd1 = new BigDecimal("0.1");
		BigDecimal bd2 = new BigDecimal("0.2");
		BigDecimal result = bd1.divide(bd2);
		System.out.println(result);//0.5*/
		
		BigDecimal bd1 = new BigDecimal("10");
		BigDecimal bd2 = new BigDecimal("3");
		BigDecimal result = bd1.divide(bd2);
		System.out.println(result);
		
	}
}
