package txt;

import java.util.HashMap;
import java.util.Set;

/*4.分析以下需求，并用代码实现：
	(1)统计每个单词出现的次数
	(2)有如下字符串"If you want to change your fate I think you must come to the woniu to learn java"
	(3)打印格式：
		to=3
  		think=1
  		you=2
  		//........*/
public class Demo4 {
	public static void main(String[] args) {
		String str="If you want to change your fate I think you must come to the woniu to learn java";
		String[] cs=str.split(" ");
		HashMap<String, Integer> map=new HashMap<String, Integer>();
		for (String s : cs) {
			if(map.containsKey(s)) {
				Integer value=map.get(s);
				value++;
				map.put(s, value);
			}else {
				map.put(s, 1);
			}
			//System.out.println(s);
		}
		Set<String> keySet = map.keySet();
		for (String key : keySet) {
			System.out.println(key+"="+map.get(key));
		}
	}

}
