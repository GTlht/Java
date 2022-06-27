### 二维数组

~~~
什么是二维数组？
	是指元素为一维数组的数组就称为二维数组
	
二维数组的定义格式？
	格式一：数据类型[][] 数组的名字 = new 数据类型[一维数组的个数][一维数组中元素的个数];
			int[][]    arr     =  new    int[3][2];
			
			3：代表这个二维数组中存储了3个一维数组
			2：代表每一个一维数组中存储2个元素
	
	格式二：数据类型[][] 数组的名字 = new 数据类型[一维数组的个数][];
			int[][]     arr    =  new   int[2][];
			
			2：这个二维数组中可以存储2个一维数组
			每个一维数组中可以存储几个元素？
				未知
	
	格式三：数据类型[][] 数组的名字 = {{元素1,元素2,...}, {元素1, 元素2, ....}, ......};
			 int[][]     arr    =  {{1,2}, {3,4,5}, {1,2,3,4,5}};
			 
二维数组的基本使用？
	1.创建容器
		int[][] arr = new int[2][];
	
	2.存储数据
		int[] arr_1 = new int[3];
		arr_1[0] = 1;
		arr_1[1] = 2;
		arr_1[2] = 3;
		arr[0] = arr_1;
		
		int[] arr_2 = new int[2];
		arr_2[0] = 4;
		arr_2[1] = 5;
		arr[1] = arr_2;
	
	3.获取数据
		System.out.println(arr[0]);
		System.out.println(arr[0][0]);
		System.out.println(arr[0][1]);
		System.out.println(arr[0][2]);
		System.out.println(arr[1]);
		System.out.println(arr[1][0]);
		System.out.println(arr[1][1]);
	
二维数组的遍历？
	//创建容器
    int[][] arr = {{1,2},{3,4,5},{6,7,8,9}};

    //遍历
    for(int i = 0; i < arr.length; i++) {
        //arr[i]->一维数组
        for(int j = 0; j < arr[i].length; j++) {
        	System.out.print(arr[i][j] + " ");
        }
        System.out.println();
    }
~~~

### 方法(函数)

~~~
什么是方法？
	具有(特定功能)的一段独立的小程序(代码块)就称为方法
	
方法的作用？
	1.提高了代码的复用性
	2.提高了代码的维护性

方法的定义格式？
	修饰符 返回值类型 方法的名字(数据类型 变量名, ......) {
		方法的功能的代码;
		return 返回值;
	}
	
怎么写一个方法？
	两个明确？
		1.明确参数列表
		2.明确返回值类型
	
	修饰符：public static 
	方法的名字：就是标识符，我们自己起的
	方法的功能的代码：你会写就会写，不会写没招
	
	例子？
		需求：定义一个方法，该方法的功能是获取两个整数的和？
		public static int getSum(int i, int j) {
            int sum = i + j;
            return sum;
        }
       
怎么使用一个方法？
	方法只有被调用才会执行
	
	怎么调用方法？
		方式一：单独调用
			格式：方法名(数据);
			例子：getSum(1,2);
		
		方式二：输出调用
			格式：System.out.println(方法名(数据));
			例子：System.out.println(getSum(1,2));
		
		方式三：赋值调用
			格式：数据类型 变量名 = 方法名(数据);
			例子：int a = getSum(1,2);
	
常见的方法的返回值类型有哪些？
	a.byte
		public static byte aaa() {
			return 1;
		}
	
	b.short
		public static short bbb() {
			return 1;
		}
		
	c.int
		public static int ccc() {
			return 1;
		}
		
	d.long
		public static long ddd() {
			return 1L;
		}
	
	e.float
		public static float eee() {
			return 1.1F;
		}
	
	f.double
		public static double fff() {
			return 1.1;
		}
	
	g.char
		public static char ggg() {
			return 'a';
		}
	
	h.boolean
		public static boolean hhh() {
			return true;//return false;
		}
		
	i.String
		public static String iii() {
			return "约吗";
		}
	
	j.数组类型
		public static int[] jjj() {
			int[] arr = {1,2,3};
			return arr;
		}
		
	k.void
		public static void kkk() {
			return ;
		}
	
方法的注意事项？
	1.方法与方法之间是平级关系，不能嵌套定义
		public staitc void aaa() {
			public static void bbb() {
		
			}
		}
		
	2.方法的返回值类型和返回值要匹配
		public static double aaa() {
			return 1;
		}
		
		public static int bbb() {
			return 'a';
		}
		
		public static int ccc() {
			return (int)1.1;
		}
		
	3.如果方法没有具体的返回值，那返回值类型就要写void
		void关键字：代表没有返回值的意思，空的，它只能写在这个问题，其他地方用不了，而且它本身也不是一个数据类型
			注意：
				1.当返回值类型为void的时候，只能使用单独调用，不能使用输出调用和赋值调用
				2.当返回值类型为void的时候，没有返回值，return可以省略不写
		
		return关键字的作用是什么？
			1.返回具体的每个数据，哪里调用返回到哪里
			2.作为方法的结束标记
			
		return的注意事项？
			在同一对花括号内，return关键字下面不能有任何语句，因为永远都执行不到，会编译报错
		
方法的形式参数和实际参数？
	什么是形式参数？
		也称为形参，是指在定义方法的时候，参数列表中的变量就称为形参
		
		public static void aaa(int i, int j) {
			i = 1;
			j = 2;
		}
	
	什么是实际参数？
		也称为实参，是指在调用方法的时候，传递的参数就是实参
		
		aaa(1, 2);
		
		int a = 1;
		int b = 2;
		aaa(a, b);
	
基本数据类型值传递和引用数据类型值传递问题？
	基本数据类型值传递问题？
		public class Demo12 {
            public static void main(String[] args) {
                int i = 1;
                int j = 2;
                System.out.println(i + "..." + j);
                aaa(i, j);
                System.out.println(i + "..." + j);
            }

            public static void aaa(int i, int j) {
                System.out.println(i + "..." + j);
                i = i + 1;
                j = i + j;
                System.out.println(i + "..." + j);
            }
        }
        
	引用数据类型值传递问题？
		public class Demo13 {
            public static void main(String[] args) {
                int[] arr = {11,12};
                System.out.println(arr);
                System.out.println(arr[0]);
                System.out.println(arr[1]);
                aaa(arr);
                System.out.println(arr);
                System.out.println(arr[0]);
                System.out.println(arr[1]);
            }

            public static void aaa(int[] arr) {
                System.out.println(arr);
                System.out.println(arr[0]);
                System.out.println(arr[1]);
                arr[0] = 15;
                arr[1] = 16;
                System.out.println(arr[0]);
                System.out.println(arr[1]);
            }
        }

方法的重载(Overload)？
	什么是方法的重载？
		是指在同一个类中，出现多个方法的名字相同，参数列表不同(数据类型不同，参数个数不同，对应的顺序位置不同)的情况，就称为方法的重载

	例子？
		public static void aaa() {}
		
		public static void aaa() {}//编译报错，因为方法完全相同，不能构成方法重载
		
		public static void aaa(int i) {}
		
		public static void aaa(int i, int j) {}
		
		public static void aaa(double d) {}
		
		public static void aaa(int a, int b) {}//编译报错，不能构成重载
		
		public static void aaa(int a, double b) {}
		
		public static void aaa(double a, int b) {}
		
		public static int aaa(int a, int b, int c) {
			return 1;
		}
		
		public static int aaa() {//编译报错，不满足方法的重载
			return 1;
		}
		
	注意：方法的重载和返回值类型无关，根本就不要看返回值类型是什么
~~~

