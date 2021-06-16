package packagetest10;

import java.util.*;
import java.io.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Javatest25_ParallelStream {
	public static void main(String[] args) {
		List<String> l1=Arrays.asList("aqw","aeqe","aw","qe","qw");
		Stream<String> parallelStream1=l1.parallelStream();
		System.out.println("isparallel:"+parallelStream1.isParallel());
		Stream<String> s1=Stream.of("w1","w2","w3");
		Stream<String> parallelStream2=s1.parallel();
		System.out.println("isparallel:"+parallelStream2 .isParallel());                                              
	}
}
