package packagetest10;

import java.util.*;
import java.util.function.Consumer;

public class Javatest17 {
	public static void main(String[] argv) {
		ab a1=new ab();
		ab a2=new ab();
		ab a3=new ab();
		ab a4=new ab();
		a1.aa=12;
		a1.bb=21;
		a2.aa=23;
		a2.bb=32;
		a3.aa=15;
		a3.bb=51;
		a4.aa=12;
		a4.bb=21;
		System.out.println("a1comparea4:"+a1.compareTo(a4));
		TreeSet<ab> t1=new TreeSet<ab>();
		t1.add(a1);
		t1.add(a2);
		t1.add(a3);
		t1.add(a4);
		System.out.println("showt1:"+t1);
	}
}

class ab implements Comparable<Object>{
	int aa;
	int bb;

	public ab() {
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
		ab a1 = (ab) obj;
		if ((a1.aa == this.aa) & (a1.bb == this.bb))
			return true;
		else
			return false;
	}

	public int compareTo(Object obj) {
		ab q = (ab) obj;
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