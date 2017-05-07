angular.module('mtcFilterModule', []);

angular.module('mtcFilterModule').controller('mtcFilterController', 
		['$scope', '$http', '$log', '$filter', function($scope, $http, $log, $filter) {

	$scope.dataList  = null;
	$scope.versionList = [];
	$scope.statusList = [];
	$http.get("../json/mtcfilter.json").success(function(data) {
		$scope.dataList = data;
		if ($scope.dataList != null && $scope.dataList.length > 0) {
			
			var uqVerList = $filter('unique')($scope.dataList, 'version');
			var uqStatList = $filter('unique')($scope.dataList, 'status');
			angular.forEach(uqVerList , function(data){
				$scope.versionList.push(data.version);
			});
			angular.forEach(uqStatList , function(data){
				$scope.statusList.push(data.status);
			});
		}
		console.log("v ", $scope.versionList, $scope.statusList);
	});
	
	$scope.openFilter = function($event, key){
		$('.idListCtrls').hide();
		 angular.element($event.target).parent().find('.idListCtrls').show();
	}
	
	$scope.applyCriteriaFilterOnMouseLeave=function(){
    	$('.idListCtrls').hide();
    };
			
} ]).filter('unique', function() {
	   return function(collection, keyname) {
		      var output = [];
		       var   keys = [];

		      angular.forEach(collection, function(doc) {
		          var key = doc[keyname];
		          if(keys.indexOf(key) === -1) {
		              keys.push(key);
		              output.push(doc);
		         
		          };
		      
		      });
		      return output;
		   
	   };
		
});