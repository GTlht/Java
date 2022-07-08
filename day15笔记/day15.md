### 异常

~~~
什么是异常？
	异常就是指错误，有问题
	
异常的体系结构？
	Throwable 异常的老大，Throwable 类是 Java 语言中所有错误或异常的超类
		-- Error
			严重的错误，比如说语法格式错误，内存溢出，类找不到等都是严重的问题
			
		-- Exception
			不算严重的错误，比如说我们之前遇到的各种异常
			-- 非RuntimeException(编译时期异常)
			   ParseException
			   IOException
			-- RuntimeException(运行时期异常)
				-- NullPointerException
				-- ClassCastException
				-- IndexOutOfBoundsException
					-- ArrayIndexOutOfBoundsException
					-- StringIndexOutOfBoundsException
					
异常的处理？
	注意：异常的处理主要是针对编译时期异常，但是也可以处理运行时期异常
	
	处理方式一：捕获
		格式：
			try {
				//发生问题的代码
			} catch(异常类名 变量名) {
				//异常处理方案
			} finally {
				//资源的释放
			}
			
			--------------------------------
			try {
				//发生问题的代码
			} catch(异常类名 变量名) {
				//异常处理方案
			}
			
			--------------------------------
			try {
				//发生问题的代码
			} finally {
				//资源的释放
			}
	
	处理方式二：抛
		1.被动抛
			格式：
				修饰符 返回值类型 方法名(参数列表) throws 异常类名 {
					方法体内容
				}
			
			注意事项？
				1.哪里调用抛哪里
				2.如果抛的是编译时期异常的话，哪里调用抛里，接收的地方还是要继续处理(要么抛要么捕获)，
				  如果抛的是运行时期异常的话，哪里调用抛哪里，接收的地方是不需要处理的。
				3.在子父类继承中，子类重写父类的方法，如果父类的方法没有抛异常，子类的方法也不能抛异常。
				  如果父类方法也抛异常了，子类重写的方法所抛的异常不可以是父类方法所抛异常的父类
		
		2.主动抛
			格式：throw 异常对象
			位置：写在方法的里面
			
自定义异常类？
	public class MyException extends RuntimeException {
        public MyException() {}


        public MyException(String message) {
            super(message);
        }
    }
~~~

