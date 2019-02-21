<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>${headerMessage}</h1>
	<h1>STUDENT SUBMISSION FORM</h1>
	<h2>Congrats, Your Form is Successfully Submitted</h2>

	<h2>${submitMessage}</h2>
	<table>
		<tr>
			<td>Student name:</td>
			<td>${student.studentName}</td>
		</tr>
		<tr>
			<td>Student DOB:</td>
			<td>${student.studentDOB}</td>
		</tr>
		<tr>
			<td>Student Hobby:</td>
			<td>${student.studentHobby}</td>
		</tr>
		<tr>
			<td>Student Mobile No:</td>
			<td>${student.studentMobileNo}</td>
		</tr>
		<tr>
			<td>Student Skills:</td>
			<td>${student.studentSkills}</td>
		</tr>

		<tr>
			<td>Student Address:</td>
			<td>Country : ${student.address.country} State :
				${student.address.state} District : ${student.address.district} Pin
				Code : ${student.address.pincode}</td>
		</tr>
	</table>
</body>
</html>