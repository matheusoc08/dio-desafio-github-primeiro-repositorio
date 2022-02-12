function trocaPar(array) {
    if (!array || array.length == 0) return -1;

    for (i = 0; i < array.length; i++){
        if (array[i] % 2 === 0) {
            array[i] = 0;
        }
    }

    return array;
}

let array = [];
console.log(trocaPar(false));