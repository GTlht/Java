### this关键字

~~~
什么是this关键字？
	它代表对象的引用，哪个对象调用this所在的方法，this就代表谁
	
this有什么用？
	1.解决了同名的局部变量隐藏了成员变量的问题
	2.可以调用本类中的成员
	
加上this关键字之后的标准代码怎么写？
	class Person {
		private String name;
		private int age;
		
		public void setName(String name) {
			this.name = name;
		}
		
		public String getName() {
			return name;
		}
		
		public void setAge(int age) {
			this.age = age;
		}
		
		public int getAge() {
			return age;
		}
	}
~~~

### 构造方法

~~~
什么是构造方法？
	是指方法名字和类名相同，格式和普通方法的格式不一样的特殊的方法，就称为构造方法

构造方法的定义格式？
	修饰符 类名(形参...) {
		
	}
	
	public Person() {
	
	}

构造方法的作用？
	1.用来创建对象
	2.可以给成员变量进行默认初始化
	
构造方法的特点？
	1.构造方法的名字一定要和类名相同
		class Person {
			public Person() {}
		}

	2.构造方法没有返回值类型
	
	3.构造方法没有返回值
		构造方法有没有return关键字？
			有return关键字，用来结束方法的
			
构造方法的注意事项？
	1.当我们没有手动写构造方法的时候，系统会默认带一个空参构造方法，当我们手动写出构造方法的时候，系统默认带的空参构造方法就会消失
	2.构造方法也是方法，既然是方法就可以有方法的重载
		class Person {
			public Person() {}
			public Person(String name) {}
			public Person(int age) {}
			public Person(String name, int age) {}
		}
		
		构造方法给属性赋值和使用setXXX()给属性赋值有什么区别？
			构造方法赋值是先天的，只能赋值一次
			setXXX()赋值是后天，可以赋值N多次
			
加上构造方法之后的标准代码怎么写？
	class Person {
		private String name;
		private int age;
		
		public Person() {}
		
		public Person(String name, int age) {
			this.name = name;
			this.age = age;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
		public String getName() {
			return this.name;
		}
		
		public void setAge(int age) {
			this.age = age;
		}
		
		public int getAge() {
			return this.age;
		}
	}
~~~

### static关键字

~~~
什么是static关键字？
	它是一个修饰符，代表静态的意思，它可以修饰成员变量和成员方法
	
static关键字的特点？
	1.被它所修饰的成员是随着字节码文件(类)的加载而加载，优先于对象存在于内存中的
	2.被它所修饰的成员可以被该类下所有对象所共享
	3.被它所修饰的成员可以通过类名直接调用
	
static关键字的注意事项？
	1.被static所修饰的成员方法中不能有this关键字
	2.静态方法中只能调用静态的成员，不能调用非静态的成员
	  非静态的成员方法中可以调用静态的成员，也可以调用非静态的成员
~~~

### 继承

~~~
什么是继承？
	一个类可以使用另一个类中的成员变量和成员方法，这种关系就称为继承

继承的格式？
	class A {}
	class B extends A {}
	
	类B 继承了 类A
	类A：父类，超类，基类
	类B：子类，派生类
	
继承的好处？
	1.提高了代码的复用性
	2.让类与类之间产生了关系，而这种关系是构成多态的前提条件
	
继承的弊端？
	提高了代码的耦合性
	
	设计原则：高内聚，低耦合
	高内聚：一个人的能力越强越好
	低耦合：一个人的关系越简单越少越好
	
继承的特点？
	在java中，类只支持单继承，不可以多继承，可以多层继承，不可以循环继承
	
	*单继承：
		class Fu {
		
		}
		
		class Zi extends Fu {
		
		}
	
	多继承：
		class Fu {
		
		}
		
		class Shu {
		
		}
		
		class Zi extends Fu, Shu {//错误的，不可以多继承
		
		}
	
	*多层继承：
		class Ye {
		
		}
		
		class Fu extends Ye {
		
		}
		
		class Zi extends Fu {
		
		}
	
	循环继承：
		class Fu extends Zi {
		
		}
		
		class Zi extends Fu  {
		
		}
		
		错误的
		
继承的注意事项？
	1.子类不能继承父类中被private关键字所修饰的成员变量和成员方法
	2.子类不能继承父类的构造方法

我们什么时候可以使用继承呢？
	当两个类之间存在"is a"的关系的时候才可以使用继承
	
	举例子：
		动物类Animal
		狗类Dog
		人类Person
		
		动物类 is a 狗类  不一定
		动物类 is a 人类  不是
		狗类 is a 动物类  是
		狗类 is a 人类    不是
		人类 is a 动物类  不是
		人类 is a 狗类    不是
		
		class Animal {}
		class Dog extends Animal {}
		class Person {}
		
	注意：我们不能单单为了获取某个功能而去瞎继承某个类
		class Person extends Bird {
		
		}
		
		class Bird {
			public void fly() {
			
			}
		}
		
		错误的

在子父类继承之中成员变量的关系？
	在父类中有一个成员变量，在子类中有一个成员变量，在子类的成员方法中有一个局部变量
	
	如果这三个变量的名字都不相同的话：
		class Fu {
			int i = 1;
		}
		
		class Zi extends Fu {
			int j = 2;
			
			public void show() {
				int a = 3;
				System.out.println(i);
				System.out.println(j);
				System.out.println(a);
			}
		}
		
		class Demo {
			public static void main(String[] args) {
				Zi zi = new Zi();
				zi.show();
			}
		}
	
	如果这三个变量的名字都相同的话：
		class Fu {
			int i = 1;
		}
		
		class Zi extends Fu {
			int i = 2;
			
			public void show() {
				int i = 3;
				System.out.println(i);
				System.out.println(i);
				System.out.println(i);
			}
		}
		
		class Demo {
			public static void main(String[] args) {
				Zi zi = new Zi();
				zi.show();
			}
		}
		
		如果要想分别打印出1,2,3怎么办？
		class Fu {
            int i = 1;
        }

        class Zi extends Fu {
            int i = 2;

            public void show() {
                int i = 3;
                System.out.println(super.i);
                System.out.println(this.i);
                System.out.println(i);
            }
        }
        
        class Demo {
			public static void main(String[] args) {
				Zi zi = new Zi();
				zi.show();
			}
		}
			
在子父类继承之中构造方法的关系？
	1.子类所有的构造方法中的第一行默认都带有super();
		class Fu {
			int i;
			public Fu() {}
		}
		class Zi extends Fu {
			public Zi() {
				//super();
			}
			
			public Zi(String name) {
				//super();
			}
			
			public Zi(int age) {
				//super();
			}
		}
		class Demo {
			public static void main(String[] args) {
				Zi zi = new Zi();
				System.out.println(zi.i);//0
			}
		}
	
	2.子类中的所有构造方法中的第一行要么是super(参数)，要么是this(参数)，二者不能共存
		class Fu {}
		class Zi extends Fu {
			public Zi() {
				this("约吗");
			}
			
			public Zi(String name) {
				super();
			}
		}
	
	3.子类中所有的构造方法中至少有一个构造方法的第一行是super(参数)
		class Fu {
			int i;
		}
		
		class Zi extends Fu {
			public Zi() {
				this("tom");
			}
			
			public Zi(String name) {
				this(18);
			}
			
			public Zi(int age) {
				super();
			}
		}

在子父类继承之中成员方法的关系？
	父类中有一个成员方法，子类中有一个成员方法
	
	如果这三个变量的名字都不相同的话：
		class Fu {
			public void printFu() {
				System.out.println("fu...");
			}
		}
		
		class Zi extends Fu {
			public void printZi() {
				System.out.println("zi...");
			}
		}
		
		class Demo {
			public static void main(String[] args) {
				Zi zi = new Zi();
				zi.printFu();
				zi.printZi();
			}
		}
	
	如果这三个变量的名字都相同的话：
		class Fu {
			public void print() {
				System.out.println("fu...");
			}
		}
		
		class Zi extends Fu {
			public void print() {
				System.out.println("zi...");
			}
		}
		
		class Demo {
			public static void main(String[] args) {
				Zi zi = new Zi();
				zi.print();//zi...
				zi.print();//zi...
			}
		}
		
		这里面涉及到一个知识点，叫做方法的重写(覆盖)
		什么方法的重写(Override)？
			在子父类继承中，子类中出现了与父类方法声明完全一致的方法，就称为方法的重写(这句话不完全对)
			
		怎么子类的方法是否满足重写？
			只需要在方法的上面加上@Override
			
		重载(Overload)和重写(Override)的区别？
			重载：在同一个类中，出现了多个方法名字相同，参数列表不同的情况，就称为重载
			重写：在子父类继承中，子类中出现了与父类方法声明完全一致的方法，就称为方法的重写
			
		重写的注意事项？
			1.子类不能重写父类的私有成员方法
			2.子类重写父类的方法，要求子类方法的访问权限修饰符必须大于或者等于父类方法的访问权限修饰符
				public > protected > 默认的 > private
			3.子类重写父类的方法，子类方法的返回值类型可以和父类方法的返回值类型不一致，但是要条件，要满足子类方法的返回值类型是父类方法的返回值类型的子类
				class F {
                    protected Animal print() {
                        return new Animal();
                    }
                }

                class Z extends F {
                    @Override
                    public Dog print() {
                        return new Dog();
                    }
                }

                class Animal {}
                class Dog extends Animal {}
 			4.静态方法只能重写静态方法
 				注意：静态已经超出面向对象(封装，继承，多态)的范围
~~~

### super关键字

~~~
什么是super关键字？
	它代表父类内存空间的标记，在用法上可以当成父类对象的引用来使用，但是不能说它就是父类对象的引用

super关键字的作用？
	1.可以调用父类的构造方法
		super(参数); 调用父类的构造方法
		this(参数)
		
	2.可以调用父类的成员变量
		super.属性名
		this.属性名
	
	3.可以调用父类的成员方法
		super.方法名();
		this.方法名();

~~~

