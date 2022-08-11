### JavaScript

~~~
什么是JavaScript？
	简称JS，它是一门脚本语言，也是一门面向对象的编程语言
	
	脚本语言：它里面的代码可以直接解析执行了，不像Java语言先编译后运行

	JavaScript = ECMAScript(js的基础语法) + BOM(浏览器对象模型，js特有的) + DOM(文档对象模型)

JavaScript的作用？
	可以让页面动起来
	
JavaScript的引入方式？
	方式一：在head标签中写script标签，在script标签中写js原生代码
		<head>
			<script>
                alert("约吗");
            </script>
		</head>
	
	方式二：在head标签中写script标签，在script标签中引入外来的js文件，在js文件中写js原生代码
		<head>
			<script src="../js/aaa.js"></script>
		</head>

	注意：
		1.script标签可以写在任意位置
		2.script标签可以写多个，就算写多个，也是有执行先后顺序的
		3.不推荐方式一和方式二结合写
	
ECMAScript(js的基础语法)？
	数据类型，常量，变量，运算符，流程控制语句，数组，方法，对象...
	
	1.注释
		Java中的注释：
			单行注释：//内容
			多行注释：/*内容*/
			文档注释：/**内容*/
		
		Js中的注释：
			单行注释：//内容
			多行注释：/*内容*/
			文档注释：/**内容*/
			
	2.常量
		Java中常量：
			字面值常量
				整数常量
				小数常量
				字符常量
				字符串常量
				布尔常量
				空常量
				
			自定义常量
				被final修饰的变量
		
		Js中常量：
			字面值常量
			自定义常量：
				const 变量名 = 数据;

	3.数据类型
		Java中数据类型：
			基本数据类型：
				整型：byte,short,int,long
				浮点型：float,double
				字符型：char
				布尔型：boolean
			引用数据类型：
				Java中自带的
				自定义的
				
		Js中数据类型：
			原始数据类型(相当于java中的基本数据类型)：
				Undefined：Undefined 类型只有一个值，即 undefined。
						   当声明的变量未初始化时，该变量的默认值是 undefined
				Null：它只有一个专用值 null，即它的字面量
				Boolean：它有两个值 true 和 false
				Number：这种类型既可以表示整数，还可以表示小数，NaN(表示非数（Not a Number）)
				String：字符串，"aaa","aa","a"... ...
				
			引用数据类型：
				String, Number, Date, .......
				自定义
				
	4.变量
		Java中变量：
			强类型
			格式：数据类型 变量名 = 数据;
		
			例子：
				int a = 12;
				System.out.println(a);//12
				a = 13;
				System.out.println(a);/13
				
			说明：当我们定义一个变量int a = 12，运行程序会在内存中开辟一块内存空间，该空间的名字叫做a，该空间中存储数据的数据类型是int，该空间中存储的数据是12
		
		Js中变量：
			弱类型
			方式一：
				var 变量名 = 数据;
				
				例子：
					var a = 12;
                    alert(a);

                    a = 13;
                    alert(a);
				
			方式二：
				let 变量名 = 数据;
					
				例子：
					let a = 12;
                    alert(a);

                    a = 13;
                    alert(a);
                    
         	说明：当我们定义一个变量var a = 12，执行程序会在内存中开辟一块内存空间，该空间的名字叫做a，没有给该空间指定数据类型，该空间中存储的是12
         	
         注意：
         	1.测试变量
         		方式一：alert(变量名);
         		方式二：document.write(变量名);
         		方式三：console.log(变量名);
         		
         	2.测试变量的数据类型
         		方式一：alert(tyoeof 变量名);
         		方式二：alert(tyoeof(变量名));
         		
         		
 	5.运算符
 		a.算术运算符
 			+,-,*,/,%,++.....
 			
 			/(除号)：
 				Java中除号：
 					int i = 3;
 					int j = 2;
 					System.out.println(i / j);//1
 				
 				Js中除号：
 					var i = 3;
					var j = 2;
					alert(i / j);
			
			+(加号)：
				Java中加号：
					1.加减的加
					2.正负的正
					3.连接符
				
				Js中加号：
					1.加减的加
					2.正负的正
					3.连接符
					4.转换符
						a.String -> Number
							1.数字格式的字符串
								var i = "123";
                                var j = 1;
                                //var a = i + j;//作为连接符
                                //var a = j + i;//作为连接符
                                var a = +i + j;//+作为转换符
                                alert(a);
                                
							2.非数字格式的字符串
								var i = "abc";
                                var j = 1;
                                //var a = i + j;
                                //var a = j + i;
                                var a = +i + j;
                                alert(a);//NaN
                                
                         b.boolean -> Number
                         	var i = true;
                            //var i = false;
                            var j = 1;
                            //var a = i + j;
                            var a = +i + j;
                            alert(a);
                            
                            true -> 1
                            false -> 0
			
			++：
				var i = 10;
				var a = ++i + i++ + i-- + --i;
				alert(a);
 		
 		b.赋值运算符
 			=,+=,-=,/=.....
 			和java中是一样的
 		
 		c.比较运算符
 			>, <, >=, <=, !=, ==, ===
 			
 			>,<：
 				Java中的大于小于：
 					String s1 = "aaa";
 					String s2 = "bbb";
 					System.out.println(s1 > s2);//编译报错
 				
 				Js中的大于小于：
 					var s1 = "aaa";
 					var s2 = "bbb";
 					alert(s1 > s2);//根据字典顺序来比较
 					
 			==：
 				Java中==：
 					int a = 12;
 					int b = 12;
 					System.out.println(a == b);//true
 					
 					int a = 12;
 					String b = "12";
 					System.out.println(a == b);//编译报错
 					
 				Js中==：
 					var a = 12;
 					var b = 12;
 					alert(a == b);
 					
 					var a = 12;
 					var b = "12";
 					alert(a == b);
 					
 			===：
            	var a = 12;
            	var b = 12;
            	alert(a === b);

                var a = 12;
                var b = "12";
                alert(a === b);
                
                ===必须两边的数据类型和数据值都一样才为true
 		
 		d.逻辑运算符
 			&&,||,!...
 			和Java是一样的
 		
 		e.三元运算符
 			格式：条件表达式 ? 表达式1 : 表达式2;
 			
 			Java中的三元：
 				int max = 1 > 2 ? 1 : 2;
 				System.out.println(max);//正确的
 				
 				1 > 2 ? 1 : 2;//错误的
 				
 				System.out.println(1 > 2 ? 1 : 2);//正确的
 				
 				1 > 2 ? System.out.println(1):System.out.println(2);//错误的
 			
 			Js中三元：
 				var max = 1 > 2 ? 1 : 2;
 				alert(max);
 				
 				1 > 2 ? 1 : 2;//正确的
 				
 				1 > 2 ? alert(1) : alert(2);
 				
 	6.流程控制语句
    	ifelse, switch, for, while...
    	和Java是一样的
    	
    	ifelse：
    		Java中iselse：
    			if(条件表达式) {
    				
    			} else {
    				
    			}
    			
    			java中if中的条件表达式一定是boolean类型
    		
			Js中iselse：
				if(条件表达式) {
    				
    			} else {
    				
    			}
 		
         		条件表达式可以为任意类型
         		只有几种情况，才为false，其余的全部为true
         			false
         			0
         			""
         			null
         			undefined
         			NaN
         			
        switch：
        	Java中switch：
        		switch(表达式) {
        			case 取值:
        				xxxooo;
        				break;
        			case 取值:
        				xxxooo;
        				break;
        			... ...
        			default:
        				xxxooo;
        				break;
        		}
        		
        		表达式的数据类型可以为：byte,short,int,String,char,枚举
        	
        	Js中switch：
        		switch(表达式) {
        			case 取值:
        				xxxooo;
        				break;
        			case 取值:
        				xxxooo;
        				break;
        			... ...
        			default:
        				xxxooo;
        				break;
        		}
        		
        		表达式可以为任意类型的数据
        		
 	8.方法(函数)
 		Java中方法：
 			格式：
                修饰符 返回值类型 方法名字(参数列表) {
                    xxxooo;
                    return 返回值;
                }
                
          	举例子：
          		public int aaa(int i, int j) {
          			int sum = i + i;
          			return sum;
          		}
 		
 		Js中方法：
 			格式一：
 				function 方法名(参数列表) {
 					xxxooo;
 					return 返回值;
 				}
 				
 				function aaa() {
 				
 				}
 				
 			格式二：
 				var 变量名 = function(参数列表) {
 					xxxooo;
 					return 返回值;
 				}
 				
 				var a = function() {
 					
 				}
 				
 		注意：在js中方法有三层含义，作为方法的使用，作为对象的使用，作为构造方法的使用
 			
 		*a.作为方法的使用
 			1.定义一个无参数无返回值的方法
 				function aaa() {
                    alert("约吗");
                }
                
                aaa();
            
         	2.定义一个无参有返回值的方法
         		function aaa() {
                    alert("在吗");
                    return "约吗";
                }
                
                var a = aaa();
				alert(a);
				
			3.定义一个有参无返回值的方法
				function aaa(i) {
                    alert(i);
                }
                
                aaa(12);
 		
 				-------------------------------
 				
 				function aaa(i) {
                    alert(i);
                }
 		
 				aaa(11, 12, 13, 14, 15);
 				
 				-------------------------------
 				
 				function aaa(i) {
                    alert(i);
                }

                aaa();
                
                -------------------------------
                
                function aaa() {
                    alert("约吗");
                }

                aaa(1,2,4,5,6);
                
                注意：js中的方法中自带一个叫做arguments的数组容器，传递进来的参数都存储到了数组容器中
                
        	4.定义一个有参有返回值方法
        		function aaa(i,j) {
                    return i+j;
                }

                var sum = aaa(1,2);
                alert(sum);
                
 		b.作为对象的使用
 			//方法作为对象的使用
			function person() {
				//arguments
				//name
			}
			
			//给person对象动态绑定name属性
			person.uname = "tom";
			//给person对象动态绑定age属性
			person.age = 18;
			
			//给person对象动态绑定setter和getter
			person.setUname = function(uname) {
				this.uname = uname;
			}
			
			person.setAge = function(age) {
				this.age = age;
			}
			
			person.getUname = function() {
				return this.uname;
			}
			
			person.getAge = function() {
				return this.age;
			}
			
			alert(person.uname + "..." + person.age);
			
			person.setUname("jerry");
			person.setAge(19);
			
			alert(person.getUname() + "..." + person.getAge());
 		
 		c.作为构造方法的使用
 			//方法作为构造方法使用
			function Person() {
				
			}
			
			Person.prototype.name = "tom";
			Person.prototype.age = 18;
			
			//创建对象
			var person = new Person();
			alert(person.name + "..." + person.age);
 		
~~~

