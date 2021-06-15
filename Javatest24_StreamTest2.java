package packagetest10;

import java.util.*;
import java.io.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Javatest24_StreamTest2 {
	public static void main(String[] argv) {
		ArrayList<String> a1 = new ArrayList<String>();
		Collections.addAll(a1, "sa", "asd", "www", "afd", "wwqq", "as", "asddww", "wda", "ayyt");
		System.out.println("Show a1:" + a1);

		Integer[] i1 = { 12, 21, 3, 312, 21, 21, 44, 124, 21, 12, 41, 4, 412, 3, 131, 31, 3, 1 };
		List<Integer> l1 = Arrays.asList(i1);
		Stream<Integer> s1 = l1.stream();

		Stream<String> s2 = a1.stream();
		Stream<Integer> s3 = Arrays.stream(i1);
		s2.filter(i -> i.startsWith("a")).filter(i -> i.length() > 2)
//		  .forEach(i->System.out.println(i))
				.forEach(System.out::println);
		s2 = a1.stream();
		s2.filter(i -> i.startsWith("a") && i.length() > 2).map(String::toUpperCase).sorted().skip(1).limit(2)
				.forEach(System.out::println);
		s2 = a1.stream();
		a1=(ArrayList<String>) s2.filter(i -> i.startsWith("a")).collect(Collectors.toList());
		System.out.println("Show a1:" + a1);
		s2 = a1.stream();
		String s4=s2.filter(i -> i.startsWith("a")).collect(Collectors.joining(" po "));
		System.out.println("Show s4:" + s4);
	}
}
