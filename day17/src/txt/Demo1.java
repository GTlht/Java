package txt;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/*1.分析以下需求，并用代码实现：
	(1)定义一个方法swap()传入集合和两个角标使集合中元素交换位置()
	(2)思路
		a.定义一个临时变量, 记住其中一个元素
		b.用第一个位置存放第二个位置上的元素
		c.用第二个位置存放临时变量记住的元素*/
public class Demo1 {
	public static void main(String[] args) {
		List list=new ArrayList();
		list.add("156");
		list.add("852");
		list.add("0000");
		System.out.println(list);
		swap(list,0,2);
		System.out.println(list);
	}
	public static void swap(List c,int i,int j) {
		Object obj=c.get(i);
		c.set(i, c.get(j));
		c.set(j, obj);
	}

}
