// let array = ['string', 1, true];
// console.log(array);

// let array2 = ['string', 1, true, ['array1'], ['array2'], ['array3']];
// console.log(array2);
// console.log(array2[4]);

/////Vetores
//array1.forEach(function (item, indice) { console.log(item, indice) });

// //insere um item no fim do array
// array.push('novo item');
// console.log(array);

// //retira um item no final do array
// array.pop();
// console.log(array);

// //retira um item no inicio do array
// array.shift();
// console.log(array);

// //insere um item no fim do array
// array.unshift(2121);
// console.log(array);

// //retorna o indice de um valor
// console.log(array.indexOf(true));

// //remove os itens de acordo com os parametros //splice(indiceInicial, quantidade)
// array2.splice(0, 3);
// console.log(array2);

// //retorna parte de um array existente //slice(indiceInicial, quantidade)
// let novoArray = array2.slice(0, 2);
// console.log(novoArray);

/////Objetos
let object = { string: 'string', number: 1, boolean: true, array: ['array'], objectInterno: { objectInterno: 'objeto interno' } };
console.log(object);
console.log(object.number);

//desestruturação de objeto
var string = object.string;
console.log(string);

var arrayInterno = object.array;
console.log(arrayInterno);

//desestruturação de objeto com chaves
var { string, boolean, objectInterno } = object;
console.log(string, boolean, objectInterno);