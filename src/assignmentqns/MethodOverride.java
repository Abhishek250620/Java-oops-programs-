package assignmentqns;

class Insta{
	String media() {
		return "image";
	}
}

class Insta2 extends Insta{
	String media() {
		System.out.println(super.media());
		return "audio";
	}
}

class MethodOverride extends Insta2{
	public static void main(String[] args) {
		MethodOverride m=new MethodOverride();
		System.out.println(m.media());
	}
}
