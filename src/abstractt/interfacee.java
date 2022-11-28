package abstractt;

interface vehicle{
	String brand="honda";
	void start();
	void stop();
}

class interfacee implements vehicle {
	@Override
	public void start() {
		System.out.println("vehicle started");
	}

	@Override
	public void stop() {

	}
	public static void main(String[] args) {
		interfacee in=new interfacee();
		in.start();
		in.stop();
		System.out.println(interfacee.brand);
	}
}