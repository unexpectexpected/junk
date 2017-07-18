var app = angular.module('myApp', []);

app.controller('Hello', function Hello($scope, $http) {
	$http.get('greeting').then(function successCallback(data) { $scope.greeting = data;});
	
	$scope.update = function() {
		$http.get('greeting', {params : {name: $scope.name }}).then(function successCallback(data) {
			$scope.greeting = data;
		});
	}
}
)