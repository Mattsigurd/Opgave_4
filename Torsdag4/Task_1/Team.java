import java.util.ArrayList;

public class Team{
		

	private String teamName = "Team Iceland";
	private int teamRank = 3;
	private ArrayList<String> teamMembers = new ArrayList<>();
	
	public static void getRank(){}

	public Team(String team){
		teamMembers.add("Matthias");
		teamMembers.add("Hanna");
		teamMembers.add("Juan");
	}
	public String toString(){
		return("Hold: "+teamName+"rank: "+teamRank);
	}
}
