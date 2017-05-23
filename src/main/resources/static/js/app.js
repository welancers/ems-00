'use strict';

var app = angular.module('app', [ 'ngRoute', 'ngResource' ]);

app.config(function($routeProvider) {
	$routeProvider
	.when('/loginsubmit', {
		templateUrl : '/views/index.html',
		controller : 'LoginRedirectController'
	}).when('/userProfileSettings', {
		templateUrl : '/views/userprofile.html',
		controller : 'usersProfileController'
	}).when('/getProfileSettings', {
		templateUrl : '/views/userProfile.html',
		controller : 'usersProfileController'
	}).when('/applyLeave', {
		templateUrl : '/views/applyLeave.html',
		controller : 'leaveApplyController'
	}).otherwise({
		redirectTo : '/'
	});
});

app.controller();
