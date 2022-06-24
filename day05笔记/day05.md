### 循环的嵌套

~~~
什么是循环的嵌套？
	循环的里面还有循环

练习题？
	需求：在控制台上打印出由*组成的矩形图案？
		*****
		*****
		*****
		*****
		
		方式一：
			System.out.println("*****");
            System.out.println("*****");
            System.out.println("*****");
            System.out.println("*****");
		
		方式二：
			for(int i = 1; i <= 4; i++) {
                System.out.println("*****");
            }
		
		方式三：
			for(int i = 1; i <= 4; i++) {
                for(int j = 1; j <= 5; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
	
		结论：外层循环控制行数，内层循环控制列数

	需求：在控制台上打印出由*组成的正直角三角形图案？
		*
		**
		***
		****
		*****
		
		方式一：
			System.out.println("*");
            System.out.println("**");
            System.out.println("***");
            System.out.println("****");
            System.out.println("*****");
            
		方式二：
			for(int i = 1; i <= 5; i++) {
                for(int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
~~~

### 数组

~~~
什么是数组？
	数组就是一个容器
	
	什么容器？
		装东西的
	
数组的作用？
	用来存储数据的，方便对数据进行管理和操作
	
数组容器的特点？
	1.数组容器一旦初始化之后，长度就固定，不可以改变
	2.数组容器中既可以存储基本数据类型的数据，也可以存储引用数据类型的数据
	3.一个数组容器中存储的数据的数据类型必须一致
  
数组容器的定义格式？
	格式一：数据类型[] 数组名 = new 数据类型[数组的长度(存储数据的个数)];
			 int[]   arr  =  new   int[5];
			 
		   数据类型 数组名[] = new 数据类型[数组的长度(存储数据的个数)];
		   	 int   arr[]  =  new   int[5];
			 
	格式二：数据类型[] 数组名 = new 数据类型[]{数据1,数据2, .......};
	         int[]   arr  =  new   int[]{1,2,3,4,5};
	
			注意：第二个中括号中不要写任何东西
	
	格式三：数据类型[] 数组名 = {数据1,数据2,.......};
			 int[]   arr  =  {1,2,3,4,5};
	
数组容器的使用？
	1.创建容器
		int[] arr = new int[5];
	
	2.向容器中装东西
		格式：数组名[索引] = 数据;
		注意：索引从0开始，最大的索引是数组的长度-1
		arr[0] = 12;
		arr[1] = 11;
		arr[2] = 13;
		arr[3] = 14;
		arr[4] = 15;
	
	3.从容器中取东西
		格式：数据类型 变量名 = 数组名字[索引];
		int a = arr[0];
		int b = arr[1];
		int c = arr[2];
		int d = arr[3];
		int e = arr[4];
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		
数组的内存？
	Java的内存分类？
		*堆
		*栈
		*方法区
		本地方法栈
		寄存器
		
	案例一：一个数组容器
		int[] arr = new int[3];
		
		arr[0] = 2;
		arr[2] = 5;
		
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
	案例二：两个数组容器
		int[] arr1 = new int[]{1,2,3};
		System.out.println(arr1);
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		arr1[1] = 4;
		arr1[2] = 5;
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		int[] arr2 = {4,5};
		System.out.println(arr2);
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		arr2[0] = 6;
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		
	案例三：一个引用两个数组容器
		int[] arr = new int[2];
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		arr[0] = 12;
		arr[1] = 13;
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		arr = new int[3];
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		arr[1] = 14;
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
	案例四：两个引用一个数组容器
		int[] arr1 = new int[2];
		System.out.println(arr1);
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		arr1[0] = 1;
		arr1[1] = 2;
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		int[] arr2 = arr1;
		System.out.println(arr2);
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		
我们在使用数组的时候，最常见的两个错误？
	1.ArrayIndexOutOfBoundsException(数组索引越界异常)
		int[] arr = {1,2};
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);//报错，越界了，因为没有2索引
	
	2.NullPointerException(空指针异常)
		int[] arr = {1,2};
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		arr = null;
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
	
数组的常见操作？
	1.遍历
		什么是数组的遍历？
			就是指挨个将数组中的元素获取打印出来
			
		//创建数组容器
		int[] arr = {11,12,13};
		
		//遍历
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		注意：arr.length是获取数组容器的长度(元素的个数)
		
	2.获取最值
		方式一：
			//创建数组容器
            int[] arr = {1,5,2,6,4};

            //获取最大值
            int max = arr[0];

            for(int i = 1; i < arr.length; i++) {
                if(max < arr[i]) {
                    max = arr[i];
                }
            }

            System.out.println(max);
            
    	方式二：
    		//创建数组容器
            int[] arr = {1,5,2,6,4};

            //获取最大值
            int max = 0;

            for(int i = 1; i < arr.length; i++) {
                if(arr[max] < arr[i]) {
                    max = i;
                }
            }

            System.out.println(arr[max]);

	3.基本查找
		键盘录入一个数字，判断该数字是否在数组中存在，如果存在则返回对应的索引，如果不存在则返回-1

		//创建数组容器
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		
		//键盘录入
		Scanner sc = new Scanner(System.in);
		System.out.println("请录入一个数字：");
		int num = sc.nextInt();
		
		//标记
		boolean flag = false;//false代表没找，true代表找到了
		
		//遍历容器
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == num) {
				System.out.println(i);
				flag = true;
				break;
			}
		}
		
		if(!flag) {
			System.out.println(-1);
		}
		
	4.数组的反转
		{1,4,2,3,6,5} -> {5,6,3,2,4,1}
		
		方式一：
			//创建容器
            int[] arr = {1,4,2,3,6,5};

            //遍历
            for(int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();

            //反转
            for(int i = 0; i < arr.length/2; i++) {
                int temp = arr[i];
                arr[i] = arr[arr.length-1-i];
                arr[arr.length-1-i] = temp;
            }

            //遍历
            for(int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            
 		方式二：
 			//创建容器
            int[] arr = {1,4,2,3,6,5};

            //遍历
            for(int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();

            //反转
            for(int i = 0, j = arr.length-1; i < arr.length/2; i++, j--) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }

            //遍历
            for(int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();

	5.数组的排序
		{1,5,3,2,4} -> {1,2,3,4,5}
		
		a.选择排序
			//创建容器
            int[] arr = {1,5,3,2,4};

            //遍历
            for(int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();

            //选择排序
            for(int i = 0; i < arr.length - 1; i++) {
                for(int j = i + 1; j < arr.length; j++) {
                    if(arr[i] > arr[j]) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }

            //遍历
            for(int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
		
		b.冒泡排序
			//创建容器
            int[] arr = {1,5,3,2,4};

            //遍历
            for(int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();

            //冒泡排序
            for(int i = 0; i < arr.length - 1; i++) {
                for(int j = 0; j < arr.length - 1 - i; j++) {
                    if(arr[j] > arr[j+1]) {
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
                }
            }

            //遍历
            for(int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();



~~~

