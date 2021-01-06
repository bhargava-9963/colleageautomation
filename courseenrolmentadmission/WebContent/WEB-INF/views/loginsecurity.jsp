<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<title>Custom Login Page</title>
</head>
<body>
<form name='loginForm' action="<c:url value='login' />" method="POST">

 <table>
 <tr>
 <th scope="col">User:</th>
 <td><input type='text' name='username'  required="required"></td>
 </tr>
 <tr>
 <th scope="col">Password:</th>
 <td><input type='password' name='password' required="required" /></td>
 </tr>
 <tr>
 <td><input name="submit" type="submit" value="submit"  /></td>
 <td><input name="reset" type="reset" /> <input type="hidden"
 name="${_csrf.parameterName}" value="${_csrf.token}" /></td>

 </tr>
 </table>

 </form>
</body>
</html>