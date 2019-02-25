package pack4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MapDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		try {
			BufferedReader br = new BufferedReader(new FileReader("D:\\All Java\\testdoc.txt"));
			String line=null;
			List<Movie> list = new ArrayList<Movie>();
			while ((line = br.readLine())!=null) {
				String[] data = line.split(" ");
				String heroName = data[0].trim();
				String movieName = data[1].trim();
				int year = Integer.parseInt(data[2]);
				Movie movie = new Movie(heroName,movieName,year);
				list.add(movie);
			}
			
			Map<String,List<Movie>> map = convertColIntoMap(list);
		
			Scanner sc = new Scanner(System.in);
			System.out.println("enter hero name");
			String hname = sc.next();
			System.out.println(map.get(hname));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static Map<String, List<Movie>> convertColIntoMap(List<Movie> list) {
		// TODO Auto-generated method stub
		
		Map<String, List<Movie>> finalMap= new HashMap<String, List<Movie>>();
		for (Movie movie : list) {
			
			if(finalMap.get(movie.getHeroName())==null){
				List<Movie> heroMovies = new ArrayList<Movie>();
				heroMovies.add(movie);
				finalMap.put(movie.getHeroName(), heroMovies);
			}else{
				List<Movie> existingMov = finalMap.get(movie.getHeroName());
				existingMov.add(movie);
				finalMap.put(movie.getHeroName(), existingMov);
			}
			
			
		}
		
		
		return finalMap;
	}

}
