package customexception;

import java.util.Scanner;

class InvalidPasswordException extends Exception{
	private String message;
	InvalidPasswordException(String message){
		this.message=message;
	}
	@Override
	public String getMessage() {
		return message;
	}
}

public class Password {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter admin Id:");
		String admin=sc.next();
		if(admin.equals("admin")) {
			System.out.println("Enter password:");
			String password=sc.next();
			if(password.equals("abhi123")) {
				System.out.println("Login succesfull!!!!!!!");
			}
		}
		else {
			try {
				throw new InvalidPasswordException("Wrong Id or Passowrd");
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
