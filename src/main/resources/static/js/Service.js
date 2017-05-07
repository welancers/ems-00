angular.module('GuestHouseModule').factory('GuestHouseService', function($resource) {
	return $resource('./api/req/guesthouse/:id', {}, {
		findById : {
			method : 'GET',
			id : '@id'
		},		
		findByGuestId : {
			method : 'GET',
			id : '@id'
		},
		getMine : {
			method : 'GET',
			id : '@id'
		},
		getBookings : {
			method : 'GET',
			id : '@id'
		},
		getApprover : {
			method : 'GET',
			id : '@id'
		},
		getApproverComments : {
			method : 'GET',
			id : '@id',
			isArray : true
		},
		deleteGuest : {
			method : 'GET',
			id : '@id'
		},
		create : {
			method : 'POST'
		},
		createBooking : {
			method : 'POST',
			params : {
				id : "createBooking"
			}
		},
		deleteRequest : {
			method : 'GET',
			id : '@id'
		},
	});
});

angular.module('GuestHouseModule').factory('GuestHouseDashboardService', function($resource) {
	return $resource('./api/req/guesthouse/:id', {}, {
		getDashboard : {
			method : 'GET',
			id : '@id'
		},
		getDashboardforKR : {
            method : 'GET',                   
            id : '@id'
        }
	});
});
