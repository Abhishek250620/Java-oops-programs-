package collection;

import java.util.HashSet;

public class Sett {
	public static void main(String[] args) {
		HashSet hs=new HashSet();
		hs.add(100);
		hs.add("java");
		hs.add(100);
		hs.add(true);
		hs.add(200);
		
		for(Object obj:hs) {
			System.out.println(obj);
		}
	}
}
