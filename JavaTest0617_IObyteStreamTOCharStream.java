package packageIOtest;

import java.io.*;
import java.nio.charset.Charset;

public class JavaTest0617_IObyteStreamTOCharStream {
	public static void main(String args[]) throws IOException{
		long begint1=System.currentTimeMillis();
		FileInputStream FIS1=new FileInputStream("filewritertest.txt");
		FileOutputStream FOS1 =new FileOutputStream("StreamTOChar.txt");
		
		InputStreamReader isr1=new InputStreamReader(FIS1);
		OutputStreamWriter osw1=new OutputStreamWriter(FOS1);
		
		BufferedReader br1=new BufferedReader(isr1);
		BufferedWriter bw1=new BufferedWriter(osw1);
		
		int len1;
		char[] c1=new char[100];
		for(;(len1=br1.read(c1))!=-1;) {
			System.out.println("len1="+len1+"c1="+c1[0]);
			bw1.write(c1, 0, len1);
		}
		
		long endt1=System.currentTimeMillis();
		
		bw1.close();
		br1.close();
		System.out.println("carrier take times:"+(endt1-begint1)+"millis");
	}
}
