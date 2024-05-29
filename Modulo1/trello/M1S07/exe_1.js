var listaNumeros = [1,2,3,4,5,6,7,8,9,10];
var listaFrutas = ["maça","morango","manga"];

listaNumeros.forEach(numero => {
    console.log(`Numero: ${numero}`);
});

listaFrutas.forEach(fruta => {
    console.log(`Fruta: ${fruta}`);
});

//exercicio 2

listaNumeros.push(15);
listaNumeros.forEach(numero => {
    console.log(`Numero: ${numero}`);
});


listaNumeros.pop();
listaNumeros.forEach(numero => {
    console.log(`Numero: ${numero}`);
});

listaFrutas.unshift("Banana");
listaFrutas.forEach(fruta => {
    console.log(`Fruta: ${fruta}`);
});

listaFrutas.shift();
listaFrutas.forEach(fruta => {
    console.log(`Fruta: ${fruta}`);
});