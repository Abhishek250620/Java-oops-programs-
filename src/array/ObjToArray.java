package array;

class Mobile{
	String brand;
	int cost;
	Mobile(String brand,int cost){
		this.brand=brand;
		this.cost=cost;
	}
}
 
public class ObjToArray {
	public static void main(String[] args) {
		Mobile m1=new Mobile("Samsung",50000);
		Mobile m2=new Mobile("Mi",6260);
		Mobile m3=new Mobile("Apple",100000);

		Mobile[] m= {m1,m2,m3};
		for(int i=0;i<m.length;i++) {
			System.out.println(m[i].brand+" "+m[i].cost);
		}
	}
}