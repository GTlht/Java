package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) throws Exception {
		List<User> list=new ArrayList<User>();
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db3", "root", "123456");
		Statement st = con.createStatement();
//		st.executeUpdate(" insert into users values(1,'lht',19) ");
//		st.executeUpdate(" insert into users values(2,'张三',16) ");
//		st.executeUpdate(" insert into users values(3,'李四',12) ");
		ResultSet rs = st.executeQuery("select * from users ");
//		boolean rs = st.execute("insert into users values(4,'hgx',11) ");
		//boolean rs = st.execute("delete from users where id=1 ");
		//boolean rs = st.execute("update users set id=1 where name='张三'");
		
		
		while(rs.next()) {
			list.add(new User(rs.getInt("id"),rs.getString("name"),rs.getInt("age")));
			//System.out.println(rs.getInt("id")+"..."+rs.getString("name")+"..."+rs.getInt("age"));
		}
		con.close();
		st.close();
		rs.close();
		for (User user : list) {
			System.out.println(user);
			
		}
	}

}
