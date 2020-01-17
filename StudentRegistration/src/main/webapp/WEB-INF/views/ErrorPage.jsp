<%@page import="org.deloitte.sms.studentregistration.utils.BusinessException"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Errors Present</title>
</head>
<body>
	<c:set var="error" value="${Error}"/>
	<h1 align="center">Invalid Entry</h1>
		<p align="center"><c:out value="${error}"></c:out><p><br>
	<a href="addstudent">Retry Registration</a>
</body>
</html>