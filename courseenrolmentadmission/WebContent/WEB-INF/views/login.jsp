<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>  
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">
     <script src="webjars/jquery/1.9.1/jquery.min.js"></script>
      <script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<title>Insert title here</title>
<style type="text/css">
.error{
color:red;
}

.login {
    /* Size & position */
    width: 300px;
    margin: 60px auto 30px;
    padding: 10px;
    position: 20px;  
}
.center{
 text-align: center;
}
</style>

</head>
<body>

<h3 class="center">Login</h3>

<div class="login">

	<form:form action="/courseenrolmentadmission/loginSuccess" method="post" modelAttribute="studentCredential">
	
		<table >
			<tr>
				<th scope="col">Enter Email:</th>
				<td><form:input path="email" required="required" placeholder="enter email"/></td>
				<td><form:errors path="email" cssClass="error"/></td>
			</tr>
			<tr>
				<th scope="col">Enter Password:</th>
				<td><form:password path="password" required="required" placeholder="enter password"/></td>
				<td><form:errors path="password" cssClass="error"/></td>
			</tr>
			<tr>
			<td></td>
			<td colspan="2"><button type="submit" class="btn btn-primary">Login</button></td>
			</tr>
		</table>
	
	</form:form>

	</div>
	
</body>
</html>

 