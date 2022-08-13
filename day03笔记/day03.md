### 数据类型的转换

~~~
数据类型转换的分类？
	隐式类型转换
	强制类型转换
	
隐式类型转换？
	什么是隐式类型转换？
		是指小的数据类型会自动提升为大的数据类型
		
	举例子？
		byte b = 1;
		short s = 2;
		int i = 3;
		long l = 4;
		float f = 5.5F;
		double d = 6.6;
		double sum = b + s + i + l + f + d;
		System.out.println(sum);
		
		当多个数据类型的变量参与运算的时候，小的数据类型会自动提升为大的数据类型

强制类型转换？
	什么是强制类型转换？
		是指大的数据类型会强制转换为小的数据类型
		
	强制类型转换的格式？
		小的数据类型 小的数据类型变量名 = (小的数据类型)大的数据类型变量名
		
	举例子？
		int a = 12;
		//byte b = a; 编译报错
		byte b = (byte)a;
		
	注意事项？
		我们能不使用强制类型转换，尽量不要使用，要不然结果会让你大惊一吃
		
		int a = 130;
		byte b = (byte)a;
		System.out.println(b);//-126
		规律：
		当a为整数：
		(a-127-1)+(-128)
		当a为负数：
		(a-(-128)+1)+127
		简要记忆：如果是正数则比较其到127的距离-1得到的值加-128；
				如果是正数则比较其到-128的距离-1得到的值加127；
		byte取值范围-128到127
		
常见的考试题？
	考题一：
		byte b1 = 1;
		byte b2 = 2;
		byte b3 = b1 + b2;
		System.out.println(b3);//编译报错
		
		
	考题二：
		byte b1 = 1;
		byte b2 = b1 + 2;
		System.out.println(b2);//编译报错
		
	注意：针对byte类型和short类型，只要右边有一个是变量就会编译报错
	
	考题三：
		byte b = 126 + 1;
		System.out.println(b);//编译正确
		
	考题四：
		byte b = 127 + 1;
		System.out.println(b);//编译报错，超出取值范围
		
注意：boolean类型不能和其他的数据类型相互转换
~~~

### ASCII码表

~~~
'a' -> 97
'A' -> 65
'0' -> 48
~~~

### 运算符

~~~
算术运算符？
	+：
		在Java中+号有三层含义？
			1.正负的正
			2.加减乘除的加号
			3.连接符
				+号什么时候作为连接符？
					任何数据类型的数据和字符串相加，此时+号就作为连接符来使用
					并且一定是一个字符串
					
				例子？
					String s = "约吗";
					int i = 12;
					String a = s + i;
					System.out.println(a);//"约吗12"
					
				练习题？
					字符串的拼接：String s = 5 + 5 + "5 + 5" + 5 + 5;
					"105 + 555"
	-
	*
	/：
		在Java中，整数除以整数，结果也一定是整数
		
		System.out.println(5/2);
		System.out.println(2/5);
		
	%(模，取余)：
		int i = 5;
		int j = 2;
		System.out.println(i % j);//1
		
		int i = 4;
		int j = 2;
		System.out.println(i % j);//0
		
	++：
		单独使用？
			int i = 1;
			//i++;//i = i + 1;
			++i;//i = i + 1;
			System.out.println(i);
			
			

			注意：++在单独使用的时候，不管是在前面还是在后面，结果都没有任何影响
		
		参与运算使用？
			++在前？
				int i = 1;
				int j = ++i;
				System.out.println(j);//2
				System.out.println(i);//2
				
				注意：++在前的话，i先自身+1,之后再参与运算
			
			++在后？
				int i = 1;
				int j = i++;
				System.out.println(j);//1
				System.out.println(i);//2
				
				int i = 1;
                i=i++;
                System.out.println(i);//1
                System.out.println(i+1);//2
				注意：++在后的话，i先参与运算，然后再自身+1
	
	--：
		单独使用？
			int i = 2;
			//i--;// i = i - 1;
			--i;//i = i - 1;
			System.out.println();//1
			
			注意：--在单独使用的时候，不管是在前面还是在后面，结果都没有任何影响
		
		参与运算使用？
			--在前？
				int i = 2;
				int j = --i;
				System.out.println(j);//1
				System.out.println(i);//1
				
				注意：--在前的话，i先自身-1,之后再参与运算
			
			--在后？
				int i = 2;
				int j = i--;
				System.out.println(j);//2
				System.out.println(i);//1
				
				注意：--在后的话，i先参与运算，然后再自身-1
				
		练习题？
			题一：
				int i = 10;
				int j = i++ + --i + ++i + i--;
				System.out.println(j);//42
				
			题二：
				byte b = 2;
				b++; //b = (byte)(b + 1)
				System.out.println(b);//3
				
				自带强制类型转换
				
				----------------------------
				
				byte b = 2;
				b = b + 1;
				System.out.println(b);//报错

赋值运算符？
	=
	+=：
		int i = 1;
		i += 2;//i = i + 2
		System.out.println(i);
		
		自带强制类型转换
		
	-=
	*=
	/=
	%=
	
关系运算符？
	关系运算符得到的结果一定是boolean类型的数据
	
	>
	<
	>=
	<=
	!=
	==
	
	注意：==和=的区别？
			==是比较，比较两边的数据是否相同
			=是赋值，将右边的数据赋值给左边的变量

逻辑运算符？
	注意：逻辑运算符的两边必须是boolean类型的数据，而且得到的结果也一定是boolean类型的数据

	&(单与)：
		System.out.println(true & true);//true
		System.out.println(true & false);//false
		System.out.println(false & true);//false
		System.out.println(false & false);//false
		
		结论：两边只要有一个为false，结果就为false
	
	|(单或)：
		System.out.println(true | true);//true
		System.out.println(true | false);//true
		System.out.println(false | true);//true
		System.out.println(false | false);//false
		
		结论：两边只要有一个为true，结果就为true
	
	^(异或)：
		System.out.println(true ^ true);//false
		System.out.println(true ^ false);//true
		System.out.println(false ^ true);//true
		System.out.println(false ^ false);//false
		
		结论：两边一样结果为false，两边不一样结果为true
	
	!(非)：
		System.out.println(true);//true
		System.out.println(!true);//false
		System.out.println(!!true);//true
		System.out.println(!!!true);//false
	
	&&(双与)：
		System.out.println(true && true);//true
		System.out.println(true && false);//false
		System.out.println(false && true);//false
		System.out.println(false && false);//false
		
		结论：两边只要有一个为false，结果就为false
	
	||(双或)：
		System.out.println(true || true);//true
		System.out.println(true || false);//true
		System.out.println(false || true);//true
		System.out.println(false || false);//false
		
		结论：两边只要有一个为true，结果就为true
		
	常见的考试题？
		&&和&的区别？ ||和|的区别？
			&：左边如果为false，右边依然要去执行判断结果，但是最终的结果一定是false
			&&：左边如果为false，右边就不再判断不再执行，最终结果一定是false
			
			|：左边如果为true，右边依然要去执行判断结果，但是最终的结果一定是true
			||：左边如果为true，右边就不再判断不再执行，最终结果一定是true
			
			推荐使用&&，||，因为效率高
			
位运算符？
	注意：位运算符的两边必须是数字，而且得到的结果也一定是数字
	
	&(与位运算)：
		System.out.println(3&2);//2
	
	|(或位运算)：
		System.out.println(3|2);//3
		
	^(异或位运算)：
		System.out.println(3 ^ 2);//1
		
		练习题？
			已知int a = 1， int b = 2，要求自己实现代码，将两个变量的值互换？
				方式一：第三方临时变量
					int a = 1;
                    int b = 2;

                    System.out.println(a + "..." + b);

                    //第三个临时变量
                    int temp = a;
                    a = b;
                    b = temp;

                    System.out.println(a + "..." + b);
                    
				方式二：异或位运算
					int a = 1;
                    int b = 2;

                    System.out.println(a + "..." + b);

                    //异或位运算方式
                    a = a ^ b;
                    b = a ^ b;
                    a = a ^ b;

                    System.out.println(a + "..." + b);
		
	~(按位取反)：符号位也取反
		System.out.println(~3);//-4
		
	<<(左移)：
		System.out.println(3 << 2);//12
		
		公式： A << N = A * 2^N
	
	>>(右移)：
		System.out.println(3 >> 2);//0
		
		公式：A >> N = A / 2^N
	
	>>>(无符号右移)：
		System.out.println(3 >>> 2);//0
		
		无符号右移和右移的区别？
			右移：如果是正数，补0，如果是负数，就补1
			无符号右移：不管是正数还是负数，都补0
			
	练习题？
		如何实现用最快速的方式将4变成2？
			4/2 = 2
			4 >> 1 = 2 效率最高，因为位运算直接操作的就是二进制

三元运算符(三目运算符)？
	格式？
		条件表达式 ? 表达式1 : 表达式2;
		 boolean
	
	执行流程？
		当程序执行到三元运算符的时候，会先执行条件表达式，看条件表达式的结果是什么，如果是true，则执行表达式1，不会执行表达式2。如果是false，则执行表达式2，不会执行表达式1。
		
	例子？
		int a = 1 > 2 ? 1 : 2;
		System.out.println(a);

	注意事项？
		1.三元运算符的表达式1和表达式2不能是输出语句
			数据类型 a = 1 > 2 ? System.out.println(1):System.out.println(2);
			
		2.三元运算符既然是一个运算符，就一定会得到一个结果，我们要么将该结果赋值给一个变量，要么直接将该结果输出到控制台
		3.三元运算符的表达式1和表达式2的数据的数据类型要一致，如果不一致的话只能放在输出语句中打印到控制台
		4.三元运算符的表达式1和表达式2的数据的数据类型要和接收的变量的数据类型匹配
			int i = 1 > 2 = 1 : 2;
			double i = 1 > 2 ? 1.0 : 2.0;
			boolean i = 1 > 2 ? true : false;
			char i = 1 > 2 ? 'a' : 'b';
			double i = 1 > 2 ? 1 : 2;
			int i = 1 > 2 ? 'a' : 'b';
~~~

### 键盘录入

~~~
实现步骤？
	1.导包
		import java.util.Scanner;
		
		注意：导包要写在package和class之间
		
	2.创建对象
		Scanner sc = new Scanner(System.in);
	
	3.调用方法
		int num = sc.nextInt();//录入数字
		String str = sc.next();//录入字符串
~~~

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

格式二？
格式三？

~~~

