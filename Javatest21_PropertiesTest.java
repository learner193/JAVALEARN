package packagetest10;

import java.util.*;
import java.io.*;
import java.util.function.Consumer;

public class Javatest21_PropertiesTest {
	public static void main(String[] argv) throws FileNotFoundException, IOException {
		Properties properties1=new Properties();
		properties1.load(new FileInputStream("D:\\DataBench\\JAVAECLIPSE\\JavaTest10\\src\\test.properties1"));
		properties1.forEach((key1,value1)->System.out.println("key1-value1="+key1+"-"+value1));
		FileOutputStream opts1=new FileOutputStream("D:\\DataBench\\JAVAECLIPSE\\JavaTest10\\src\\test.properties1");
		properties1.setProperty("charset", "UTF-8");
		Writer out =Writer.nullWriter();
		
		properties1.store(out,  "new charset code");
		
	}
}
