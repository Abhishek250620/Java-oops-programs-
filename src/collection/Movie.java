package collection;

public class Movie implements Comparable<Movie> {
	String name;
	int year;
	public Movie(String name, int year) {
		this.name = name;
		this.year = year;
	}
	@Override
	public String toString() {
		return "Movie:"+name+" year:"+year;
	}
	@Override
	public int compareTo(Movie m) {
		return this.year-m.year;
	}
}
