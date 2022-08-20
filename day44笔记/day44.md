### 单例设计模式

~~~
什么是单例设计模式？
	通过单例设计模式可以制造获取有且只能有一个对象的环境
	
单例设计模式的代码体现？
	方式一：饿汉式(立即加载)
		class Singleton {
            private static final Singleton singleton = new Singleton();

            private Singleton() {}

            //提供一个方法，让外界获取到该类的对象
            public static Singleton getInstance() {
                return singleton;
            }
        }
        
        优点：线程是安全的
        缺点：因为是静态的成员变量，在定义的时候就直接显示初始化，对象是对着.class文件的加载就已经创建了，所以很早的进内存，占内存空间
	
	方式二：懒汉式(延迟加载)
		class Singleton {
            private static Singleton singleton;

            private Singleton() {}

            public static Singleton getInstance() {
                if(singleton == null) {
                    singleton = new Singleton();
                }

                return singleton;
            }
        }
        
        优点：不过立即加载，节省内存空间
        缺点：线程不安全
	
	方式三：懒汉式(延迟加载)
		class Singleton {
            private static Singleton singleton;

            private Singleton() {}

            public static synchronized Singleton getInstance() {
                if(singleton == null) {
                    singleton = new Singleton();
                }

                return singleton;
            }
        }
        
        优点：不用立即加载，所以不占内存空间
             线程安全
             
        缺点：效率低
        
	方式四：懒汉式(延迟加载)
		class Singleton {
            private static Singleton singleton;

            private Singleton() {}

            public static Singleton getInstance() {
                if(singleton == null) {
                    synchronized(Singleton.class) {
                        if(singleton == null) {
                            singleton = new Singleton();
                        }
                    }
                }

                return singleton;
            }
        }

		优点：不占内存，线程安全，效率不低
~~~

### 枚举

~~~
什么是枚举？
	枚举是特殊的单例，单例要求我们针对一个类的对象有且只能有一个，枚举要求我们针对一个类的对象有且可以有几个，不是一个对象，但是也不能有太多个对象，只能有几个对象


自定义枚举类？
	格式一：
		public class Demo01 {
            public static void main(String[] args) {
                Week mon = Week.MON;
                System.out.println(mon);

                Week tue = Week.TUE;
                System.out.println(tue);

                Week wed = Week.WED;
                System.out.println(wed);
            }
        }

        class Week {
            public static final Week MON = new Week();
            public static final Week TUE = new Week();
            public static final Week WED = new Week();

            private Week() {}
        }
        
 	格式二：
 		public class Demo01 {
            public static void main(String[] args) {
                Week mon = Week.MON;
                System.out.println(mon);
                System.out.println(mon.getName());

                Week tue = Week.TUE;
                System.out.println(tue);
                System.out.println(tue.getName());

                Week wed = Week.WED;
                System.out.println(wed);
                System.out.println(wed.getName());
            }
        }

        class Week {
            public static final Week MON = new Week("星期一");
            public static final Week TUE = new Week("星期二");
            public static final Week WED = new Week("星期三");

            private String name;

            private Week(String name) {
                this.name = name;
            }

            public String getName() {
                return name;
            }
        }

	格式三：
		public class Demo01 {
            public static void main(String[] args) {
                Week mon = Week.MON;
                System.out.println(mon.getName());
                mon.show();

                Week tue = Week.TUE;
                System.out.println(tue.getName());
                tue.show();

                Week wed = Week.WED;
                System.out.println(wed.getName());
                wed.show();
            }
        }

        abstract class Week {
            public static final Week MON = new Week("星期一") {
                @Override
                public void show() {
                    System.out.println("星期一");
                }
            };
            public static final Week TUE = new Week("星期二") {
                @Override
                public void show() {
                    System.out.println("星期二");
                }
            };
            public static final Week WED = new Week("星期三") {
                @Override
                public void show() {
                    System.out.println("星期三");
                }
            };

            private String name;

            private Week(String name) {
                this.name = name;
            }

            public String getName() {
                return name;
            }

            public abstract void show();
        }

真正的枚举类？
	格式一：
		public class Demo02 {
            public static void main(String[] args) {
                Week mon = Week.MON;
                System.out.println(mon);

                Week tue = Week.TUE;
                System.out.println(tue);

                Week wed = Week.WED;
                System.out.println(wed);
            }
        }

        enum Week {
            MON, TUE, WED;
        }
        
	格式二：
		public class Demo02 {
            public static void main(String[] args) {
                Week mon = Week.MON;
                System.out.println(mon);
                System.out.println(mon.getName());

                Week tue = Week.TUE;
                System.out.println(tue);
                System.out.println(tue.getName());

                Week wed = Week.WED;
                System.out.println(wed);
                System.out.println(wed.getName());
            }
        }

        enum Week {
            MON("星期一"), TUE("星期二"), WED("星期三");

            private String name;

            private Week(String name) {
                this.name = name;
            }

            public String getName() {
                return name;
            }
        }
        
	格式三：
		enum Week {
            MON("星期一") {
                public void show() {
                    System.out.println("星期一");
                }
            }, TUE("星期二") {
                public void show() {
                    System.out.println("星期二");
                }
            }, WED("星期三") {
                public void show() {
                    System.out.println("星期三");
                }
            };

            private String name;

            private Week(String name) {
                this.name = name;
            }

            public String getName() {
                return name;
            }

            public abstract void show();
        }
	
	枚举的注意事项？
		1.定义枚举要使用enum关键字
		2.枚举的本质？
			final class com._enum.Week extends java.lang.Enum<com._enum.Week> {
                public static final com._enum.Week MON;
                public static final com._enum.Week TUE;
                public static final com._enum.Week WED;
                static {};
                public static com._enum.Week[] values();
                public static com._enum.Week valueOf(java.lang.String);
            }
            枚举的本质就是一个继承了Enum类的一个类
       	3.枚举项必须放在枚举类中的第一行
       	4.枚举项与枚举项之间要用逗号隔开，最后一个枚举项后面用分号，如果最后一个枚举项的后面没有内容，分号可以省略不写，但是如果最后一个枚举项的后面有内容的时候，分号必须写，建议写上分号
       	5.任何枚举中都默认带有私有的空参构造
       	6.枚举可以作为switch语句中的表达式
       		MyEnum me2 = MyEnum.ME2;
		
            switch(me2) {
                case ME1:
                    System.out.println("在吗");
                    break;
                case ME2:
                    System.out.println("约吗");
                    break;
                case ME3:
                    System.out.println("滚犊子");
                    break;
            }
		7.枚举中可以写抽象方法，但是一旦有抽象方法，枚举项就必须实现
	
	枚举类的常见的方法？
		public String toString()
		public final int compareTo(E o)
		public final String name()
		public final int ordinal()
		public static <T extends Enum<T>> T valueOf(Class<T> enumType,String name)
		public static com._enum.Week[] values()
        public static com._enum.Week valueOf(java.lang.String)
~~~

### 反射

~~~
什么是反射？
	正射：
		1.创建对象
		2.调用属性和方法
	
	反射：
		1.创建属性和方法
		2.将属性和方法赋予给某个对象

反射的作用？
	1.降级耦合性(解耦)
	2.可以结合配置文件，创建未知类的对象






~~~









