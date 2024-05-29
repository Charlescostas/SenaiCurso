// Objeto literal representando um carro
const carro = {
    marca: 'Toyota',
    modelo: 'Corolla',
    ano: 2020,
    cor: 'prata',
    ligar: function() {
      console.log('O carro está ligado.');
    }
  };
  
  // Acessando propriedades e métodos do objeto carro
  console.log(carro.marca); // Saída: Toyota
  console.log(carro.ano); // Saída: 2020
  carro.ligar(); // Saída: O carro está ligado.
  