package packageIOtest;

import java.io.*;
import java.nio.charset.Charset;
import java.util.Arrays;

public class Test0618_FileClass2 {
	public static void main(String args[]) throws IOException{
		long begint1=System.currentTimeMillis();
		
		String fp2="D:\\DataBench\\JAVAECLIPSE\\JavaTestIO";
		File f1=new File(fp2);
		
		if (f1.isDirectory()) {
			String[] fileNames1=f1.list((dir,name)->name.endsWith(".txt"));
		
		
		Arrays.stream( fileNames1 ).forEach(f->System.out.println("filelist:"+f));
		}
		
		
		fileDirectory1(f1);
		
		String fp3="D:\\DataBench\\JAVAECLIPSE\\JavaTestIO\\新建文件夹";
		File f2=new File(fp3);
		deleteDirectory1(f2);
		
		
		long endt1=System.currentTimeMillis();		
		System.out.println("take times:"+(endt1-begint1)+"millis");
	}
	
	public static void fileDirectory1(File f1) {
		File[] listFiles1=f1.listFiles();
		for(File f2:listFiles1) {
			if(f2.isDirectory()) {
				fileDirectory1(f2);
			}
			System.out.println("recursion: "+f2);
		}
	}
	
	public static void deleteDirectory1(File f1) {
		File[] listFiles=f1.listFiles();
		for(File f2:listFiles) {
			if(f2.isDirectory()) {
				deleteDirectory1(f2);
			}
			System.out.println("show document "+f2);
			f2.delete();
		}
	}
}
