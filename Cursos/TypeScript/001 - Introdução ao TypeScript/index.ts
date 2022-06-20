interface Pessoa{
    nome: string;
    idade: number;
    nacionalidade: string;
}

interface Brasileiro extends Omit<Pessoa, 'nacionalidade'>{

}

const brbr: Brasileiro = {
    nome: 'rafael',
    idade: 14,

}