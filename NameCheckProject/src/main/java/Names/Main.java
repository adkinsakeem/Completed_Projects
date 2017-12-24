package Names;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
	
	static boolean TestOn = true;
	
	//static ArrayList <String> NameList = new ArrayList<String>();
	static ArrayList<people> NameList = new ArrayList<people>();
	static people names;
	static String n1 = "";
	static String n2 = "";
	static String n3 = "";
	static String n4 = "";
	static String n5 = "";
	static String n6 = "";
	static String n7 = "";
	static String n8 = "";
	static String n9 = "";
	static String n10 = "";
	static int test = 0;
	static boolean nameCheck = false;
	static boolean breakLoop = true;
	

	public Boolean main(String testName) throws FileNotFoundException, IOException {
		ReadNames.getNames();
		askForNames(testName);
		
		return nameCheck;

	}
	
	public static void askForNames(String testName){
		int indexnum1 = 0;
		int indexnum2 = 0;
		String tempSearchName = "";
		ArrayList<String>searchMember = new ArrayList<String>();
		@SuppressWarnings("resource")
		Scanner inputName = new Scanner(System.in);
		String inputPerson = testName;
		if(TestOn == false){
		System.out.println("Please Enter A Name To Search:");
		inputPerson = inputName.nextLine();
		}
		 while(indexnum1 != -1){
			 indexnum2 = indexnum1;
			 indexnum1 = inputPerson.indexOf(" ", indexnum2);
			 if(indexnum1 != -1){
			 tempSearchName = (inputPerson.substring(indexnum2, indexnum1));
			 searchMember.add(tempSearchName);
			 indexnum1++;
			 }else{
			tempSearchName = (inputPerson.substring(indexnum2));
			searchMember.add(tempSearchName);
			 }
		 }
		searchNames(searchMember);
	}
	
	public static void searchNames(ArrayList<String> searchMember){
		nameCheck = true;
		int nameLoop = 0;
		int ListBounds = NameList.size();
		
		while(nameLoop != ListBounds){
			breakLoop = false;
			if(searchMember.size() == NameList.get(nameLoop).nameSize){
			NameVerification.NameVerification1(nameLoop, searchMember);
			}else{
				nameCheck = false;
			}
			nameLoop++;
		
		if(nameCheck == true){
			break;
		}
	}
		//System.out.println(nameCheck);
	}
	
	
	
//Below Code Gets All Names From Database************************************
//***************************************************************************

	
	public static void addName(String subName, int indexcount){
		
		switch (indexcount) {
        case 1: 
        	
        n1 = null;
        n2 = null;
        n3 = null;
        n4 = null;
        n5 = null;
        n6 = null;
        n7 = null;
        n8 = null;
        n9 = null;
        n10 = null;
        n1 = subName;
        break;
        case 2: n2 = subName;
        break;
        case 3: n3 = subName;
        break;
        case 4: n4 = subName;
        break;
        case 5: n5 = subName;
        break;
        case 6: n6 = subName;
        break;
        case 7: n7 = subName;
        break;
        case 8: n8 = subName;
        break;
        case 9: n9 = subName;
        break;
        case 10: n10 = subName;
        break;
		}
		
	}
	
	public static void addToArray(int indexcount){
		people names = new people();
		names.addInfo(n1, n2, n3, n4, n5, n6, n7, n8, n9, n10, indexcount);
		NameList.add(names);

	}
	

}
