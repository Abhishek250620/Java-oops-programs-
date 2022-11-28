package collection;

import java.util.*;

public class Set {
	public static void main(String[] args) {
		HashSet<Comparable> hs=new HashSet();
		LinkedHashSet<Integer> lhs=new LinkedHashSet<Integer>();
		TreeSet<Integer> ts=new TreeSet<Integer>();
		
		hs.add(100);
		hs.add("java");
		hs.add(100);
		hs.add('a');
		hs.add(true);
		hs.add(null);
		System.out.println(hs);
		
		lhs.add(100);
		lhs.add(200);
		lhs.add(100);
		lhs.add(300);
		System.out.println(lhs);
		
		ts.add(20);
		ts.add(10);
		ts.add(30);
		ts.add(10);
		System.out.println(ts);
	}
}
