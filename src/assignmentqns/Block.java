package assignmentqns;

public class Block {
	int a;
	static int b;


	static {
		b=23;
	}
	//non static
	{
		a=12;
		b=23;
	}
	public static void main(String[] args) {
		Block B=new Block();
		System.out.println(B.b);
		System.out.println(B.a);
	}
}
