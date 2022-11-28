package collection;

import java.util.ArrayList;

class Employe{
	String name;
	double sal;
	Employe(String name, double sal) {
		this.name = name;
		this.sal = sal;
	}
	
	@Override
	public String toString() {
		return name+" "+sal;
	}
	
}

public class ObjIntoCollection {
	public static void main(String[] args) {
		Employe emp1=new Employe("Tom", 25000);
		Employe emp2=new Employe("jerry", 35000);
		Employe emp3=new Employe("Smith", 45000);
		
		ArrayList<Employe> a=new ArrayList<Employe>();
		a.add(emp1);
		a.add(emp2);
		a.add(emp3);
		
		for(Employe e:a) {
			System.out.println(e);
		}
	}
}
