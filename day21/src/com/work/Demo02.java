package com.work;

import java.io.File;

/*

2.删除指定文件夹aaa(文件夹中是有子文件和子文件夹的)
	-- aaa
		-- bbb
			-- bbb.txt
			-- bbb.java
			-- ccc
				-- ccc.txt
				-- ccc.jpg
		-- aaa.txt
		-- 1.jpg
*/

public class Demo02 {
	public static void main(String[] args) {
		File file = new File("aaa");
		delete(file);
		System.out.println("删除成功~");
	}
	
	public static void delete(File file) {
		File[] files = file.listFiles();
		
		for (File f : files) {
			if(f.isFile()) {
				f.delete();//删除文件
			} else {
				delete(f);
			}
		}
		
		//删除自身(文件夹)
		file.delete();
	}
}
