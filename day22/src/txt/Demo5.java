package txt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

/*5.分析以下需求，并用代码实现
	项目根路径下有个questions.txt文件内容如下：
		5+5
		150-25
		155*155
		2555/5
	要求：读取内容计算出结果，将结果写入到results.txt文件中
		5+5=10
		//....*/
public class Demo5 {
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new FileReader("questions.txt"));
		BufferedWriter bw=new BufferedWriter(new FileWriter("results.txt"));
		String str="";
		String[] arr=new String[2];
		while((str=br.readLine())!=null) {
			if(str.contains("+")) {
				arr=str.split("\\+");
				str=arr[0]+"+"+arr[1]+"="+(Integer.parseInt(arr[0])+Integer.parseInt(arr[1]));
				bw.write(str);
				bw.newLine();
			}else if(str.contains("-")) {
				arr=str.split("\\-");
				str=arr[0]+"-"+arr[1]+"="+(Integer.parseInt(arr[0])-Integer.parseInt(arr[1]));
				bw.write(str);
				bw.newLine();
			}else if(str.contains("*")) {
				arr=str.split("\\*");
				str=arr[0]+"*"+arr[1]+"="+(Integer.parseInt(arr[0])*Integer.parseInt(arr[1]));
				bw.write(str);
				bw.newLine();
			}else {
				arr=str.split("\\/");
				str=arr[0]+"/"+arr[1]+"="+(Double.parseDouble(arr[0])/Double.parseDouble(arr[1]));
				bw.write(str);
				bw.newLine();
			}
		}
		br.close();
		bw.close();
	}

}
