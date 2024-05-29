function mudarCor() {
    var body = document.body;
    
    if (body.style.background=="black") {
        body.style.background = "white"
        document.getElementById('titulo').style.color = "black"
    }
    else {
        body.style.background = "black"
        document.getElementById('titulo').style.color = "white"
    }
}
document.getElementById('form-add').addEventListener('submit', function(event) {
    event.preventDefault();
    mudarCor();
});
