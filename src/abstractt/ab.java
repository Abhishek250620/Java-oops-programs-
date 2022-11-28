package abstractt;

abstract class ab1 {
	void demo() {
	}
	abstract void demo2();
}
class ab extends ab1{
	@Override
	void demo() {
		System.out.println("demo method running");
	}

	@Override
	void demo2() {
		System.out.println("demo2 method running");
	}

	public static void main(String[] args) {
		ab a=new ab();
		a.demo();
		a.demo2();
	}
}


