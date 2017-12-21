package main;

import java.io.IOException;
import java.util.Scanner;
import java.util.stream.IntStream;


public class Groups {
	
	static Team allTeam[] = new Team[6];
	static int[] availableNumbers = new int[6];
	static int teamCount = 0;
	static int x = 0;
	static int x3 = 0;
	static String teamName = "";
	static boolean removedname = false;
	static  String log = "";
	static int logNumber = 1;
	
	public static void main(String[] args) {
		
		System.out.println("There are 3 Teams named \"Air, Land, and Sea\"");
		System.out.println("Are we Adding, Removing, Displaying Team Members, or Show Log?");
		try {
			readCommand();
		} catch (invalidInputException e) {
			e.printStackTrace();
		}
	}
	
	
	public static void readCommand() throws invalidInputException{
		
		@SuppressWarnings("resource")
		Scanner reader = new Scanner(System.in); 
		System.out.println("Type \"Add, Remove, Display, or Log\"");
		String input = reader.nextLine();
		input = input.toLowerCase();
	     switch (input) {
	         case "add":
	        	 addTeamMember();
	             break;
	         case "remove":
	        	 removeTeamMember();
	             break;
	         case "display":
	        	 displayTeamMembers();
	        	 break;
	         case "log":
	        	 showLogs();
	        	 break;
	         default:
	        	System.out.println("The Input is Invalid");
	        	readCommand();
	        	 
	     }
	}
	
	public static void showLogs() throws invalidInputException{
		try{
		Team.displayLog();
		System.out.println("Press Enter key to continue...");
		@SuppressWarnings({ "unused", "resource" })
		Scanner reader = new Scanner(System.in);
		}catch(NullPointerException e){
			System.out.println("Something Went Wrong!");
			System.out.println(e);
		}
		
		 try {
			System.in.read();
			readCommand();
		} catch (IOException e) {
			System.out.println("Something Went Wrong!");
		}
	}
	
	
	public static void  displayTeamMembers() throws invalidInputException{
	
		try{
		for(int x = 0; x < 5; x++){
			if(allTeam[x] != null){
				allTeam[x].displayMembers();
			}
		}
		}catch(ArrayIndexOutOfBoundsException e){
			
		}
		readCommand();
	}
	public static void removeTeamMember() throws invalidInputException{
		int x = 0;
		String log = "";
		
		 
		
		@SuppressWarnings("resource")
		Scanner inputData = new Scanner(System.in);
		System.out.println("Type the name you would like to remove");
		String removeMember = inputData.nextLine();
		while(x < 5){
			
			if (allTeam[x] != null){
			allTeam[x].checkRemovedNames(removeMember, x);
			}
			if(removedname == true){
				break;
			}
			x++;
		}
		if(removedname == true){
			while (x < 5){
				allTeam[x] = allTeam[x+1];
				x++;
			}
			allTeam[5] = null;
			
			log = removeMember + " has been removed from team " + teamName + ".";
			System.out.println(log);
			Team.enterLog(log, logNumber);
			logNumber++;
		}else{
			try{
			throw new invalidInputException();
			}catch (invalidInputException e){
				
			}
		}
		readCommand();
	}
	
	public static void addTeamMember() throws invalidInputException{

		int x2 = 0;
		
		@SuppressWarnings("resource")
		Scanner inputData = new Scanner(System.in);
		System.out.println("Type Team Members Name");
		String inputMember = inputData.nextLine();
		
		System.out.println("Type The Team This Member Will Join");
		String inputTeam = inputData.nextLine();
		
		inputTeam = inputTeam.toLowerCase();;
		//x = 0;
		try{
			while(allTeam[x] != null || x == 6){
				
			teamCount = x;
			x++;
				
			}
		}catch(ArrayIndexOutOfBoundsException e){
			//Do Nothing
		}
		x2 = 0;
		while (allTeam[x2]!= null){
			
			x3 = allTeam[x2].getPlayerNumber(x3);
			availableNumbers[x2] = x3;
			x2++;
		}

		boolean contains1 = IntStream.of(availableNumbers).anyMatch(x -> x == 1);
		boolean contains2 = IntStream.of(availableNumbers).anyMatch(x -> x == 2);
		boolean contains3 = IntStream.of(availableNumbers).anyMatch(x -> x == 3);
		boolean contains4 = IntStream.of(availableNumbers).anyMatch(x -> x == 4);
		boolean contains5 = IntStream.of(availableNumbers).anyMatch(x -> x == 5);
		
		if(contains1 == false){
			x3 = 1;
		}else if(contains2 == false){
			x3 = 2;
		}else if(contains3 == false){
			x3 = 3;
		}else if(contains4 == false){
			x3 = 4;
		}else if(contains5 == false){
			x3 = 5;
		}else{
			x3 = 6;
		}





	
		
			 switch (inputTeam) {
	         case "air":
	        	 addAir(x, inputMember, x3);
	             break;
	         case "land":
	        	 addLand(x, inputMember, x3);
	             break;
	         case "sea":
	        	 addSea(x, inputMember, x3);
	             break;
	             default:
	            	 wrongInput();
			 }
			 
	}
	
	public static void wrongInput(){
		System.out.println("The Input is Invalid");
		try {
			readCommand();
		} catch (invalidInputException e) {
			System.out.println("Error Has Occurred");
			e.printStackTrace();
		}
	}
			 
			 @SuppressWarnings("static-access")
			public static void addAir(int x, String inputMember, int x3) throws invalidInputException{
				
				 try{
				
				 allTeam[x] = new TeamAir();
				 allTeam[x].addInfo(x, inputMember, x3);
				 allTeam[x].showLog(log);
				 allTeam[x].enterLog(log, logNumber);
				 logNumber++;
				 }catch(ArrayIndexOutOfBoundsException e){
					 log = "There is no more room on the teams. Please remove someone.";
					 Team.enterLog(log, logNumber);
					 logNumber++;
				 }
				 readCommand();
				 
			 }
			 
			 @SuppressWarnings("static-access")
			public static void addLand(int x, String inputMember, int x3) throws invalidInputException{
				 
				
				 
				 try{
				 allTeam[x] = new TeamLand();
				 allTeam[x].addInfo(x, inputMember, x3);
				 
				 allTeam[x].showLog(log);
				 
				 allTeam[x].enterLog(log, logNumber);
				 logNumber++;
				 }catch(ArrayIndexOutOfBoundsException e){
					 log = "There is no more room on the teams. Please remove someone.";
					 allTeam[x].showLog(log);
				 }
				 readCommand();
				 
				 
			 }
 
 @SuppressWarnings("static-access")
public static void addSea(int x, String inputMember, int x3) throws invalidInputException{
	 
	
	 
	 try{
	 allTeam[x] = new TeamSea();
	 allTeam[x].addInfo(x, inputMember, x3);
	 
	 allTeam[x].showLog(log);
	 
	 allTeam[x].enterLog(log, logNumber);
	 logNumber++;
	 }catch(ArrayIndexOutOfBoundsException e){
		 log = "There is no more room on the teams. Please remove someone.";
		 allTeam[x].enterLog(log, logNumber);
		 logNumber++;
	 }
	 readCommand();
	 
 }


}
