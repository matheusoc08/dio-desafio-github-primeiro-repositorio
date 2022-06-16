
////Atividade 1
var array = [1, 2, 3];

const somaArray = function (acc, currentValue){
   // acc = 0;

    acc += currentValue;

    return acc;
}

console.log(array.reduce(somaArray, 5));

/////////////
////Atividade 2

var pricesList = [11.89, 12, 89.09, 15.99];
var saldo = 300;

const subtraiSaldo = function (acumulador, valorAtual) {
    acumulador -= valorAtual;

    return acumulador;
}

console.log(pricesList.reduce(subtraiSaldo, saldo));


/////////////////////
////Versao Prodessora
////Atividade 1
function somaNumeros(arr) {
    return arr.reduce(function (prev, current) {
        return prev + current;
    });
}

const arr = [1, 2];

console.log(somaNumeros(arr));

////Atividade 2
const lista = [
    {
        name: 'sabao em po',
        preco: 30
    },
    {
        name: 'cereal',
        preco: 12
    },
    {
        name: 'toalha',
        preco: 30
    }
]

const saldoDisponivel = 100;

function calculaSaldo(saldoDisponivel, lista) {
    return lista.reduce(function (prev, current, index) {
        console.log('rodada ', index + 1);
        console.log({ prev });
        console.log({ current });
        return prev - current.preco;
    }, saldoDisponivel);
}

console.log(calculaSaldo(saldoDisponivel, lista));