package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Stu {
	String name;
	int age;
	Stu(String name,int age){
		this.name=name;
		this.age=age;
	}
	@Override
	public String toString() {
		return name+" "+age;
	}
	public static void main(String[] args) {
		Stu s=new Stu("tom", 21);
		Stu s1=new Stu("jerry", 22);
		ArrayList<Stu>al=new ArrayList<Stu>();
		al.add(s);
		al.add(s1);
		Iterator<Stu> e=al.iterator();
		while(e.hasNext()) {
			System.out.println(e.next());
		}
	}
}
