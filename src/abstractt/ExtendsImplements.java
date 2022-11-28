package abstractt;

interface demo{
	double PI=3.14;
	void walk();
}

interface demo2{
	String name="yahoo";
	void browsing();
}

class demo3{
	int id=12;
	void start() {
		System.out.println("class method");
	}
}

class ExtendsImplements extends demo3 implements demo,demo2{
	@Override
	public void walk() {
		
	}
	@Override
	public void browsing() {
		
	}
	public static void main(String[] args) {
		ExtendsImplements ei =new ExtendsImplements();
		ei.browsing();
		ei.walk();
		ei.start();
		System.out.println(ei.id);
		System.out.println(ExtendsImplements.PI);
		System.out.println(ExtendsImplements.name);
	}
}
