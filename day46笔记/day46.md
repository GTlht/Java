### 注解

~~~
什么是注解？
	注解（Annotation），也叫元数据。一种代码级别的说明。它是JDK1.5及以后版本引入的一个特性，与类、接口、枚举是在同一个层次。它可以声明在包、类、字段、方法、局部变量、方法参数等的前面，用来对这些元素进行说明，注释。
	
	注解就是用来解释说明的
	
	注释：用来解释说明的，是给程序员看的
	注解：用来解释说明的，是程序看的
	
注解的作用？
	①编写文档：通过代码里标识的注解生成文档【生成文档doc文档】
	②代码分析：通过代码里标识的注解对代码进行分析【使用反射】
	③编译检查：通过代码里标识的注解让编译器能够实现基本的编译检查【Override】

注解的书写位置？
	位置一：写在类名的上面
		@注解
		class Demo {
		
		}
		
	位置二：写在成员变量的上面
		class Demo {
			@注解
			String name;
		}
	
	位置三：写在方法的上面
		class Demo {
			@注解
			public void show() {
			
			}
		}
	
	位置四：写在形参的前面
		class Demo {
			public void show(@注解 int i, @注解 int j) {
			
			}
		}

注解的分类？
	预定义注解？
		Java中自带的注解
		
		@Override：它的作用是对覆盖超类中方法的方法进行标记，如果被标记的方法并没有实际覆盖超类中的方法，则编译器会发出错误警告
		@Deprecated：已过时
		@SuppressWarnings：压制警告
			注意：一般参数值都为"all"，代表压制所有警告
			@SuppressWarnings("all")
	
	自定义注解？
		我们自己写的注解
		
		自定义注解的格式？
			@元注解
			修饰符 @interface 注解的名字 {
				xxxooo;
			}
			
		注解的本质？
			public interface com.annotation.MyAnno1 extends         	
			java.lang.annotation.Annotation {
			
			}
			
			注解的本质就是默认继承了Annotation接口的接口
			
		注解的属性？
			什么是属性？
				注解的属性就是接口中的抽象方法
				
			属性的定义格式？
				数据类型 属性名();
				  int    aaa();
				  
				注意：注解中的属性的数据类型只能是以下几种数据类型？
					基本数据类型
					String
					枚举
					注解
					以上几种数据类型的数组类型
			
			属性的书写？
				public @interface MyAnno2 {
                    int aaa();
                    String bbb();
                    MyEnum ccc();
                    MyAnno1 ddd();
                    String[] eee();
                }
                
            属性的使用？
            	使用格式：@注解名(属性名=属性值,属性名=属性值,......)
            	
            	public @interface MyAnno2 {
                    int aaa();
                    String bbb();
                    MyEnum ccc();
                    MyAnno1 ddd();
                    String[] eee();
                }
            	
            	//@MyAnno2(aaa=18)
                //@MyAnno2(bbb="tom")
                //@MyAnno2(ccc=MyEnum.E1)
                //@MyAnno2(ddd=@MyAnno1)
                //@MyAnno2(eee="tom")
                //@MyAnno2(eee= {"tom"})
                //@MyAnno2(eee= {"tom","jerry","rose"})
                @MyAnno2(aaa=18, bbb="tom", ccc=MyEnum.E2, ddd=@MyAnno1, eee= {"tom","jerry"})
                public class Demo04 {

                }
                
           	我们在使用属性的时候需要注意哪些问题？
           		1.如果属性有多个的话，我们每个属性都需要赋值，属性与属性之间要用逗号隔开
           		2.属性可以用default关键字来声明，用来给属性赋予默认的初始化值，如果属性有默认的初始化的话，我们在使用属性的时候是不需要给属性赋值的，也可以给赋值。
           		3.如果一个注解中的属性有且只有一个的话，并且该属性的名字叫做value的时候，我们在使用注解的时候，是可以不用写属性名，直接写属性值。
           	
元注解？
	什么是元注解？
		可以标注注解的注解就称为元注解
		
	常见的元注解？
		@Target：规定被它所标注的注解可以标注在哪些位置
			属性：ElementType[] value();
			取值：
				ElementType.TYPE：只能标注在类的上面
				ElementType.FIELD：只能标注在变量的上面
				ElementType.METHOD：只能标注在方法的上面
				
		@Retention：规定被它所标注的注解的生存时长
			属性：RetentionPolicy value();
			取值：
				RetentionPolicy.SOURCE：此类型会被编译器丢弃
				RetentionPolicy.CLASS：此类型注解会保留在class文件中，但JVM会忽略它
				RetentionPolicy.RUNTIME： 此类型注解会保留在class文件中，JVM会读取它
		
		@Documented：规定被它所标注的注解是否能够存在于帮助文档中
		@Inherited：贵定被它所标注的注解可以被子类继承
		
注解的解析？
	什么是注解的解析？
		是指通过反射技术，来获取注解中的属性值，这些数据可以应用程序中
		
		注意：想要实现注解的解析，该注解必须加上元注解@Retention(RetentionPolicy.RUNTIME)
		
	注解的解析？
		1.注解在类的上面
			public class Demo10 {
                public static void main(String[] args) throws Exception {
                    //获取字节码文件对象
                    Class clazz = Class.forName("com.annotation.A");

                    //获取注解对象
                    //Annotation annotation = clazz.getAnnotation(A_anno.class);
                    A_anno a_anno = (A_anno)clazz.getAnnotation(A_anno.class);

                    //获取属性值
                    String name = a_anno.name();
                    int age = a_anno.age();

                    System.out.println(name + "..." + age);
                }
            }

            @Retention(RetentionPolicy.RUNTIME)
            @interface A_anno {
                String name();
                int age();
            }

            @A_anno(name="tom",age=18)
            class A {

            }
		
		2.注解在变量的上面
			public class Demo11 {
                public static void main(String[] args) throws Exception {
                    //获取字节码文件对象
                    Class clazz = Class.forName("com.annotation.B");

                    //获取成员变量的对象
                    Field iField = clazz.getDeclaredField("i");

                    //获取注解对象
                    B_anno b_anno = iField.getAnnotation(B_anno.class);

                    //获取属性值
                    String name = b_anno.name();
                    int age = b_anno.age();

                    System.out.println(name + "..." + age);
                }
            }

            @Retention(RetentionPolicy.RUNTIME)
            @interface B_anno {
                String name();
                int age();
            }

            class B {
                @B_anno(name="jerry",age=19)
                int i;
            }
            
		3.注解在方法的上面
			public class Demo12 {
                public static void main(String[] args) throws Exception {
                    //获取字节码文件对象
                    Class clazz = Class.forName("com.annotation.C");

                    //获取成员方法对象
                    Method showMethod = clazz.getMethod("show");

                    //获取注解对象
                    C_anno c_anno = showMethod.getAnnotation(C_anno.class);

                    //获取属性值
                    String name = c_anno.name();
                    int age = c_anno.age();

                    System.out.println(name + "..." + age);
                }
            }

            @Retention(RetentionPolicy.RUNTIME)
            @interface C_anno {
                String name();
                int age();
            }

            class C {
                @C_anno(name="rose",age=16)
                public void show() {

                }
            }
~~~

### Lambda表达式

~~~
回顾匿名内部类？
	1.接口中抽象方法无参无返回值
		public class Demo01 {
            public static void main(String[] args) {
                A a = new A() {
                    public void show() {
                        System.out.println("约吗");
                    }
                };
                a.show();
            }
        }

        interface A {
            public void show();
        }
        
	2.接口中抽象方法有参无返回值
		public class Demo02 {
            public static void main(String[] args) {
                B b = new B() {
                    public void show(int i) {
                        System.out.println(i);
                    }
                };
                b.show(12);
            }
        }

        interface B {
            public void show(int i);
        }
	
	3.接口中抽象方法无参有返回值
		public class Demo03 {
            public static void main(String[] args) {
                C c = new C() {
                    public String show() {
                        return "约吗";
                    }
                };
                System.out.println(c.show());
            }
        }

        interface C {
            public String show();
        }
	
	4.接口中抽象方法有参有返回值
		public class Demo04 {
            public static void main(String[] args) {
                D d = new D() {
                    public String show(int i) {
                        return i + "约吗";
                    }
                };

                System.out.println(d.show(12));
            }
        }

        interface D {
            public String show(int i);
        }

	5.接口作为方法的形参
		public class Demo05 {
            public static void main(String[] args) {
                print(new E() {
                    public void show() {
                        System.out.println("约吗");
                    }
                });
            }

            public static void print(E e) {
                e.show();
            }
        }

        interface E {
            public void show();
        }
        
	6.接口作为方法的返回值
		public class Demo06 {
            public static void main(String[] args) {
                F f = print();
                f.show();
            }

            public static F print() {
                return new F() {
                    public void show() {
                        System.out.println("约吗");
                    }
                };
            }
        }

        interface F {
            public void show();
        }

什么是lambda表达式？
	lambda表达式是一个基于函数式编程思想的用来替代匿名内部类的新特性
	
	什么是函数式编程思想？
		面向对象编程思想重点强调的是通过对象的形式去做一些事情
		函数式编程思想重点强调的是做什么事情，而不是通过什么形式去做
	
		匿名内部类重点关注的是对象
		lambda表达式重点关注的是做什么事情
		
	注意：想要学好lambda表达式，一定要先学好匿名内部类

lambda表达式的入门小案例？
	1.未使用lambda表达式
		public class Demo07 {
            public static void main(String[] args) {
                MyRunnable mr = new MyRunnable();
                Thread t = new Thread(mr);
                t.start();
            }
        }

        class MyRunnable implements Runnable {
            @Override
            public void run() {
                System.out.println("约吗");
            }
        }
        
        --------------------------------------------------
        
        public class Demo08 {
            public static void main(String[] args) {
                new Thread(new Runnable() {
                    public void run() {
                        System.out.println("约吗");
                    }
                }).start();
            }
        }
	
	2.使用lambda表达式
		public class Demo09 {
            public static void main(String[] args) {
                new Thread(() -> {System.out.println("约吗");}).start();
            }
        }
        
lambda表达式的定义格式？
	格式：(形式参数) -> {代码块}
	
	说明：
		(形式参数)：表示匿名内部类中重写的方法的参数列表
		-> 固定格式，指向要做的事情
		{代码块}：表示匿名内部类中重写的方法中的方法体内容

练习题？
	1.接口中抽象方法无参无返回值
		public class Demo10 {
            public static void main(String[] args) {
                A a = () -> {System.out.println("约吗");};
                a.show();
            }
        }

        interface A {
            public void show();
        }

	2.接口中抽象方法有参无返回值
		public class Demo11 {
            public static void main(String[] args) {
                B b = (int i) -> {System.out.println(i);};
                b.show(12);
            }
        }

        interface B {
            public void show(int i);
        }

	3.接口中抽象方法无参有返回值
		public class Demo12 {
            public static void main(String[] args) {
                C c = () -> {return "约吗";};
                System.out.println(c.show());
            }
        }

        interface C {
            public String show();
        }

	4.接口中抽象方法有参有返回值
		public class Demo13 {
            public static void main(String[] args) {
                D d = (int i) -> {return i + "约吗";};
                System.out.println(d.show(12));
            }
        }

        interface D {
            public String show(int i);
        }

	5.接口作为方法的形参
		public class Demo14 {
            public static void main(String[] args) {
                print(() -> {System.out.println("约吗");});
            }

            public static void print(E e) {
                e.show();
            }
        }

        interface E {
            public void show();
        }
        
	6.接口作为方法的返回值
		public class Demo15 {
            public static void main(String[] args) {
                F f = print();
                f.show();
            }

            public static F print() {
                return () -> {System.out.println("约吗");};
            }
        }

        interface F {
            public void show();
        }
~~~

