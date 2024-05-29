const listaNumeros = [1,5,9,7,2,3,6]

const listaNumeroQuadra = listaNumeros.map(numero => numero * numero) 

listaNumeroQuadra.forEach(numero => {
    console.log(`Numero Quadrado: ${numero}`);
});