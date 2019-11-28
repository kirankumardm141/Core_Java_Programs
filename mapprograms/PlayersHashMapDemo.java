package mapprograms;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class PlayersHashMapDemo {

	private static Map<String, List<Players>> convertListIntoMap(List<Players> playerslist) {
		Map<String, List<Players>> finalop = new HashMap<String, List<Players>>();

		for (Players players : playerslist) {

			if (finalop.get(players.getTeamName()) == null) {
				List<Players> li = new ArrayList<Players>();
				li.add(players);
				finalop.put(players.getTeamName(), li);
			} else {
				List<Players> existingPlayers = finalop.get(players.getTeamName());
				existingPlayers.add(players);
				finalop.put(players.getTeamName(), existingPlayers);
			}

		}

		return finalop;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=null;
		try {

			BufferedReader br = new BufferedReader(new FileReader("D:\\WorkSpace\\Players.txt"));
			String line = null;

			List<Players> playerslist = new ArrayList<Players>();
			while ((line = br.readLine()) != null) {
				String[] data = line.split(",");
				int runs = Integer.parseInt(data[3].trim());
				int wickets = Integer.parseInt(data[4].trim());
				Players pl = new Players(data[0].trim(), data[1].trim(), data[2].trim(), runs, wickets);
				playerslist.add(pl);
			}
			System.out.println(playerslist);

			Map<String, List<Players>> map = convertListIntoMap(playerslist);

			System.out.println(map);

			sc = new Scanner(System.in);
			System.out.println("Enter Team Name:");
			String teamName = sc.next();
			// sc.close();

			List<Players> obj = map.get(teamName);
			System.out.println(obj);

			br.close();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			sc.close();
		}
		
	}

}
