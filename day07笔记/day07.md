### 面向对象

~~~
常识？
	Java语言是一门面向对象的语言
	C语言是一门面向过程的语言
	
什么是面向过程什么是面向对象？
	什么是面向过程思想？
		是指重点强调的是过程
	什么是面向对象思想？
		是指重点强调的是对象
	
	举例子？
		旅游：
			面向过程：自己做旅游攻略(去哪些景点，每个景点收费多少，一日三餐吃什么，路线，交通，PPT)，准备换洗衣服，准备药品，各种零食....
			面向对象：找一个私人订制旅行社
			
		日常生活：
			面向过程：吃饭，做菜，买菜，清洗各种衣服，打扫卫生，拖地，买药，看病.....
			面向对象：找一个对象
		
	面向过程和面向对象有什么关系？
		面向对象是基于面向过程，是建立在面向过程基础之上
		
面向对象的好处是什么？
	1.面向对象是一种更符合我们人类思考习惯的思想
	2.面向对象可以将复杂的事情简单化
	3.面向对象可以将我们程序员从执行者变成指挥者
~~~

### 类和对象

~~~
什么是类？
	官方：类是事物的属性(外在特征)和行为(具备功能)的集合，是一个抽象的概念
	大白话：想要知道java中的类是什么，我们要先知道现实生活中的类是什么，因为java源于现实生活
		  那现实生活中的类是什么意思？
		  	通过百度百科查找，我们知道了类是指很多相似事物的综合
		  我们为什么叫做人类？
		  	因为我们有共同或者相似的特性，我们都有相似的外观，眼睛，鼻子，嘴巴，耳朵，我们也相同的功能，我们都有吃喝拉撒睡等功能。
		  	
什么是对象？
	官方：对象是类的具体的存在，体现，实例
	大白话：如果拿人类举例子，那对象就是指你，我，他每一个个体，实体，实例
	
怎么写一个类？
	定义类要用关键字class
	
	格式：
		class 类名 {
			类的属性
			类的行为
		}
		
	举例子：
		需求：写一个人类？
			class Person {
				//人类的属性(成员变量)：外在特征
				//姓名
				String name;
				//年龄
				int age;
				//血型
				String xuexing;
				//性别
				String sex;
				//星座
				String xingzuo;
				
				//人类的行为(成员方法)：具备的功能
				//吃
				public void eat() {
					System.out.println("吃饭");
				}
				//喝
				public void drink() {
					System.out.println("喝水");
				}
				//拉
				public void la() {
					System.out.println("拉");
				}
				//撒
				public void sa() {
					System.out.println("撒");
				}
				//睡
				public void sleep() {
					System.out.println("睡觉");
				}
			}
	
怎么使用一个类？
	注意：我们不能说怎么使用一个类，应该怎么使用通过类所创建的对象
	
	怎么创建对象呢？
		类名 对象名 = new 类名();
		Person p  = new Person();
		
	怎么使用对象的属性？
		对象名.属性名
		
		p.name = "tom";
		p.age = 18;
		
		System.out.println(p.name + "..." + p.age);
	
	怎么使用对象的行为？
		对象名.方法名();
		
		p.eat();
		p.drink();
~~~

### 成员变量和局部变量

~~~
什么是成员变量？
	定义在类中，方法外的变量就称为成员变量
	
	class Demo {
		int i;
		int j;
		
		public void aaa() {}
	}

什么是局部变量？
	定义在方法中，或者方法声明上的变量就称为局部变量
	
	public void aaa(int a) {
		int i = 1;
		int j = 2;
	}

成员变量和局部变量的区别？
	1.定义位置不同
		成员变量：定义在类中，方法外
		局部变量：定义在方法中或者方法的声明上
	
	2.存储位置不同
		成员变量：存储在堆中的对象中
		局部变量：存储在栈中的方法中
	
	3.初始化值不同
		成员变量：有默认的初始化值
			引用数据类型默认值为null
			byte,short,int,long默认值为0
			float,double默认值为0.0
			boolean默认值为false
			char默认值为'\u0000'
		
		局部变量：没有默认的初始化值，所以一定要先赋值再使用
	
	4.生命周期不同
		成员变量：因为是存储在对象中，所以是随着对象的存在而存在，随着对象的消失而消失
		局部变量：因为是存储在方法中，所以是随着方法的存在而存在，随着方法的消失而消失
	
	5.作用域范围不同
		成员变量：在类中的全部范围
			public class Demo06 {
                public static void main(String[] args) {
                    A a = new A();
                    a.aaa();
                    a.bbb();
                }
            }

            class A {
                int i;

                public void aaa() {
                    System.out.println(i);
                }

                public void bbb() {
                    System.out.println(i);
                }
            }
		局部变量：在所在的方法中的范围
            class A {
                public void aaa() {
                    int j = 1;
                    System.out.println(j);
                }

                public void bbb() {
                    System.out.println(j);//编译报错，因为找不到j
                }
            }
~~~

### 匿名对象

~~~
什么是匿名对象？
	没有名字的对象
	
匿名对象的定义格式？
	new 类名();
	new Person();

怎么使用属性和方法？
	new 类名().属性名
	new 类名().方法名()
	
匿名对象的特点？
	一次性
	
匿名对象有什么用？
	当我们只需要调用一次对象的属性或者方法的时候，就可以使用匿名对象
	
	注意：匿名对象可以作为实际参数进行传递
		举例子：
			public class Demo08 {
                public static void main(String[] args) {
                    /*Person p = new Person();

                    Pig pig = new Pig();
                    pig.name = "烤乳猪";

                    p.eat(pig);*/

                    new Person().eat(new Pig());
                }
            }

            class Person {
                public void eat(Pig pig) {
                    System.out.println("喜欢吃" + pig.name);
                }
            }

            class Pig {
                String name = "烤乳猪";
            }
~~~

### 封装

~~~
面向对象三大特征：封装，继承，多态

什么是封装？
	是指隐藏对象的属性和实现细节，仅对外提供公共的访问方式
	
怎么隐藏对象的属性和实现细节？
	只需要在属性的前面加上关键字private即可

怎么提供公共的访问方式？
	针对一个属性提供两个方法setXXX()和getXXX()即可
~~~

### private关键字

~~~
什么是private关键字？
	它是一个修饰符，代表私有的意思，它可以修饰成员变量和成员方法
	
private关键字的特点是什么？
	被它所修饰的成员变量和成员方法只能在本类中使用，不能在其他类中使用
	
加上private关键字之后的标准代码？
	class Person {
		private String name;
		private int age;
		
		public void setName(String n) {
			name = n;
		}
		
		public String getName() {
			return name;
		}
		
		public void setAge(int a) {
			age = a;
		}
		
		public int getAge() {
			return age;
		}
	}
~~~

