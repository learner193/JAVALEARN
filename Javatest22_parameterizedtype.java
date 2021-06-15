package packagetest10;

import java.util.*;
import java.io.*;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Javatest22_parameterizedtype {
	public static void main(String[] argv)  {
		ArrayList<String> a1=new ArrayList<String>();
		Collections.addAll(a1,"sa","asd","www","afd","wwqq","as","asddww","wda","ayyt");
		System.out.println("Show a1:"+a1);
		Collections.reverse(a1);
		System.out.println("Show a1:"+a1);
		Collections.shuffle(a1);
		System.out.println("Show a1 shuffle:"+a1);
		Collections.sort(a1);
		System.out.println("Show a1:"+a1);
		Collections.swap(a1, 0, 2);
		System.out.println("Show a1:"+a1);
		System.out.println("Show a1 max:"+Collections.max(a1));
		Collections.sort(a1);
		int index1 =Collections.binarySearch(a1, "asd");
		System.out.println("Show index in a1:"+a1.get(index1));
		
		ArrayList<Integer> a2=new ArrayList<>();
		Collections.addAll(a2, 12,21,213,213,21,21,23,32,14,54,146,3);
		int[] i2= {1221,321,13,123,213,321,312,3,213,3,1,32,31,3};
		int[] i1=Arrays.copyOfRange(i2, 1, 5);
		System.out.println("Show i1:"+i1.toString());
		for(int a=0;a<i1.length;a++) {
			System.out.println("Show i1:"+i1[a]);
		}
		Arrays.fill(i2,2);
		for(int a=0;a<i2.length;a++) {
			System.out.println("Show i2:"+i2[a]);
		}
		
		Stream<String> stream1=a1.stream();
		Stream<String> stream2=stream1.filter(i->i.startsWith("a"));
		stream2.forEach(i->System.out.println("printStream:"+i));
		System.out.println("printStream:"+stream2.toString());
		
		
	}
}
