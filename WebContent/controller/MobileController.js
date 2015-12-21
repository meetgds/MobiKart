var app = angular.module('mobikart', []);
app.controller('mobCtrl', function($scope) {
    $scope.firstName = "John";
    $scope.lastName = "Doe";
    $scope.companies = ["Apple", "Samsung", "Motorola", "Nokia", "Sony", "Lg", "Blackberry", "Lenovo"];
    $scope.accessories = ["Covers", "Screen Guards", "Earphones", "Batteries", "Data Cables"];
});/**
 * Created by GDS on 21-12-2015.
 */
