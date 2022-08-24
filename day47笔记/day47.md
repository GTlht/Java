### Lambda表达式

~~~
练习题？
	7.补全代码
		public class Demo01 {
            public static void main(String[] args) {
                /*
                    补全代码，可以在控制台上打印以下内容：
                        约吗
                        滚犊子
                */

                /*show(new A() {
                    public void show(String s) {
                        System.out.println("约吗");
                        System.out.println(s);
                    }
                });*/

                show((String s) -> {
                    System.out.println("约吗");
                    System.out.println(s);
                });
            }

            public static void show(A a) {
                a.show("滚犊子");
            }
         }

        interface A {
            public void show(String s);
        }
	
	8.补全代码
		public class Demo02 {
            public static void main(String[] args) {
                //补全代码，实现两个参数的和
                /*print(new B() {
                    public int print(int i, int j) {
                        return i + j;
                    }
                });*/

                print((int i, int j) -> {return i + j;});
            }

            public static void print(B b) {
                int sum = b.print(1, 2);
                System.out.println(sum);
            }
        }

        interface B {
            public int print(int i, int j);
        }

lambda表达式的省略规则？
	格式：(形式参数) -> {代码块}
	
	(形式参数)：
		1.无参
			()不可以省略，必须写上
			
			public classs Demo {
				public static void main(String[] args) {
					A a = () -> {System.out.println("约吗");};
					a.show();
				}
			}
			
			interface A {
				public void show();
			}
		
		2.有一个参数
			小括号是可以省略不写
			数据类型可以省略不写
			
			public class Demo {
				public static void main(String[] args) {
					B b = i -> {System.out.println(i);};
					b.show();
				}
			}
			
			interface B {
				public void show(int i);
			}
		
		3.有多个参数
			小括号不可以省略，必须写
			数据类型可以省略不写
			
			public class Demo {
				public static void main(String[] args) {	
					C c = (i, j) -> {return i + j;};
					System.out.println(c.print(1,2));
				}
			}
			
			interface C {
				public int print(int i, int j);
			}

	->：固定格式，不可以省略
	
	{代码块}：
		1.有一条有效语句
			花括号可以省略不写
			分号可以省略不写
			如果有return，return可以省略不写
			
			public class Demo {
				public static void main(String[] args) {
					D d = (i, j) -> i + j;
				}
			}
			
			interface D {
				public int print(int i, int j);
			}
		
		2.有多条有效语句
			什么都不可以省略，正常写

lambda表达式的注意事项？
	1.必须是接口
	2.接口中的抽象方法有且只能有一个
	3.lambda表达式不能单独使用

lambda表达式和匿名内部类的区别？
	1.当方法的形参类型是普通类或者抽象类型的时候，可以使用匿名内部类，但是不可以使用lambda表达式
	2.当接口中有多个抽象方法的时候，可以使用匿名内部类，但是不可以使用lambda表达式
	3.匿名内部类可以单独使用，lambda表达式不可以单独使用
	4.匿名内部类会生成.class文件，lambda表达式不会生成.class文件

lambda表达式关于方法引用的使用？
	什么是方法引用？
		带有::引用运算符的表达式，就称为方法引用
		
	例子一：
		public class Demo09 {
            public static void main(String[] args) {
                /*I i = new I() {
                    public void show(int i) {
                        System.out.println(i);
                    }
                };
                i.show(12);*/

                /*I ii = (int i) -> {System.out.println(i);};
                ii.show(12);*/

                /*I ii = i -> System.out.println(i);
                ii.show(12);*/

                I ii = System.out::println;
                ii.show(12);
            }
        }

        interface I {
            public void show(int i);
        }
        
	例子二：
		public class Demo10 {
            public static void main(String[] args) {
                /*J j = new J() {
                    public Person show(String name) {
                        return new Person(name);
                    }
                };
                Person p = j.show("tom");
                System.out.println(p);*/

                /*J j = (String name) -> {return new Person(name);};
                Person p = j.show("jerry");
                System.out.println(p);*/

                /*J j = name -> new Person(name);
                Person p = j.show("rose");
                System.out.println(p);*/

                J j = Person::new;
                Person p = j.show("jack");
                System.out.println(p);
            }
        }

        interface J {
            public Person show(String name);
        }

        class Person {
            private String name;

            public Person(String name) {
                this.name = name;
            }

            @Override
            public String toString() {
                return "Person [name=" + name + "]";
            }
        }
~~~

### 接口

~~~
1.8之前？
	常量：public static final
	抽象方法：public abstract

1.8之后？
	常量
	抽象方法
	默认方法
	静态方法

1.9之后？
	常量
	抽象方法
	默认方法
	静态方法
	私有方法
	
默认方法？
	格式：
		public default 返回值类型 方法名字(参数列表) {
			xxxooo;
		}
		
	例子：
		interface Inter {
            public abstract void show();

            //默认方法
            public default void print() {
                System.out.println("约吗");
            }
        }

静态方法？
	格式：
		public static 返回值类型 方法名字(参数列表) {
			xxxooo;
		}
	
	例子：
		interface Inter {
            public abstract void show();

            //静态方法
            public static void print() {
                System.out.println("约吗");
            }
        }

私有方法？
	格式：
		private 返回值类型 方法名(参数列表) {
			xxxooo;
		}
		
		private static 返回值类型 方法名(参数列表) {
			xxxooo;
		}
		
~~~

### 函数式接口

~~~
什么是函数式接口？
	有且只有一个抽象方法的接口，就称为函数式接口
	
函数式接口的标记？
	@FuntionalInterface

函数式接口的使用？
	案例一：函数式接口作为方法的形参
		public class Demo02 {
            public static void main(String[] args) {
                /*show(new Runnable() {
                    public void run() {
                        System.out.println("约吗");
                    }
                });*/

                //show(() -> {System.out.println("约吗");});

                show(() -> System.out.println("约吗"));

            }

            public static void show(Runnable runnable) {
                Thread t = new Thread(runnable);
                t.start();
            }
        }

	案例二：函数式接口作为方法的返回值
		public class Demo03 {
            public static void main(String[] args) {
                ArrayList<String> al = new ArrayList<>();

                al.add("a");
                al.add("bbb");
                al.add("aaaaa");
                al.add("cc");
                al.add("dddd");

                System.out.println(al);

                //需求：对字符串的长度进行排序：大到小
                Collections.sort(al, getComparator());

                System.out.println(al);
            }

            public static Comparator<String> getComparator() {
                /*return new Comparator<String>() {
                    @Override
                    public int compare(String s1, String s2) {
                        return s2.length() - s1.length();
                    }
                };*/

                //return (String s1, String s2) -> {return s2.length() - s1.length();};

                return (s1, s2) -> s2.length() - s1.length();
            }
        }

常见的函数式接口？
	1.Supplier 生产型函数式接口
	2.Consumer 消费型函数式接口
	3.Predicate 比较型函数式接口
	4.Function 转换型函数式接口
	
~~~

### XML

~~~
什么是xml？
	可扩展标示语言（extensive markup language）
	
	可扩展：是相对于html来说的，因为html中的标签都是预定义好的，在xml中的标签都是我们自己定义的
	标记语言：里面的代码都是由标签组成的

	xml和html的区别？
		1.html里面的标签都是预定义的，xml里面的标签都是自定义的
		2.html标记语言是非常不严谨的，也就是说我们很难把html给写错了
		  xml标记语言是非常严谨的，也就是我们很难把它写对
		3.html是用来展示数据的，xml是用来存储数据的

xml的作用？
	用来当做配置文件使用的

	xml配置文件和properties配置文件的区别？
		properties配置文件一般用于单项配置：
			driver=com.mysql.jdbc.Driver
			url=jdbc:mysql://localhost:3306/db1
			username=root
			password=123
		
		xml配置文件一般用于多项配置：
			<databases>
				<database id="mysql">
					<driver>com.mysql.jdbc.Drvier</driver>
					<url>jdbc:myql://localhost:3306/db1</url>
					<username>root</username>
					<password>123</password>
				<database>
				<database id="oracle">
					<driver>com.oracle.jdbc.Drvier</driver>
					<url>jdbc:oracle://localhost:3306/db1</url>
					<username>admin</username>
					<password>999</password>
				</database>
			</databases>

xml的入门小案例？
	1.创建一个文件，后缀名改位.xml
	2.在文件中写以下内容：
		<?xml version='1.0' encoding='utf-8'?>
        <students>
            <student>
                <name>tom</name>
                <age>18</age>
            </student>
            <student>
                <name>jerry</name>
                <age>19</age>
            </student>
        </students>
	3.通过浏览器打开该xml文件

xml的语法？
	1.xml文件的后缀名是以.xml为结尾
	2.xml文件中的第一行要写文档声明：
		<?xml version='1.0' encoding='utf-8'?>
		
		version属性：代表版本号的意思，必须得写
		encoding属性：告诉浏览器用什么编码打开该xml文件，可写可不写
	3.属性要加单引号或者双引号
	4.标签与标签之间要正常嵌套
		不能你中有我，我中有你
		<student><name></student></name> 错误的嵌套
		<student><name></name></student> 正确的嵌套
	5.xml中是严格区分大小写的
		<student><STUDENT> 错误的
		<student></student> 正确的
	6.xml的标签命名规则：
		a.可以有数字，英文字母和符号组成
		b.数字和标签符号不能开头
		c.标签名中不可以有空格
	7.xml是非常严谨的语言

xml的约束文档？
	xml约束的分类？
		dtd约束文档
		schema约束文档
	
	


~~~

