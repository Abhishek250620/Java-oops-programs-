package logicalprogarming;

public class CaseConvert {
	public static void main(String[] args) {
		char c='1';
		if(c>='A'&&c<='Z')
			System.out.println(c+=32);
		else if(c>='a'&&c<='z')
			System.out.println(c-=32);
		else
			System.out.println("Not Alpha");
	}
}
