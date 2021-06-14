package packagetest10;

import java.util.*;
import java.util.function.Consumer;

public class Javatest18 {
	public static void main(String[] argv) {
		ac a1=new ac();
		ac a2=new ac();
		ac a3=new ac();
		ac a4=new ac();
		a1.aa=12;
		a1.bb=21;
		a2.aa=23;
		a2.bb=32;
		a3.aa=15;
		a3.bb=51;
		a4.aa=12;
		a4.bb=21;
		System.out.println("a1comparea4:"+a1.compareTo(a4));
		TreeSet<ac> t1=new TreeSet<ac>(new Comparator1());
		t1.add(a1);
		t1.add(a2);
		t1.add(a3);
		t1.add(a4);
		System.out.println("showt1:"+t1);
		TreeSet<ac> t2=new TreeSet<ac>((obj1,obj2)->{return -(obj1.hashCode()-obj2.hashCode());});
		t2.add(a1);
		t2.add(a2);
		t2.add(a3);
		t2.add(a4);
		System.out.println("showt2:"+t2);
	}
}
class Comparator1 implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		int a=o1.hashCode()-o2.hashCode();
		return a;
	}	
}

class ac implements Comparable<Object>{
	int aa;
	int bb;

	public ac() {
		aa = 0;
		bb = 0;
	}

	public String toString() {
		String aas, bbs;
		aas = Integer.toString(aa);
		bbs = Integer.toString(bb);
		return aas + "-" + bbs;
	}

	public int hashCode() {
		return Integer.hashCode(aa) + Integer.hashCode(bb);
	}

	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof ab)) {
			return false;
		}
		ac a1 = (ac) obj;
		if ((a1.aa == this.aa) & (a1.bb == this.bb))
			return true;
		else
			return false;
	}

	public int compareTo(Object obj) {
		ac q = (ac) obj;
		if (this.aa > q.aa) {
			return 1;
		}
		if (this.aa == q.aa) {
			if (this.bb > q.bb) {
				return 1;
			}
			if (this.bb == q.bb) {
				return 0;
			}
		}
		return -1;
	}
}