package packagetest10;

import java.util.*;
import java.util.function.Consumer;

public class Javatest19_Map {
	public static void main(String[] argv) {
		Map m1=new HashMap();
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
		
		
		
		System.out.println("show map m1:"+m1);
		System.out.println("show map m1.containsKey(1):"+m1.containsKey(1));
		System.out.println("show map m1.get(1):"+m1.get(1));
		System.out.println("show map m1.keySet:"+m1.keySet());
		System.out.println("show map m1.size():"+m1.size());
		System.out.println("show map m1.values():"+m1.values());
		m1.replace(1, "one");
		System.out.println("show map m1:"+m1);
		Set keySet1=m1.keySet();
		Iterator iterator1=keySet1.iterator();
		for(;iterator1.hasNext();) {
			Object key1=iterator1.next();
			Object value1=m1.get(key1);
			System.out.println("iteratored hash map m1:"+key1+","+value1);
		}
		Set entrySet1=m1.entrySet();
		System.out.println("show keySet1:"+keySet1);
		System.out.println("show entrySet1:"+entrySet1);
		Iterator iterator2=entrySet1.iterator();
		for(;iterator2.hasNext();) {
			Map.Entry mapEntry1=(Map.Entry)(iterator2.next());
			Object key1=mapEntry1.getKey();
			Object value1=mapEntry1.getValue();
			System.out.println("iteratored hash map m1:by Map.Entry way: "+key1+","+value1);
		}
		m1.forEach((key1,value1)->{System.out.println("show foreach way:"+key1+","+value1);});
		
		Collection values1=m1.values();
		values1.forEach(value1->{System.out.println("show values foreach way:"+value1);});
		
		
		Map m3=new LinkedHashMap();
		m3.put(1, "first");
		m3.put(2, "second");
		m3.put(3, "third");
		m3.put(2, "two");
		m3.put(5, "fifth");
		m3.put(6, "sixth");
		m3.put(7, "seventh");
		m3.put(8, "eighth");
		m3.put(9, "ninth");
		m3.put(10, "tenth");
		m3.put(11, "eleventh");
		m3.put(15, "fifteenth");
		m3.put(100, "hundredth");
		m3.put(1000, "thousandth");
		m3.put(56, "fiftysixth");
		m3.put(57, "fiftyseventh");
		System.out.println("linkedHashMap m3: "+m3);
	}
}