package packageIOtest;

import java.io.*;
import java.nio.charset.Charset;
import java.util.Arrays;

public class Test0617_FileClass {
	public static void main(String args[]) throws IOException{
		long begint1=System.currentTimeMillis();
		
		
		String fpn1="FileClassTest.txt";
		File f1=new File(fpn1);
		f1.createNewFile();
		System.out.println("filename:"+f1.getName());
		System.out.println("fpath "+f1.getPath());
		System.out.println("fpathAbs "+f1.getAbsolutePath());
		System.out.println("fpathPar "+f1.getParent());
		System.out.println(f1.canRead()?"canRead":"notread");
		System.out.println(f1.canWrite()?"canwrite":"notwrite");
		System.out.println(f1.isFile()?"isfile":"notfile");
		System.out.println(f1.isDirectory()?"isdirectory":"notdirectory");
		System.out.println(f1.isAbsolute()?"isabsolute":"notabsolute");
		System.out.println("last modify time:"+f1.lastModified());
		System.out.println("filelength "+f1.length()/1024+"kb");
//		System.out.println("delete file  "+f1.delete());
		
		String fp2="D:\\DataBench\\JAVAECLIPSE\\JavaTestIO";
		File f2=new File(fp2);
		if (f2.isDirectory()) {
			String[] filenames1=f2.list();
			Arrays.stream(filenames1).forEach(System.out::println);
			
		}
		
		
		
		long endt1=System.currentTimeMillis();		
		System.out.println("take times:"+(endt1-begint1)+"millis");
	}
}
