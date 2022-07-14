### HashMap集合

~~~
HashMap集合的特点？
	1.无序的
	2.没有索引
	3.双列的
	4.键唯一，值可以重复
	
常见的构造方法？
	public HashMap()：构造一个具有默认初始容量 (16) 和默认加载因子 (0.75) 的空 HashMap
	
常见的成员方法？
	和Map的方法是一样的

HashMap集合的遍历？
	方式一：通过键找值
	方式二：通过键值对对象找键和值

练习题？
	题一：使用HashMap存储键为String类型，值为Person类型的元素，遍历并打印？
	题二：使用HashMap存储键为Person类型，值为String类型的元素，遍历并打印？
~~~

### TreeMap集合

~~~
TreeMap集合的特点？
	1.无序的
	2.没有索引
	3.双列的
	4.键唯一，值可以重复
	
常见的构造方法？
	public TreeMap()
	
常见的成员方法？
	和Map的方法是一样的
	
TreeMap集合遍历？
	方式一：通过键找值
	方式二：通过键值对对象找键和值
	
练习题？
	题一：使用TreeMap存储键为String类型，值为Pig类型的元素，遍历并打印？
	题二：使用TreeMap存储键为Pig类型，值为String类型的元素，遍历并打印？
~~~

### Collections

~~~
什么是Collections类？
	集合工具类，用来操作集合的
	
	构造私有
	方法静态
	
常见的成员方法？
	public static <T extends Comparable<? super T>> void sort(List<T> list)：根据元素的自然顺序 对指定列表按升序进行排序
	public static <T> void sort(List<T> list, Comparator<? super T> c)：根据指定比较器产生的顺序对指定列表进行排序
~~~

### 可变参数

~~~
我们先来思考几个小问题？
	题一：定义一个方法，该方法的功能是获取两个整数和？
		public static int getSum(int i, int j) {
			return i + j;
		}
		
	题二：定义一个方法，该方法的功能是获取三个整数和？
		public static int getSum(int a, int b, int c) {
			return a + b + c;
		}
		
	题三：定义一个方法，该方法的功能是获取四个整数和？
		public static int getSum(int a, int b, int c, int d) {
			return a + b + c + d;
		}
		
	题五：定义一个方法，该方法的功能是获取N个整数和？
		public static int getSum(???) {
			return ???;
		}
		
什么是可变参数？
	数量可以变化的参数，参数个数不定就称为可变参数
	
可变参数的定义格式？
	修饰符 返回值类型 方法名(数据类型...变量名) {
		return xxxooo;
	}
	
可变参数的本质？
	数组
	
可变参数的注意事项？
	当方法的形参有多个参数，并且有一个是可变参数的时候，可变参数必须放在最后面
~~~

### 递归

~~~
什么是递归？
	方法内部调用方法本身

递归的注意事项？
	1.递归的次数不能太多，太多会造成内存溢出
	2.递归要有出口，没有出口就变成死递归
	
练习题？
	题一：求N的阶乘，使用递归来实现？
		5! = 5 * 4 * 3 * 2 * 1
	
		public class Demo02 {
            public static void main(String[] args) {
                int num = getJC(5);
                System.out.println(num);//120
            }

            public static int getJC(int n) {
                if(n == 1) {
                    return 1;
                }

                return n * getJC(n-1);
            }
        }

	题二：求第N项的斐波那契数列的值是多少？
		1 1 2 3 5 8 13 ... ...
		
		public class Demo03 {
            public static void main(String[] args) {
                int num = getN(7);
                System.out.println(num);//13
            }

            public static int getN(int n) {
                if(n == 1 || n == 2) {
                    return 1;
                }

                return getN(n-1) + getN(n-2);
            }
        }
~~~

### File类

~~~
什么是File类？
	它代表文件或者文件夹(目录)的类
	
常见的构造方法？
	public File(String pathname)
	public File(String parent,String child)
	public File(File parent,String child)
	
常见的成员方法？
	1.创建相关的方法
		public boolean createNewFile()：创建文件，创建成功返回true，创建失败返回false
		public boolean mkdir()：创建单级文件夹，创建成功返回true，创建失败返回false
		public boolean mkdirs()：创建多级文件夹，创建成功返回true，创建失败返回false
		
	2.删除相关的方法
	3.判断相关的方法
	4.获取相关的方法





~~~

### 路径

~~~
路径的分类？
	相对路径
	绝对路径
	
什么是绝对路径？
	是以盘符开始的路径
	C:\Users\apple\Desktop\aaa.txt
	
什么是相对路径？
	不以盘符开始的路径
	相对于谁呢？
		相对于当前项目下
~~~

