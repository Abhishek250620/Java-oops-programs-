package Exception;
import java.util.*;
class InvalidAge extends Exception{
	String msg;
	InvalidAge(String msg){
		this.msg=msg;
	}
	@Override
	public String getMessage() {
		return msg;
	}
}

public class CustomException {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		if(age>=18) {
			System.out.println("Eligible for DL");
		}
		else {
			try {
				throw new InvalidAge("You are not 18");
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
