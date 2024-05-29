function isConcluida(tarefas) {
    return fruit.name === "cherries";
}
const tarefas = [
    {id:1, descricao: 'Fazer compras', concluida: false},
    {id:2, descricao: 'Estudar Java', concluida: true},
    {id:3, descricao: 'lavar carro', concluida: false}
]

const tarefaConcluidaFind = tarefas.find(({ concluida }) => concluida === false);
console.log(tarefaConcluidaFind)

const tarefaConcluida = tarefas.filter(({ concluida }) => concluida===false)
console.log(tarefaConcluida)