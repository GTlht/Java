package com.work;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/*
4.分析以下需求，并用代码实现
	1.项目根目录下建立文件： user.txt，文件中存放用户名和登录密码，格式：用户名，密码,如：aaa,123；
	2. user.txt文件中初始存放的用户信息有如下：
		jack,123
		rose,123
		tom,123
	3.要求完成如下功能：
	  程序运行时：控制台提示用户输入注册的用户名和密码；
	   验证键盘录入的用户名跟user.txt中已注册的用户名是否重复：
	   是：控制台提示：用户名已存在
	   否：将键盘录入的用户名及密码写入user.txt文件，并在控制台提示：注册成功；
*/

public class Demo04 {
	public static void main(String[] args) throws IOException {
		//创建容器
		ArrayList<User> al = new ArrayList<>();
		
		//键盘录入
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请录入用户名：");
		String username = sc.next();//tom
		System.out.println("请录入密码");
		String password = sc.next();
		
		//校验用户名是否存在
		//创建高效字符输入流对象
		BufferedReader br = new BufferedReader(new FileReader("user.txt"));
		String line = null;
		while((line = br.readLine()) != null) {
			//解析
			String[] strs = line.split(",");
			//封装数据
			User user = new User(strs[0], strs[1]);
			//将对象存储到容器中
			al.add(user);
		}
		
		//释放资源
		br.close();
		
		//判断是否存在不存在的标记
		boolean flag = false;
		
		//判断用户名是否重复
		//遍历容器
		for (User user : al) {
			if(username.equals(user.getName())) {
				System.out.println("用户名存在");
				flag = true;
				break;
			}
		}
		
		//创建高效字符输出流对象
		BufferedWriter bw = new BufferedWriter(new FileWriter("user.txt", true));
		
		//用户名不存在，写出到文件中
		if(!flag) {
			System.out.println("注册成功~");
			bw.newLine();
			bw.write(username + "," + password);
		}
		
		//释放资源
		bw.close();
		
	}
}

class User {
	private String name;
	private String password;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", password=" + password + "]";
	}
	
	
}