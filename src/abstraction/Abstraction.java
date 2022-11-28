package abstraction;

abstract class Bank{
	abstract void deposit(int amt);
	abstract void withdraw(int amt);
	abstract void balence();
}

class BankImp extends Bank{
	int bal=5000;
	@Override
	void deposit(int amt) {
		System.out.println(amt+" deposited");
		bal+=amt;
	}
	@Override
	void withdraw(int amt) {
	System.out.println(amt+" withdrawan");
	}
	@Override
	void balence() {
		System.out.println("current balance:"+bal);
	}
	
}

class Abstraction {
	public static void main(String[] args) {
		Bank b=new BankImp();
		b.deposit(4111);
		b.withdraw(3000);
		b.balence();
	}
}
