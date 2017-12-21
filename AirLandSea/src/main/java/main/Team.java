package main;

public class Team {
	
	 String Playername = "John Doe";
	 static int Playernumber = 0;
	 static StringBuffer TeamsLog = new StringBuffer();

	 String TeamName = "Captain";
	 Boolean nameMatch = false;

	public void addInfo(int x, String inputMember, int x2) {
		Playername = inputMember;
		System.out.println();
		
	}
	
	public void checkRemovedNames(String removeMember, int x){
		nameMatch = false;
		if(removeMember.toLowerCase().equals(Playername.toLowerCase())){
			Groups.teamName = TeamName;
			nameMatch = true;

		}
		Groups.removedname = nameMatch;

	}
	
	public static void displayLog(){
	System.out.println(TeamsLog);	
	}
	
	public void displayMembers(){
		System.out.println(Playernumber + ". " + Playername + ";");
	}
	
	public String showLog(String log){
		log = (Playername + " Is Now The Judge for All Teams.");
		System.out.println(log);
		Groups.log = log;
		return log;
	}
	
	public static void enterLog(String log, int logNumber){
		
		TeamsLog.append(logNumber + ". " + log + "; ");
	}
	
	public int getPlayerNumber(int x3){
		
		x3 = Playernumber;
		return x3;
	}

}
