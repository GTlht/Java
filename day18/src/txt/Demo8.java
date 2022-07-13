package txt;

import java.text.Collator;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/*8.需求：给定一个数组：{"张柏芝","刘德华","张亮","张靓颖","杨颖","黄晓明"}
	1、编写一个方法：将数组中的元素添加到list集合中，并把所有姓张的人员读取出来打印到控制台上。
	2、对集合中的人员进行排序(主要条件:长度,次要条件:姓氏)倒叙,并保留重复的元素。
	3、把排序好的元素，使用迭代器的方式打印出来。*/
public class Demo8 {
	public static void main(String[] args) {
		TreeSet<String> tree=new TreeSet<String>(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				
				int num=o2.length()-o1.length();

				return num==0?1:num;
			}
		});
		Collections.addAll(tree,"张柏芝","刘德华","张亮","张靓颖","杨颖","黄晓明" );
		Iterator<String> it=tree.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
				
		}
	}

}
