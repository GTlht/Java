### 多线程

~~~
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
       		同步锁机制来解决问题
       		
       		1.同步代码块
       			格式：
       				synchronized(锁对象) {
       					
       				}
       			
       			注意：锁对象可以是任意对象，但是要保证所有的线程共用同一把锁对象
       		
       		2.同步方法
       			格式：
       				修饰符 synchronized 返回值类型 方法名(参数列表) {
       					xxxooo;
       					return 返回值;
       				}
       			
       			同步方法的锁对象是什么？
       				this
       		
       		3.静态同步方法
       			格式：
       				修饰符 static synchornized 返回值类型 方法名(参数列表) {
       					xxxooo;
       					return 返回值;
       				}
       				
       			静态同步方法的锁对象是什么？
       				字节码文件对象
       		
       		4.Lock锁
       			ReentrantLock lock = new ReentrantLock();
       			lock.lock();
       			lock.unlock();
       			
等待唤醒机制？
	目的：为了解决生产者和消费者的问题
	
	Object类：
		public final void wait()：在其他线程调用此对象的 notify() 方法或 notifyAll() 方法前，导致当前线程等待
		public final void notify()：唤醒在此对象监视器上等待的单个线程
		public final void notifyAll()：唤醒在此对象监视器上等待的所有线程
		
	例子：
		public class Demo03 {
            public static void main(String[] args) {
                Print1 p = new Print1();

                //创建一个线程
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        while(true) {
                            p.print1();
                        }
                    }
                }).start();

                //创建一个线程
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        while(true) {
                            p.print2();
                        }
                    }
                }).start();
            }
        }

        class Print1 {
            private Object obj = new Object();
            private boolean flag = false;

            public void print1() {
                synchronized(obj) {
                    if(!flag) {
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }

                    System.out.print("约");
                    System.out.print("吗");
                    System.out.println();

                    flag = false;
                    obj.notify();
                }
            }

            public void print2() {
                synchronized(obj) {
                    if(flag) {
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }

                    System.out.print("滚");
                    System.out.print("犊");
                    System.out.print("子");
                    System.out.println();

                    flag = true;
                    obj.notify();
                }
            }
        }
        
	wait()和sleep()的区别？
		1.
			wait()是Object类中的普通方法
			sleep()是Thread类中的静态方法
			
		2.
			wait()是需要被唤醒的
			sleep()是时间到了自己醒了
			
		3.
			wait()在等待的时候，是需要释放锁对象的
			sleep()在睡觉的时候，是不会释放锁对象的
			
死锁？
	哲学家的故事
	
	例子：
		public class Demo06 {
            public static void main(String[] args) {
                String s1 = "左筷子";
                String s2 = "右筷子";

                new Thread("哲学家A") {
                    public void run() {
                        while(true) {
                            synchronized(s1) {
                                System.out.println(getName() + "拿到了" + s1 + ",等待" + s2);
                                synchronized(s2) {
                                    System.out.println(getName() + "拿到了" + s2 + ",开吃");
                                }
                            }
                        }
                    }
                }.start();

                new Thread("哲学家B") {
                    public void run() {
                        while(true) {
                            synchronized(s2) {
                                System.out.println(getName() + "拿到了" + s2 + ",等待" + s1);
                                synchronized(s1) {
                                    System.out.println(getName() + "拿到了" + s1 + ",开吃");
                                }
                            }
                        }
                    }
                }.start();
            }
        }
	
Java中线程安全的类？
	1.ArrayList和Vector
		ArrayList是线程不安全，效率高
		Vector是线程安全的，效率低
		
	2.StringBuilder和StringBuffer
		StringBuilder是线程不安全的，效率高
		StringBuffer是线程安全的，效率低
	
	3.HashMap和Hashtable
		HashMap是线程不安全的，效率高
		Hashtable是线程安全的，效率低
~~~

