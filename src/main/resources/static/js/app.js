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
        .otherwise(
            { redirectTo: '/'}
        );
});

app.controller();
