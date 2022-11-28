package collection;

//Movie

import java.util.ArrayList;
import java.util.Collections;

public class SortMocie {
	public static void main(String[] args) {
		ArrayList<Movie> a=new ArrayList<Movie>();
		a.add(new Movie("ABC", 2022));
		a.add(new Movie("B", 2020));
		a.add(new Movie("C", 2021));
		a.add(new Movie("D", 2023));
		a.add(new Movie("E", 2016));
		a.add(new Movie("F", 2018));
		Collections.sort(a);
		System.out.println("Latest:"+a.get(0));
		System.out.println("Oldest:"+a.get(a.size()-1));
		for(int i=0;i<a.size();i++) {
			if(a.get(i).year>2017&&a.get(i).year<2020) {
				System.out.println(a.get(i));
			}
			if(a.get(i).name.startsWith("A")) {
				System.out.println(a.get(i));
			}
		}
	}
}
