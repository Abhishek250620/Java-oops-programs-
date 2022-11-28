package hasarelationship;

class Country{
	String name;
	State stt;
	Country(String name,State stt){
		this.name=name;
		this.stt=stt;
	}
}

class State{
	String name;
	District dist;
	State(String name,District dist){
		this.name=name;
		this.dist=dist;
	}
}

class District{
	String name;
	District (String name){
		this.name=name;
	}
}

public class CountryMain {
	public static void main(String[] args) {
		District dist=new District("Ramanagar");
		State stt=new State("Karnataka", dist);
		Country cunt=new Country("India", stt);
		System.out.println(cunt.stt.dist.name);
		System.out.println(cunt.stt.name);
		System.out.println(cunt.name);
		Country c1=new Country("US", new State("xyz", new District("abc")));
		System.out.println(new State("goa",new District("aa")));
	}
}