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
<title>placement</title>
<style>
.error{
color:red;
}

.center{
 text-align: center;
}
.register{
     width: 300px;
    margin: 60px auto 30px;
    padding: 10px;
    position: 20px; 
}


</style>
</head>
<body>
<jsp:include page="adminheader.jsp" />
<br>

<div class="center">
<h1 >Placement Update</h1>
<div class="register">
<table >


        <form:form action="/courseenrolmentadmission/placementsuccess"  modelAttribute="placement">
 
            <tr>
                <th scope="col">CompanyNamae :</th>
                <td><form:input path="companyName" required="required" placeholder="company name"/></td>
                <td><form:errors path="companyName" cssClass="error"></form:errors></td>
            </tr>
            <tr>
                <th scope="col">salary :</th>
                <td><form:input path="salary" required="required"  placeholder="enter salary" /></td>
                <td><form:errors path="salary" cssClass="error"></form:errors></td>
            </tr>
            
            <tr>
            <th scope="col">cgpa :</th>
                <td><form:input path="cgpa" required="required"  placeholder="enter the CGPA"/></td>
                <td><form:errors path="cgpa" cssClass="error"></form:errors></td>
            </tr>
            
            <tr>
            <th scope="col">RegisterLink :</th>
                <td><form:input path="registerLink" required="required"  placeholder="enter the Register"/></td>
                <td><form:errors path="registerLink" cssClass="error"></form:errors></td>
            </tr>
            

            <tr>
                <th scope="col">branch :</th>
                <td><form:textarea path = "branch" rows = "3" cols = "30" required="required"  placeholder="Enter the branches" />
                <td><form:errors path="branch" cssClass="error"></form:errors></td>
            </tr>
            <tr>
                <td></td>
                <td colspan="2" ><input type="submit" value="Save" class="btn btn-primary"></td>
            </tr>
        </form:form>
    </table>
    </div>
</div>

<hr>
<hr>

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
      
     
     </tr>
      </c:forEach>
    </tbody>
  </table>

</div>


</body>
</html>