package txt;
/*5.定义测试类:
		创建电脑对象,依次调用开机方法,使用USB设备, 关机方法

		打印效果如下:
			开机
			连接鼠标的USB
			断开鼠标的USB
			连接键盘的USB
			断开键盘的USB
			关机*/
public class Demo12 {
	public static void main(String[] args) {
		NoteBook nb=new NoteBook();
		nb.start();
		nb.faction(new Mouse());
		nb.faction(new KryBoard());
		nb.off();
	}

}
interface Usb{
	void open();
	void closs();
}
class Mouse implements Usb{

	@Override
	public void open() {
		System.out.println("连接鼠标的USB");
		
	}

	@Override
	public void closs() {
		System.out.println("断开鼠标的USB");
		
	}
	
}
class KryBoard implements Usb{

	@Override
	public void open() {
		System.out.println("连接键盘的USB");
		
	}

	@Override
	public void closs() {
		System.out.println("断开键盘的USB");
		
	}
	
}
class NoteBook{
	public void start() {
		System.out.println("开机");
	}
	public void off() {
		System.out.println("关机");
	}
	public void faction(Usb usb) {
		usb.open();
		usb.closs();
	}
}