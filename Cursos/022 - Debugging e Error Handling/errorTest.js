function verificaArray(array, numero) {
    try{
        if (!array || !numero) throw new ReferenceError("Por favor, envie os parametros");
        
        if (typeof array != 'object') throw new TypeError("Array precisa ser do tipo Object");
        if (typeof numero != 'number') throw new TypeError("Numero precisa do tipo Number");

        if (array.length != numero) throw new RangeError("Tamanho inválido!");

        return array;
    }
    catch (e) {
        if (e instanceof ReferenceError) {
            console.log("Este erro é um ReferenceError!");
            console.log(e.message);
        } else if (e instanceof (TypeError)) {
            console.log("Este erro é um TypeError");
            console.log(e.message);
        }
        else if (e instanceof RangeError) {
            console.log("Este erro é um RangeError");
            console.log(e.message);
        } else {
            console.log("Este é um erro inesperado: " + e);
        }
    }
}

var arr = [1, 2];

console.log(verificaArray(arr, 2));