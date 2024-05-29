class Produto {
    constructor(nome, preco = 0, quantidade = 0) {
      this.nome = nome;
      this.preco = preco;
      this.quantidade = quantidade;
    }
  
    calcularTotal() {
      return this.preco * this.quantidade;
    }
  }
  
  // Criando instâncias da classe Produto
  const produto1 = new Produto('Camiseta', 29.99);
  const produto2 = new Produto('Calça Jeans', 49.99, 2);
  
  // Exibindo informações dos produtos
  console.log(produto1);
  console.log(produto2);
  
  // Calculando o total para cada produto
  console.log('Total do produto 1:', produto1.calcularTotal()); // Saída: 0
  console.log('Total do produto 2:', produto2.calcularTotal()); // Saída: 99.98
  