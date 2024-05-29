/*
var numero1 = window.prompt("Informe numero 1:");

var numero2 = window.prompt("Informe numero 2:");

var operador = window.prompt("Informe operador:");

var resultado = 0

resultado = eval(numero1 + operador + numero2)

window.alert(parseFloat(resultado))*/

var historico = []
var display = '' 

function limpar(){
    this.atuliazar('')
}

function addValor(valor){
    this.atualizarDisplay(display += valor);
}

function calcularOperacao(){  
    this.atualizarDisplay(eval(display));
}

function atuliazar(valor){
    display = valor; 
    var displayinfo = document.getElementById('display-info')
    displayinfo.innerHTML = valor
}