package javabean;

public class inheritence3 extends inheritence2{
	int w=30;
	public static void main(String[] args) {
		inheritence3 i=new inheritence3();
		System.out.println(i.x);
		System.out.println(i.y);
		i.walk();
		i.test();
	}
}
