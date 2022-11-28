package singleton;
class AdharCard{
	String name;
	int id;
	private static AdharCard ac;
	private AdharCard(String name,int id) {
		System.out.println("Object Created");
		this.name=name;
		this.id=id;
	}
	@Override
	public String toString() {
		return "Id of "+name+" is "+id;
	}
	public static AdharCard getInstance(String name,int id) {
		if(ac==null) {
			ac=new AdharCard(name,id);
		}
		return ac;
	}
}
public class Person {
	public static void main(String[] args) {
		System.out.println(AdharCard.getInstance("Smith",2345));
		System.out.println(AdharCard.getInstance("Smith",2345));
		System.out.println(AdharCard.getInstance("Smith",2345));
	}
}
