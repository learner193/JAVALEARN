package packagetest10;

import java.util.*;

public class Javatest12 {
	public static void main(String[] argv) {
		ArrayList<Character> l1 = new ArrayList<Character>();
		l1.add('q');
		l1.add('@');
		l1.add((char) 95);
		l1.add((char) 48);
		System.out.println(l1.hashCode());
		System.out.println(l1.size());
		System.out.println(l1.toString());
		System.out.println(l1.isEmpty());
		l1.remove(0);
		System.out.println(l1.toString());
		System.out.println(l1.get(0));
		LinkedList l2=new LinkedList();
		l2.add("guguugugu");
		l2.add(1223331);
		l2.add(21133112L);
		l2.add(2121.212121);
		System.out.println("增删效率高.循环链表 前后引用"+l2.toString());
		System.out.println(l2);
		l2.offer(l2.get(1));
		System.out.println(l2);
		l2.push(l2.get(4));
		l1.add(0, null);
		System.out.println(l1);
		System.out.println(l2);
		l2.peek();
		System.out.println(l2.peek());
		l2.removeFirst();
		System.out.println(l2);
		System.out.println("remove:"+l2.pollLast());
		System.out.println(l2);
	}
}