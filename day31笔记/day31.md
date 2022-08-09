### DQL(数据库查询语言)

~~~
单表查询：
	环境搭建：
		create table user (
			id int,
			name varchar(20),
			age int,
			sex varchar(20)
		);
		
		insert into user values(1, 'tom', 18, '男');
		insert into user values(2, 'jerry', 19, '男');
		insert into user values(3, 'rose', 16, '女');
		insert into user values(4, 'jack', 26, '男');
		insert into user values(5, 'tony', 28, '男');
		insert into user values(6, 'mary', 37, '女');
		insert into user values(7, 'lucy', 21, '女');
	
	条件查询？
		简单的条件查询？
		复杂的条件查询？
			1.聚合函数查询
				sum() 求和
				count() 统计个数
				max() 获取最大值
				min() 获取最小值
				avg() 获取平均值
					
				需求：查询user表中所有用户的年龄总和？
					select sum(age) from user;
					
				需求：查询user表中年龄在19-23的之间的年龄总和？
					select sum(age) from user where age between 19 and 23;
					select sum(age) as 年龄总和 from user where age between 19 and 23;
					
				需求：查询user表中的总人数？
					select count(*) from user;
					
				需求：查询user表中年龄在19-23的之间的总人数？
					select count(*) from user where age between 19 and 23;
					
				需求：查询user表中最大的年龄是多少？
					select max(age) from user;
					
				需求：查询user表中最小的年龄是多少？
					select min(age) from user;
					
				需求：查询user表中年龄的平均值是多少？
					select avg(age) from user;
					select avg(ifnull(age, 0)) from user;
					
					select truncate(avg(age), 2) from user;
					select truncate(avg(ifnull(age, 0)), 2) from user;
					
					select sum(age) / count(*) from user;
					select truncate(sum(age)/count(*), 2) from user;
					select truncate(sum(age) / count(ifnull(age, 0)), 2) from user;
					select truncate(sum(age) / count(ifnull(age, 0)), 2) 年龄平均值 from user;
				需求：查询当前系统时间
					select now();
				
			2.排序查询
				order by 排序的字段 升序/降序
				
				升序：asc，默认就是升序
				降序：desc
			
				需求：根据年龄升序查询？
					select * from user order by age asc;
					select * from user order by age;
					
				需求：根据年龄降序查询？
					select * from user order by age desc;
					
				需求：查找年龄为16,21,28,37岁的记录信息(年龄降序排序)？
					select * from user where age in (16, 21, 28, 37) order by age desc;
					
				需求：根据所有用户的记录信息，按照姓名进行字典顺序的查询？
					select * from user order by name asc;
					
				需求：查询所有的用户信息，按照年龄由大到小，如果年龄相同，再按照姓名字典顺序查询？
					select * from user order by age desc, name asc;
					
			3.分组查询
				group by 分组的字段
				
				注意：使用分组查询，查询出来的结果一般都是一个聚合函数带上一个分组的字段
				
				需求：按照性别进行分组，查询出每组的人数？
					select count(*) from user group by sex;
					select sex, count(*) from user group by sex;
					
				需求：按照年龄进行分组，查询出每组的人数？
					select age, count(*) from user group by age;
			
				需求：根据性别进行分组，查询出每组年龄大于21岁的总人数？
					select sex, count(*) from user where age > 21 group by sex;
					
				需求：根据年龄进行分组，要求每组的总人数大于1的总人数给查询出来？
					select age, count(*) from user group by age having count(*) > 1;
					
				having和where的区别？
					1.where只能写在分组前，having只能写在分组后
					2.where是在分组前进行条件判断，having是在分组后进行条件判断
					3.where后面的条件中不能有聚合函数，having后面的条件中可以有聚合函数
			
			4.分页查询
				limit 起始的数，每页显示的条数
				
				需求：查询出第一页的记录信息(每页显示3条)？
					select * from user limit 0, 3;
					
				需求：查询第二页的记录信息(每页显示3条)？
					select * from user limit 3, 3;
					
				需求：查询第三页的记录信息(每页显示3条)？
					select * from user limit 6, 3;
					
				需求：查询出第N页的记录信息(每页显示3条)？
					select * from user limit (N - 1) * 每页显示的条数, 每页显示的条数;
~~~

### 约束

~~~
非空约束？
	not null
	
	加了和不加有什么区别？
		加了非空约束，说明该字段不能为空
		
	创建表的时候添加非空约束？
		create table user (
			name varchar(20) not null,
			age int
		);
		
	删除非空约束？
		alter table user modify name varchar(20);
	
	创建表之后再添加非空约束？
		alter table user modify name varchar(20) not null;

唯一约束？
	unique
	
	加了和不加有什么区别？
		加了唯一约束之之后，说明该字段的数据不能重复

	创建表的时候添加唯一约束？
		create table user (
			name varchar(20) unique,
			age int
		);
		
	删除唯一约束？
		alter table user drop index name;
		
	创建表之后再添加唯一约束？
		alter table user modify name varchar(20) unique;
		
主键约束？
	primary key
	
	加了和不加有什么区别？
		加了主键约束，说明该字段非空且唯一
		
	创建表的时候添加主键约束？
		create table user (
			id int primary key,
			name varchar(20),
			age int
		);
		
	删除主键约束？
		alter table user drop primary key;
		
	创建表之后再添加主键约束？
		alter table user modify id int primary key;

自动增长？
	auto_increment
	
	创建表的时候添加自动增长？
		create table user (
			id int primary key auto_increment,
			name varchar(20)
		);
	
	删除自动增长？
		alter table user modify id int;
	
	创建表之后再添加自动增长？
		alter table user modify id int auto_increment;

外键约束？
	原始写法：constraint 外键的名字 foreign key (本表中的字段名) references 一的一方的表名(主键id);
	简化写法：foreign key (本表中的字段名) references 一的一方的表名(主键id);
	
	加了和不加有什么区别？
		加了外键约束之后，该字段就不可以随意的瞎写了，写的数据只能是一的一方的表中主键id所对应的值

	创建表的时候添加外键约束？
		用户表：
			create table user (
				id int primary key auto_increment,
				name varchar(20)
			);
		
		电脑表：
			create table computer (
				id int primary key auto_increment,
				name varchar(20),
				uid int,
				constraint c_u_key foreign key (uid) references user(id)
			);
	
	删除外键约束？
		alter table computer drop foreign key c_u_key;
	
	创建表之后再添加外键约束？
		alter table computer add constraint c_u_key foreign key (uid) references user(id);
		alter table computer add foreign key (uid) references user(id);
~~~

### 表与表之间的关系

~~~
一对一？
	举例子：
		公民表和身份证表
		
		公民表：
			create table person (
				id int primary key auto_increment,
				name varchar(20)
			);
			
		身份证表：
			create table idcard (
				id int primary key auto_increment,
				idnumber int
			);
			
		设计原则：将两张表合并成一张表
		
		公民表：
			create table person (
				id int primary key auto_increment,
				name varchar(20),
				idnumber int
			);

一对多(多对一)？
	举例子：
		用户表和电脑表

		用户表：
			create table user (
				id int primary key auto_increment,
				name varchar(20)
			);
		
		电脑表：
			create table computer (
				id int primary key auto_increment,
				name varchar(20)
			);
			
		设计原则：在多的一方额外添加一个字段，关联一的一方的主键id
		
		用户表：
			create table user (
				id int primary key auto_increment,
				name varchar(20)
			);
		
		电脑表：
			create table computer (
				id int primary key auto_increment,
				name varchar(20),
				uid int,
				constraint c_u_key foreign key (uid) references user(id)
			);
		
多对多？
	举例子：
		学生表和老师表
		
		学生表：
			create table student (
				id int primary key auto_increment,
				name varchar(20)
			);
		
		老师表：
			create table teacher (
				id int primary key auto_increment,
				name varchar(20)
			);
			
		设计原则：额外增加一张新的表，作为第三方关联表
		
		学生表：
			create table student (
				id int primary key auto_increment,
				name varchar(20)
			);
		
		老师表：
			create table teacher (
				id int primary key auto_increment,
				name varchar(20)
			);
		
		关联表：
			create table s_t (
				sid int,
				tid int,
				primary key(sid, tid),
				foreign key (sid) references student(id),
				foreign key (tid) references teacher(id)
			);
			
练习题？
	已知有三张表，用户表，分类，商品表，根据实际情况分析它们之间的关系，将表创建完整？
~~~

