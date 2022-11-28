package Exception;
public class ArthExce {
	public static void main(String[] args) {
		try{
			System.out.println(24/0);
		}
		catch(Exception ae) {
			System.out.println(ae.getMessage());
		}
	}
}
