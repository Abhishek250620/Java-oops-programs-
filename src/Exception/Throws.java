//Throws
package Exception;

class Student{
	public static void demoni() throws Exception  {
		System.out.println(2/0);
	}
}

public class Throws {
	public static void main(String[] args) {
		try{
			Student.demoni();
		}
		catch(Exception e) {
			System.out.println("Invalid denomi");
		}
	}
}

