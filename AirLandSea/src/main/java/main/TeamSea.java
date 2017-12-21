package main;

public class TeamSea extends Team {
	
	String Playername;
	int Playernumber;
	String TeamName = "Team Sea";
	Boolean nameMatch = false;
	
public void addInfo(int x, String inputMember, int x2){
		
		Playername = inputMember;
		Playernumber = x2;
		
	}

public void displayMembers(){
	System.out.println(Playernumber + ". " + Playername + ";");
}

public void checkRemovedNames(String removeMember, int x){
	nameMatch = false;
	if(removeMember.toLowerCase().equals(Playername.toLowerCase())){
		Groups.teamName = TeamName;
		nameMatch = true;

	}
	Groups.removedname = nameMatch;

}

public String showLog(String log){
	log = (Playername + " has been added to Team Sea as number " + Playernumber + ".");
	System.out.println(log);
	Groups.log = log;
	return log;
}

public int getPlayerNumber(int x3){
	
	x3 = Playernumber;
	return x3;
}


}
