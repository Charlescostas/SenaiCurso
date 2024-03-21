function mediaAluno(aluno, i) {
    let soma = 0
    for (numero in aluno.notas) {
        soma += aluno.notas[numero]
    }

    let media = soma / aluno.notas.length
    return media
}

const listaNotas = [
    {aluno:'Davi'   , notas: [2,6,8,5]},
    {aluno:'João'   , notas: [8,7,6,9]},
    {aluno:'Elisa'  , notas: [1,10,7,6]},
    {aluno:'Isabela', notas: [5,8,7,9]}
]

listaNotas.forEach(function(aluno, i) {
    console.log('Aluno: '+aluno.aluno+" "+mediaAluno(aluno, i))
})
