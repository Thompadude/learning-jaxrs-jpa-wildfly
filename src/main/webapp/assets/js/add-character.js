$(document).ready(function () {

    var baseUrl = "http://localhost:8080/star-wars-awesomeness/resources/users/";
    var classUrl = $('input:radio[name=input-class]:checked').val();
    var postUrl = baseUrl + inputClassChoice;

    $(document).on('click', '#btn-submit', function () {
        $.ajax({
            url: baseUrl,
            method: 'post',
            data: convertToJsonString(),
            headers: {'Content-Type': 'application/json'},
            success: function (response) {
                console.log("Character successfully created.");
            },
            error: function (error) {
                alert("Character creation failed")
            }
        });
    });

    function convertToJsonString() {
        return JSON.stringify({
            "firstName": $('#input-first-name').val(),
            "lastName": $('#input-last-name').val()
        });
    }

});