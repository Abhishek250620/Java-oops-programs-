package collection;

import java.util.TreeSet;

class Stud implements Comparable<Stud>{
	int age;
	Stud(int age){
		this.age=age;
	}
	@Override
	public String toString() {
		return "Age:"+age;
	}
	@Override
	public int compareTo(Stud s) {
//		return this.age-s.age;
		return s.age-this.age;
//        21 - 24
	}
}
public class SortStud {
	public static void main(String[] args) {
		TreeSet<Stud> t=new TreeSet<Stud>();
		t.add(new Stud(24));
		t.add(new Stud(21));
		t.add(new Stud(19));
		t.add(new Stud(20));
		t.add(new Stud(23));
		for(Stud ele:t) {
			System.out.println(ele);
		}
	}
}