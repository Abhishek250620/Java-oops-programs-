package javabean;

public class demo2 extends demo1 {
	demo2(){
		super(10);
		System.out.println("demo 2 1st cons");
	}
	public static void main(String[] args) {
		new demo2();
	}
}
