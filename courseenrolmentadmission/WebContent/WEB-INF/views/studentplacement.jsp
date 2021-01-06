<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">
     <script src="webjars/jquery/1.9.1/jquery.min.js"></script>
      <script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<meta charset="ISO-8859-1">
<title>ApplyPlacement</title>
<style>
.center{
 text-align: center;

}

</style>
</head>
<body>
<jsp:include page="studentheader.jsp" />

<h1 class="center">List Of Companies</h1>

<div class="container">
<table class="table table-hover">
    <thead>
      <tr>
        <th scope="col">Id</th>
        <th scope="col">Branch</th>
        <th scope="col">CGPA</th>
        <th scope="col">CompanyName</th>
        <th scope="col">Salary</th>
        <th scope="col">ApplyHere</th>
      </tr>
    </thead>
    <tbody>
     <c:forEach var="companylist" items="${listofcompanys}">
      <tr>
     
      <td>${companylist.id}</td>
      <td>${companylist.branch}</td>
      <td>${companylist.cgpa}</td>
      <td>${companylist.companyName}</td>
      <td>${companylist.salary}</td>
      <td><a href="${companylist.registerLink}" class="btn btn-primary" target="_blank">Apply</a></td>
      
      
     
     </tr>
      </c:forEach>
    </tbody>
  </table>

</div>


</body>
</html>