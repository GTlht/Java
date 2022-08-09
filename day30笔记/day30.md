### 数据库

~~~
思考一个问题？
	在我们开发中，经常要使用一个写数据，数据一多久不方便管理和操作，为了方便对数据进行管理和操作，我们学习了容器(数组，集合)。
	但是呢容器也是有弊端的，就是不能够对数据进行永久性的存储，程序开启数据存储到了容器中，程序停止，容器从内存中消失，数据丢失了。在开发中，就会有需要对数据永久性存储的这样的需求，比如注册登录功能，这些功能使用容器是无法实现的。所以呢，我们学习了IO流技术，因为IO流技术可是帮助我们实现数据的永久性存储，因为数据存储到了本地磁盘的文件中。
	但是呢IO流技术也是有弊端的，比如说我们想要修改文件中的某个用户的信息的时候，就特别的麻烦，代码量不少，效率低，所以我们要学习数据库技术，使用它操作文件中的数据是非常的方便。

什么是数据库？
	可以存储数据的仓库
	数据库其实就一个软件，叫做数据库管理系统
	
常见的数据库有哪些？
	关系型数据库？
		Oracle：甲骨文，收费
		*MySql：Oracle公司(甲骨文)，免费的
		DB2：IBM公司，收费
		SQL Server：微软公司，收费
		... ...
	
	非关系型数据库？
		Redise
		MongDB
		HBase
		Neo4J
		... ...
		
MySql数据库服务的开启和关闭？
	如何查找服务？
		1.在搜索框里输入服务即可
		2.在运行窗口中输入services.msc
	
	开启mysql服务：
		1.在服务窗口中找到mysql服务，鼠标右键选择启动
		2.在管理员身份下的dos窗口中输入指令：net start mysql
	
	关闭mysql服务：
		1.在服务窗口中找到mysql服务，鼠标右键选择停止
		2..在管理员身份下的dos窗口中输入指令：net stop mysql

MySql数据库的登录和退出？
	登录：mysql -uroot -p密码
	退出：exit
	
了解数据库的几个概念？
	数据库管理系统：就是指软件，比如说MySql数据库，Oracle数据库等
	数据库：是指安装完这个系统软件之后生成的一个专门存储表的文件夹
	表：就是指存储数据的文件
~~~

### SQL

~~~
什么是SQL？
	结构化查询语言（Structured Query Language）

	SQL的工业标准：一套规范，也就说按照这套规范所做出来的sql语句，是可以操作任何数据库的，是通用的
	SQL的方言：是每一个数据库厂商自己做出来的一套sql语句，只能操作自己厂商研发出来的数据库，不是通用

	普通话和方言

SQL语句的分类？
	DDL：数据定义语言（data definition language），这个分类中的sql语句主要是用来操作数据库和表的结构的
	DML：数据操作语言（Data Manipulation Language），这个分类中的sql语句主要是用来操作数据库中的表中的数据的增删改的
	DQL：数据查询语言（data query language），这个分类中的sql语句主要是用来操作数据库中的表中的数据的查询的
	DCL：数据控制语言（Data Control Language），这个分类中的sql语句主要是用来操作用户的访问权限，用户名和密码，等级等
~~~

### DDL(数据库定义语言)

~~~
操作数据库结构？
	需求：查看有哪些数据库？
		show databases;
	
	需求：创建一个新的数据库？
		create database 数据库的名字;
		
		create database db3;
		
	需求：删除一个数据库？
		drop database 数据库的名字;
		
		drop database db3;
		
	需求：查看数据库的创建细节？(用什么sql语句创建的该数据库)
		show create database 数据库的名字;
		
		show create database db3;
		
	需求：指定使用具体的哪一个数据库？
		use 数据库的名字;
		
		use db3;
	
操作表结构？
	需求：查看数据库有哪些表？
		show tables;
	
	需求：创建一张表？
		create table 表的名字 (
			字段名 数据类型,
			字段名 数据类型,
			......
			字段名 数据类型
		);
		
		create table user (
			name varchar(20),
			age int
		);
		
		常见的数据类型？
			int
			decimal(5,2)
			varchar(20)
			date：精确到年月日
			datetime：精确到年月日时分秒
			timestamp：精确到年月日时分秒
		
	需求：查看表的创建细节(用什么sql语句创建的该表)？
		show create table 表名;
		
		show create table user;
		
	需求：查看表结构？
		desc 表名;
		
		desc user;
		
	需求：删除一张表？
		drop table 表名;
		
		drop table user;
		
	需求：额外添加一个新的字段？
		alter table 表名 add 字段名 数据类型;
		
		alter table user add sex varchar(20);
		
	需求：修改指定字段的数据类型？
		alter table 表名 modify 字段名 新的数据类型;
		
		alter table user modify age varchar(20);
		
	需求：修改指定字段的名字？
		alter table 表名 change 旧的字段名 新的字段名 数据类型;
		
		alter table user change sex gender varchar(20);

	需求：删除指定字段？
		alter table 表名 drop 字段名;
		
		alter table user drop sex;
		
	需求：修改表名？
		alter table 旧的表名 rename 新的表名;
		alter table user rename person;
		
		rename table 旧的表名 to 新的表名;
		rename table person to user;
~~~

### DML(数据库操作语言)

~~~
表中数据的添加：
	需求：向表中添加一条新的记录？
		insert into 表名 (字段名, 字段名, ...) values (字段值, 字段值, ...);
		insert into user (name, age) values ('tom', 18);
		insert into user (name) values ('jerry');
		insert into user (age) values (19);
		注意：可以给指定的某些字段赋值
		
		insert into 表名 values (字段值, 字段值, ...);
		insert into user values ('rose', 17);
		注意：必须给所有的字段赋值
		
	需求：向表中添加多条新的记录？
		insert into 表名  (字段名, 字段名, ...) values(字段值, 字段值, ...)，(字段值, 字段值, ...)，...;
		insert into user (name, age) values ('tom', 18), ('jerry', 19), ('rose', 17);
		
		insert into 表名 values (字段值, 字段值, ...),(字段值, 字段值, ...),...;
		insert into user values ('tom', 18), ('jerry', 19);

	注意：解决dos窗口中文问题：set names gbk
	
表中数据的修改：
	需求：将表中的所有记录的某个字段的值进行修改？
		update 表名 set 字段名 = 字段值;
		update user set age = 20;
		update user set name = 'jack';
		
	需求：将表中的所有的记录的多个字段的值进行修改？
		update 表名 set 字段名 = 字段值, 字段名 = 字段值, ...;
		update user set name = 'tony', age = 21;
		
	需求：将表中的某条记录的某个字段的值进行修改？
		update 表名 set 字段名 = 字段值 where 字段名 = 字段值;
		update user set name = 'jerry' where age = 18;
		update user set age = 19 where name = 'jerry';

表中数据的删除：
	需求：删除所有的记录信息？
		delete from 表名;
		delete from user;
		
		truncate 表名;(DDL)
		truncate user;
		
		这两种方式的区别？
			第一种方式是逐行扫描逐行删除
			第二种方式是先把整张表给删除，再重新建一张新的表		

	需求：删除某条记录？
		delete from 表名 where 字段名 = 字段值;
		delete from user where age = 19;
		delete from user where name = 'tom';

~~~

