class Animal {
    constructor(nome,idade) {
        this.nome = nome;
        this.idade = idade;
    }

    som() {
        return (`${this.nome} som do animal.`)        
    } 
}

class Cachorro extends Animal {
    som() {
        return (`${this.nome} Au au!.`)
    }
}

const gato = new Animal("Apolo",5)
const cachorro = new Cachorro("Bingo",7)

console.log(gato.som())
console.log(cachorro.som())
