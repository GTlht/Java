package com.decorative;

public class Demo03 {
	public static void main(String[] args) {
		FileInputStream fis = new FileInputStream();
		
		//一次读取一个字节
		int by = fis.read();
		//一次读取一个字节数组
		byte[] bys = new byte[1024];
		int len = fis.read(bys);
		
		fis.close();
		
		System.out.println("-----------------------------------");
		
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream());
		
		//一次读取一个字节
		int b = bis.read();
		//一次读取一个字节数组
		byte[] bys1 = new byte[1024];
		int len1 = bis.read(bys1);
		
		bis.close();
	}
}

abstract class InputStream {
	public abstract int read();
	public abstract int read(byte[] bys);
	public abstract void close();
	public abstract void aaa();
	public abstract void bbb();
	public abstract void ccc();
}

class FileInputStream extends InputStream {
	@Override
	public int read() {
		//一次读取一个字节
		return 0;
	}

	@Override
	public int read(byte[] bys) {
		//一次读取一个字节数组
		return 0;
	}

	@Override
	public void close() {
		//释放资源
	}

	@Override
	public void aaa() {
		//各种杂七杂八的功能
	}

	@Override
	public void bbb() {
		//各种杂七杂八的功能
	}

	@Override
	public void ccc() {
		//各种杂七杂八的功能
	}
}

class BufferedInputStream extends InputStream {
	private InputStream is; 
	
	public BufferedInputStream(InputStream is) {
		this.is = is;
	}

	@Override
	public int read() {//功能需要增强
		//一次读取一个字节增强版
		return 0;
	}

	@Override
	public int read(byte[] bys) {//功能需要增强
		//一次读取一个字节数组增强版
		return 0;
	}

	@Override
	public void close() {//功能不需要增强
		is.close();
	}

	@Override
	public void aaa() {//功能不需要增强
		is.aaa();
	}

	@Override
	public void bbb() {//功能不需要增强
		is.bbb();
	}

	@Override
	public void ccc() {//功能不需要增强
		is.ccc();
	}
}