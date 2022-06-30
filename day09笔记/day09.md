### 五子棋

~~~
单机版
	*画棋盘
	落子
	判断胜负
	悔棋
	再来一局
	保存棋谱
	复盘(打谱)
	退出
	人机大战
	背景音乐
	音乐效果
	......
网络版

JavaFX技术
里面提供了一些类和方法
~~~

### 多态

~~~
什么是多态？
	多种形态
	多态是指对象在不同的时刻表现出的不同的形态
	
	举例子：
		在公园里的某一个位置有一条狗
		你对你女朋友说：你看，那条狗真好看(你看，那个动物真好看)(你看，那个生物真好看)

多态的前提条件？
	1.要有继承关系
	2.要有父类引用指向子类对象
    3.要有方法的重写(没有这一点也可以构成多态，只不过没有方法重写的多态没有任何意义)
    
多态的代码实现？
	class Fu {
		public void print() {}
	}
	class Zi extends Fu {//要有继承关系
		@Override
		public void print() {}//要有方法的重写
	}
	class Demo {
		public static void main(String[] args) {
			Fu fu = new Zi();//父类引用指向子类对象
		}
	}
	
多态间子父类继承之间成员变量的关系？
	已知父类中有一个成员变量，子类中有一个成员变量
	
	如果这两个变量的名字都不相同的话：
		class Fu {
			int i = 1;
		}
		
		class Zi extends Fu {
			int j = 2;
		}
		
		class Demo {
			public static void main(String[] args) {
				Fu fu = new Zi();
				System.out.println(fu.i);//1
				System.out.println(fu.j);//编译报错
			}
		}
		
		结论：父类引用不能使用子类中特有的成员变量
	
	如果这两个变量的名字都相同的话：
		class Fu {
			int i = 1;
		}
		
		class Zi extends Fu {
			int i = 2;
		}
		
		class Demo {
			public static void main(String[] args) {
				Fu fu = new Zi();
				System.out.println(fu.i);//1
				System.out.println(fu.i);//1
			}
		}
		
		结论：父类引用只能使用它自身带的成员变量
		
	口诀：多态调用成员变量，编译看左边，运行看左边

多态间子父类继承之间成员方法的关系？
	已知父类中有一个成员方法，子类中有一个成员方法
	
	如果这两个方法的名字都不相同的话：
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
				Fu fu = new Zi();
				fu.printFu();//fu...
				fu.printZi();//编译报错
			}
		}
		
		结论：父类引用使用子类特有的成员方法
	
	如果这两个方法的名字都相同的话：
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
				Fu fu = new Zi();
				fu.print();
				fu.print();
			}
		}
		
		结论：如果子类重写了父类的方法，父类引用可以使用子类重写的方法
	
	口诀：多态调用成员方法，编译看左边，运行看右边

多态间子父类继承之间静态成员的关系？
	静态成员变量：
		class Fu {
			static int i = 1;
		}
		
		class Zi extends Fu {
			static int i = 2;
		}
		
		class Demo {
			public static void main(String[] args) {
				Fu fu = new Zi();
				System.out.println(fu.i);//1
			}
		}
	
	静态成员方法：
		class Fu {
			public static void print() {
				System.out.println("fu...");
			}
		}
		
		class Zi extends Fu {
			public static void print() {
				System.out.println("zi...");
			}
		}
		
		class Demo {
			public static void main(String[] args) {
				Fu fu = new Zi();
				fu.print();
			}
		}
	
	口诀：只要是多态调用静态成员，编译看左边，运行看左边

多态的作用？
	提高了扩展性：父类引用作为形式参数，子类对象作为实际参数

	例子？
		public class Demo05 {
            public static void main(String[] args) {
                Dog dog = new Dog();
                Cat cat = new Cat();
                Pig pig = new Pig();
                Bird bird = new Bird();
                Panada panada = new Panada();

                Person p = new Person();
                p.feed(dog);
                p.feed(cat);
                p.feed(pig);
                p.feed(bird);
                p.feed(panada);
            }
        }

        class Animal {
            public void eat() {
                System.out.println("吃");
            }

            public void drink() {
                System.out.println("喝");
            }
        }

        class Dog extends Animal {
            public void eat() {
                System.out.println("吃骨头");
            }

            public void drink() {
                System.out.println("喝水");
            }
        }

        class Cat extends Animal {
            public void eat() {
                System.out.println("吃排骨肉");
            }

            public void drink() {
                System.out.println("喝奶");
            }
        }

        class Pig extends Animal {
            public void eat() {
                System.out.println("吃白菜");
            }

            public void drink() {
                System.out.println("喝水");
            }
        }

        class Panada extends Animal {
            public void eat() {
                System.out.println("吃竹子");
            }

            public void drink() {
                System.out.println("喝可乐");
            }
        }

        class Bird extends Animal {
            public void eat() {
                System.out.println("吃虫子");
            }

            public void drink() {
                System.out.println("喝甘露");
            }
        }

        class Person {
            /*//饲养狗
            public void feed(Dog dog) {
                dog.eat();
                dog.drink();
            }

            //饲养猫
            public void feed(Cat cat) {
                cat.eat();
                cat.drink();
            }

            //饲养猪
            public void feed(Pig pig) {
                pig.eat();
                pig.drink();
            }

            //饲养鸟
            public void feed(Bird bird) {
                bird.eat();
                bird.drink();
            }*/

            //饲养动物
            public void feed(Animal animal) {
                animal.eat();
                animal.drink();
            }
        }

多态的弊端？
	父类引用不能使用子类特有的成员
	
	怎么解决？
		向下转型
		
		向上转型：Fu fu = new Zi();
		向下转型：Zi zi = (Zi)fu;

		注意：向下转型转不好会报错(类型转换异常，ClassCastException)
~~~

### final关键字

~~~
什么是final关键字？
	它是一个修饰符，代表最终的意思，它可以修饰类，变量和方法
	
final关键字的特点？
	1.被它所修饰的类不能被继承
	2.被它所修饰的方法不能被重写
	3.被它所修饰的变量是自定义常量
		Java中常量的分类？
			字面值常量：
				整数常量
				小数常量
				字符常量
				字符串常量
				布尔常量
				空常量
					null 是专门给引用数据类型赋值
			自定义常量：
				被final修饰的变量就是自定义常量
				
		自定义常量(被final修饰的变量)的注意事项？
			赋值方式：
				1.直接赋值
					final int i = 1;
				2.构造方法赋值
					final int i;
	
                    public A() {
                        i = 3;
                    }
~~~

