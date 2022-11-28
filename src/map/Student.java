package map;
import java.util.Set;
import java.util.TreeMap;
class Stu implements Comparable<Stu>{
	int id;
	String name;
	Stu(int id,String name){
		this.id=id;
		this.name=name;
	}
	@Override
	public String toString() {
		return "Id:"+id+" Name:"+name;
	}
	@Override
	public int compareTo(Stu s) {
		return this.name.compareTo(s.name);
	}
}
public class Student {
	public static void main(String[] args) {
		TreeMap<Stu,Integer> tm=new TreeMap<Stu,Integer>();
		tm.put(new Stu(20,"Abhi"),34);
		tm.put(new Stu(10,"Smith"),20);
		tm.put(new Stu(30,"Tom"),5);
		tm.put(new Stu(40,"Jerry"),45);
		Set<Stu>s=tm.keySet();
		for(Stu key:s) {
			System.out.println(key+" "+" Marks:"+tm.get(key));
		}
	}
}
