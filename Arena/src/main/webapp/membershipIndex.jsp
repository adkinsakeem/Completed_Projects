<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add New Member</title>
</head>
<body>
Enter Members Name
<br>
<br>
<form action="http://localhost:8080/Arena/webapi/addMember" method=post>
	Member Name: <input type="text" name="memberName" value="" />
	<br>
	<br>
	What Type of Membership Do They Have?
	<br>
	 <INPUT TYPE="radio" NAME="memberType" VALUE="bronzeMember" CHECKED>
             Bronze
            &nbsp;
     <INPUT TYPE="radio" NAME="memberType" VALUE="silverMember" CHECKED>
            Silver
           &nbsp;
     <INPUT TYPE="radio" NAME="memberType" VALUE="goldMember" CHECKED>
           Gold
            <BR>
            <br>
   
            
	<input type="submit" name="addMember" value="Add" />
	
	</form>


</body>
</html>
