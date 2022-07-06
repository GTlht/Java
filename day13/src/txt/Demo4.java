package txt;
/*4.分析以下需求，并用代码实现：
	(1)定义数字字符串数组{"010","3223","666","7890987","123123"}
	(2)判断该数字字符串数组中的数字字符串是否是对称(第一个数字和最后一个数字相等，第二个数字和倒数第二个数字是相等的，依次类推)的，并逐个输出
	(3)如：010 是对称的，3223 是对称的，123123 不是对称的
*/
public class Demo4 {
	public static void main(String[] args) {
		String[] str={"010","3223","666","7890987","123123"};
		for(int i=0;i<str.length;i++) {
			if(str[i].equals(new StringBuilder(str[i]).reverse().toString())) {
				System.out.println(str[i]+"  是对称的");
			}else {
				System.out.println(str[i]+"  不是对称的");
			}
		}
		
	}

}
