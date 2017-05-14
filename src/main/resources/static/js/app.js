'use strict';

var app = angular.module('app', ['ngRoute','ngResource']);

app.config(function($routeProvider){
    $routeProvider       
        .when('/userProfileSettings',{
            templateUrl: '/views/userprofile.html',
            controller: 'usersProfileController'
        })
        .when('/getProfileSettings',{
            templateUrl: '/views/userprofile.html',
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
