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

反射的相关方法？
	1.获取字节码文件对象
		方式一：类名.class
			Class clazz1 = Person.class;
			
		方式二：对象.getClass()
			Person p = new Person();
			Class clazz2 = p.getClass();
		
		方式三：Class.forName("包名 + 类名")
			Class clazz3 = Class.forName("com.reflect.Person");
			
		推荐使用方式三
		
		Class类：
			public T newInstance()：通过空参构造方法来创建对象
	
	2.获取构造方法对象
		获取构造方法对象的目的：为了创建对象
		
		Class类：
			public Constructor<T> getConstructor(Class<?>... parameterTypes)： 返回一个 Constructor 对象，只能获取公共的构造方法对象
			public Constructor<T> getDeclaredConstructor(Class<?>... parameterTypes)： 返回一个 Constructor 对象，能够获取所有访问权限修饰符所修饰的构造方法对象
			public Constructor<?>[] getConstructors()：返回一个包含某些 Constructor 对象的数组
			public Constructor<?>[] getDeclaredConstructors()：返回一个包含某些 Constructor 对象的数组
			
		Constructor类：
			public T newInstance(Object... initargs)：使用此 Constructor 对象表示的构造方法来创建该构造方法的声明类的新实例，并用指定的初始化参数初始化该实例
			public void setAccessible(boolean flag)：将此对象的 accessible 标志设置为指示的布尔值。值为 true 则指示反射的对象在使用时应该取消 Java 语言访问检查
	
	3.获取成员变量对象
		获取成员变量对象的目的：为了给对象的属性赋值
		
		Class类：
			public Field getField(String name)：返回一个 Field 对象
			public Field getDeclaredField(String name)：返回一个 Field 对象
			public Field[] getFields()：返回一个包含某些 Field 对象的数组
			public Field[] getDeclaredFields()：返回一个包含某些 Field 对象的数组
	
		Field类：
			public void set(Object obj,Object value)：给某个对象设置什么值
			public Object get(Object obj)：获取某个对象的该属性值
			public void setAccessible(boolean flag)：将此对象的 accessible 标志设置为指示的布尔值。值为 true 则指示反射的对象在使用时应该取消 Java 语言访问检查
		
	4.获取成员方法对象
		获取成员方法对象的目的：为了调用某个类的方法
		
		Class类：
			public Method getMethod(String name,Class<?>... parameterTypes)：返回一个 Method 对象
			public Method getDeclaredMethod(String name,Class<?>... parameterTypes)：返回一个 Method 对象
			public Field[] getMethods()：返回 Field 对象的一个数组
			public Field[] getDeclaredMethods()：返回 Field 对象的一个数组
			
		Method类：
			public Object invoke(Object obj,Object... args)：对带有指定参数的指定对象调用由此 Method 对象表示的底层方法
			public void setAccessible(boolean flag)：将此对象的 accessible 标志设置为指示的布尔值。值为 true 则指示反射的对象在使用时应该取消 Java 语言访问检查
		
练习题？
	题一：已知有一个ArrayList集合，泛型为String，要求通过反射技术，可以实现向集合中存储Integer类型的数据？
		public class Demo06 {
            public static void main(String[] args) throws Exception {
                //创建容器
                ArrayList<String> al = new ArrayList<>();

                //添加元素
                al.add("aaa");
                al.add("bbb");
                al.add("ccc");

                System.out.println(al);

                //获取字节码文件对象
                Class clazz = al.getClass();

                //获取add方法名的成员方法对象
                Method addMethod = clazz.getMethod("add", Object.class);

                //调用该方法
                addMethod.invoke(al, 11);
                addMethod.invoke(al, 22);
                addMethod.invoke(al, 33);
                addMethod.invoke(al, true);

                System.out.println(al);

                for (Object obj : al) {
                    System.out.println(obj);
                }
            }
        }
	
	题二：模拟框架，通过反射技术来实现我们可以随意的指定某个类和某个方法(空参),就可以执行该类中的方法？
		public class Demo07 {
            public static void main(String[] args) throws Exception {
                //加载配置文件
                Properties p = new Properties();
                p.load(Demo07.class.getClassLoader().getResourceAsStream("aaa.properties"));

                //获取数据
                String className = p.getProperty("className");
                String methodName = p.getProperty("methodName");

                //获取字节码文件对象
                Class clazz = Class.forName(className);

                //获取对象
                Object obj = clazz.newInstance();

                //获取成员方法对象
                Method method = clazz.getMethod(methodName);

                //调用该对象的该方法
                method.invoke(obj);
            }
        }

        class A {
            public void printA() {
                System.out.println("约吗");
            }

            public void print() {
                System.out.println("在吗");
            }
        }

        class B {
            public void printB() {
                System.out.println("滚犊子");
            }

            public void print() {
                System.out.println("臭不要脸");
            }
        }
			
~~~

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
	
~~~









