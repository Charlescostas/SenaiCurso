class Carro {
    constructor(marca,modelo,ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    info() {
        return ("Marca: "+ this.marca+ ", Modelo: " + this.modelo + ", Ano: " + this.ano + ".")        
    } 
}  

const carro1 = new Carro("Ford","KA",2000)
const carro2 = new Carro("Toyota","Corolla",2015)

console.log(carro1.info())
console.log(carro2.info())

