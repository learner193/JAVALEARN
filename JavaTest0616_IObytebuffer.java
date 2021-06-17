package packageIOtest;

import java.io.*;

public class JavaTest0616_IObytebuffer {
	public static void main(String args[]) throws IOException{
		long begint1=System.currentTimeMillis();
		FileInputStream in1=new FileInputStream("D:\\DataBench\\JAVAECLIPSE\\JavaTestIO\\фад╩╫ьм╪(19).png");
		FileOutputStream out1=new FileOutputStream("Copier1");
		int carrier1 ;
		byte[] buffer1=new byte[2048];
		for(;((carrier1=in1.read(buffer1))!=-1);) {
			out1.write(buffer1,0,carrier1);
		}
		in1.close();
		out1.close();
		long endt1=System.currentTimeMillis();
		
		System.out.println("carrier take times:"+(endt1-begint1)+"millis");
	}
}
