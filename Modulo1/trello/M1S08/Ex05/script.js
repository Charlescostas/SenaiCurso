document.getElementById('texto-digitado').addEventListener('keydown', function(event) {
    const texto = document.getElementById('descricao').value
    document.getElementById('texto').innerHTML = texto.toUpperCase()
});