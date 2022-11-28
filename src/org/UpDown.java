package org;

class Up{
	int up=10;
	void add() {
		System.out.println("1st method");
	}
}

class Down extends Up{
	int down=20;
	@Override
	void add() {
		System.out.println("Override method");
	}
}

class Down1 extends Up{
	int down1=30;
	@Override
	void add() {
		System.out.println("ovverriden");
	}
}

public class UpDown {
	static void demo(Up u) {
		u.add();
	}
	public static void main(String[] args) {
		demo(new Down());
		demo(new Down1());
	}
}