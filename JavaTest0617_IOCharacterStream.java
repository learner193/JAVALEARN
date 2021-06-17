package packageIOtest;

import java.io.*;
import java.nio.charset.Charset;

public class JavaTest0617_IOCharacterStream {
	public static void main(String args[]) throws IOException{
		long begint1=System.currentTimeMillis();
		
		FileReader filereader1=new FileReader("WTF.txt");
		
		int Carrier1;
		for(;((Carrier1=filereader1.read())!=-1);) {
			System.out.println((char)Carrier1);
		}
		
		
		
		long endt1=System.currentTimeMillis();
		
		filereader1.close();
		System.out.println("carrier take times:"+(endt1-begint1)+"millis");
	}
}
