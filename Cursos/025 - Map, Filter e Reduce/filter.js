var array = [1, 2, 34, 5, 75, 743, 121, 3232, 353, 76, 99, 4];

function verPar(par) {
    if (par % 2 == 0) {
        return par;
    }
}

//console.log(array.filter((par) => par % 2 == 0));

console.log(array.filter(verPar));

/////
////Versao Professora
function filtraPares(arr) {
    return arr.filter(callback);
}

function callback(item) {
    return item % 2 === 0;
}

console.log(filtraPares(array));