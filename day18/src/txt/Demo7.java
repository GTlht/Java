package txt;
/*7.请用LinkedList的集合模拟栈数据结构，并测试*/

import java.util.LinkedList;

public class Demo7 {
	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<Integer>();
		list.addFirst(1);
		list.addFirst(2);
		list.addFirst(3);
		list.addFirst(4);
		list.addFirst(5);
		for (Integer i : list) {
			System.out.println(i);
		}
	}
}
