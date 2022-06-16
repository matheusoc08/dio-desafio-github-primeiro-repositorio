var array = [30, 30, 40, 5, 223, 2049, 3034, 5];
const set1 = new Set();

function valoresUnicos(array){
    for (i = 0; i < array.length; i++) {
        set1.add(array[i]);
    }

    return [...set1]; //spread
}

console.log(valoresUnicos(array));
