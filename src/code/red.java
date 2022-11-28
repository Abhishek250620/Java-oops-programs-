package code;

class vehicle{
	String brand;
	vehicle(String brand){
		this.brand=brand;
	}  
}

class car extends vehicle{
	double cost;
	car(String brand,double cost){
		super(brand);
		this.cost=cost;
	}
}

class bike extends vehicle{
	String color;
	bike(String brand,String color){
		super(brand);
		this.color=color;
	}
}

class red {
	public static void main(String[] args) {
		bike b=new bike("honda","black");
		car c=new car("bajaj",40000);
		System.out.println("car brand:"+c.brand);
		System.out.println("car cost:"+c.cost);
		System.out.println("bike brand:"+b.brand);
		System.out.println("bike color:"+b.color);
	}
}
