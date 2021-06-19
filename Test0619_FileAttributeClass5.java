package packageIOtest;

import java.io.*;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.nio.*;

public class Test0619_FileAttributeClass5 {
	public static void main(String args[]) throws IOException{
		Path path1=Paths.get("D:\\DataBench\\JAVAECLIPSE\\JavaTestIO");
		Files.createDirectories(path1);
		System.out.println("created Directories");
		Path filepath=Paths.get("D:\\DataBench\\JAVAECLIPSE\\JavaTestIO\\test4.txt");
		Files.createFile(filepath);
		System.out.println("SizeofFile:"+Files.size(filepath));
		List<String> list=new ArrayList<String>();
		list.add("testtest");
		Files.write(filepath,list, StandardOpenOption.APPEND);
		List<String>lines=Files.readAllLines(filepath);
		System.out.println("SizeofFile:"+Files.size(filepath));
		System.out.println("content of file"+lines);
	}
}
