<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<!-- Create a form tag -->
<s:form action="registerAction">
	<s:textfield name="firstName" label="First Name"/>
	<s:textfield name="lastName" label="Last Name"/>
	<s:radio name="gender" list="{'Male','Female'}" label="Gender"/>
	<s:textfield name="age" label="Age"/>
	<s:textfield name="email" label="Email"/>
	
	<!-- Create a submit button -->
	<s:submit value="Register"/>
</s:form>
</body>
</html>