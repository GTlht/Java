package com.work;

/*
手机类Phone
			属性:品牌brand,价格price
			行为:打电话call,发短信sendMessage,玩游戏,playGame
 */
public class Demo01 {
	public static void main(String[] args) {
		Phone p1 = new Phone("华为", 12000);
		Phone p2 = new Phone();
		p2.setBrand("苹果");
		p2.setPrice(9000);
	}
}

class Phone {
	private String brand;
	private int price;
	
	public Phone() {}
	
	public Phone(String brand, int price) {
		this.brand = brand;
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public void call() {}
	public void sendMessage() {}
	public void playGame() {}
	
}
