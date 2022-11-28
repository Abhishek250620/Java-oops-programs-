package Exception;
class InavlidAmt extends RuntimeException{
	private String msg;
	public InavlidAmt(String msg) {
		this.msg = msg;
	}
	@Override
	public String getMessage() {
		return msg;
	}
}
public class ATM {
	public static void main(String[] args) {
		int bal=5000;
		int amt=8000;
		if(amt<=bal) {
			System.out.println(bal-=amt);
		}
		else {
			try {
			throw new InavlidAmt("Not that amt in ur account");
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}