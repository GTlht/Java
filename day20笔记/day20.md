### File类

~~~
什么是File类？
	它代表文件或者文件夹(目录)的类
	
常见的构造方法？
	public File(String pathname)
	public File(String parent,String child)
	public File(File parent,String child)
	
常见的成员方法？
	1.创建相关的方法
		public boolean createNewFile()：创建文件，创建成功返回true，创建失败返回false
		public boolean mkdir()：创建单级文件夹，创建成功返回true，创建失败返回false
		public boolean mkdirs()：创建多级文件夹，创建成功返回true，创建失败返回false
		
	2.删除相关的方法
		public boolean delete()：可以删除文件或者文件夹
		
		注意事项？
			1.如果要删除的文件夹下有子文件或者子文件夹的话，该文件夹是不可以被删除的
			2.使用该方法所删除的文件或者文件夹是不走回收站的
	
	3.判断相关的方法
		public boolean exists()：判断是否存在
		public boolean isFile()：判断是否是文件
		public boolean isDirectory()：判断是否是文件夹
	
	4.获取相关的方法
		public String getName()：获取文件或者文件夹的名字
		public String getPath()：获取文件或者文件夹的路径
		public String getAbsolutePath()：获取文件或者文件夹的绝对路径
		public long length()：获取文件的长度
		public File[] listFiles()：获取file所封装的文件夹中的所有子文件和子文件夹的file对象的数组




~~~
