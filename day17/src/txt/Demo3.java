package txt;

import java.util.ArrayList;
import java.util.List;

/*3.分析以下需求，并用代码实现：
	(1)将集合中的元素反转
	(2)思路
		a.定义循环, 循环size()/2次
		b.第一次交换第一个和最后一个, 第二次交换第二个和倒数第二个
		*/
public class Demo3 {
	public static void main(String[] args) {
		List list=new ArrayList();
		list.add(123);
		list.add("sbf");
		list.add("sfb");
		list.add(185);
		System.out.println(list);
		swap(list);
		System.out.println(list);
	}
	public static void swap(List list) {
		for(int i=0;i<list.size()/2;i++) {
			Object temp=list.get(i);
			list.set(i, list.get(list.size()-1-i));
			list.set(list.size()-1-i, temp);
		}
	}

}
