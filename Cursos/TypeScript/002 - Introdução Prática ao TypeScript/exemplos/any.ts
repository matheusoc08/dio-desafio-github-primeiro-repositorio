let valorAny: any;
valorAny = 3;
valorAny = 'Ola';
valorAny = true;

let valorString: string = 'Teste';
valorString = valorAny;
let valorString2: string = 'Testao';
valorString2: valorAny;

function somarString(string1: string, string2: string){
    console.log(string1 + string2);
}

somarString(valorString, valorString2);