package capitalOne.Arena;

import java.util.ArrayList;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/addMember")
public class Arena extends Member {

	String newName = "";
	String newMember = "";
	ArrayList<Member> Arenamembers = new ArrayList<Member>();
	int memberCount = 0;
	//String addMemberHTML = "<html> <head> <title>Member Added </title></head><body><h1>This Member Has Been Added</h1><form action=\"http://localhost:8080/Arena/membershipIndex.jsp\" method=post><br>	<input type=\"submit\" name=\"back\" value=\"Back to Member Page\" /></form></body></html>";
	public String addMemberHTML = "";
	
	
	@POST
	@Produces(MediaType.TEXT_HTML)
	public String getMember(@FormParam("memberName") String name,
			@FormParam("memberType") String Mtype){
		
		System.out.println(newMember);
		Member member = new Member();
		
		member.checkMembership(name, Mtype);
		addMemberHTML = member.MemberHTML;
		getMember(member);
		System.out.println(addMemberHTML);
		return addMemberHTML;
		
	}
	
	public void getMember(Member member){
		memberCount++;
		Arenamembers.add(member);
	}

	
}
