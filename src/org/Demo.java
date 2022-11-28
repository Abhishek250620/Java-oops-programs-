package org;

class Demo1{
	int age;
	int marks;
	int age2;
	int marks2;
	Demo1(int age,int marks){
		this.age=age;
		this.marks=marks;
	}
	
	Demo1(int age2){
		this(20,56);
		this.age2=age2;
	}
}

class Demo2 extends Demo1{
	int marks1;
	Demo2(int age,int marks1){
		super(20,28);
		this.marks1=marks1;
	}
}
public class Demo {
	public static void main(String[] args) {
		Demo2 d=new Demo2(22,45);
		System.out.println(d.age);
		System.out.println(d.age);
		System.out.println(d.marks);
		System.out.println(d.marks1);
	}
}
