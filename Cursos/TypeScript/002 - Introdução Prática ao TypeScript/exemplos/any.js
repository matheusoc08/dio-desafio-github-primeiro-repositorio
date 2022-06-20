"use strict";
let valorAny;
valorAny = 3;
valorAny = 'Ola';
valorAny = true;
let valorString = 'Teste';
valorString = valorAny;
let valorString2 = 'Testao';
valorString2: valorAny;
function somarString(string1, string2) {
    console.log(string1 + string2);
}
somarString(valorString, valorString2);
