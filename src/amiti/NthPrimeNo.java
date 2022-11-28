package amiti;

public class NthPrimeNo {
	public static void main(String[] args) {
		int n=5;
		int count=0;
		int num=1;
		while(count<n) {
			num+=1;
			int i=2;
			for(i=2;i<=num;i++) {
				if(num%i==0) {
					break;
				}
			}
			if(i==num) {
				count+=1;
			}
		}
	}
}
