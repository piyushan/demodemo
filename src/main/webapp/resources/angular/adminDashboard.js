/**
 * @author Mansi
 * @param e
 */

function toggleIcon(e) {
	$(e.target)
	.prev('.panel-heading')
	.find(".more-less")
	.toggleClass('glyphicon-chevron-down glyphicon-chevron-up');
}
$('.panel-group').on('hidden.bs.collapse', toggleIcon);
$('.panel-group').on('shown.bs.collapse', toggleIcon);

//Need to change this module according to the database
//hAVE TO REMOVE/change THIS MODULE
var todos = angular.module('todos', ['ui.bootstrap']);

todos.controller('TodoController', function($scope) {
	$scope.filteredTodos = []
	,$scope.currentPage = 1
	,$scope.numPerPage = 10
	,$scope.maxSize = 5;

	$scope.makeTodos = function() {
		$scope.todos = [];
		for (i=1;i<=1000;i++) {
			$scope.todos.push({ text:'todo '+i, done:false});
		}
	};
	$scope.makeTodos(); 

	$scope.$watch('currentPage + numPerPage', function() {
		var begin = (($scope.currentPage - 1) * $scope.numPerPage)
		, end = begin + $scope.numPerPage;

		$scope.filteredTodos = $scope.todos.slice(begin, end);
	});
});


var switchdemo = angular.module('switchdemo', ['showTrainerTrainee']).controller('SwitchController', function($scope){

	$scope.init = function(isActive){
		if(isActive===1)
			$scope.status = true;
		else
			$scope.status =false;
	}

	$scope.changeStatus = function(){
		$scope.status = !$scope.status;
	}

})
function add(radio) {

	//Create an input type dynamically.
	var element = document.createElement("input");
	element.setAttribute("name", type);


	var temp = document.getElementById("radio");

	//Append the element in page (in span).
	temp.appendChild(element);

}
var app = angular.module('app', ['switchdemo','todos','showTrainerTrainee']);

app.directive('toggleButton', function() {
	return {
		require: 'ngModel',
		scope: {
			activeText: '@activeText',
			inactiveText: '@inactiveText',
			lightState: '=ngModel'
		},
		replace: true,
		transclude: true,
		template: '<div>' +
		'<span ng-transclude></span> ' +
		'<button class="btn" ng-class="{\'btn-primary\': state.value}" ng-click="state.toggle()">{{activeText}}</button>' +
		'<button class="btn" ng-class="{\'btn-primary\': !state.value}" ng-click="state.toggle()">{{inactiveText}}</button>' +
		'</div>',
		link: function postLink(scope) {
			scope.lightState = scope.inactiveText;

			scope.state = {
					value : true,
					toggle: function() {
						this.value = !this.value; 
						scope.lightState = this.value ? scope.activeText : scope.inactiveText;
					}
			
			};
		}
	}
})



/**
 * @author piyushan Pratik
*/

var showTrainerTrainee = angular.module('showTrainerTrainee',[]);

showTrainerTrainee.controller('showListController',["$scope","$http",function($scope, $http ){
	
	/*
	 * To fetch list of trainers and trainees displayed on admin dashboard.
	 */
	$http({
		  method: 'POST',
		  url: 'http://localhost:9090/TrainingSystem/getUsers',
		  data: {}
	  }).then(function(response){
		  	alert(response.status);
		  $scope.userDetails = response.data;
		  	
		});
	alert("alert");
}]);