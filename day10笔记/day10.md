### 代码块

~~~
什么是代码块？
	由一对花括号括起来的就称为代码块 {}
	
代码块的分类？
	局部代码块
	构造代码块
	静态代码块
	同步代码块(以后学)
	
局部代码块？
	什么是局部代码块？
		定义在方法中的代码块就称为局部代码块
		public void print() {
			{
			
			}
		}
	
	局部代码块的作用？
		为了更早让局部变量在内存中消失，节省内存空间
		
构造代码块？
	什么是构造代码块？
		定义在类中，方法外的代码块，就称为构造代码块
		
		class Demo {
			{
			
			}
		}
	
	构造代码块的作用？
		当构造方法被调用，构造代码块就一定会被执行，而且是优先于构造方法执行
		可以多个构造方法中的共性代码进行抽取，放入到构造代码块中，提高了复用性，一劳永逸

静态代码块？
	什么是静态代码块？
		在构造代码块前面加上static关键字就变成了静态代码块
	
		class Demo {
			static {
			
			}
		}
	
	静态代码块的作用？
		当第一次.class文件加载进方法区的时候，会执行一次，之后就不会再执行了
		当有些数据，只需要初始化一次的时候，就可以将它们放在静态代码块中，静态代码块就是为了给数据进行初始化
		
考试题？
	class Fu {
		static {
			System.out.println("fu...静态代码块...");
		}
		
		{
			System.out.println("fu...构造代码块...");
		}
		
		public Fu() {
			System.out.println("fu...构造方法...");
		}
	}
	
	class Zi extends Fu {
		static {
			System.out.println("zi...静态代码块...");
		}
		
		{
			System.out.println("zi...构造代码块...");
		}
		
		public Zi() {
			System.out.println("zi...构造方法...");
		}
	}
	
	class Demo {
		public static void main(String[] args) {
			Zi zi = new Zi();
		}
	}
	
	答案：
		fu...静态代码块...
        zi...静态代码块...
        fu...构造代码块...
        fu...构造方法...
        zi...构造代码块...
        zi...构造方法...
~~~

### 抽象类

~~~
什么是抽象类？
	有抽象方法的类就称为抽象类
	
	什么是抽象方法？
		没有方法体的方法就称为抽象方法
	
抽象类的特点？
	1.抽象类和抽象方法都必须由abstract关键字所修饰
		abstract class Person {
			public abstract void eat();
		}
	
	2.有抽象方法的类一定是抽象类，但是抽象类不一定有抽象方法
	3.抽象类不可以创建对象
	4.一个类想要继承抽象类：
		a.该类本身也是一个抽象类，就可以不用重写抽象方法
		b.该类是一个普通类，就必须重写所有的抽象方法

抽象类的成员特点？
	1.成员变量
		抽象类中可以有非静态的成员变量
		抽象类中可以有静态的成员变量
		抽象类中可以有被final修饰自定义的常量
		
	2.成员方法
		抽象类中可以抽象方法
		抽象类中可以有非抽象方法
	
	3.构造方法
		抽象类中有构造方法，但是不能创建对象
		有构造方法的目的是给父类中的成员变量初始化，提供给子类使用

abstract关键字不能和哪些关键字共存？
	1.不能跟static关键字共存，因为被static所修饰的方法可以通过类名直接调用，同时如果被abstract所修饰的话，该方法又没有方法体，类名调用一个没有方法体的方法没有任何意义
	2.不能跟final关键字共存，被final所修饰的方法不能被子类重写，但是同时被abstract所修饰的方法必须要求子类重写，它们两个冲突
	3.不能跟private关键字共存，被private所修饰的方法不能被子类重写，但是同时被abstract所修饰的方法必须要求子类重写，它们两个冲突
	
我们什么时候可以使用抽象类？
	当父类中的方法强制子类必须具备，就可以将该方法定义为抽象方法，子类就必须重写
	
	abstract class Animal {
        public abstract void eat();
    }

    class Dog extends Animal {
        public void eat() {
            System.out.println("吃骨头");
        }
    }

    class Cat extends Animal {
        public void eat() {
            System.out.println("吃鱼");
        }
    }
~~~

### 接口

~~~
什么是接口？
	比抽象类更加抽象的表现形式，就是接口
	
接口的定义格式？
	定义接口要用关键字interface
	
	interface 接口名 {
	
	}
	
接口的使用格式？
	interface Inter {
	
	}
	
	class InterImpl implements Inter {
	
	}
	
接口的特点？
	1.接口不能创建对象
	2.如果一个类想要实现一个接口：
		a.该类是一个抽象类，就可以不用重写接口中的抽象方法
		b.该类是一个普通类，就必须重写接口中的所有的抽象方法

接口的成员特点？
	1.成员变量
		接口中所有的成员变量都是自定义常量
		默认修饰符：public static final
		
		//int i = 1;
        //final int i = 1;
        //static final int i = 1;
        public static final int i = 1;
	
	2.成员方法
		接口中所有的成员方法都是抽象方法(这句话并不完全准确)
		默认修饰符：public abstract 
	
		//void eat();
		//public void eat();
		//abstract void eat();
		public abstract void eat();
		
	3.构造方法
		没有构造方法

类与类之间，类与接口之间，接口与接口之间的关系？
	1.类与类之间是继承关系，支持单继承，不可以多继承，可以多层继承，不可以循环继承
	
	2.类与接口之间是实现关系，可以单实现，也可以多实现，而且可以在多实现接口的同时继承其他的类

	3.接口与接口之间是继承关系，可以单继承，也可以多继承

我们什么时候使用接口？
	接口是额外扩展的功能，本身一些类不具备这些功能，要想具备这些功能就需要去实现具备这些功能的接口
	
	例子：
		abstract class Animal {
			public abstract void eat();
		}
		
		class Dog extends Animal {
			public void eat() {
				System.out.println("吃骨头");
			}
			
			public void swimming() {
				System.out.println("狗刨");
			}
		}
		
		class Cat extends Animal {
			public void eat() {
				System.out.println("吃鱼");
			}
		}
		
		class Pig extends Animal implements Swim, Aircraft {
			public void eat() {
				System.out.println("吃肉");
			}
			
			public void swimming() {
				System.out.println("浮泳");
			}
			
			public void fly() {
				System.out.println("横向飞");
			}
		}
		
		interface Swim {
			public abstract void swimming();
		}

		interface Aircraft {
			public abstract void fly();
		}
~~~

### 包

~~~
什么是包？
	包就是指文件夹
	
怎么创建包？
	com.work
	com.xxx
	
	文件夹名.文件夹名
	
包的命名规则？
	公司域名倒着写，去掉www
	
	www.woniuxy.com
	
	com.woniuxy.aaa
	com.woniuxy.bbb
	
	注意：包名都是小写的
	
导包？
	格式：import 包名.包名.类名
	
	为什么要导包？
		import java.util.Scanner;
		因为两个类不在同一个文件夹下
		
		com.aaa:
			A类
				import com.bbb.B;
		com.bbb:
			B类
~~~

### 访问权限修饰符

~~~
访问权限修饰符的分类？
	public      公共的
	protected   受保护的
	默认的
	private     私有的

			 同类中	同包不同类有继承	同包不同类无继承	不同包不同类有继承	不同包不同类无继承
public		 true		   true				true			  true				true
protected    true		   true				true			  true				false
默认的        true			 true			  true				false			  false
private      true		   false			false			  false				false

以后都该使用哪些访问权限修饰符？
	类：一般都是用public，而且一个Java文件只能写一个类
	成员变量：一般都是用private，封装
	成员方法：一般都是用public修饰，少数的用protected
	构造方法：一般都是用public修饰
~~~

### 内部类

~~~
什么是内部类？
	将一个类定义在另一个类的里面，里面的类就称为内部类
	
内部类的特点？
	内部类可以直接使用外部类中的成员，包括私有的
	外部类不能直接使用内部类中的成员

内部类的分类？
	1.成员内部类
		什么是成员内部类？
			定义在类中，方法外的内部类
			
			class Outer {
				class Inner {
				
				}
			}
			
		成员内部类的几种分类？
			a.public/protected/默认：
				class Outer {
                    class Inner {
						int i = 1;
						public void print() {
							System.out.println("约吗");
						}
                    }
                }
                
                class Demo {
                	public static void main(String[] args) {
                		Outer.Inner oi = new Outer().new Inner();
                        System.out.println(oi.i);
                        oi.print();
                	}
                }
			
			b.static：
				class Outer {
                    static class Inner {
						int i = 2;
						public void print() {
							System.out.println("在吗");
						}
                    }
                }
                
                class Demo {
                	public static void main(String[] args) {
                		Outer.Inner oi = new Outer.Inner();
                        System.out.println(oi.i);
                        oi.print();
                        
                        //注意：要导包import com.inner.Outer2.Inner2;
                        Inner2 inner = new Inner2();
                        System.out.println(inner.i);
                        inner.print();
                	}
                }
			
			c.private：
				class Outer {
                    private class Inner {
						int i = 2;
						public void print() {
							System.out.println("在吗");
						}
                    }
					
					 public void show() {
                        Inner inner = new Inner();
                        System.out.println(inner.i);
                        inner.print();
                    }
                }
                
                class Demo {
                	public static void main(String[] args) {
                		Outer outer = new Outer();
                		outer.show();
                	}
                }
	
	2.局部内部类
		什么是局部内部类？
			定义在方法中的内部类
			
			class Outer {
				public void print() {
					class Inner {
					
					}
				}
			}
			
		局部内部类的使用？
			class Outer {
				public void print() {
					class Inner {
						int i = 3;
						public void show() {
							System.out.println("滚犊子");
						}
					}
					
					Inner inner = new Inner();
					System.out.println(inner.i);
					inner.show();
				}
			}
			
			class Demo {
				public static void main(String[] args) {
					Outer outer = new Outer();
					outer.print();
				}
			}
~~~

### 匿名内部类

~~~
什么是匿名内部类？
	没有名字的局部内部类，它的本质是对象，所以也叫做匿名子类对象
	
匿名内部类的定义格式？
	new 类名/接口名() {
		//重写的方法；
		//自定义的方法；
	};
	
练习题？
	题一：接口中的方法是无参无返回值
		public class Demo09 {
            public static void main(String[] args) {
                Inter inter = new Inter() {
                    public void print() {
                        System.out.println("约吗");
                    }
                };
                inter.print();
            }
        }

        interface Inter {
            public void print();
        }
	
	题二：接口中的方法是无参有返回值
		public class Demo10 {
            public static void main(String[] args) {
                Inter inter = new Inter() {
                    public String print() {
                        return "约吗";
                    }
                };
                /*String s = inter.print();
                System.out.println(s);*/
                System.out.println(inter.print());
            }
        }

        interface Inter {
            public String print();
        }
	
	题三：接口中的方法是有参无返回值
		public class Demo11 {
            public static void main(String[] args) {
                Inter inter = new Inter() {
                    public void print(int i) {
                        System.out.println("约吗" + i);
                    }
                };
                inter.print(12);
            }
        }

        interface Inter {
            public void print(int i);
        }
	
	题四：接口中的方法是有参有返回值
		public class Demo12 {
            public static void main(String[] args) {
                Inter inter = new Inter() {
                    public String print(int i) {
                        return i + "约吗";
                    }
                };
                String s = inter.print(1);
                System.out.println(s);
            }
        }

        interface Inter {
            public String print(int i);
        }
	
	题五：接口作为方法的形参
		public class Demo13 {
            public static void main(String[] args) {
                show(new Inter() {
                    public void print() {
                        System.out.println("约吗");
                    }
                });
            }

            public static void show(Inter inter) {
                inter.print();
            }
        }

        interface Inter {
            public void print();
        }
		
	题六：接口作为方法的返回值
		public class Demo14 {
            public static void main(String[] args) {
                Inter inter = show();
                inter.print();
            }

            public static Inter show() {
                return new Inter() {
                    public void print() {
                        System.out.println("约吗");
                    }
                };
            }
        }

        interface Inter {
            public void print();
        }
        
    题七：
    	class Demo {
    		public static void main(String[] args) {
    			//补充代码，要求能够调用A中的show方法和Inter中print方法，最终在控制台上打印出“约吗”
    			new A() {
                    public void show(Inter inter) {
                        inter.print();
                    }
                }.show(new Inter() {
                    public void print() {
                        System.out.println("约吗");
                    }
                });
    		}
    	}
    	
		abstract class A {
			public abstract void show(Inter inter);
		}
		
		interface Inter {
			public void print();
		}

	题八：
		class Demo {
			public static void main(String[] args) {
				Tools.getInstance().print();
			}
		}
		interface Inter {
			public void print();
		}
		
		补全代码，运行程序可以在控制台上打印出"约吗"
		class Tools {
            public static Inter getInstance() {
                return new Inter() {
                    public void print() {
                        System.out.println("约吗");
                    }
                };
            }
        }
~~~

