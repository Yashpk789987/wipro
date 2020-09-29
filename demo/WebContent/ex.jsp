<%@page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <h1>hello </h1>
 <%
 PrintWriter outPrintWriter = response.getWriter(); 
 outPrintWriter.println(2*3);
 %>
</body>
</html>