package javabean;

class methodor {
	void add() {
		System.out.println("running add method");
	}
}
class methodoverride extends methodor{
	@Override
	void add() {
		System.out.println("running 2nd add method");
		super.add();
	}
	public static void main(String[] args) {
		methodoverride m=new methodoverride();
		m.add();
	}
}
