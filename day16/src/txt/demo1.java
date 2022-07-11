package txt;
/*1.请按以下要求编写代码：
	1.定义一个只能存储字符串的集合对象；
	2.向集合内添加以下数据：
		“孙悟空”
		“猪八戒”
		“沙和尚”
		“铁扇公主”
	3.不用遍历，直接打印集合；
	4.获取第4个元素
	5.打印一下集合大小；
	6.删除元素“铁扇公主”
	7.删除第3个元素
	8.将元素“猪八戒”改为“猪悟能”
	9.再次打印集合;*/

import java.util.ArrayList;
import java.util.Collections;

public class demo1 {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		Collections.addAll(list,"孙悟空","猪八戒","沙和尚","铁扇公主");
		System.out.println(list);
		System.out.println(list.size());
		list.remove("铁扇公主");
	
		list.remove(2);
		
		list.set(1, "猪悟能");
		System.out.println(list);

	}
	
}
