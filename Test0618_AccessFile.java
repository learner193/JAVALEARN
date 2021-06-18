package packageIOtest;

import java.io.*;
import java.nio.charset.Charset;
import java.util.Arrays;

public class Test0618_AccessFile {
	public static void main(String args[]) throws IOException{
		String fn1="why.txt";
		RandomAccessFile raf1=new RandomAccessFile(fn1,"rw");
		int times1=Integer.parseInt(raf1.readLine())-1;
		if (times1>0) {
			System.out.println("last time: "+times1+"times");
			raf1.seek(0);
			raf1.write((times1+"").getBytes());
		}else {
			System.out.println("none last time");
		}
		raf1.close();
	}
}

 class P implements Serializable{
	private static final long serialVersionUID=1L;
	private int id;
	private String name;
	private int age;
}
