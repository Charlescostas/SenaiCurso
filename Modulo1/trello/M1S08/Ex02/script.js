function adicionar(texto) {
    var lista = document.querySelectorAll('li')
    var listaUl = document.getElementsByTagName('ul')[0];
    var i = (lista.length+1)

    var texto = (texto+' '+i)
    var li=document.createElement('li')
    li.appendChild(document.createTextNode(texto));
    li.setAttribute("id", ("item"+i))
    listaUl.appendChild(li);
}
function alterarColor() {
    document.getElementById("item3").style.color = "yellow";   
}

// Função para adicionar uma tarefa ao enviar o formulário
document.getElementById('form-add').addEventListener('submit', function(event) {
    event.preventDefault();
    
    const descricao = document.getElementById('descricao').value;
    adicionar(descricao);
});

window.onload = function (){
    alterarColor()
}