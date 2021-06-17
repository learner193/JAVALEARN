package packageIOtest;

import java.io.*;
import java.nio.charset.Charset;

public class JavaTest0617_IOCharacterStreamwriter {
	public static void main(String args[]) throws IOException{
		long begint1=System.currentTimeMillis();
		
		BufferedReader br1=new BufferedReader(new FileReader("filewritertest.txt"));
		BufferedWriter bw1=new BufferedWriter(new FileWriter("FRtest.txt",true));
		
		int carrier1;
		char[] buffer1=new char[100];
		
		for(;(carrier1=br1.read(buffer1))!=-1;) {
			System.out.println(carrier1);
		    bw1.write(buffer1, 0, carrier1);
		}
		
		
		
		long endt1=System.currentTimeMillis();
		
		bw1.close();
		br1.close();
		System.out.println("carrier take times:"+(endt1-begint1)+"millis");
	}
}
