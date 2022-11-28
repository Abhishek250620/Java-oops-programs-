
//Storing 5 Student obj into ArrayList and Displaying Max and Min marks Scored Students name

package collection;

import java.util.ArrayList;

class Student{
	String name;
	int marks;

	Student(String name,int marks){
		this.name=name;
		this.marks=marks;
	}

	@Override
	public String toString() {
		return name+" scored "+marks+" marks";
	}
}

public class MaxAndMin {
	public static void main(String[] args) {
		Student std1=new Student("Tom",34);
		Student std2=new Student("Jerry",3);
		Student std3=new Student("Smith",24);
		Student std4=new Student("Jo",40);
		Student std5=new Student("Amit",10);
		ArrayList<Student> al=new ArrayList<Student>();
		al.add(std1);
		al.add(std2);
		al.add(std3);
		al.add(std4);
		al.add(std5);

		int max=0;
		int min=0;
		for(int i=1;i<al.size();i++) {
			if(al.get(min).marks>al.get(i).marks) {
				min=i;
			}
			if(al.get(max).marks<al.get(i).marks) {
				max=i; 
			}
		}
		System.out.println("Max marks --> "+al.get(max));
		System.out.println("Min marks --> "+al.get(min));
	}
}
