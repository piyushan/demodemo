<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>

<meta charset="ISO-8859-1" />
<title>Index</title>
<%-- <!-- Bootstrap -->
<link
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css"
	rel="stylesheet"></link>
<link type="text/css" rel="stylesheet" href="<c:url value='/css/style.css'/>"></link>
 <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.1/angular.min.js"></script>
<script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
<script
	src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
 --%>
 
 <%@ include file="header.html" %>
<script  src="<c:url value='/resources/angular/login.js'/>" ></script>
</head>


<body  data-ng-app="loginModule">
	
	<div id="login" style="background-color: White" class="center">
		<form name="loginForm" method="post" style="background-color: White"
			data-ng-controller="loginFormController">

			<div class="form-horizontal">
				<font color="Black">User Id:</font> <input type="text"
					class="form-control" id="email" name="userName" 
					data-ng-model="user.userName" required="required"/>
			</div>
			<div class="form-horizontal">
				<font color="Black">Password:</font> <input type="password"
					class="form-control" id="pwd" name="password" 
					data-ng-model="user.password" required="required"/><br>
			</div>
			<div class="form-horizontal">
				<button type="submit" class="btn btn-primary"
					data-ng-click="onLogin()">Login</button>
				<br> <br>
			</div>
			<div class="form-horizontal">
				<font color="Red"><label >{{loginErrorMessage}}</label></font> <br>
			</div>
		</form>
	</div>
	
	
</body>
</html>