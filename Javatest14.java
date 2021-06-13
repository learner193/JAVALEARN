package packagetest10;

import java.util.*;
import java.util.function.Consumer;

public class Javatest14 {
	public static void main(String[] argv) {
		HashSet s1=new HashSet();
		s1.add("first");
		s1.add('2');
		s1.add(3.000);
		s1.add(4);
		s1.forEach(obj0->System.out.println("hashset each:"+obj0));
	}
}