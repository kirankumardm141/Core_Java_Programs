package mapprograms;

public class Players {

	private String playerName;
	private String teamName;
	private String skill;
	private int runs;
	private int wickets;

	// Constructor
	public Players(String playerName, String teamName, String skill, int runs, int wickets) {
		super();
		this.playerName = playerName;
		this.teamName = teamName;
		this.skill = skill;
		this.runs = runs;
		this.wickets = wickets;
	}

	@Override
	public String toString() {
		return playerName + " " + teamName + " " + skill + " " + runs + " " + +wickets + " ";
	}

	// Getter Methods
	public String getPlayerName() {
		return playerName;
	}

	public String getTeamName() {
		return teamName;
	}

	public String getSkill() {
		return skill;
	}

	public int getRuns() {
		return runs;
	}

	public int getWickets() {
		return wickets;
	}

}
