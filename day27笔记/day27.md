### 多线程

~~~
了解几个概念？
	什么是进程？
		打开一个应用程序，就打开一个进程
	
	什么是线程？
		是进程中的一条执行单元，执行路径
	
	什么是并行？
		在同一时刻，多个指令可以在多个CPU上同时执行
	
	什么是并发？
		在同一个时刻，多个指令可以在同一个CPU上交替执行
	
	举例子：360安全卫士，百度云盘，迅雷... ...

多线程的实现方式？
	方式一：继承Thread类
		实现步骤：
			1.自定义一个类，继承Thread类
			2.重写run()方法，在run()中写线程要执行的代码
			3.在main()中创建自定义类的对象
			4.调用该对象的start()即可
			
	方式二：实现Runnable接口
		实现步骤：
			1.自定义一个类，实现Runnable接口
			2.重写run()，在run()中写线程要执行的代码
			3.在main()中创建Thread类的对象，并且将自定义类的对象作为实际参数传递到构造方法中
			4.调用Thread类的对象的start()
	
	方式三：实现Callable接口
		实现步骤：
			1.自定义一个类，实现Callable接口
			2.重写call()，在call()中写线程要执行的代码
			3.在main()中创建自定义类的对象
			4.在main()中创建Futrue的子类FutureTask的对象，并且将自定义对象作为实际参数传递到其中
			5.在main()中创建Thread类的对象，将FutureTask的对象作为实际参数传递到其中
			6.调用Thread类的对象的start()
			
	三种多线程的实现方式的区别？
		实现Runnable和Callable方式？
			优点：扩展性较好，在实现接口的同时还是可以继承其他的类的
			缺点：代码较复杂，不能使用直接使用Thread类中的方法
		
		继承Thread方式？
			优点：代码简单，可以直接使用Thread类的方法
			缺点：扩展性较差，继承了Thread类就不可以继承其他的类了
			
		实现Callable方式？
			有返回值
			
Thread类中的常见方法？
	public final String getName()：返回该线程的名称
	public final void setName(String name)：改变线程名称，使之与参数 name 相同
	public static Thread currentThread()：返回对当前正在执行的线程对象的引用
	public final int getPriority()：返回线程的优先级
	public final void setPriority(int newPriority)：更改线程的优先级
		默认：5
		范围：1-10
	public final void setDaemon(boolean on)：将该线程标记为守护线程
	public static void sleep(long millis)：在指定的毫秒数内让当前正在执行的线程休眠（暂停执行）
	
线程的生命周期？
	新建状态
	就绪状态
	运行状态
	阻塞状态
	死亡状态

多线程程序中引发的线程安全问题？
	例子：售票案例
		已知电影院正在出售一个影片的票，总共有100张票，售完为止，共有3个窗口共同出售这100张票，使用多线程程序来实现该案例？
	
		public class Demo09 {
            public static void main(String[] args) {
                Ticket t = new Ticket();

                Thread t1 = new Thread(t, "窗口1");
                t1.start();

                Thread t2 = new Thread(t, "窗口2");
                t2.start();

                Thread t3 = new Thread(t, "窗口3");
                t3.start();
            }
        }

        class Ticket implements Runnable {
            private int tickets = 100;

            @Override
            public void run() {
                while(true) {
                    if(tickets > 0) {
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        System.out.println(Thread.currentThread().getName() + "...正在出售第..." + tickets + "...张票" );
                        tickets--;
                    }
                }
            }
        }
        
        通过测试，我们发现该程序存在一些小问题？
        	1.出现了相同的票数
        	2.出现了负数张票
        	
        什么时候会引发出多线程安全问题？
        	1.是不是在多线程的程序中
        	2.要有共享资源存在
        	3.操作共享资源的代码至少要有2条语句以上的时候
       
       	怎么解决多线程引发的安全问题？
       		请听下回分解
        	
        
		
~~~

