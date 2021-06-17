package packageIOtest;

import java.io.*;

public class JavaTest0616_IObytebufferStream {
	public static void main(String args[]) throws IOException{
		long begint1=System.currentTimeMillis();
		BufferedInputStream bufferins1=new BufferedInputStream(new FileInputStream("D:\\DataBench\\JAVAECLIPSE\\JavaTestIO\\фад╩╫ьм╪(19).png"));
		BufferedOutputStream bufferouts1=new BufferedOutputStream(new FileOutputStream("copier2.png"));
		
		int carrier1;
		for(;((carrier1=bufferins1.read())!=-1);) {
			bufferouts1.write(carrier1);
		}
		
		long endt1=System.currentTimeMillis();
		
		bufferins1.close();
		bufferouts1.close();
		System.out.println("carrier take times:"+(endt1-begint1)+"millis");
	}
}
