### if语句

~~~
格式一？
	if(条件表达式) {
		语句体内容;
	}
	
	执行流程？
		当程序执行到if语句的时候，会先看条件表达式的结果，如果是true，则进入到if中，执行语句体内容，如果是false，则不会进入到if语句中，就不会执行到语句体内容
		
	例子？
		int i = 1;
		int j = 2;
		if(i > j) {
			System.out.println("约吗");
		}
		System.out.println("滚犊子");

	常见的考试题？
		考题一：
			boolean b = false;
			
			if(b == true) {
				System.out.println("在吗");
			}
			
			System.out.println("约吗");
			
		考题二：
			boolean b = true;
			
			if(b = false) {
				System.out.println("在吗");
			}
			
			System.out.println("约吗");
			
		考题三：
			boolean b = false;
			
			if(b)
				System.out.println("约吗");
				System.out.println("滚犊子");
				
			注意：当if语句中的内容只有一条有效语句的时候，花括号可以省略不写

		考题四：
			boolean b = false;
			if(b); {
				System.out.println("约吗");
			}
			System.out.println("滚犊子");

		考题五：
			boolean b = false;
			
			if(b)
				int i = 1;
			
			System.out.println("约吗");

格式二？
	if(条件表达式) {
		语句体内容;
	} else {
		语句体内容;
	}
	
	执行流程？
		当程序执行到ifelse的时候，会先判断条件表达式的结果，如果是true，则进入到if，执行里面的语句体内容，不会进入到else，不会执行里面的语句体内容。如果是false，则不会进入到if，就不会执行到里面的语句体内容，会进入到else，会执行里面的语句体内容。
		
	例子？
		int i = 1;
		int j = 2;
		if(i > j) {
			System.out.println("约吗");
		} else {
			System.out.println("滚犊子");
		}

	注意？
		if语句的第二种格式可以和三元运算符互换使用
			if写起来代码多一些，但是可读性好一些
			三元运算符代码写起来少一些，可读性差一些

格式三？
	if(条件表达式) {
		语句体内容;
	} else if(条件表达式) {
		语句体内容;
	} else if(条件表达式) {
		语句体内容;
	} ...
	else {
		语句体内容;
	}
	
	执行流程？
		当程序执行到ifelse的时候，会先判断if的条件表达式的结果，如果为true，则进入到if执行里面的语句体内容，执行完if语句结束。如果为false，就会继续向下判断elseif中的条件表达式的结果，如果为true，则进入到elseif中执行里面的语句体内容，执行完if语句结束。如果为false，就会继续向下判断elseif中的条件表达式的结果...，如果所有的if或者elseif中的条件表达式的结果都为false，则会进入到else，执行里面的语句体内容。
		
	例子？
		int i = 3;
		if(i > 4) {
			System.out.println("哈哈");
		} else if(i > 3) {
			System.out.println("嘿嘿");
		} else if(i > 2) {
			System.out.println("嘻嘻");
		} else if(i > 1) {
			System.out.println("呵呵");
		} else {
			System.out.println("嘤嘤");
		}

	注意：当if语句格式三中的else里面没有内容的时候，else是可以省略不写的，但是建议写上
		int i = 3;
		if(i > 4) {
			System.out.println("哈哈");
		} else if(i > 3) {
			System.out.println("嘿嘿");
		} else if(i > 2) {
			System.out.println("嘻嘻");
		} else if(i > 1) {
			System.out.println("呵呵");
		} else {
			
		}
		-------------------------------
		int i = 3;
		if(i > 4) {
			System.out.println("哈哈");
		} else if(i > 3) {
			System.out.println("嘿嘿");
		} else if(i > 2) {
			System.out.println("嘻嘻");
		} else if(i > 1) {
			System.out.println("呵呵");
		}
		
	练习题？
		int i;
		int j = 3;
		if(j > 5) {
			i = 1;
		} else if(j > 4) {
			i = 2;
		} else if(j > 3) {
			i = 3;
		} else if(j > 2) {
			i = 4;
		} else if(j > 1) {
			i = 5;
		}
		System.out.println(i);//编译报错
		
		怎么解决？
			1.在每一条路上都给变量i赋值
			2.在定义变量i的时候，给它赋初始值
~~~

### switch语句

~~~
格式？
	switch(表达式) {
		case 取值1:
			语句体内容;
			break;
		case 取值2:
			语句体内容;
			break;
		... ...
		default:
			语句体内容;
			break;
	}

执行流程？
	当程序执行到switch的时候，会拿表达式和case后面取值进行匹配，如果第一个case匹配成功，则进入到第一个case中执行里面语句体内容和bread，switch结束。如果第一个case不匹配，会依次向下找下一个case看一看是否匹配，如果所有的case都不匹配，则会进入到default中执行里面语句体内容和break。
	
例子？
	int i = 2;
	switch(i) {
		case 1:
			System.out.println("哈哈");
			break;
		case 2:
			System.out.println("呵呵");
			break;
		case 3:
			System.out.println("嘿嘿");
			break;
		default:
			System.out.println("嘤嘤");
			break;
	}

注意事项？
	1.switch中的表达式的数据类型可以为以下几种：
		byte,short,int,char,String,枚举
	2.default可以放在任意一行，但是不管放在哪一行，都会优先去找case匹配，只有所有的case都不匹配，最后才会找default
	3.break关键字可以省略不写，但是一旦省略不写就可能会造成switch穿透
		当程序匹配完一次case或者default之后，就不会再进行二次匹配，但是语句体内容该执行还会执行
	4.switch语句的结束标记是遇到break或者结尾}
	5.default可以省略不写，建议写上
	
什么时候用if，什么时候用switch？
	当我们要判断某个区间范围的时候，使用if
	当我们要判断几个数据的时候，可以使用switch
~~~

### 局部代码块

~~~
什么是代码块？
	由一对花括号括起来的，就称为代码块
	{
	
	}

什么是局部代码块？
	写在程序执行的入口(main)的里面的代码块就称为局部代码块
	
	public static void main(String[] args) {
		{
		
		}
	}
	
局部代码块的作用？
	它可以让变量更早的在内存中消失，节省内存空间
~~~

### for循环

~~~
思考一个问题？
	如何在控制台上输出10个1？
		public class Demo01 {
            public static void main(String[] args) {
                System.out.println(1);
                System.out.println(1);
                System.out.println(1);
                System.out.println(1);
                System.out.println(1);
                System.out.println(1);
                System.out.println(1);
                System.out.println(1);
                System.out.println(1);
                System.out.println(1);
            }
        }

格式？
	for(初始化条件; 判断条件; 控制条件) {
		循环体内容;
	}
	
	初始化条件：定义变量，并且赋值
	判断条件：结果是boolean类型的数据，一般都写关系运算符
	控制条件：变量的自增或自减
	循环体内容：重复执行的代码

执行流程？
	初始化条件 -> 判断条件 -> 循环体内容 -> 控制条件
			 -> 判断条件 -> 循环体内容 -> 控制条件
			 -> 判断条件 -> 循环体内容 -> 控制条件
			 -> 直到判断条件不满足的时候，循环结束
			 
练习题？
	题一：在控制台上输出10个1？
		for(int i = 1; i <= 10; i++) {
			System.out.println(1);
		}
		
	题二：在控制天上输出1-10的数字？
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		
	题三：在控制台上打印出1-10的数字和(累加和思想)？
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
		
	题四：在控制台上打印出1-100之间的所有的偶数？
		方式一：
			for(int i = 1; i <= 100; i++) {
                //判断i是偶数
                /*if(i % 2 == 0) {
                    System.out.println(i);
                }*/

                if(i % 2 != 1) {
                    System.out.println(i);
                }
            }
            
		方式二：
			for(int i = 2; i <= 100; i+=2) {
                System.out.println(i);
            }
            
	题五：在控制台上打印出1-10之间的奇数的个数(统计思想)？
		int count = 0;
		for(int i = 1; i <= 10; i++) {
			//判断是奇数
			if(i % 2 == 1) {
				count++;
			}
		}
		System.out.println(count);
~~~

### while循环

~~~
格式？
	初始化条件;
	while(判断条件) {
		循环体内容;
		控制条件;
	}

执行流程？
	初始化条件 -> 判断条件 -> 循环体内容 -> 控制条件
			 -> 判断条件 -> 循环体内容 -> 控制条件
			 -> 判断条件 -> 循环体内容 -> 控制条件
			 -> 直到判断条件不满足的时候，循环结束

练习题？
	题一：在控制台上输出10个1？
		int i = 1;
		while(i <= 10) {
			System.out.println(1);
			i++;
		}
	
	题二：在控制天上输出1-10的数字？
		int i = 1;
		while(i <= 10) {
			System.out.println(i);
			i++;
		}
	
	题三：在控制台上打印出1-10的数字和(累加和思想)？
		int sum = 0;
		int i = 1;
		while(i <= 10) {
			sum = sum + i;
			i++;
		}
		System.out.println(sum);
		
	题四：在控制台上打印出1-100之间的所有的偶数？
		int i = 1;
		while(i <= 100) {
			if(i % 2 == 0) {
				System.out.println(i);
			}
			i++;
		}
		
	题五：在控制台上打印出1-10之间的奇数的个数(统计思想)？
		int count = 0;
		int i = 1;
		while(i <= 10) {
			if(i % 2 == 1) {
				count++;
			}
			i++;
		}
		System.out.println(count);
~~~

### do...while循环

~~~
格式？
	初始化条件;
	do {
		循环体内容;
		控制条件;
	} while(判断条件);

执行流程？
	初始化条件 -> 循环体内容 -> 控制条件 -> 判断条件
			 -> 循环体内容 -> 控制条件 -> 判断条件
			 -> 循环体内容 -> 控制条件 -> 判断条件
			 ... ...
			 -> 循环体内容 -> 控制条件 -> 直到判断条件不满足的时候，循环结束
	
练习题？
	题一：在控制天上输出1-10的数字？
		int i = 1;
		do {
			System.out.println(i);
			i++;
		} while(i <= 10);
~~~

### 三个循环的区别

~~~
while和for？
	1.循环体内容和控制条件可以一次都不执行
	2.判断条件一定比循环体内容和控制条件多执行一次
	
	while和for的区别？
		for循环的初始化条件在循环的外面无法使用
			for(int i = 1; i <= 10; i++) {
				System.out.println(i);
			}
			System.out.println(i);//编译报错
		
		while循环的初始化条件在循环的外面可以继续使用
			int i = 1;
			while(i <= 10) {
				System.out.println(i);
				i++;
			}
			System.out.println(i);
			
		for循环的初始化条件可以在循环的外面用吗？
			int i;
			for(i = 1; i <= 10; i++) {
				System.out.println(i);
			}
			System.out.println(i);
			
	什么时候用for，什么时候用while？
		明确循环次数用for
		不明确循环次数用while

do...while？
	1.循环体内容和控制条件至少会执行一次
	2.判断条件和循环体内容和控制条件执行的次数一样多
~~~

### break和continue

~~~
break关键字？
	break关键字可以用在switch中，也可以用在循环中
	
	用在switch中是结束switch语句
	用在循环中是结束循环的
	
	例子？
		for(int i = 1; i <= 10; i++) {
			if(i == 2) {
				break;//结束循环
			}
			System.out.println(i);
		}

continue关键字？
	continue可以在循环中
	用在循环中是结束本次循环，继续下一次循环
	
	例子？
		for(int i = 1; i <= 10; i++) {
			if(i == 2) {
				continue;//结束本次循环，继续下一次循环
			}
			System.out.println(i);
		}
		
注意事项？
	public class Demo02 {
        public static void main(String[] args) {
            for(int i = 1; i <= 10; i++) {
                if(i == 2) {
                    //break;
                    continue;
                    System.out.println(i);//编译报错，因为永远都执行不到
                }
            }
        }
    }
    
    在同一对花括号内，break和continue关键字的下面不能有任何代码，因为永远在还行不到
~~~

### 死循环

~~~
什么是死循环？
	就是指进入循环之后死里面，永远出不来
	
最简单的死循环？
	for(;;) {}
	*while(true) {}
~~~

