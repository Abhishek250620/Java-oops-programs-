package collection;
import java.util.Comparator;
import java.util.TreeSet;
class Emp{
	int id;
	Emp(int id){
		this.id=id;
	}
	@Override
	public String toString() {
		return "id:"+id;
	}
}
class SortEmpById implements Comparator<Emp>{
	@Override
	public int compare(Emp x,Emp y) {
		return x.id-y.id;
	}
}
public class EmplSort {
	public static void main(String[] args) {
		TreeSet<Emp> t=new TreeSet<Emp>(new SortEmpById());
		t.add(new Emp(30));
		t.add(new Emp(10));
		t.add(new Emp(40));
		t.add(new Emp(20));
		for(Emp i:t) {
			System.out.println(i+" ");
		}
	}
}
