var btnAdd = document.querySelector('button')
var btnLimpar = document.getElementById('btnLimpar')
var meuInteresse = document.querySelector('input')
var listaInteresse = document.querySelector('ul')

//varivel para pegar os dados localStorage
const INTERESSES_KEY = 'meus-interesses'

//pega o evento click do botao
btnAdd.addEventListener('click', (event) => {
    //pega valor campo meus interesse
    var interesse = meuInteresse.value;

    //pega lista do localStorage 
    var listaStorage = localStorage.getItem(INTERESSES_KEY)

    //verifico se foi inserido algum valor no campo imput
    //senao dou uma mensagem
    if (interesse){
        //verifica se localStorage existe se nao existir cria um nova
        if(listaStorage) {
            //converte a Storage para json
            var listaStorageConvertida = JSON.parse(listaStorage) // ['', '']
            listaStorageConvertida.unshift(interesse)
    
            localStorage.setItem(INTERESSES_KEY, JSON.stringify(listaStorageConvertida))

        } else {
            var listaArray = [interesse]
    
            localStorage.setItem(INTERESSES_KEY, JSON.stringify(listaArray))
        }
        
        //limpa campo meus interesse
        meuInteresse.value = ''
    }
    else alert("Informe um Interesse!!")
})

//funcao para carregar dados salvo no localstorage
function carregarInteresses() {
    var lista = localStorage.getItem(INTERESSES_KEY)

    if(lista) {
        var listaConvertida = JSON.parse(lista)

        // Limpar a lista
        listaInteresse.innerHTML = ""
        // Depois adicionar um por um
        listaConvertida.forEach(interesse => {
            const li = document.createElement('li')
            li.appendChild(document.createTextNode(interesse));
            listaInteresse.appendChild(li);
        });
    }
}

//Funcao para limpa a lista e localStorage
btnLimpar.addEventListener('click', function(event) {
    var lista = localStorage.getItem(INTERESSES_KEY)

    if(lista) {
        var listaConvertida = JSON.parse(lista)

        // Percorre a lista e deleta o interesse do localStorage
        listaConvertida.forEach(interesse => {
            localStorage.removeItem(INTERESSES_KEY, interesse);
        });

        // Limpar a lista
        listaInteresse.innerHTML = ""
    }
});

setInterval(carregarInteresses, 1000)