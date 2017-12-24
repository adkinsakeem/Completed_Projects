package org.capitalone.greetingsproject.greetings_web_app;

public class HTML_Builder {

	private String htmlOpen;
	private String title = "Capital One Greeting";
	private String bodyOpen;
	private String pageHeader = "Capital One Greeting";
	private String formAct = "\"http://localhost:8080/greetings-web-app/webapi/Getname\"";
	private String formWords = "Please Type Your Name: ";
	private String nameValue = "\"nameValue\"";
	private String submitValue = "\"Submit Name\"";

	
	//private String HTMLComplete = "";
	StringBuffer HTMLComplete = new StringBuffer(1000);
	
	public String GetFullHTML(){
		getHtmlOpen(HTMLComplete);
		getTitle(HTMLComplete);
		getBodyOpen(HTMLComplete);
		getHeader(HTMLComplete);
		getForm(HTMLComplete);
		getBodyClose(HTMLComplete);
		getHtmlClose(HTMLComplete);
		
		return HTMLComplete.toString();
	}
	
	
	public String getHtmlOpen(StringBuffer htmlOpen) {
		htmlOpen.append("<html> ");
		return htmlOpen.toString();
	}
	
	public String getTitle(StringBuffer htmlOpen) {
		htmlOpen.append("<title> ");
		htmlOpen.append( title);
		htmlOpen.append( " </title> ");
		return htmlOpen.toString();
	}
	
	public String getBodyOpen(StringBuffer htmlOpen) {
		htmlOpen.append( "<body> ");
		
		return htmlOpen.toString();
	}
	
	public String getHeader(StringBuffer htmlOpen){
		htmlOpen.append( "<h1> ");
		htmlOpen.append( pageHeader);
		htmlOpen.append( "</h1> ");
		
		return htmlOpen.toString();
	}
	
	public String getForm(StringBuffer htmlOpen) {
		htmlOpen.append( "<form action= ");
		htmlOpen.append( formAct);
		htmlOpen.append( "  method=post>");
		htmlOpen.append( "<p>");
		htmlOpen.append( formWords);
		htmlOpen.append( "<input type=\"text\" name="+nameValue+" value=\"\" />");
		htmlOpen.append( "</p>");
		htmlOpen.append( "<br>");
		htmlOpen.append( "<input type=\"submit\" name=\"submit\" value="+submitValue+" />");
		htmlOpen.append( "</form>");
		
		return htmlOpen.toString();
	}
	
	public String getBodyClose(StringBuffer htmlOpen) {
		htmlOpen.append( "</body>");
		return htmlOpen.toString();
	}
	
	public String getHtmlClose(StringBuffer htmlOpen) {
		htmlOpen.append( "</html>");
		return htmlOpen.toString();
	}
	

}
