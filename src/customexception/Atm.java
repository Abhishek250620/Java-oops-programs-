package customexception;

import java.util.Scanner;

class InsufficientFundException extends RuntimeException{

}
public class Atm {
	public static void main(String[] args) {
		int bal=15000;
		Scanner sc=new Scanner(System.in);
		int amount=sc.nextInt();
		if(amount<=bal) {
			System.out.println("Amount succesfully withdrawen");
		}
		else {
			throw new InsufficientFundException();
		}
	}
}
