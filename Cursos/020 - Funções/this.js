var pessoa1 = {
    nome: "roberto",
    idade: 4
}

var pessoa2 = {
    nome: "Angelica",
    idade: 23
}

function calculaIdade(anos) {
    return `Daqui a ${anos} anos, ${this.nome} terá ${this.idade + anos} anos de idade`;
}

console.log(calculaIdade.apply(pessoa1, [5]));
console.log(calculaIdade.call(pessoa2, 5));
