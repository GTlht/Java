package txt;
/*11.��������д����
	�����������󣬲��ô���ʵ��
	�ֻ���Phone
	����:
		Ʒ��brand
		�۸�price
	��Ϊ:
		��绰call()
		������sendMessage()
		����ϷplayGame()
		
	Ҫ��:
		1.��������Ҫ������,����Ҫ˽��,���ɿղΡ��вι��죬setter��getter����
		2.���������,��main�����д�������Ķ��󲢸����Ը�ֵ(��ʾ���ַ���:setter�����͹��췽��)
		3.����������Ա����,��ӡ��ʽ����:
			����ʹ�ü۸�Ϊ998Ԫ��С��Ʒ�Ƶ��ֻ���绰....
			����ʹ�ü۸�Ϊ998Ԫ��С��Ʒ�Ƶ��ֻ�������....
			����ʹ�ü۸�Ϊ998Ԫ��С��Ʒ�Ƶ��ֻ�����Ϸ....
*/
public class Demo11 {
	public static void main(String[] args) {
		System.out.println("-----------���췽��-------------------");
		Phone1 p1=new Phone1("С��",998);
		p1.call();
		p1.sendMessage();
		p1.playGame();
		System.out.println("------------setter-------------------");
		Phone1 p2=new Phone1();
		p2.setBrand("С��");
		p2.setPrice(998);
		p1.call();
		p1.sendMessage();
		p1.playGame();
	}
	
	

}
class Phone1{
	private String brand;
	private int price;
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
	public Phone1(String brand, int price) {
		this.brand = brand;
		this.price = price;
	}
	public Phone1() {
	
	}
	public void call() {
		System.out.println("����ʹ�ü۸�Ϊ"+price+"Ԫ��"+brand+"Ʒ�Ƶ��ֻ���绰....");
	}
	public void sendMessage() {
		System.out.println("����ʹ�ü۸�Ϊ"+price+"Ԫ��"+brand+"Ʒ�Ƶ��ֻ�������....");
	}
	public void playGame(){
		System.out.println("����ʹ�ü۸�Ϊ"+price+"Ԫ��"+brand+"Ʒ�Ƶ��ֻ�����Ϸ....");
	}
}
