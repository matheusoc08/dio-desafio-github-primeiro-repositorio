let anyEstaDeVolta: any;
anyEstaDeVolta = 3;
anyEstaDeVolta = 'teste';

let stringTeste: string = 'verificar';
stringTeste = anyEstaDeVolta;

let unknownValor: unknown;
unknownValor = 3;
unknownValor = 'opa';
unknownValor = true;
unknownValor = 'vai sim';

let stringTeste2: string = 'agora vai';
stringTeste2 = unknownValor;

if(typeof unknownValor === 'string'){
    stringTeste2 = unknownValor;
}

///Tipo never

function jogaErro(erro: string, codigo: number): never{
    throw {error: erro, code: codigo}
}

jogaErro('Deu erro', 500);

