package txt;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

/*3.将文件name.txt中的以下数据：
	张三,18,男银
	李四,20,女银
	...
	...
	需求：将文件中李四的名字修改为王五，其他不变*/
public class Demo3 {
	public static void main(String[] args) throws Exception {
		FileReader fr=new FileReader("name.txt");
		
		char[] ch=new char[5];
		int len=0;
		StringBuilder sb=new StringBuilder();
		String str=null;
		//System.out.println(fr);
		while((len=fr.read(ch))!=-1) {
			sb.append(ch,0,len);
			//System.out.println((char)len);
		}
		
		
		fr.close();
		FileWriter fw=new FileWriter("name.txt");
		str=sb.toString();
		System.out.println(str);
		str=str.replace("李四", "王五");
		fw.write(str);
		fw.close();
	}

}
