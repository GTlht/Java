package com._enum;

public class Demo01 {
	public static void main(String[] args) {
		/*Week mon = Week.MON;
		System.out.println(mon.getName());
		mon.show();
		
		Week tue = Week.TUE;
		System.out.println(tue.getName());
		tue.show();
		
		Week wed = Week.WED;
		System.out.println(wed.getName());
		wed.show();*/
	}
}

/*abstract class Week {
	public static final Week MON = new Week("星期一") {
		@Override
		public void show() {
			System.out.println("星期一");
		}
	};
	public static final Week TUE = new Week("星期二") {
		@Override
		public void show() {
			System.out.println("星期二");
		}
	};
	public static final Week WED = new Week("星期三") {
		@Override
		public void show() {
			System.out.println("星期三");
		}
	};
	
	private String name;
	
	private Week(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public abstract void show();
}*/

/*class Week {
	public static final Week MON = new Week("星期一");
	public static final Week TUE = new Week("星期二");
	public static final Week WED = new Week("星期三");
	
	private String name;
	
	private Week(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}*/

/*class Week {
	public static final Week MON = new Week();
	public static final Week TUE = new Week();
	public static final Week WED = new Week();
	
	private Week() {}
}*/
