package com.pragim.model;

public class Movie {
	
	private int id;
	private String movName;
	private int year;
	
	public Movie(int id, String movName, int year) {
		super();
		this.id = id;
		this.movName = movName;
		this.year = year;
	}

	@Override
	public String toString() {
		return "Movie [id=" + id + ", movName=" + movName + ", year=" + year
				+ "]";
	}

	public int getId() {
		return id;
	}

	public String getMovName() {
		return movName;
	}

	public int getYear() {
		return year;
	}

	/*@Override
	public int compareTo(Movie o) {
		// TODO Auto-generated method stub
		String mov1 = this.getMovName();
		String mov2 = o.getMovName();
		return mov1.compareTo(mov2);
	}*/
	
	
	
	
	
	

}
