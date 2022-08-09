package txt;

import java.io.File;

/*1.在桌面上创建一个名字叫做aaa/bbb/ccc/aaa.txt？*/
public class Demo1 {
	public static void main(String[] args) {
		File file=new File("C:/Users/LHT/Desktop/aaa/bbb/ccc/aaa.txt");
		System.out.println(file.mkdirs());
	}

}
