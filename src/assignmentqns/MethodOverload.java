package assignmentqns;

class Calculatore{
	void sum(int a,int b) {
		int sum=a+b;
		System.out.println(sum);
	}
	void sum(int a,double b) {
		double sum=a+b;
		System.out.println(sum);
	}
	void sum(double a,int b) {
		double sum=a+b;
		System.out.println(sum);
	}
	void sum(double a,double b) {
		double sum=a+b;
		System.out.println(sum);
	}
}

class MethodOverload {
	public static void main(String[] args) {
		Calculatore c=new Calculatore();
		c.sum(2, 3);
		c.sum(2.3, 4.4);
	}
}
