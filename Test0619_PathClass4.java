package packageIOtest;

import java.io.*;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.nio.*;

public class Test0619_PathClass4 {
	public static void main(String args[]) throws IOException{
		Path path1=Paths.get("D:\\DataBench\\JAVAECLIPSE\\JavaTestIO\\test1.txt");
		System.out.println("pathroot  "+path1.getRoot());
		System.out.println("pathparent  "+path1.getParent());
		System.out.println("pathnamecount  "+path1.getNameCount());
		for(int i=0;i<path1.getNameCount();i++) {
			Path name=path1.getName(i);
			System.out.println("number index: "+i+"pathname: "+name);
		}
		System.out.println("pathURi:  "+path1.toUri());
		System.out.println("pathAbsolute: "+path1.toAbsolutePath());
	}
}
