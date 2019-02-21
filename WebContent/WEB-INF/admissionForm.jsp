<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>${headerMessage}</h1>
	<h1>STUDENET ADMISSION FORM</h1>

	<h1 style="color: red">${message}</h1>

	<form:errors path="student.*" />
	<form action="/FirstSpringProject/submissionWithModelAttrForm"
		method="post">
		<!--  <table><tr><td><spring:message code="label.studentName"/></td></tr></table>-->
		<p>
			<spring:message code="label.studentName" />
			:<input type="text" id="studentId" name="studentName">
		</p>
		<p>
			<spring:message code="label.studentDOB" />
			: <input type="text" id="studentDOB" name="studentDOB">
		</p>
		<p>
			<spring:message code="label.studentHobby" />
			: <input type="text" id="studentHobby" name="studentHobby">
		</p>
		<p>
			<spring:message code="label.studentMobileNo" />
			:<input type="text" id="studentId" name="studentMobileNo">
		</p>
		<p>
			Student Skills : <select name="studentSkills" multiple="multiple">
				<option value="CoreJava">Core Java</option>
				<option value="Spring">Spring</option>
				<option value="Python">Python</option>
			</select>
		</p>

		<table>
			<tr>
				<td>Country Name :</td>
				<td><input type="text" name="address.country"></td>
			</tr>
			<tr>
				<td>State Name :</td>
				<td><input type="text" name="address.state"></td>

			</tr>
			<tr>
				<td>District Name :</td>
				<td><input type="text" name="address.district"></td>

			</tr>
			<tr>
				<td>Pin Code :</td>
				<td><input type="text" name="address.pincode"></td>

			</tr>
		</table>
		<input type="submit" value="Submit Form">
	</form>
</body>
</html>