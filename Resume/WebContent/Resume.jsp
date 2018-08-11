<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.cg.pojo.Resume1"%>
<!DOCTYPE html>
<!-- Resume Display Format -->
<html>
<head>
<%
	Resume1 resume = (Resume1) request.getAttribute("Resume1");
%>
<meta charset="ISO-8859-1">
<title>My Resume</title>
</head>
<body>
	<h1><%=resume.getFirstName()%>
		<%=resume.getLastName()%></h1>
	<%=resume.getAddress()%><br> Mobile :
	<%=resume.getContactnumber()%><br> Email :
	<%=resume.getEmail()%><br> Website :
	<%=resume.getWebsite()%><br>
	<br>

	<h3 align="center">JOB OBJECTIVES</h3>
	<hr style="border-bottom: 2px solid;">
	<%=resume.getDescription()%><br>

	<h3 align="center">HIGHEST QUALIFICATION</h3>
	<hr style="border-bottom: 2px solid;">
	<%
		for (String qualification : resume.getQualification()) {
	%>
	<%=qualification + "\t"%>
	<%
		}
	%><br>

	<h3 align="center">SPECIAL SKILLS</h3>
	<hr style="border-bottom: 2px solid;">
	<%
		for (String skills : resume.getSkills()) {
	%>
	<%=skills + "\t"%>
	<%
		}
	%><br>

	<h3 align="center">HOBBIES</h3>
	<hr style="border-bottom: 2px solid;">
	<%
		for (String hobbies : resume.getHobbies()) {
	%>
	<%=hobbies + "\t"%>
	<%
		}
	%><br>

	<h3 align="center">ADDITIONAL INFORMATION</h3>
	<hr style="border-bottom: 2px solid;">
	Gender :<%=resume.getGender()%><br> Date Of Birth :<%=resume.getDateOfBirth()%>
</body>
</html>