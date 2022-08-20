package com._enum;

public class Demo04 {
	public static void main(String[] args) {
		/*MyE me1 = MyE.ME1;
		System.out.println(me1.toString());*/
		
		/*MyE me1 = MyE.ME1;
		MyE me3 = MyE.ME3;
		//int num = me1.compareTo(me2);
		//int num = me2.compareTo(me1);
		int num = me1.compareTo(me3);
		System.out.println(num);*/
		
		/*MyE me1 = MyE.ME1;
		System.out.println(me1.name());*/
		
		/*MyE me1 = MyE.ME3;
		System.out.println(me1.ordinal());*/
		
		/*//public static <T extends Enum<T>> T valueOf(Class<T> enumType,String name)
		MyE me = MyE.valueOf(MyE.class, "ME3");
		System.out.println(me);*/
		
		/*//public static com._enum.Week[] values()
		MyE[] values = MyE.values();
		for (MyE me : values) {
			System.out.println(me);
		}*/
		
		//public static com._enum.Week valueOf(java.lang.String)
		MyE me = MyE.valueOf("ME2");
		System.out.println(me);
	}
}

enum MyE {
	ME1, ME2, ME3;
}