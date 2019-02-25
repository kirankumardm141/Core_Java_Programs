package com.pragim.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

import com.pragim.model.Movie;

public class TreeSetWithMoviesWithComparable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Movie> al = new ArrayList<Movie>();
		Movie m1 = new Movie(5, "ddl", 1999);
		Movie m2 = new Movie(4, "kkh", 2000);
		Movie m3 = new Movie(1, "dhangal", 2017);
		Movie m4 = new Movie(6, "shivaji", 2010);
		Movie m5 = new Movie(2, "ravan", 2011);
		Movie m6 = new Movie(3, "delhi", 2014);
		
		al.add(m1);
		al.add(m2);
		al.add(m3);
		al.add(m4);
		al.add(m5);
		al.add(m6);
		
		//TreeSet<Movie> ts = new TreeSet<Movie>(al);
		
		
		Collections.sort(al, new MovieComparator());
		System.out.println(al);
		
		
		
		//TreeSet<Movie> ts = new TreeSet<Movie>(new MovieComparator());
		
		/*Movie m1 = new Movie(5, "ddl", 1999);
		Movie m2 = new Movie(4, "kkh", 2000);
		Movie m3 = new Movie(1, "dhangal", 2017);
		Movie m4 = new Movie(6, "shivaji", 2010);
		Movie m5 = new Movie(2, "ravan", 2011);
		Movie m6 = new Movie(3, "delhi", 2014);
		
		ts.add(m1);
		ts.add(m2);
		ts.add(m3);
		ts.add(m4);
		ts.add(m5);
		ts.add(m6);*/
		
		
		//System.out.println(ts);
		

	}

}
class MovieComparator implements Comparator<Movie>
{

	@Override
	public int compare(Movie o1, Movie o2) {
		// TODO Auto-generated method stub
		return o1.getMovName().compareTo(o2.getMovName());
	}
	
}