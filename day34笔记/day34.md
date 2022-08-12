### JDBC事务处理

~~~
Connection中事务处理的方法？
	void setAutoCommit(boolean autoCommit)：将此连接的自动提交模式设置为给定状态，autoCommit - 为 true 表示启用自动提交模式；为 false 表示禁用自动提交模式 
	void rollback()：回滚
	void commit()：提交

	public class Demo01 {
        public static void main(String[] args) throws Exception {
            //获取数据库连接对象
            Connection conn = JdbcUtils.getConnection();

            //开启事务
            conn.setAutoCommit(false);

            //获取执行sql语句对象
            PreparedStatement ps = conn.prepareStatement("update user set money = money + ? where name = ?");

            //给tom减去100
            ps.setInt(1, -100);
            ps.setString(2, "tom");
            //执行sql语句
            ps.executeUpdate();

            System.out.println(1/0);

            //给jerry加上100
            ps.setInt(1, 100);
            ps.setString(2, "jerry");
            //执行sql语句
            ps.executeUpdate();

            //提交事务
            conn.commit();

            //释放资源
            JdbcUtils.close(conn, ps);
        }
    }
~~~

### JavaWeb常识

~~~
什么是JavaWeb？
	是指用Java语言来开发基于互联网端的项目
	
软件架构？
	1.C(Client)/S(Server)：客户端/服务器
		是指本地有一个客户端软件，远程有一个服务器
		
		举例子：QQ，微信，爱奇艺，网易云音乐，百度云盘，... ...
		
		优点：用户体验度好，功能强大
		缺点：占内存，开发，测试，部署，维护等非常麻烦，成本大
		
	2.B(Browser)/S(Server)：浏览器/服务器
		是指本地有一个浏览器，通过输入不同的网址，就可以访问到远程的不同服务器

		举例子：淘宝，京东，天猫... ...
		
		优点：不占内存，开发，测试，部署，维护等非常的方便简单，成本低
		缺点：功能相对不够强大，用户体验相对较差，对硬件要求较高

网站和网页？
	什么是网站？
		一个网站是由多个网页组成一个集合体
		
	什么是网页？
		就是通过浏览器访问的每一个页面，每一个页面都称为一个网页，也是一个html文件
		
	常见的浏览器？
		IE，谷歌，火狐，360浏览器，QQ浏览器，苹果浏览器，... ...

	浏览器的内核？
		什么是内核？
			渲染引擎，是浏览器的核心
		
		内核的作用？
			可以获取网页上的内容，进行解析，然后再通过另外一种方式给我们呈现出来
			
		常见的内核有哪些？
			trident IE浏览器
			gecko 火狐浏览器
			webkit 苹果浏览器
			blink 谷歌浏览器
			
			国内的浏览器都是使用的webkit或者blink内核

资源？
	什么是资源？
		资源就是指文件
		
	资源的分类？
		静态资源
		动态资源
	
	静态资源？
		什么是静态资源？
			是指文件中的数据都是写死的，今天打开是这个样子，明天打开还是这个样子，不会发生变化的资源文件
		
		举例子？
			文本文件，图片，视频，音频， ......
			html，css，js
			
			前端静态资源三兄弟：
				html：写页面
				css：美化页面
				js：让页面动起来的
				
		注意：当我们通过浏览器访问服务器的某个静态资源，该静态资源会直接响应回浏览器，通过浏览器解析，给我们呈现出来。浏览器内核只能解析静态资源
				
	动态资源？
		什么是动态资源？
			是指文件中的数据是活的，不同时刻访问这个文件，内容是可以发生改变的
			
		举例子？
			jsp，servlet
			
		注意：当我们通过浏览器访问服务器的某个动态资源，该动态资源不会直接响应回浏览器，会先转换为静态资源，然后将静态资源响应回浏览器，浏览器给解析呈现出来。浏览器不能解析动态资源
~~~

### HTML

~~~
什么是html？
	超文本标记语言（Hypertext Markup Language）
	
	超文本：
		是指超级文本，比普通文本的功能更加强大的文本
		
		普通文本里面只能写字，变换内容的字体和大小
		超级文本里面可以写字，可以变换字体，可以变换颜色，可以变换大小，可以嵌入图片，动态图片，音频，视频等
		
		超人和普通人
		
	标记语言：
		是指代码都是由标签组成的
		<html></html>
	
html的作用？
	用来写页面的(网页)

html的入门小案例？
	1.创建一个文件，文件名叫做HelloWorld.html
	2.在文件中写以下的内容：
		<html>
            <head>
                <title>约吗</title>
            </head>
            <body>
                滚犊子
            </body>
        </html>
	3.通过浏览器打开该文件即可

html的基础语法？
	1.html文件的后缀名是以.html或者.htm为结尾的
	2.html里面内容是由标签组成的，标签的写法有两种：
		写法一：围堵标签
			有头有尾
			<html></html>
			<body></body>
		
		写法二：自闭合标签
			<hr/>
			<br/>
			<input/>
	3.标签可以互相嵌套
    	标签要正确嵌套，不能你中有我，我中有你
    	
    	错误嵌套写法：
    		<html><body></html></body>
    		
    	正确嵌套写法：
    		<html><body></body></html>
    		<html><br/></html>
    4.html是不区分大小写的
    	<html></html>
    	<HTML></HTML>
    	<html></HTML>
    5.标签中可以写属性
    	属性格式：属性名=属性值
    	写的位置：写在标签的里面
    		<body 属性名=属性值 属性名=属性值></body>
    		<hr 属性名=属性值 属性名=属性值/>
    	属性值要由引号括起来的，单引号和双引号都可以
    		<font color="red"></font>
    		<hr color='red'/>
    6.html是一个非常不严谨的标记语言
    	我们很难把html给写错了
    	
html中常见的标签？
	1.结构体标签
		<!DOCTYPE html>：声明该文件是一个以html5为标准的html文件
		
		html标签：根标签，每一个html文件中有且只有一个
		
		head标签：头标签，里面的子标签一般都是用来设置页面的属性的
		
		meta标签：主要设置页面属性的
			charset="utf-8"：告诉浏览器用什么编码方式打开此文件
		
		title标签：页面标题标签

		body标签：体标签，里面的子标签一般都是用来进行页面展示的
		
	2.文本标签
		注释标签：<!--注释的内容-->
		
		标题标签：<h数字></h数字>
			数字范围：1-6，数字越小标题越小
			超出范围和没写标题标签是一样的效果
		
		段落标签：<p></p>
		
		换行标签：<br/>
		
		水平线标签：<hr/>
			常见的属性：
				color属性：设置水平线的颜色
				size属性：设置水平线的粗细
				width属性：设置水平线的宽度
				align属性：设置水平线的位置
					left 居左
					center 居中
					right 居右
					
		加粗标签：
			<b></b>
			<strong></strong>
			
		斜体标签：
			<i></i>
			<em></em>
			
		删除线标签：
			<s></s>
			<del></del>
			
		下划线标签：
			<u></u>
			<ins></ins>
			
		字体标签：
			<font></font>
			
			常见的属性：
				color属性：设置字体的颜色
				size属性：设置字体的大小
					数字范围：1-7，数字越大字体越大，超出范围按照7来算
				face属性：设置字体的字体
				
width属性和color属性的设置方式？
	width属性的设置？
		方式一：数字，单位是像素(px)
			<hr color="red" width="1000">
			<hr color="red" width="100">
			
		方式二：百分比
			<hr color="yellowgreen" width="50%">
			
	color属性的设置？
		方式一：颜色单词
			<font color="red" size="7">约吗</font>
			
		方式二：颜色的十六进制表示形式
			<font color="#ffd83c" size="7">滚犊子</font><br>
            <font color="#000000" size="7">滚犊子</font><br>
            <font color="#FFFFFF" size="7">滚犊子</font><br>
            <font color="#FF0000" size="7">滚犊子</font><br>
            <font color="#00FF00" size="7">滚犊子</font><br>
            <font color="#0000FF" size="7">滚犊子</font><br>
		
		方式三：颜色的rgb表示法
			<font size="7" style="color:rgb(0,0,0)">滚犊子</font><br>
            <font size="7" style="color:rgb(255,255,255)">滚犊子</font><br>
            <font size="7" style="color:rgb(255,0,0)">滚犊子</font><br>
            <font size="7" style="color:rgb(0,255,0)">滚犊子</font><br>
            <font size="7" style="color:rgb(0,0,255)">滚犊子</font><br>
            <font size="7" style="color:rgb(255,186,90)">滚犊子</font><br>
		
~~~



