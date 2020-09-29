<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="emp" class="assignment1.beans.Employee" />
	<% if (request.getParameter("submit") == null) { %>
		<form method="get" action="/JavabeansInJsp/assignment1/index.jsp">
			Name: <input type="text" name="name" /><br />
			ID: <input type="text" name="id" /><br />
			<input type="submit" name="submit" />
		</form>
	<% } else { %>
			<jsp:setProperty name="emp" property="name" value='<%=request.getParameter("name")%>' />  
			<jsp:setProperty name="emp" property="id" value='<%=Integer.parseInt(request.getParameter("id"))%>' />
			
			Name: <jsp:getProperty name="emp" property="name"/><br />
			ID: <jsp:getProperty name="emp" property="id"/><br />
			Salary: <jsp:getProperty name="emp" property="salary"/>
	<% } %>
</body>
</html>