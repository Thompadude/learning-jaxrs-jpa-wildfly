$(document).ready(function () {

    var baseUrl = "http://localhost:8080/star-wars-awesomeness/resources/characters/";
    var classUrl = $('#input-class option:selected').val().toLowerCase();

    $(document).on('click', '#btn-submit', function () {

        classUrl = $('#input-class option:selected').val().toLowerCase();
        var postUrl = baseUrl + classUrl;

        $.ajax({
            url: postUrl,
            method: 'post',
            data: convertToJsonString(),
            headers: {'Content-Type': 'application/json'},
            success: function (response) {
                window.location.replace('../index.html');
            },
            error: function (error) {
                alert("Character creation failed")
            }
        });
    });

    var isJediOptionsDisabled;
    var isSoldierOptionsDisabled = true;
    $('#input-class').change(function () {
        isJediOptionsDisabled = !isJediOptionsDisabled;
        isSoldierOptionsDisabled = !isSoldierOptionsDisabled;

        $('.input-for-jedi').prop('disabled', isJediOptionsDisabled);
        $('.input-for-soldier').prop('disabled', isSoldierOptionsDisabled);
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