package txt;
/*1. 分析以下需求，并用代码实现
	手机类Phone
	属性:
		品牌brand
		价格price
	行为:
		打电话call()
		发短信sendMessage()
		玩游戏playGame()
		*/
public class Demo1 {
	public static void main(String[] args) {
		
	}

}
class Phone {
	private String brand;
	private double price;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void call() {
		System.out.println("使用"+brand+"打电话");
	}
	public void sendMessage() {
		System.out.println("使用"+brand+"发短信");
	}
	public void playGame() {
		System.out.println("使用"+brand+"打游戏");
	}
}

