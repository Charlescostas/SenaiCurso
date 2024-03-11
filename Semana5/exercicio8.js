const numeros = [2, 4, 11, 18];
const numeroAlgo = 15;

function parSoma(a, alvo) {
    let soma
    let resultado = "Numero algo não encontrado"

    for (var i = 0; i < a.length; i++) {
        for (var y = (i+1); y < a.length; y++) {
            soma = (Number(a[i])+Number(a[y]))

            if (soma==numeroAlgo) {
                resultado = "Numero algo encontrado na posição: [" + i + "," + y + "]" 
                y = a.length
            }
        }    
    }
    return resultado
}

console.log(parSoma(numeros, numeroAlgo))