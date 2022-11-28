package javabean;
import java.util.Scanner;

public class swap {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter A value: ");
		int a=sc.nextInt();
		System.out.println("enter B value: ");
		int b=sc.nextInt();
		System.out.println("A is: "+a);
		System.out.println("B is: "+b);
		System.out.println("----------");
		int temp=0;
		temp=a;
		a=b;
		b=temp;
		System.out.println("A value after swap: "+a);
		System.out.println("B value after swap: "+b);
		sc.close();
	}
}
