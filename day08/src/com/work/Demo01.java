package com.work;

/*
1. 分析以下需求，并用代码实现
	手机类Phone
	属性:
		品牌brand
		价格price
	行为:
		打电话call()
		发短信sendMessage()
		玩游戏playGame()
*/
public class Demo01 {
	public static void main(String[] args) {
		Phone phone = new Phone();
		phone.setBrand("华为");
		phone.setPrice(12000);
		System.out.println(phone.getBrand() + "..." + phone.getPrice());
		phone.call();
		phone.sendMessage();
		phone.playGame();
	}
}

class Phone {
	//属性
	private String brand;
	private int price;
	
	//行为
	public void call() {
		System.out.println("打电话");
	}
	
	public void sendMessage() {
		System.out.println("发信息");
	}
	
	public void playGame() {
		System.out.println("玩游戏");
	}
	
	public void setBrand(String b) {
		brand = b;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public void setPrice(int p) {
		price = p;
	}
	
	public int getPrice() {
		return price;
	}
}
