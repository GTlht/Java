package txt;

import java.util.List;

/*5.分析以下需求，并用代码实现：
	定义一个replaceAll方法,用传入集合的新值替换集合中的老值(list,old,new)*/
public class Demo5 {
	public static void main(String[] args) {
		
	}

	public static void replaceAll(List<String> list,String old,String _new) {
		for(int i=0;i<list.size();i++) {
			if(list.get(i).equals(old)) {
				list.set(i, _new);
			}
		}
		
	}
}
