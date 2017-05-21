app.controller('menuController', ['$scope', '$http', '$log',
                                   function($scope, $http, $log) {
    $http.get("../json/menu.json").success(function(response) {
		$scope.menuList = response;
	});
	
}]);

app.controller('usersProfileController', ['$scope', '$http', '$log',
    function($scope, $http, $log) {
$http.get("../json/userProfileDetails.json").success(function(response) {
$scope.employees = response.empList;
$log.log("Employees --> ", $scope.employees);
});

}]);

app.controller('testProfileController', ['$scope', '$http', '$log',
    function($scope, $http, $log) {
         $http.get('/userProfile/getDetails').success(function(response){
             $scope.employees = response;
             $log.log("Employees --> ", $scope.employees);
         }).error(function(){
            //handle error
         })
     
}]);

app.controller('leaveApplyController', ['$scope', '$http', '$log',
    function($scope, $http, $log) {
	$scope.submit_form = function(){
		$http({
	        url: "/userProfile/applyLeave",
	        method: "POST",
	        headers: {'Content-Type': 'application/json'},
	        data: $scope.formAdata
	    }).success(function(data, status, headers, config) {
	        $scope.status = status;
	        console.log(status)
	    }).error(function(data, status, headers, config) {
	        $scope.status = status;
	    });
	}
	
	
	
}]);