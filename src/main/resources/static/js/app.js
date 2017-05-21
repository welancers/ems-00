'use strict';

var app = angular.module('app', ['ngRoute','ngResource']);

app.config(function($routeProvider){
    $routeProvider       
        .when('/userProfileSettings',{
            templateUrl: '/views/userProfile.html',
            controller: 'usersProfileController'
        })
        .when('/getProfileSettings',{
            templateUrl: '/views/userProfile.html',
            controller: 'testProfileController'
        })
        .when('/applyLeave',{
            templateUrl: '/views/applyLeave.html',
            controller: 'leaveApplyController'
        })
        .otherwise(
            { redirectTo: '/'}
        );
});

app.controller();