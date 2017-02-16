<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>



<html >

<head>

	<%@ include file="header.html" %>
	<title>AdminDashboard</title>
	
	<script  src="<c:url value='/resources/angular/adminDashboard.js'/>"></script>

</head>


<body data-ng-app="app">
	


	<div class="container-fluid">
		<nav class="nav nav-tabs">
			<div class="container-fluid">
				<ul class="nav nav-tabs">
					<li class="active"><a href="AdminDashboard.html">Home</a></li>
					<li><a href="AddSession.html">Add Session</a></li>
					<li><a href="SessionDetails.html">View Session</a></li>
					<li><a href="AddUser.html">Add User</a></li>
					<li class="pull-right"><a href="index.html"
						data-toggle="modal" data-target=".bs-example-modal-sm"> <span
							class="glyphicon glyphicon-log-in"></span> Logout
					</a></li>

				</ul>


			</div>
		</nav>
	</div>
	<div class="container" style="margin-top: 10px">
		<form>
			<div class="form-group">
				<div class="input-group">
					<input ng-model="searchString" type="text" class="form-control"
						placeholder="Search..."> <span class="input-group-addon"><span
						class="glyphicon glyphicon-search"></span></span>
				</div>
			</div>
		</form>
	</div>
	<div class="container" data-ng-controller="showListController">
		<div style="margin: 10px" class="well wel-lg table-responsive">
			<table class="table">
				<thead>
					<tr>
						<th align="center">Username</th>
						<th align="center">Name</th>
						<th align="center">Created Date</th>
						<th align="center">Is Active</th>
						<th align="center">Role</th>
					</tr>
				</thead>
				<tbody>
					<tr data-ng-repeat="user in userDetails">
						<td align="center">{{user.userName}}</td>
						<td align="center">{{user.firstName}} {{user.lastName}}</td>
						<td align="center">{{user.creationDate}}</td>
						<td align="center">
							<section>
								<div data-ng-controller="SwitchController" data-ng-init="init(user.isActive)">
									<i class="fa fa-toggle-on active" data-ng-if="status == true"
										data-ng-click="changeStatus();"></i> <i
										class="fa fa-toggle-on fa-rotate-180 inactive"
										data-ng-if="status == false" data-ng-click="changeStatus();"></i>
								</div>
							</section>
						</td>
						<td align="center">
							<section>
								<button toggle-button active-text="Trainee"
									inactive-text="Trainer" data-ng-model="light.state"></button>
							</section>
						</td>
						<!-- Data from database -->
					</tr>
				</tbody>
			</table>
		</div>
	</div>
	<div class="container">
		<form>
			<button class="btn btn-primary">Save Changes</button>
		</form>
	</div>
	<!-- Need to change total items and max size according to the database -->
	<div class="container">
		<pagination class="pull-right" ng-model="currentPage"
			total-items="todos.length" max-size="maxSize" boundary-links="true">
		</pagination>
	</div>
</body>
</html>