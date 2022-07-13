### TreeSet集合

~~~
TreeSet存储自定义对象？
	方案一：自然排序
		题一：使用TreeSet集合，存储几头猪，要按照猪的年龄由小到大进行排序，年龄相同，则去重？	
			class Pig implements Comparable<Pig> {
				@Override
                public int compareTo(Pig p) {
                    return this.age - p.age;
                }
			}
		
		题二：使用TreeSet集合，存储几头猪，要按照猪的年龄由大到小进行排序，年龄相同，则去重？
			class Pig implements Comparable<Pig> {
				@Override
                public int compareTo(Pig p) {
                    return p.age - this.age;
                }
			}
		
		题三：使用TreeSet集合，存储几头猪，要按照猪的年龄由大到小进行排序，如果年龄相同，再按照姓名进行字典顺序排序，如果名字也相同，则去重？
			class Pig implements Comparable<Pig> {
                @Override
                public int compareTo(Pig p) {
                    //比较年龄，大到小
                    int num1 = p.age - this.age;
                    //比较姓名，小到大
                    int num2 = num1 == 0 ? this.name.compareTo(p.name) : num1;

                    return num2;
                }
            }
	
	方案二：比较器
		题一：使用TreeSet集合，存储几头猪，要按照猪的年龄由小到大进行排序，年龄相同，则去重？
			TreeSet<Pig> ts = new TreeSet<Pig>(new Comparator<Pig>() {
			@Override
                public int compare(Pig p1, Pig p2) {
                    //比较年龄，小到大
                    return p1.getAge() - p2.getAge();
                }
            });
		
		题二：使用TreeSet集合，存储几头猪，要按照猪的年龄由大到小进行排序，年龄相同，则去重？
			TreeSet<Pig> ts = new TreeSet<Pig>(new Comparator<Pig>() {
                @Override
                public int compare(Pig p1, Pig p2) {
                    //比较年龄，大到小
                    return p2.getAge() - p1.getAge();
                }
            });
		
		题三：使用TreeSet集合，存储几头猪，要按照猪的年龄由大到小进行排序，如果年龄相同，再按照姓名进行字典顺序排序，如果名字也相同，则去重？
			TreeSet<Pig> ts = new TreeSet<Pig>(new Comparator<Pig>() {
                @Override
                public int compare(Pig p1, Pig p2) {
                    //比较年龄，大到小
                    int num1 = p2.getAge() - p1.getAge();
                    //比较姓名，小到大
                    int num2 = num1 == 0 ? p1.getName().compareTo(p2.getName()) : num1;

                    return num2;
                }
            });
~~~

### HashSet集合

~~~
HashSet集合的特点？
	1.无序的(存入的顺序和取出的顺序不一定一样)
	2.元素不可以重复
	3.无索引
	
常见的构造方法？
	public HashSet()：构造一个新的空 set，其底层 HashMap 实例的默认初始容量是 16，加载因子是 0.75
	
常见的成员方法？
	和Set的方法是一样的
	
HashSet集合的遍历？
	方式一：转数组
	方式二：迭代器
	方式三：增强for
	
练习题？
	题一：使用HashSet集合存储String类型的数据，遍历并打印？
		//创建容器
		HashSet<String> hs = new HashSet<String>();
		
		//添加元素
		hs.add("aaa");
		hs.add("bbb");
		hs.add("aaa");
		hs.add("ccc");
		
		//遍历容器		
		for (String str : hs) {
			System.out.println(str);
		}
	
	题二：使用HashSet集合存储Integer类型的数据，遍历并打印？
		//创建容器
		HashSet<Integer> hs = new HashSet<Integer>();
		
		//添加元素
		hs.add(111);
		hs.add(333);
		hs.add(222);
		hs.add(111);
		
		//遍历容器
		for (Integer in : hs) {
			System.out.println(in);
		}
	
	题三：使用HashSet集合存储几头猪，遍历并打印？
		//创建对象
		HashSet<Pig> hs = new HashSet<Pig>();
		
		//添加元素
		hs.add(new Pig("tom", 18));
		hs.add(new Pig("jerry", 19));
		hs.add(new Pig("rose", 18));
		hs.add(new Pig("tom", 18));
		hs.add(new Pig("jack", 23));
		
		Pig p = new Pig("tony", 18);
		hs.add(p);
		hs.add(p);
		
		//遍历容器
		for (Pig pig : hs) {
			System.out.println(pig);
		}
		
		注意：通过测试，发现HashSet存储自定义对象，默认是根据地址值去重的。
		提出新的需求：如果属性完全一致则去重，该如何实现呢？
			重新hashCode()和equals()
			
			@Override
            public int hashCode() {
                return this.name.hashCode() + this.age * 23;
            }

            @Override
            public boolean equals(Object obj) {
                Pig p = (Pig)obj;
                return this.name.equals(p.name) && this.age == p.age;
            }

~~~

### 数据结构

~~~
哈希表？
	哈希值：哈希值是Java通过对象的地址值和一系列算法计算出来一个int类型的整数，我们可以通过Object类中的hashCode()来获取哈希值。
	
	1.7之前：
		哈希表 = 数组 + 链表(元素为链表的数组)
	
	1.7之后：
		哈希表 = 数组 + 链表 + 红黑树
~~~

### LinkedHashSet集合

~~~
LinkedHashSet集合的特点？
	1.有序的
	2.元素不可以重复
	3.无索引
~~~

### Map集合

~~~
Map集合的特点？
	1.无序的
	2.没有索引
	3.双列的
	4.键唯一，值可以重复

常见的成员方法？
	V put(K key,V value)：添加/修改
	void clear()：清空
	V remove(Object key)：根据键删除键值对
	V get(Object key)：根据键获取值
	boolean containsKey(Object key)：判断是否包含指定的键
	boolean containsValue(Object value)：判断是否包含指定的值
	int size()：获取集合容器的长度
	Collection<V> values()：将所有的值获取到并且存储到Collection集合中
	Set<K> keySet()：将所有的键获取到并且存储到Set集合中
	Set<Map.Entry<K,V>> entrySet()：将键值对对象存储到Set集合中
	
Map集合的遍历？
	方式一：键找值
		//创建容器
		Map<String, String> map = new HashMap<String, String>();
		
		//添加元素
		map.put("tom", "成都");
		map.put("jerry", "都江堰");
		map.put("rose", "乐山");
		map.put("jack", "眉山");
		map.put("tony", "自贡");
		
		//遍历容器：通过键找值
		Set<String> set = map.keySet();
		for (String key : set) {
			String value = map.get(key);
			System.out.println(key + "..." + value);
		}
	
	方式二：键值对找键和值
		//创建容器
		Map<String, String> map = new HashMap<String, String>();
		
		//添加元素
		map.put("tom", "成都");
		map.put("jerry", "都江堰");
		map.put("rose", "乐山");
		map.put("jack", "眉山");
		map.put("tony", "自贡");
		
		//遍历容器：通过键值对找键和值
		Set<Map.Entry<String, String>> set = map.entrySet();
		for (Map.Entry<String, String> entry : set) {
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + "..." + value);
		}
	
	


~~~

