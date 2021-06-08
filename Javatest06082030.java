package packagetest8;

import java.io.IOException;
import java.util.*;


public class Javatest06082030 {
	public static void main(String[] argv) throws IOException, InterruptedException {
		StringBuffer a=new StringBuffer("abcdefg");
		System.out.println(a);
		a.append(777);
		System.out.println(a);
		a.insert(2,"www");
		System.out.println(a);
		a.deleteCharAt(2);
		System.out.println(a);
		a.replace(1, 4, "6789");
		System.out.println(a);
		a.delete(0, 1);
		//System.exit(0);
		System.out.println(a);
		String b=a.toString();
		System.out.println(b);
		a.reverse();
		System.out.println(a);
		System.gc();
		long t;
		t=System.currentTimeMillis();
		System.out.println(t);
		int[] p=new int[100];
		int[] q=new int[100];
		p[10]=212;
		p[90]=212;
		System.arraycopy(p, 0, q, 0, 100);
		System.out.println(q[10]);
		System.out.println(q[90]);
		
		
		Properties pop=System.getProperties();
		System.out.println(pop);
		System.out.println("****************");
		
		java.util.Set<String> propertyNames=pop.stringPropertyNames();
		
		for(String o:propertyNames) {
			String v=System.getProperty(o);
			System.out.println(o+"->"+v);
		}
		
		for(int i:p) {
			System.out.println(i);
		}
		
		
		Runtime run=Runtime.getRuntime();
		int e=run.availableProcessors();
		long f=run.freeMemory();//byte
		long g=run.maxMemory();
		
		System.out.println(e);
		System.out.println(f/1024/1024+"mb");
		System.out.println(g/1024/1024/1024+"gb");
		
		
			Process pro=run.exec("notepad.exe");
		
		
		
			Thread.sleep(5000);
		
		
		pro.destroy();
	}
}
