package javabean;

public class demo {
	
	private int id;
	private String name;
	
	public void setId(int id) {
		this.id=id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo d=new demo();
		d.setId(12);
		d.setName("Abhishek");
		System.out.println("emp id is: "+d.getId());
		System.out.println("emp name is: "+d.getName());

	}

}
