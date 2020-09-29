<%@page import="java.util.HashMap"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table border=1>
		<tr>
			<th>Numbers</th>
			<th>Factorial</th>
		</tr>
		<%
			ArrayList<HashMap<String, Integer>> list = (ArrayList<HashMap<String, Integer>>) request.getAttribute("fact_num_list");
            for (HashMap<String, Integer> obj : list) {
				out.println("<tr><td>" + obj.get("number") + "</td>");
				out.println("<td>" + obj.get("factorial") + "</td></tr>");
			}
		%>
	</table>
</body>
</html>