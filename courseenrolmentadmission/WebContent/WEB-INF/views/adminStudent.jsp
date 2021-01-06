<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>

<style type="text/css">
input[type=text] {
  width: 50%;
  padding: 5px 5px;
  box-sizing: border-box;
  border-radius:2px;
  align:center;
  margin
}

</style>

    <link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">
     <script src="webjars/jquery/1.9.1/jquery.min.js"></script>
      <script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>AllumniSearch</title>
</head>
<body>

<jsp:include page="adminheader.jsp" />
<div class="container">

<form action="/courseenrolmentadmission/searchstudent">

<input type="text"  placeholder="search students" required name="search"/>

<input type="submit" value="Search" class="btn btn-primary"/>
</form>
</div>
<div class="container">
<table class="table table-hover">
    <thead>
     <tr>
        <th scope="col">Id</th>
        <th scope="col">studentName</th>
        <th scope="col">gender</th>
        <th scope="col">city</th>
        <th scope="col">Email</th>
        <th scope="col">Phone</th>
      </tr>
    </thead>
    <tbody>
     <c:forEach var="student" items="${studentlist}">
      <tr>
     
      <td>${student.id}</td>
      <td>${student.studentName}</td>
      <td>${student.gender}</td>
      <td>${student.city}</td>
      <td>${student.email}</td>
      <td>${student.phone}</td>
 
       <td>
      <a href="deleteStudent?id=${student.id}" class="btn btn-danger">Delete</a>
      </td>
     </tr>
      </c:forEach>
    </tbody>
  </table>

</div>
</body>
</html>