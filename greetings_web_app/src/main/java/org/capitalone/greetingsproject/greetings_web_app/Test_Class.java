package org.capitalone.greetingsproject.greetings_web_app;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.swing.*;

import java.io.BufferedReader;
import java.io.InputStream;
import java.util.Scanner;

@Path("/test")
public class Test_Class {
	
	 String line;
	
@GET
@Produces(MediaType.TEXT_HTML)
  public void getHTMLString(){

	//JTextField numberEnter = new JTextField("Enter numbers here", 20); 
	//JTextPane text = new JTextPane();
	//text.setContentType("text/html");
	Scanner s = new Scanner(System.in);
	//return JOptionPane;

 }

}
