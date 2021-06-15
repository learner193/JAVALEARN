package packagetest10;

import java.util.*;
import java.io.*;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Javatest23_StreamTest {
	public static void main(String[] argv)  {
		ArrayList<String> a1=new ArrayList<String>();
		Collections.addAll(a1,"sa","asd","www","afd","wwqq","as","asddww","wda","ayyt");
		System.out.println("Show a1:"+a1);
		
		Integer[] i1= {12,21,3,312,21,21,44,124,21,12,41,4,412,3,131,31,3,1};
		List<Integer> l1=Arrays.asList(i1);
		Stream<Integer> s1=l1.stream();
		s1.forEach(i->System.out.println("Show s1:"+i));
		Stream<Integer> s2=Stream.of(i1);
		Stream<Integer> s3=Arrays.stream(i1);
	
	}
}
