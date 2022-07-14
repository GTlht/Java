package txt;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

/*3.分析以下需求，并用代码实现：
	(1)有类似这样的字符串："1.2,3.4,5.6,7.8,5.56,44.55"请按照要求，依次完成以下试题
	(2)以逗号作为分隔符，把已知的字符串分成一个String类型的数组，数组中的每一个元素类似于"1.2","3.4"这样的字符串
	(3)把数组中的每一个元素以"."作为分隔符，把"."左边的元素作为key，右边的元素作为value，封装到Map中，Map中的key和value都是Object类型
	(4)把map中的key封装的Set中，并把Set中的元素输出
	(5)把map中的value封装到Collection中，把Collection中的元素输出*/
public class Demo3 {
	public static void main(String[] args) {
		String str="1.2,3.4,5.6,7.8,5.56,44.55";
		String[] cs=str.split(",");
		HashMap<Object, Object> map=new HashMap<Object, Object>();
		System.out.println("(2)以逗号作为分隔符，把已知的字符串分成一个String类型的数组，数组中的每一个元素类似于\"1.2\",\"3.4\"这样的字符串");
		for (String s : cs) {
			String[] _cs=s.split("\\.");
			map.put(_cs[0], _cs[1]);
			System.out.print(s+" ");
		}
		Set<Object> keySet = map.keySet();
		Collection<Object> coll=map.values();
		System.out.println("\n把数组中的每一个元素以\".\"作为分隔符，把\".\"左边的元素作为key，右边的元素作为value，封装到Map中，Map中的key和value都是Object类型");
		for (Object key : keySet) {
			System.out.print(key+"::"+map.get(key)+" ");
		}
		System.out.println("\n(4)把map中的key封装的Set中，并把Set中的元素输出");
		for (Object key : keySet) {
			System.out.print(key+" ");
		}
		System.out.println("\n(5)把map中的value封装到Collection中，把Collection中的元素输出");
		for (Object co : coll) {
			System.out.print(co+" ");
			
		}
	}

}
