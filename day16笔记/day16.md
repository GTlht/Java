### 集合

~~~
什么是集合？
	集合就是个容器
	
	什么是容器？
		可以装东西的，可以取东西的
		
集合的作用？
	可以存储数据，方便对数据进行管理和操作
	
集合容器的特点？
	1.集合容器的长度是可以变化的，也就意味着说里面存储的元素的个数不定
	2.集合容器只能存储引用数据类型的数据
	3.一个集合容器中可以存储不同引用数据类型的数据

集合容器和数组容器的区别？
	1.集合容器的长度是可以变化的，也就意味着说里面存储的元素的个数不定
	  数组容器的长度是固定的，一旦初始化长度就不可以改变
	  
	2.集合容器只能存储引用数据类型的数据
	  数组容器里面既可以存储引用数据类型数据，也可以存储基本数据类型数据
	  
	3.一个集合容器中可以存储不同引用数据类型的数据
	  一个数组容器中只能存储同一种数据类型的数据

集合的体系结构(家谱)？
	单列集合：
		*Collection 单列集合的顶层接口
			-- *List 子接口
				-- *ArrayList 实现类
				-- *LinkedList 实现类
				-- Vector 实现类
			-- *Set 子接口
				-- *HashSet 实现类
				-- *TreeSet 实现类
				-- *LinkedHashSet 实现类
	双列集合：
		*Map 双列集合的顶层接口
			-- *HashMap 实现类
			-- *TreeMap 实现类
			-- LinkedHashMap 实现类
			-- Hashtable 实现类
				-- *Properties 子类
~~~

### Collection集合

	常见的成员方法？
		boolean add(Object e)：添加，添加成功返回true，添加失败返回false
	    boolean addAll(Collection c)：添加一个集合容器
	    void clear()：清空集合容器
		boolean contains(Object o)：判断是否包含指定元素
		boolean isEmpty()：判断容器是否为空
		boolean remove(Object o)：删除指定元素
		default boolean removeIf(Predicate filter)：按照条件删除指定的元素
			练习题？
				题一：创建一个集合容器，里面只存储String类型数据，要求删除里面所有的长度大于3的字符串？
				题二：创建一个集合容器，里面存储String和Integer类型的数据，要求删除里面的所有的Integer类型的数据，只保留字符串？
				
		int size()：获取集合容器的长度
		Object[] toArray()：将集合容器转换成数组容器
		Iterator<E> iterator()：获取迭代器对象
			Iterator接口：
				boolean hasNext()：判断下一个还有没有元素，有返回true，没有返回false
				E next()：获取下一个元素
		
	Collection集合的遍历？
		方式一：转数组
			//创建容器
	        Collection c = new ArrayList();
	
	        //添加元素
	        c.add("aaa");
	        c.add("bbb");
	        c.add("ccc");
	
	        //遍历容器
	        //Object[] toArray()
	        Object[] objs = c.toArray();
	        for(int i = 0; i < objs.length; i++) {
	            System.out.println(objs[i]);
	        }
	        
		方式二：迭代器
			//创建容器
	        Collection c = new ArrayList();
	
	        //添加元素
	        c.add("aaa");
	        c.add("bbb");
	        c.add("ccc");
	
	        //遍历容器
	        //Iterator iterator()
	        Iterator it = c.iterator();
	
	        while(it.hasNext()) {
	            Object obj = it.next();
	            System.out.println(obj);
	        }
		
		方式三：增强for(foreach)
			增强for的定义格式？
				for(元素的数据类型 变量名 : 容器的名字) {
				
				}
				
			注意：增强for底层使用的就是迭代器
				
			//创建容器
	        Collection c = new ArrayList();
	
	        //添加元素
	        c.add("aaa");
	        c.add("bbb");
	        c.add("ccc");
	
	        //遍历容器
	        for(Object obj : c) {
	            System.out.println(obj);
	        }

### List集合

~~~
List集合的特点？
	1.有序的(存入的顺序和取出的顺序是一致)
	2.元素可以重复
	3.有索引的

常见的成员方法？
	大部分方法和Collection中的方法是一样的，我们不需要学习了
	
	特有的方法？
		void add(int index,E element)：添加
		E get(int index)：获取
		E remove(int index)：删除
		E set(int index,E element)：修改

List集合的遍历？
	方式一：转数组
		//创建容器
		List list = new ArrayList();
		
		//添加元素
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		
		//遍历容器
		Object[] objs = list.toArray();
		for (Object obj : objs) {
			System.out.println(obj);
		}
		
	方式二：迭代器
		//创建容器
		List list = new ArrayList();
		
		//添加元素
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		
		//遍历容器
		Iterator it = list.iterator();
		while(it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}
	
	方式三：增强for
		//创建容器
		List list = new ArrayList();
		
		//添加元素
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		
		//遍历容器
		for(Object obj : list) {
			System.out.println(obj);
		}
	
	方式四：普通for
		//创建容器
		List list = new ArrayList();
		
		//添加元素
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		
		//遍历容器
		for(int i = 0; i < list.size(); i++) {
			Object obj = list.get(i);
			System.out.println(obj);
		}
~~~

### ArrayList集合

~~~
ArrayList集合的特点？
	1.有序的(存入的顺序和取出的顺序是一致)
	2.元素可以重复
	3.有索引的
	
常见的构造方法？
	public ArrayList()：构造一个初始容量为 10 的空列表
	
常见的成员方法？
	和List集合的方法是一样的
	
ArrayList集合的遍历？
	方式一：转数组
		//创建容器
		ArrayList al = new ArrayList();
		
		//添加元素
		al.add("aaa");
		al.add("bbb");
		al.add("ccc");
		
		//遍历容器
		Object[] objs = al.toArray();
		for (Object obj : objs) {
			System.out.println(obj);
		}
	
	方式二：迭代器
		//创建容器
		ArrayList al = new ArrayList();
		
		//添加元素
		al.add("aaa");
		al.add("bbb");
		al.add("ccc");
		
		//遍历容器
		Iterator it = al.iterator();
		while(it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}
	
	方式三：增强for
		//创建容器
		ArrayList al = new ArrayList();
		
		//添加元素
		al.add("aaa");
		al.add("bbb");
		al.add("ccc");
		
		//遍历容器
		for (Object obj : al) {
			System.out.println(obj);
		}
	
	方式四：普通for
		//创建容器
		ArrayList al = new ArrayList();
		
		//添加元素
		al.add("aaa");
		al.add("bbb");
		al.add("ccc");
		
		//遍历容器
		for (int i = 0; i < al.size(); i++) {
			Object obj = al.get(i);
			System.out.println(obj);
		}

练习题？
	题一：已知有一个集合，里面存储了以下元素："aaa","bbb","aaa","aaa","ccc","ddd"，要求将集合中的所有的"aaa"给干掉？(不可以使用removeif())
	
	题二：已知有一个集合，里面存储3头猪，要求遍历集合，在控制台打印猪的属性？
~~~

### LinkedList集合

~~~
LinkedList集合的特点？
	1.有序的(存入的顺序和取出的顺序是一致)
	2.元素可以重复
	3.有索引的
	
常见的构造方法？
	public LinkedList()：构造一个空列表

常见的成员方法？
	大部分和List中的方法是一样的
	
	特有的成员方法：
		public void addFirst(E e)：将元素添加到集合的第一个位置上
		public void addLast(E e)：将元素添加到集合的最后一个位置上
		public E getFirst()：获取第一个元素
		public E getLast()：获取最后一个元素
		public E removeFirst()：删除第一个元素
		public E removeLast()：删除最后一个元素
		
LinkedList集合的遍历？
	方式一：转数组
		//创建容器
		LinkedList ll = new LinkedList();
		
		//添加元素
		ll.add("aaa");
		ll.add("bbb");
		ll.add("ccc");
		
		//遍历容器
		Object[] objs = ll.toArray();
		for (Object obj : objs) {
			System.out.println(obj);
		}
		
	方式二：迭代器
		//创建容器
		LinkedList ll = new LinkedList();
		
		//添加元素
		ll.add("aaa");
		ll.add("bbb");
		ll.add("ccc");
		
		//遍历容器
		Iterator it = ll.iterator();
		while(it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}
		
	方式三：增强for
		//创建容器
		LinkedList ll = new LinkedList();
		
		//添加元素
		ll.add("aaa");
		ll.add("bbb");
		ll.add("ccc");
		
		//遍历容器
		for (Object obj : ll) {
			System.out.println(obj);
		}
		
	方式四：普通for
		//创建容器
		LinkedList ll = new LinkedList();
		
		//添加元素
		ll.add("aaa");
		ll.add("bbb");
		ll.add("ccc");
		
		//遍历容器
		for(int i = 0; i < ll.size(); i++) {
			Object obj = ll.get(i);
			System.out.println(obj);
		}
~~~

### 数据结构

~~~
队列：
	特点：先进先出，后进后出
	
栈：
	特点：先进后出，后进先出
~~~

