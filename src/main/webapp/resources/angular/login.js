/**
 * This is angular js for login authentication.
 * used in index.html 
 */

var app = angular.module("loginModule",[]);

app.controller('loginFormController',["$scope","$http",function($scope, $http ){
	
	
	$scope.onLogin = function(){
		$http({
			  method: 'POST',
			  url: 'http://localhost:9090/TrainingSystem/login',
			  data:$scope.user
		  }).then(function(response){
			  	if(response.data.isActive === 0){
			  		$scope.loginErrorMessage = "Your account is deactivated. Contact Admin.";
			  		return;
			  	}
			  	if(response.data.role === 'admin'){
			  		
			  		location.href = './admin/adminDashboard';
			  	}else if(response.data.role === 'trainer'){
			  		
			  		location.href = './trainer';
			  	}else if(response.data.role === 'group'){
			  		
			  		location.href = './trainee';
			  	}else{
			  		$scope.loginErrorMessage = "Invalid username or password";
			  	}
			});
		
	}
	
}]);