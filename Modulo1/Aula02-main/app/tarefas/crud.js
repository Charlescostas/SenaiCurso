export let listaDeTarefas = [
    { id: 1, descricao: 'Fazer compras', concluida: false },
    { id: 2, descricao: 'Estudar JavaScript', concluida: true },
    { id: 3, descricao: 'Lavar o carro', concluida: false },
    { id: 4, descricao: 'Fazer compras', concluida: false }
];

export class Tarefas {
    function adicionarTarefa(descricao) {

        const novaTarefa = {
            id: listaDeTarefas.length + 1,
            descricao: descricao,
            concluida: false
        };
    
        listaDeTarefas.push(novaTarefa);
        console.log("Tarefa adicionada!")
        return listaDeTarefas
    }
    
    function removerTarefa(id) {
        const tarefa = listaDeTarefas.find(tarefa => tarefa.id === id);
    
        if (tarefa) {
            listaDeTarefas = listaDeTarefas.filter(tarefa => tarefa.id !== id);
            console.log(`Tarefa de id: ${id} removida com sucesso!`)
        }
        else {
            console.log("Tarefa não encontrada!")
        }    
    }
    
    function concluirTarefa(id) {
        const tarefa = listaDeTarefas.find(tarefa => tarefa.id === id);
    
        if (tarefa) {
            tarefa.concluida = true;
        }
        else {
            console.log("Tarefa não encontrada!")
        }
    }
    
    function exibirTarefas() {
        listaDeTarefas.forEach(tarefa => {
            console.log(`ID: ${tarefa.id}, Descrição: ${tarefa.descricao}, Concluída: ${tarefa.concluida ? 'Sim' : 'Não'}`);
        });
    }
}


export let minhaVariavel = "Rawan"