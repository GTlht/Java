package txt;
/*2.分析以下需求，并用代码实现：	
(1)定义一个TreeSet集合，然后存入6个Double类型的数据，分别是[1.1,5.2,6.3,2.5,5.2,3.3]
(2)不去重，然后遍历输出(从大到小)*/

import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

public class Demo2 {
	public static void main(String[] args) {
		TreeSet<Double> set=new TreeSet<Double>(new Comparator<Double>() {

			@Override
			public int compare(Double d1, Double d2) {
				if(d2>d1) {
					return 1;
				}else if(d1>d2){
					return -1;
				}else {
				return 1;
			}
			}
		});
		Collections.addAll(set, 1.1,5.2,6.3,2.5,5.2,3.3);
		System.out.println(set);
		
	}

}
