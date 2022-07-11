package txt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/*6.分析以下需求，并用代码实现
	1.定义ArrayList集合，存入多个字符串
	   如:"ab1" "123ad"  "bca" "dadfadf"  "dddaaa"  "你好啊"  "我来啦"  "别跑啊"
	2.遍历集合,删除长度大于5的字符串,打印删除后的集合对象
	3.基于上一步,删除集合中元素包含0-9数字的字符串(只要字符串中包含0-9中的任意一个数字就需要删除此整个字符串)*/
public class demo6 {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		Collections.addAll(list,"ab1", "123ad" , "bca" ,"dadfadf" , "dddaaa"  ,"你好啊" , "我来啦" , "别跑啊" );
		Iterator<String> it=list.iterator();
		while(it.hasNext()) {
			String next=it.next();
			if(next.length()>5 ) {
				it.remove();
			}
			for(int i=0;i<next.length();i++) {
				if(next.charAt(i)>'0'&&next.charAt(i)<'9') {
					it.remove();
					break;
				}
			}
		}
		System.out.println(list);
	}

}
