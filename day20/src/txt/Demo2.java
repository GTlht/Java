package txt;

import java.io.File;
import java.io.IOException;

/*2.删除指定文件夹aaa(文件夹中是有子文件和子文件夹的)
	-- aaa
		-- bbb
			-- bbb.txt
			-- bbb.java
			-- ccc
				-- ccc.txt
				-- ccc.jpg
		-- aaa.txt
		-- 1.jpg*/
public class Demo2 {
	public static void main(String[] args) throws IOException {
		File file=new File("aaa");
		deletef(file);
		System.out.println(file.exists());
		
		
	}
	public static void deletef(File file) {
		File[] files=file.listFiles();
		for (File file2 : files) {
			if(file2.isFile()) {
				file2.delete();
			}else {
				deletef(file2);
			}
		}
		file.delete();
	}

}
