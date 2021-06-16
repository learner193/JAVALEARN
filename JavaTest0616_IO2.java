package packageIOtest;

import java.io.*;

public class JavaTest0616_IO2 {
	public static void main(String args[]) throws IOException{
		FileInputStream in1=new FileInputStream("IMG_1861.jpg");
		FileOutputStream out1=new FileOutputStream("dest.jpg");
		int len=0;
		long beginTime=System.currentTimeMillis();
		for(;(len=in1.read())!=-1;) {
			out1.write(len);
		}
		long endTime=System.currentTimeMillis();
		
		System.out.println("takes time"+(endTime-beginTime)+"millis");
		
		in1.close();
		out1.close();
		
	}
}
