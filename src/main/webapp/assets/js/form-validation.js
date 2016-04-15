$(document).ready(function () {
    $(document).keyup(function () {
        var isAnyInputEmpty = $('input').filter(function () {
                return $.trim(this.value).length === 0;
            }).length > 0;

        if (isAnyInputEmpty) {
            $('#btn-submit').attr('disabled', true);
        } else {
            $('#btn-submit').attr('disabled', false);
        }
    });
});