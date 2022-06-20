// Como podemos melhorar o esse código usando TS? 

enum Emprego{
    Atriz,
    Padeiro
}

class Pessoa {
    nome: string = '';
    idade: number = 0;
    emprego?: Emprego;

    constructor(nome: string, idade: number, profissao?: Emprego){
        this.nome = nome;
        this.idade = idade;
        this.emprego = profissao;
    }
}

let pessoa1 = new Pessoa('', 0 );

pessoa1.nome = "maria",
pessoa1.idade = 29,
pessoa1.emprego = Emprego.Atriz

interface novaPessoa {
    nome: string,
    idade: number,
    profissao?: Emprego
}

let pessoa2: novaPessoa = {
    nome: 'roberto',
    idade: 19,
    profissao: Emprego.Padeiro
}


let pessoa3: {nome: string, idade: number, profissao: Emprego} = {
    nome: "laura",
    idade: 32,
    profissao: Emprego.Atriz
};

let pessoa4 = {
    nome: "carlos",
    idade: 19,
    profissao: Emprego.Padeiro
}


/*
//Versao professor
enum Trabalho {
    Atriz,
    Padeiro
}

type Humano = {
    nome: string,
    idade: number,
    profissao: Trabalho
}

let pessoa1: Humano = {
    nome: 'maria',
    idade: 29,
    profissao: Trabalho.Atriz
};

let pessoa2: Humano = {
    nome: 'roberto',
    idade: 19,
    profissao: Trabalho.Padeiro
};

let pessoa3: Humano = {
    nome: 'laura',
    idade: 32,
    profissao: Trabalho.Atriz
};

let pessoa4: Humano = {
    nome: "carlos",
    idade: 19,
    profissao: Trabalho.Padeiro
}
*/