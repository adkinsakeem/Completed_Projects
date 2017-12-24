package Names;

import java.util.ArrayList;
import java.util.Arrays;

public class NameVerification extends Main{
	static int memberLoop = 0;
	public static String[] Junior = {"Junior","Jr","Jr.","JR","J.R.","j.r.","J R","JR.", "jr"}; 
	public static String[] Senior = {"Senior","Sr","Sr.","SR","S.R.","s.r.","S R","SR.", "sr"};
	public static String[] Second = {"Second","II","ii","The Second","2","the second","The second", "second"}; 
	public static String[] Third = {"Third","III","iii","The Third","3","the third","The third", "third"};
	public static String[] Fourth = {"Fourth","IV","iv","The Fourth","4","the fourth","The fourth", "fourth"};
	
	
	public static void NameVerification1(int nameLoop, ArrayList<String> searchMember){
		memberLoop = 0;
		while(((searchMember.size()-1) >= memberLoop)){
		if (NameList.get(nameLoop).Names[memberLoop].equals(searchMember.get(memberLoop))){
			nameCheck = true;
		}else{

			if(searchMember.size()-1 == memberLoop){
				Checksuffix(nameLoop, searchMember, memberLoop);
			}else{
			nameCheck = false;
			}
		}
		memberLoop++;
	}
	}
	

public static void Checksuffix(int nameLoop, ArrayList<String> searchMember, int memberLoop){
	checkJunior(nameLoop, searchMember, memberLoop);
	
	if(nameCheck == false){
		checkSenior(nameLoop, searchMember, memberLoop);
	}
	if(nameCheck == false){
		checkSecond(nameLoop, searchMember, memberLoop);
	}
	if(nameCheck == false){
		checkThird(nameLoop, searchMember, memberLoop);
	}
	if(nameCheck == false){
		checkFourth(nameLoop, searchMember, memberLoop);
	}
}

public static void checkJunior(int nameLoop, ArrayList<String> searchMember, int memberLoop){
	if((Arrays.asList(Junior).contains(NameList.get(nameLoop).Names[memberLoop])) && (Arrays.asList(Junior).contains(searchMember.get(memberLoop)))){
		nameCheck = true;
	}else{
		nameCheck = false;
	}
}

public static void checkSenior(int nameLoop, ArrayList<String> searchMember, int memberLoop){
	if((Arrays.asList(Senior).contains(NameList.get(nameLoop).Names[memberLoop])) && (Arrays.asList(Senior).contains(searchMember.get(memberLoop)))){
		nameCheck = true;
	}else{
		nameCheck = false;
	}
}

public static void checkSecond(int nameLoop, ArrayList<String> searchMember, int memberLoop){
	if((Arrays.asList(Second).contains(NameList.get(nameLoop).Names[memberLoop])) && (Arrays.asList(Second).contains(searchMember.get(memberLoop)))){
		nameCheck = true;
	}else{
		nameCheck = false;
	}
}

public static void checkThird(int nameLoop, ArrayList<String> searchMember, int memberLoop){
	if((Arrays.asList(Third).contains(NameList.get(nameLoop).Names[memberLoop])) && (Arrays.asList(Third).contains(searchMember.get(memberLoop)))){
		nameCheck = true;
	}else{
		nameCheck = false;
	}
}

public static void checkFourth(int nameLoop, ArrayList<String> searchMember, int memberLoop){
	if((Arrays.asList(Fourth).contains(NameList.get(nameLoop).Names[memberLoop])) && (Arrays.asList(Fourth).contains(searchMember.get(memberLoop)))){
		nameCheck = true;
	}else{
		nameCheck = false;
	}
}



}
