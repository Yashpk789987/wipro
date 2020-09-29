<%@page import="java.time.LocalDateTime"%>
<%@page import="java.time.format.DateTimeFormatter"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <h1> Today's Date : 
        <%
		   DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyy/MM/dd");
           DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("HH:mm:ss");
		   LocalDateTime now = LocalDateTime.now();
		   out.println(dtf1.format(now));
		%>
	</h1>
	<h1> Current Time : 
        <%
		   out.println(dtf2.format(now));
		%>
	</h1>
</body>
</html>