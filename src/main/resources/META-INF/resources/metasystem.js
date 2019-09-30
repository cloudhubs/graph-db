function refresh() {
    $.get('/metasystem', function (metasystem) {
        console.log(metasystem);
        var list = '';
        (metasystem || []).forEach(function (fruit) { // <1>
            list = list
                + '<tr>'
                + '<td>' + fruit.id + '</td>'
                + '<td>' + fruit.name + '</td>'
                + '<td><a href="#" onclick="deleteFruit(' + fruit.id + ')">Delete</a></td>'
                + '</tr>'
        });
        if (list.length > 0) {
            list = ''
                + '<table><thead><th>Id</th><th>Name</th><th></th></thead>'
                + list
                + '</table>';
        } else {
            list = "No metasystem in database"
        }
        $('#all-metasystem').html(list);
    });
}

function deleteFruit(id) {
    $.ajax('/metasystem/' + id, {method: 'DELETE'}).then(refresh);
}

$(document).ready(function () {

    $('#create-metaSystem-button').click(function () {
        var fruitName = $('#metaSystem-name').val();
        $.post({
            url: '/metasystem',
            contentType: 'application/json',
            data: JSON.stringify({name: fruitName})
        }).then(refresh);
    });

    refresh();
});