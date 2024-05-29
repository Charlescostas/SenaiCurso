// Definição da classe Pessoa
class Pessoa {
    constructor(nome, idade) {
      this.nome = nome;
      this.idade = idade;
    }
  
    falar() {
      console.log(`Olá, meu nome é ${this.nome} e tenho ${this.idade} anos.`);
    }
  }
  
  // Criando um objeto do tipo Pessoa
  const pessoa2 = new Pessoa('Maria', 25);
  
  // Acessando propriedades e métodos do objeto pessoa2
  console.log(pessoa2.nome); // Saída: Maria
  console.log(pessoa2.idade); // Saída: 25
  pessoa2.falar(); // Saída: Olá, meu nome é Maria e tenho 25 anos.
  