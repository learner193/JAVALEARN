package packagetest10;

import java.util.*;
import java.util.function.Consumer;

public class Javatest20_TreeMap {
	public static void main(String[] argv) {
		Map m1=new TreeMap(new TreeMapcompare1());
		m1.put(1, "first");
		m1.put(2, "second");
		m1.put(3, "third");
		m1.put(2, "two");
		m1.put(5, "fifth");
		m1.put(6, "sixth");
		m1.put(7, "seventh");
		m1.put(8, "eighth");
		m1.put(9, "ninth");
		m1.put(10, "tenth");
		m1.put(11, "eleventh");
		m1.put(15, "fifteenth");
		m1.put(100, "hundredth");
		m1.put(1000, "thousandth");
		m1.put(56, "fiftysixth");
		m1.put(57, "fiftyseventh");
		System.out.println("show TreeMap M1"+m1);
	}
}
class TreeMapcompare1 implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		int s1=(int)o1;
		int s2=(int)o2;
		return -(s1-s2);		
	}	
}