package txt;
/*1. �����������󣬲��ô���ʵ��
	�ֻ���Phone
	����:
		Ʒ��brand
		�۸�price
	��Ϊ:
		��绰call()
		������sendMessage()
		����ϷplayGame()
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
		System.out.println("ʹ��"+brand+"��绰");
	}
	public void sendMessage() {
		System.out.println("ʹ��"+brand+"������");
	}
	public void playGame() {
		System.out.println("ʹ��"+brand+"����Ϸ");
	}
}

