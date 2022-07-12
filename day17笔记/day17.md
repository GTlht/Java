### 数据结构

~~~
数组数据结构？
	特点：查询快，增删慢
	
	ArrayList底层使用的就是数组数据结构
	
链表数据结构？
	链表的分类？
		单向链表
		双向链表
	
	特点：查询慢，增删快
	
	LinkedList底层使用的就是双向链表数据结构
~~~

### 泛型

~~~
什么是泛型？
	泛型就是指参数化类型，是指在定义泛型的时候就像定义方法的形参一样，在使用泛型的使用就像在给方法传参一样。
	
泛型的定义格式？
	<E>
	<K,V>
	
泛型的基本使用？
	//创建容器
    ArrayList<String> al = new ArrayList<String>();

    //添加元素
    al.add("aaa");
    al.add("bbb");
    al.add("ccc");

    //遍历容器
    Iterator<String> it = al.iterator();
    while(it.hasNext()) {
        String str = it.next();
        System.out.println(str);
    }

泛型的作用？
	避免了强制类型转换
	指定了具体的数据类型，当我们传递的是未指定的数据类型的话就会编译报错
	
泛型的注意事项？
	1.泛型只能写引用数据类型，不能写基本数据类型
		ArrayList<int> al = new ArrayList<int>(); 错误的
		ArrayList<Integer> al = new ArrayList<Integer>(); 正确的
		
	2.前面的泛型要和后面的泛型类型匹配
		ArrayList<String> al = new ArrayList<Integer>(); 错误的
		ArrayList<Integer> al = new ArrayList<Character>(); 错误的
		ArrayList<Object> al = new ArrayList<Integer>(); 错误的

	3.后面的泛型可以省略不写
		ArrayList<String> al = new ArrayList<String>(); 正确的
		ArrayList<String> al = new ArrayList<>(); 正确的 
		ArrayList<String> al = new ArrayList(); 正确的
		
自定义泛型？
	1.自定义泛型类
		class A<E> {
            public void print(E e) {
                System.out.println(e);
            }
        }
	
	2.自定义泛型方法
		class B {
            public <E> void print(E e) {
                System.out.println(e);
            }
        }
	
	3.自定义泛型接口(父类)
		interface Inter<E> {
            public void print(E e);
        }

        class InterImpl<E> implements Inter<E> {
            public void print(E e) {
                System.out.println(e);
            }
        }

泛型通配符？
	1.?
		ArrayList<?> al1 = new ArrayList<String>();
		ArrayList<?> al2 = new ArrayList<Integer>();
		ArrayList<?> al3 = new ArrayList<Character>();
	
	2.? extends E
		ArrayList<? extends Number> al1 = new ArrayList<Number>(); 正确的
		ArrayList<? extends Number> al2 = new ArrayList<Integer>(); 正确的
		ArrayList<? extends Number> al3 = new ArrayList<Double>(); 正确的
		ArrayList<? extends Number> al4 = new ArrayList<Object>(); 错误的
		ArrayList<? extends Number> al5 = new ArrayList<String>(); 错误的
	
	3.? super E
		ArrayList<? super Number> al1 = new ArrayList<Number>(); 正确的
		ArrayList<? super Number> al2 = new ArrayList<Integer>(); 错误的
		ArrayList<? super Number> al3 = new ArrayList<Double>(); 错误的
		ArrayList<? super Number> al4 = new ArrayList<String>(); 错误的
		ArrayList<? super Number> al5 = new ArrayList<Object>(); 正确的
~~~

### Set集合

~~~
Set集合的特点？
	1.无序的(存入的顺序和取出的顺序不一定一样)
	2.元素不可以重复
	3.无索引

常见的成员方法？
	和Collection中的方法是一样的
	
Set集合的遍历？
	方式一：转数组
		//创建容器
		Set<String> set = new HashSet<String>();
		
		//添加元素
		set.add("aaa");
		set.add("bbb");
		set.add("ccc");
		
		//遍历容器
		Object[] objs = set.toArray();
		for (Object obj : objs) {
			System.out.println(obj);
		}
		
	方式二：迭代器
		//创建容器
		Set<String> set = new HashSet<String>();
		
		//添加元素
		set.add("aaa");
		set.add("bbb");
		set.add("ccc");
		
		//遍历容器
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String str = it.next();
			System.out.println(str);
		}
	
	方式三：增强for
		//创建容器
		Set<String> set = new HashSet<String>();
		
		//添加元素
		set.add("aaa");
		set.add("bbb");
		set.add("ccc");
		
		//遍历容器
		for (String str : set) {
			System.out.println(str);
		}
~~~

### TreeSet集合

~~~
TreeSet集合的特点？
	1.无序的(存入的顺序和取出的顺序不一定一样)
	2.元素不可以重复
	3.无索引
	4.可以排序
	
常见的构造方法？
	public TreeSet()：构造一个新的空 set，该 set 根据其元素的自然顺序进行排序
	public TreeSet(Comparator<? super E> comparator)：造一个新的空 TreeSet，它根据指定比较器进行排序

常见的成员方法？
	和Set方法是一样的
	
TreeSet集合遍历？
	方式一：转数组
	方式二：迭代器
	方式三：增强for

练习题？
	题一：创建一个TreeSet集合，添加String类型的数据，遍历并打印？
		//创建容器
		TreeSet<String> ts = new TreeSet<String>();
		
		//添加元素
		ts.add("aaa");
		ts.add("ccc");
		ts.add("aaa");
		ts.add("bbb");
		
		//遍历
		for (String str : ts) {
			System.out.println(str);
		}
		
		按照字符串的字典顺序排序的
	
	题二：创建一个TreeSet集合，添加Integer类型的数据，遍历并打印？
		//创建容器
		TreeSet<Integer> ts = new TreeSet<Integer>();
		
		//添加元素
		ts.add(333);
		ts.add(111);
		ts.add(222);
		ts.add(111);
		
		//遍历
		for (Integer in : ts) {
			System.out.println(in);
		}
		
		按照数字的大小由小到大排序的
	
	题三：创建一个TreeSet集合，添加Pig类型的数据，遍历并打印？
		//创建容器
		TreeSet<Pig> ts = new TreeSet<Pig>();
		
		//添加元素
		ts.add(new Pig("tom", 18));
		ts.add(new Pig("jerry", 19));
		ts.add(new Pig("rose", 17));
		ts.add(new Pig("tom", 18));
	
		//遍历
		for (Pig pig : ts) {
			System.out.println(pig);
		}
		
		运行结果报错，类型转换异常，如果我们想要运行不报错，必须要满足两个条件之一。
		
		两个条件：
			一：自然排序
				实现步骤：
					1.自定义一个类，实现Comparable接口
					2.重写comparaTo()方法
					3.在该方法中写排序规则
		
                class Pig implements Comparable<Pig> {
                    @Override
                    public int compareTo(Pig pig) {
                        //return 0;//只有一个
                        //return 1;//正序
                        return -1;//倒叙
                    }
                }
			
			二：比较器
				实现步骤：
					1.创建TreeSet容器，在其构造方法中传递Comparator接口对象
					2.重写compare()方法
					3.在该方法中写排序规则
					
				//创建容器
                TreeSet<Pig> ts = new TreeSet<Pig>(new Comparator<Pig>() {
                    @Override
                    public int compare(Pig p1, Pig p2) {
                        //return 0;//只有一个
                        //return 1;//正序
                        return -1;//倒叙
                    }
                });
~~~

### 数据结构

~~~
二叉树：
	普通二叉树：
		特点：
			1.二叉树是由节点组成
			2.每个二叉树有且只有一个根节点
			3.每个节点下面最多只能有2个子节点
	
	二叉查找树：
		特点：
			1.二叉树是由节点组成
			2.每个二叉树有且只有一个根节点
			3.每个节点下面最多只能有2个子节点
			4.大的放右边，小的放左边，也就是说任何一个节点的左子树中的所有节点一定比它小，任何一个节点的右子树的所有节点一定比它大。
		
	平衡二叉树：
		自平衡二叉查找树
		
		特点：
			1.二叉树是由节点组成
			2.每个二叉树有且只有一个根节点
			3.每个节点下面最多只能有2个子节点
			4.大的放右边，小的放左边，也就是说任何一个节点的左子树中的所有节点一定比它小，任何一个节点的右子树的所有节点一定比它大
			5.任何一个节点的左子树和右子树的高度差不能超过1，如果超过1就会发生自旋转(左旋和右旋)
	
	红黑树：
		特点：
			1.任何节点的颜色要么是黑色，要么是红色
			2.根节点一定是黑色
			3.如果一个节点是红色的，那么该节点的两个子节点一定是黑色的，也就是不能出现连续两个红色节点
			4.如果一个节点没有子节点，那么该节点默认指向了名为Nil的节点，该节点称为叶子节点，而叶子节点一定是黑色的
			5.任何一个节点到其叶子节点的这条简单路径上的黑色节点的个数是一样多的
	
		注意：
			1.默认添加的节点的颜色是什么颜色？
				红色
			2.如果出现连续两个红色节点该怎么处理呢？
				a.如果叔叔节点的颜色是红色，那么父亲节点由红变黑，叔叔节点由红变黑，爷爷节点由黑变红，如果爷爷节点是根节点，再由红变黑。
				b.如果叔叔节点的颜色是黑色，要么父亲节点由红变黑，爷爷节点由黑变红，然后再进行旋转
	
	TreeSet集合底层使用的是红黑树
~~~

