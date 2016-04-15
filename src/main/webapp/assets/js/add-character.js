$(document).ready(function () {

    var baseUrl = "http://localhost:8080/star-wars-awesomeness/resources/characters/";

    $(document).on('click', '#btn-submit', function () {

        var classUrl = $('#input-class option:selected').val().toLowerCase();
        var postUrl = baseUrl + classUrl;

        $.ajax({
            url: postUrl,
            method: 'post',
            data: convertToJsonString(),
            headers: {'Content-Type': 'application/json'},
            success: function (response) {
                console.log("Character successfully created.")
            },
            error: function (error) {
                alert("Character creation failed")
            }
        });
    });

    function convertToJsonString() {
        return JSON.stringify({
            "firstName": $('#input-first-name').val(),
            "lastName": $('#input-last-name').val(),
            "affiliation": $('#input-affiliation option:selected').val().toUpperCase(),
            "biography": $('#input-biography').val(),
            "physicalStrength": $('#input-physicalstrength option:selected').val().toUpperCase(),
            "race": $('#input-race option:selected').val().toUpperCase(),
            "rank": $('#input-rank option:selected').val().toUpperCase(),
            "weapon": $('#input-weapon option:selected').val().toUpperCase()
        });
    }

});