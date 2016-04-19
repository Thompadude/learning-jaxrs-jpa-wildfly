app.controller('CharacterController', ['$scope', '$http', function ($scope, $http) {

    var baseUrl = "http://localhost:8080/star-wars-awesomeness/resources/characters/";
    $scope.sortTypeJedis = 'lastName';
    $scope.sortTypeSoldiers = 'lastName';

    $http({
        url: baseUrl + "jedis",
        method: 'get',
        header: {'Content-Type': 'application/json'}
    }).success(function (response) {
        $scope.listOfJedis = response;
    }).error(function (error) {
        // TODO add error handling
    });

    $http({
        url: baseUrl + "soldiers",
        method: 'get',
        header: {'Content-Type': 'application/json'}
    }).success(function (response) {
        $scope.listOfSoldiers = response;
    }).error(function (error) {
        // TODO add error handling
    });

    $scope.viewCharacter = function (character) {
        var characterId = character.target.attributes.id.value;

        $http({
            url: baseUrl + characterId,
            method: 'get',
            header: 'application/json'
        }).success(function (response) {
            $scope.characterProfile = response;
            $('#section-character-profile')
                .hide()
                .fadeIn();
            $('.section-characters').hide()
        }).error(function (error) {
            // TODO add error handing
        })
    };

    $scope.backToCharacterList = function () {
        $('#section-character-profile').hide();
        $('.section-characters').fadeIn()
    }

}]);