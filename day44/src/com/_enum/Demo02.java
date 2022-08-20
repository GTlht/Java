package com._enum;

public class Demo02 {
	public static void main(String[] args) {
		Week mon = Week.MON;
		System.out.println(mon);
		
		Week tue = Week.TUE;
		System.out.println(tue);
		
		Week wed = Week.WED;
		System.out.println(wed);
	}
}

enum Week {
	MON("星期一") {
		public void show() {
			System.out.println("星期一");
		}
	}, TUE("星期二") {
		public void show() {
			System.out.println("星期二");
		}
	}, WED("星期三") {
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
}

/*enum Week {
	MON("星期一"), TUE("星期二"), WED("星期三");
	
	private String name;
	
	private Week(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}*/

/*enum Week {
	MON, TUE, WED;
}*/