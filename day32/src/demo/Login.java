package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.jdbc.Driver;

public class Login {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db3", "root", "123456");
		Statement st = con.createStatement();
		System.out.println("输入用户名和密码：");
		Scanner sc=new Scanner(System.in);
		String name1=sc.next();
		int id1=sc.nextInt();
		String sql="select * from users where id="+id1+" and name='"+name1+"'";
		ResultSet rs = st.executeQuery(sql);
		if(rs.next()) {
			System.out.println("登录成功");
		}else {
			System.out.println("登陆失败");
		}
	}
	

}
