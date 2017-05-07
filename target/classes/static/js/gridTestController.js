angular.module('gridTest', []);

angular.module('gridTest').controller('gdController', 
		['$scope', '$http', '$log', '$filter', function($scope, $http, $log, $filter) {
	var firstPage = null;
	$http.get("../json/gridListData.json").success(function(data) {
		//console.log(data);
		$scope.priceList = data;
		$scope.setPages($scope.priceList.length);
		$scope.setPage(firstPage);
		//$log.log("Price List --> ", $scope.priceList);
	});
	
	$scope.priceSet = function(obj) {
		console.log("Global Check, current check --> ", $scope.selectAll, obj);
		var check = true;
		
		angular.forEach($scope.priceList, function(price){
			if (!price.select){
				check = false;
			}
		});
		if ($scope.selectAll == undefined && check) {
			$scope.selectAll = true;
		}
		if ($scope.selectAll != undefined && $scope.selectAll && !check) {
			$scope.selectAll = false;
		} 
	};
	
	$scope.pageStartIndex = 0;
	$scope.setPages = function(length) {
		var pages = Math.ceil(length/10);
		var pageArr = [];
		for(var i=1; i<=pages; i++) {
			var newPage = {};
				newPage.pageNo = i;
				newPage.startIndex = ((i - 1) * 10);
			if (i===1) {
				firstPage = newPage;
			}
			//pageArr.push(i);
			pageArr.push(newPage);
		}
		$scope.pageArr = pageArr;
		return pageArr.length;
	};
	
	$scope.setPage = function(page) {
		console.log("clicked --> ", page.pageNo);
		//$scope.pageNum = ((pageNo - 1) * 10); Old working code
		$scope.pageNum = page.pageNo;
		$scope.pageStartIndex = page.startIndex;
		
		//$('#' + $scope.previousPage).attr('class', '');
		//$('#' + pageNo).attr('class','pageClick');
		$scope.previousPage = page.pageNo;
	};
	
	
}]).filter('splitrow', function(){
    return function (input, count){
    	console.log("splitrow --> ", input, count);
        var out = [];
            if(typeof input === "object"){
                for (var i=0, j=input.length; i < j; i+=count) {
                    out.push(input.slice(i, i+count));
                }
            }
        return out;
    }
});


/*.filter('unique', function() {
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
		
});*/