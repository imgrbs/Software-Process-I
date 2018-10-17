$(document).ready(function(){
    $.get("http://localhost:8080/products", function(data, status){
        if (status === 'success') {
            var greetText = data[0]
            $('div#text h1').text(greetText.productName)
        } else {
            $('div#text h1').text('Fetch Errors :(')
        }
    });
});