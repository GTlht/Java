package txt;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

/*2.分析以下需求，并用代码实现：
	(1)利用键盘录入，输入一个字符串
	(2)统计该字符串中各个字符的数量
	(3)如：
		用户输入字符串"If~you-want~to~change-your_fate_I_think~you~must~come-to-the-woniu
		-to-learn-java"
		程序输出结果：-(9)I(2)_(3)a(7)c(2)d(1)e(6)f(2)g(1)h(4)i(1)j(1)k(2)l(1)m(2)n(4)o(8)
		r(4)s(2)t(8)u(4)v(1)w(1)y(3)~(6)
		*/
public class Demo2 {
	public static void main(String[] args) {
		String str="If~you-want~to~change-your_fate_I_think~you~must~come-to-the-woniu-to-learn-java";
		char[] c=str.toCharArray();
		HashMap<Character, Integer> map=new HashMap<Character, Integer>();
		for (char d : c) {
			if(map.containsKey(d)) {
				Integer value=map.get(d);
				value++;
				map.put(d, value);
			}else {
				map.put(d, 1);
			}
			
		}
		Set<Entry<Character, Integer>> entrySet=map.entrySet();
		Iterator<Entry<Character, Integer>> it=entrySet.iterator();
		while(it.hasNext()) {
			Entry<Character, Integer> entry=it.next();
			System.out.print(entry.getKey()+"("+entry.getValue()+")");
		}
	}

}
