package com.work;

import java.util.Comparator;
import java.util.TreeSet;

/*
2.分析以下需求，并用代码实现：	
	(1)定义一个TreeSet集合，然后存入6个Double类型的数据，分别是[1.1,5.2,6.3,2.5,5.2,3.3]
	(2)不去重，然后遍历输出(从大到小)
*/

public class Demo02 {
	public static void main(String[] args) {
		TreeSet<Double> ts = new TreeSet<>(new Comparator<Double>() {
			@Override
			public int compare(Double d1, Double d2) {
				/*//大到小
				double n1 = d2 - d1;
				//不去重
				double n2 = n1 == 0 ? 1 : n1;
				return (int)n2;*/
				
				return d2 - d1 > 0 ? 1 : -1;
			}
		});
		
		ts.add(1.1);
		ts.add(5.2);
		ts.add(6.3);
		ts.add(2.5);
		ts.add(5.2);
		ts.add(3.3);
		
		for (Double d : ts) {
			System.out.println(d);
		}
	}
}
