/**
 * 
 */
var sessions = angular.module('sessions', ['ui.bootstrap']);

sessions.controller('SessionController', function($scope) {
   $scope.filteredSessions = []
  ,$scope.currentPage = 1
  ,$scope.numPerPage = 5
  ,$scope.maxSize = 5;
  
  $scope.makeSessions = function() {
    $scope.sessions = [];
    for (i=1;i<=1000;i++) {	//Dynamic value of i where it is 1000, put number of rows in session  table
      $scope.sessions.push({ text:'Session '+i, done:false});
    }
  };
  $scope.makeSessions(); 
  
  $scope.$watch('currentPage + numPerPage', function() {
    var begin = (($scope.currentPage - 1) * $scope.numPerPage)
    , end = begin + $scope.numPerPage;
    
    $scope.filteredSessions = $scope.sessions.slice(begin, end);
  });
});

