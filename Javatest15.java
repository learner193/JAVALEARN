package packagetest10;

import java.util.*;
import java.util.function.Consumer;

public class Javatest15 {
	public static void main(String[] argv) {
		aa a1 = new aa();
		a1.aa = 1;
		a1.bb = 1;
		
		aa a2 = new aa();
		a2.aa = 12332;
		a2.bb = 312445;
		
		aa a3 = new aa();
		a3.aa = 1;
		a3.bb = 1;

		HashSet h1 = new HashSet();
		h1.add(a1);
		h1.add(a2);
		h1.add(a3);

		System.out.println(h1);
	}
}

class aa {
	int aa;
	int bb;

	public aa() {
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
		if (!(obj instanceof aa)) {
			return false;
		}
		aa a1 = (aa) obj;
		if ((a1.aa == this.aa) & (a1.bb == this.bb))
			return true;
		else
			return false;
	}
}