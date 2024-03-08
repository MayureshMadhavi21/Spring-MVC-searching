<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1> ${ student } </h1>
<h1>Student Name is ${ student.name } </h1>
<h1>Student Id is ${ student.id } </h1>
<%-- <h1>Student DOB is ${ student.dob } </h1> --%>
<h1>Student gender is ${ student.gender } </h1>
<h1>Student subjects are ${ student.subjects } </h1>
<h1>Student type is ${ student.type } </h1>
<h1>Student Address street is ${ student.address.street } </h1>
<h1>Student Address city is ${ student.address.city } </h1>
</body>
</html>