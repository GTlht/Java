package txt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

/*4.分析以下需求，并用代码实现
	1.项目根目录下建立文件： user.txt，文件中存放用户名和登录密码，格式：用户名，密码,如：aaa,123；
	2. user.txt文件中初始存放的用户信息有如下：
		jack,123
		rose,123
		tom,123
	3.要求完成如下功能：
	  程序运行时：控制台提示用户输入注册的用户名和密码；
	   验证键盘录入的用户名跟user.txt中已注册的用户名是否重复：
	   是：控制台提示：用户名已存在
	   否：将键盘录入的用户名及密码写入user.txt文件，并在控制台提示：注册成功；*/
public class Demo4 {
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new FileReader("user.txt"));
		BufferedWriter bw=new BufferedWriter(new FileWriter("user.txt",true));
		Scanner sc=new Scanner(System.in);
		String input=sc.next();
		String pawd=sc.next();
		String str=null;
		boolean flag=true;
		while((str=br.readLine())!=null) {
			if(str.startsWith(input)) {
				System.out.println("用户名已存在！");
				flag=false;
				break;
			}
		}
		if(flag) {
			bw.write("\r\n"+input);
			bw.write(","+pawd);
		}
		br.close();
		bw.close();
	}

}
