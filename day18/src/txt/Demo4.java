package txt;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

/*4.编写一个程序，获取10个1至20的随机数，要求随机数不能重复。并把最终的随机数输出到控制台。*/
public class Demo4 {
	public static void main(String[] args) {
		HashSet<Integer> num=new HashSet<Integer>();
		int size=0;
		while(num.size()<10) {
			int temp=(int)(Math.random()*20+1);
			num.add(temp);
		}
	
		
		for (Integer i: num) {
			System.out.print(i+" ");
		}
	}

}
