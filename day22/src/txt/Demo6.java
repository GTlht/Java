package txt;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
/*6.项目根路径下有text.txt文件，内容如下：
	我爱Java
	123456
	利用IO流的知识读取text.txt文件的内容反转后写入text.txt文件中，内容如下：
	123456
	我爱Java*/
import java.util.Arrays;

public class Demo6 {
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new FileReader("text.txt"));
		
		String str=null;
		StringBuffer sb=new StringBuffer();
		while((str=br.readLine())!=null) {
			sb.append(new StringBuffer(str).reverse()+"\r\n");
			//System.out.println(str);
		}
		br.close();
		BufferedWriter bw=new BufferedWriter(new FileWriter("text.txt"));
		bw.write(sb.toString());
		bw.close();
	}

}
