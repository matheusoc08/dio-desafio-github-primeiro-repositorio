
var N = 6;

for (let i = 1; i <= N; i++){

    if(i % 2 === 0){
        console.log(`${i}^2 = ${power(i)}`);
    }
}

function power(i){
    return Math.pow(i, 2);
}

