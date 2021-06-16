package packageIOtest;

import java.io.*;

public class JavaTest0616_IO {
	public static void main(String args[]) throws IOException{
//		try {
		System.out.println("o");
		FileInputStream ins1=new FileInputStream("D:\\DataBench\\JAVAECLIPSE\\JavaTestIO\\test1.txt");
		int b=0;
		for(;(b=ins1.read())!=-1;) {
			System.out.println("new stream"+b);
		}
		ins1.close();
		
		FileOutputStream outs1=new FileOutputStream("test2.txt");
		String s1="ÎßºþÎßºþÎßÎßÎß";
		System.out.println("getBytes="+s1.getBytes());
		s1.getBytes();		
		outs1.write(s1.getBytes());
		outs1.close();
		
		FileOutputStream outs2=new FileOutputStream("test2.txt",true);
		
		System.out.println("getBytes="+s1.getBytes());
		s1.getBytes();		
		outs2.write(s1.getBytes());
		outs2.close();
//		}
//		finally {
//			try {
//				if(ins1!=null)ins1.close();				
//			}catch(Exception e) {
//				e.printStackTrace();
//			}
//			try {
//				if(outs1!=null)outs1.close();				
//			}catch(Exception e2) {
//				e2.printStackTrace();
//			}
//		}
//		
	}
}
