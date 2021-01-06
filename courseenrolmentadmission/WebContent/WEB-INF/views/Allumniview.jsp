<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Allumniview</title>
    <link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">
     <script src="webjars/jquery/1.9.1/jquery.min.js"></script>
      <script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>

<style>
body {
  font-family: Arial, Helvetica, sans-serif;
}

.flip-card {
  background-color: transparent;
  width: 300px;
  height: 300px;
  perspective: 1000px;
}

.flip-card-inner {
  position: relative;
  width: 100%;
  height: 100%;
  text-align: center;
  transition: transform 0.6s;
  transform-style: preserve-3d;
  box-shadow: 0 4px 8px 0 rgba(0,0,0,0.2);
}

.flip-card:hover .flip-card-inner {
  transform: rotateY(180deg);
}

.flip-card-front, .flip-card-back {
  position: absolute;
  width: 100%;
  height: 100%;
  -webkit-backface-visibility: hidden;
  backface-visibility: hidden;
}

.flip-card-front {
  background-color: #bbb;
  color: black;
}

.flip-card-back {
  background-color: #2980b9;
  color: white;
  transform: rotateY(180deg);
}
</style>
</head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="Allumniheader.jsp" />

<div class="container">

<h1>ALLUMNI STUDENT SEARCHING TOOL</h1>

</div>
<br><br>
<div class="container">
<div class="row">
<div class="col-sm-4">
<div class="flip-card">
  <div class="flip-card-inner">
    <div class="flip-card-front">
      <img src="${pageContext.request.contextPath}/resources/images/gridview.jpg" alt="Avatar" style="width:300px;height:300px;">
    </div>
    <div class="flip-card-back">
      <h1>Bhargava</h1> 
      <p>Software Engineer Associate</p> 
      <p>We love that guy</p>
    </div>
  </div>
  </div>
  </div>
  <div class="col-sm-4">
<div class="flip-card">
  <div class="flip-card-inner">
    <div class="flip-card-front">
      <img src="${pageContext.request.contextPath}/resources/images/gridview.jpg" alt="Avatar" style="width:300px;height:300px;">
    </div>
    <div class="flip-card-back">
      <h1>Sandeep</h1> 
      <p>Software Engineer Associate</p> 
      <p>We love to code</p>
    </div>
  </div>
  </div>
  </div>
  <div class="col-sm-4">
<div class="flip-card">
  <div class="flip-card-inner">
    <div class="flip-card-front">
      <img src="${pageContext.request.contextPath}/resources/images/gridview.jpg" alt="Avatar" style="width:300px;height:300px;">
    </div>
    <div class="flip-card-back">
      <h1>Kalaipriyan</h1> 
      <p>Architect & Engineer</p> 
      <p>We love to code</p>
    </div>
  </div>
  </div>
  </div>
  
  
</div>
</div>
  
</body>
</html>
