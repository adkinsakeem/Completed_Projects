package capitalOne.Arena;

public class Member implements BronzeMember, SilverMember, GoldMember {
	
	protected String name = "";
	protected String membershipType = "";
	protected String seatsType = "None";
	protected int freeDrink = 0;
	protected int freeShirt = 0;
	protected int guestsAmount = 0;
	protected boolean backstage = false;
	protected String MemberHTML = "";

	protected void checkMembership(String name, String newMember){
		
		switch (newMember) {
        case "bronzeMember": BronzeMembership(name);
        break;
        
        case "silverMember": SilverMembership(name);
        break;
        
        case "goldMember": GoldMembership(name);
        break;       
                 
		}
		
		if (backstage == true){
			MemberHTML = "<html> <head> <title>Member Added </title></head><body><h1>This Member Has Been Added</h1><br>"+name+"<br>Has a "+membershipType+" Membership<br>Member has "+seatsType+" seats<br>Member is allowed "+freeDrink+" free drinks<br>Member is allowed "+freeShirt+" free shirts<br>Member is allowed to bring "+guestsAmount+" guests<br>Member has access to backstage<br><form action=\"http://localhost:8080/Arena/membershipIndex.jsp\" method=post><br>	<input type=\"submit\" name=\"back\" value=\"Back to Member Page\" /></form></body></html>";
		}else{
			MemberHTML = "<html> <head> <title>Member Added </title></head><body><h1>This Member Has Been Added</h1><br>"+name+"<br>Has a "+membershipType+" Membership<br>Member has "+seatsType+" seats<br>Member is allowed "+freeDrink+" free drinks<br>Member is allowed "+freeShirt+" free shirts<br>Member is allowed to bring "+guestsAmount+" guests<br><form action=\"http://localhost:8080/Arena/membershipIndex.jsp\" method=post><br>	<input type=\"submit\" name=\"back\" value=\"Back to Member Page\" /></form></body></html>";
		}
		
	}
	
	
	public void BronzeMembership(String newName){
		name = newName;
		membershipType = "Bronze";
		seatsType = "Economy";
		freeDrink = 1;
		guestsAmount = 1;
		
	}
	
	public void SilverMembership(String newName){
		name = newName;
		membershipType = "Silver";
		seatsType = "Deluxe";
		freeDrink = 3;
		guestsAmount = 2;
		freeShirt = 1;
		
	}
	
	public void GoldMembership(String newName){
		name = newName;
		membershipType = "Gold";
		seatsType = "Skybox";
		freeDrink = 5;
		guestsAmount = 4;
		freeShirt = 2;
		backstage = true;
		
	}

}


