<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <jsp:useBean id="employee" class="com.webapp.model.Employee" scope="request" />
    <jsp:setProperty name="employee" property="*"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Details</title>
</head>
<body>
    <h1>Employee details</h1>
	<p>Employee id: <c:out value="${employee.id}"/></p>
	<p>Employee name: <c:out value="${employee.name}"/></p>

</body>
</html>
