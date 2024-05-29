// Função construtora para criar objetos do tipo Pessoa
function Pessoa(nome, idade) {
    this.nome = nome;
    this.idade = idade;
    this.falar = function() {
      console.log(`Olá, meu nome é ${this.nome} e tenho ${this.idade} anos.`);
    };
  }
  
  // Criando um objeto do tipo Pessoa
  const pessoa1 = new Pessoa('João', 30);
  
  // Acessando propriedades e métodos do objeto pessoa1
  console.log(pessoa1.nome); // Saída: João
  console.log(pessoa1.idade); // Saída: 30
  pessoa1.falar(); // Saída: Olá, meu nome é João e tenho 30 anos.
  