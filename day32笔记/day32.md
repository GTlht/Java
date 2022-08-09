### DQL(数据库查询语言)

~~~
单表查询？
	简单查询
	条件查询
		简单的条件查询
		复杂的条件查询
多表查询？
	环境搭建？
		create table a (
			id int,
			name varchar(20)
		);
		
		insert into a values(1, 'tom');
		insert into a values(2, 'jerry');
		insert into a values(3, 'rose');
		
		create table b (
			id int,
			name varchar(20)
		);
		
		insert into b values(1,'张三');
		insert into b values(2,'李四');
		insert into b values(4,'王五');
		
	笛卡尔积查询？
		注意：笛卡尔积查询是所有多表查询中最基础的查询，其他的多表查询都是建立在笛卡尔查询基础之上的
		
		select * from a, b;
	
	内连接查询？
		隐式内连接查询？
			需求：查询a表和b表中所有的记录信息，要求a表中的id值要和b表中的id值相同？
				select * from a, b where a.id = b.id;
	
		显示内连接查询？
			需求：查询a表和b表中所有的记录信息，要求a表中的id值要和b表中的id值相同？
				select * from a inner join b on a.id = b.id;
		
	外连接查询？
		左外连接查询？
			需求：查询a表和b表中id值相同的记录信息(包含a表中的所有的记录信息)？
				select * from a left join b on a.id = b.id;
		
		右外连接查询？
			需求：查询a表和b表中id值相同的记录信息(包含b表中的所有的记录信息)？
				select * from a right join b on a.id = b.id;
				
	子查询
		3种情况
		嵌套查询，sql语句里面还有sql语句
		
		情况一：里面的sql语句查询出来的是一个数据
			需求：查询a表中id值等于b表中姓名为张三的id值的记录信息？
				select * from a where id = (select id from b where name = '张三');
			
		情况二：里面的sql语句查询出来的是多个数据
			需求：查询a表中id值等于b表中姓名为张三,王五的id值的记录信息？
				select * from a where id in (select id from b where name in ('张三','王五'));
				
		情况三：里面的sql语句查询出来的是一张表
			需求：根据id降序排列查询a表中的所有的记录信息？(子查询)
				select * from a order by id desc;
				
				select * from (select * from a order by id desc) newA;

~~~

### 事务

~~~
什么是事务？
	事务，一般是指要做的或所做的事情
	我们要做的事情
	
	事务主要处理我们做的事情的，事情分大事情和小事情，事务主要是处理大事情的
	什么算大事，什么算小事？
	比如说：
		需求：向表中添加一条记录？
			insert into user values(1,'tom',18);
			一条sql语句就可以完成这个事情
		
		需求：将表中的某条记录的数据进行修改？
			update user set name = 'jerry' where id = 1;
			一条sql语句就可以完成这个事情
			
		需求：删除表中某条记录信息？
			delete from user where id = 1;
			一条sql语句就可以完成这个事情
			
		需求：查询表中的记录信息？
			select * from user;
			一条sql语句就可以完成这个事情
			
		以上都是小事情。
		
		环境搭建：
			create table user (
				name varchar(20),
				money int
			);
			
			insert into user values('tom', 1000);
			insert into user values('jerry', 1000);
		
		需求：实现tom给jerry转账100元钱？
			update user set money = 900 where name = 'tom';
			update user set money = 1100 where name = 'jerry';
			二条sql语句才可以完成这个事情

事务的处理？
	方式一：
		start transaction; 开启事务
		commit; 提交事务
		rollback; 回滚事务
		
		常见的组合？
			1.
				start transaction;
				要做的事情
				commit;
				
			2.
				start transaction;
				要做的事情
				rollback;
	
	方式二：
		查看事务的提交方式是默认提交还是手动提交？
			select @@autocommit;
				1：代表自动提交事务
				0：代表手动提交
				
		修改事务的默认提交方式？
			set @@autocommit = 0;

事务的四大特性？
	原子性：原子是参与化学反应的最小的粒子，不可以再分割，也就是说一个事务是不可以被分割
	持久性：通过事务处理之后数据依然是永久存储的
	一致性：事务处理的前后数据是一致的
	隔离性：事务与事务之间是没有任何关系的，互相不干涉的，互相不影响
		但是如果两个事务处理的是同一个事情的话，说白了就是操作的是同一张表的话，那就会打破隔离性
		一旦打破了隔离性，就会引发一些问题：
			脏读：事务A 读到了 事务B 还未提交的数据
			不可重复读：事务A 读到了 事务B 已经提交后的修改(update)的数据
			虚读(幻读)：事务A 读到了 事务B 已经提交后的更新(insert)的数据
		
        出现了问题怎么解决？
        	设置事务的隔离级别

事务的隔离级别？
	read uncommitted：如果设置了这个隔离级别，上面的三个问题都解决不了
	read committed：如果设置了这个隔离级别，能够解决脏读，但是不能解决不可重复读和虚读
	repeatable read：如果设置了这个隔离级别，能够解决脏读，不可重复读，不能解决虚读
	serializable：如果设置了这个隔离级别，都能够解决
	
	mysql数据库的默认隔离级别：repeatable read
	oracle数据库的默认隔离级别：read committed
	
	查看当前的隔离级别？
		select @@tx_isolation;
		
	设置当前的隔离级别？
		set global transaction isolation level 隔离级别;
~~~

