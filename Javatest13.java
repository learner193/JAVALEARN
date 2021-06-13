package packagetest10;

import java.util.*;
import java.util.function.Consumer;

public class Javatest13 {
	public static void main(String[] argv) {
		ArrayList l1 = new ArrayList();
		l1.add(123456789);
		l1.add(234567890);
		l1.add(345678901);
		l1.add(456789012);
		l1.add(567890123);
		l1.add(678901234);
		l1.add(789012345);
		Iterator iterator1 = l1.iterator();
		for (; iterator1.hasNext();) {
			Object obj1 = iterator1.next();	
			if(456789012==(int)obj1) {
				iterator1.remove();
			}
			System.out.println("objÄÚÈÝ£º" + obj1);
		}
		for(Object obj2:l1) {
			System.out.println("foreach loop:" + obj2);
		}
		l1.forEach(obj1->System.out.println("foreach lambdaloop:" + obj1));
		iterator1=l1.iterator();
		iterator1.forEachRemaining(obj1->System.out.println(" iterator lambdaloop:" + obj1));
	}
}