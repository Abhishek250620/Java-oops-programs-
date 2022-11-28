package inheritancee;
import java.util.ArrayList;
import java.util.Collections;
class Emp implements Comparable<Emp>{
	int id;
	String name;
	Emp(int id,String name){
		this.id=id;
		this.name=name;
	}
	@Override
	public String toString() {
		return "Name: "+name+" id:"+id;
	}
	@Override
	public int compareTo(Emp e) {
		return this.id-e.id;
	}
}
public class SortEmp {
	public static void main(String[] args) {
		ArrayList<Emp> al=new ArrayList<Emp>();
		al.add(new Emp(30,"hgf"));
		al.add(new Emp(20,"ff"));
		al.add(new Emp(40,"vvjj"));
		al.add(new Emp(10,"abvde"));
		Collections.sort(al);
		for(Emp e:al) {
			System.out.println(e+" ");
		}
	}
}
