package org.capitalone.greetingsproject.greetings_web_app;


import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context; 
import javax.ws.rs.core.MediaType;


@Path("/")
public class Main_Greeting {
	@Context
	  public String HTMLGreeting = "";
	  
	  HTML_Builder html_builder = new HTML_Builder();
	  	
	@Path("name")
	@GET
	@Produces(MediaType.TEXT_HTML)
	  public String getHTMLString(){
		  return html_builder.GetFullHTML();

	 }



@Path("/Getname")
@POST
@Produces(MediaType.TEXT_PLAIN)
public String askName(@FormParam("nameValue") String name){
	return "Hello " + name;
}
}
