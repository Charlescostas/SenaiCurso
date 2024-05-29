const fruta = '{"frutas":["Maça","Banana","Laranja","Pera"]}';
var obj = JSON.parse(fruta);

console.log(obj.frutas[1])

obj.frutas.push('Abacate')

console.log(obj)