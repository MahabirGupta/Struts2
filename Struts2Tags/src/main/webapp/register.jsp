<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Registration Form</title>
<s:head/>
</head>
<body>

<h2>Registration Form</h2>
<!-- Create a form tag -->
<s:form action="registerAction">
	<s:textfield name="firstName" label="First Name:"/>
	<s:textfield name="lastName" label="Last Name:"/>
	<s:radio name="gender" list="{'Male','Female'}" label="Gender:"/>
	<s:textfield name="age" label="Age"/>
	<s:textfield name="email" label="Email"/>
	<!-- To allow user to key in multiple lines of codes -->
	<s:textarea name="address" cols="30" rows="7" label="Address:"></s:textarea>
	<!-- Create a select tag -->
	<s:select list="{'Blue','Red','Green','White'}" name="selectedColor" headerKey="None" headerValue="Select a color" label="Favourite Color:"/>
	<!-- To select multiple values -->
	<%--  <s:select multiple="true" list="colors" name="selectedColor" headerKey="None" headervalue="Select a color" label="Favourite Color:"/>--%>
	<!-- To reset all the values use reset tag -->
	<s:reset value="Reset"/>
	
	<!-- Create a submit button -->
	<s:submit value="Register"/>
</s:form>
</body>
</html>