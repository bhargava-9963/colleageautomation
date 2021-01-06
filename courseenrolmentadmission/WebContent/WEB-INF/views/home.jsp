<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
    <title>Welcome</title>
    <link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">
     <script src="webjars/jquery/1.9.1/jquery.min.js"></script>
      <script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</head>
<body>
<br><br>
<div class="container">
<div class="row">
<div class="col-sm-4">
 <div class="card" style="width: 18rem;">
  <img class="card-img-top" src="${pageContext.request.contextPath}/resources/images/gridview.jpg" alt="Card image cap">
  <div class="card-body">
    <h4 class="card-title">Student Allumni</h4>
    <p class="card-text">Student Allumni Search Friends Here</p>
    <a href="/courseenrolmentadmission/login" class="btn btn-primary">StudentAllumni</a>
  </div>
</div>
</div>
<div class="col-sm-4">
 <div class="card" style="width: 18rem;">
  <img class="card-img-top" src="${pageContext.request.contextPath}/resources/images/gridview.jpg" alt="Card image cap">
  <div class="card-body">
    <h4 class="card-title">Student</h4>
    <p class="card-text">Student vtop here to redirect working process</p>
    <a href="/courseenrolmentadmission/studentLogin" class="btn btn-primary">Student</a>
  </div>
</div>
</div>
<div class="col-sm-4">
 <div class="card" style="width: 18rem;">
  <img class="card-img-top" src="${pageContext.request.contextPath}/resources/images/gridview.jpg" alt="Card image cap">
  <div class="card-body">
    <h4 class="card-title">Administrattion</h4>
    <p class="card-text">Administration working process</p>
    <a href="/courseenrolmentadmission/adminlogin" class="btn btn-primary">Admin</a>
  </div>
</div>
</div>

</div>
</div>

</body>
</html>