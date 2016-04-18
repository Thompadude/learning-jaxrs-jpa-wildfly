app.controller('CreateCharacterController', ['$scope', '$http', function ($scope, $http) {

    $http({
        url: "http://localhost:8080/star-wars-awesomeness/resources/characters/jedis",
        method: 'get',
        header: {'Contet-Type': 'application/json'}
    }).success(function (response) {
        $scope.listOfJedis = response;
    }).error(function () {
        alert("Error fetching jedi list")
    })

}]);