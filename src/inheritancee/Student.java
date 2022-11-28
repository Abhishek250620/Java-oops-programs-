package inheritancee;
class College{
	String name;
	Dept dept;
	public College(String name, Dept dept) {
		this.name = name;
		this.dept = dept;
	}
}
class Dept{
	String name;
	Student std;
	Dept(String name,Student std){
		this.name=name;
		this.std=std;
	}
}
public class Student{
	String name;
	Student(String name){
		this.name=name;
	}
	public static void main(String[] args) {
		Student std=new Student("tom");
		System.out.println(std.name);
		Dept dept=new Dept("cse",std);
		System.out.println(dept.name);
		College clg=new College("gecr",dept);
		System.out.println(clg.name);
	}
}