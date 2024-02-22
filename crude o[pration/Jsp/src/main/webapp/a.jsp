<%@page import="org.apache.taglibs.standard.tag.common.xml.IfTag"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
		<%
		
			String name  = request.getParameter("name");
			String email  = request.getParameter("email");
			String pass  = request.getParameter("pass");
			
			if(pass.equals("12345"))
			{
				out.print("welcome"+email);
			}
			else
			{
				out.print("fail");
			}
		
		%>
		<br>
		<br>
		
		<a href="https://www.instagram.com/">click Me</a>		
		


</body>
</html>