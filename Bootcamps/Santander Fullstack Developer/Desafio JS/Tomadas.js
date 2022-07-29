

let line = 
    //[2, 4, 3, 2];
    // [6, 6, 6, 6];
    [2, 2, 2, 2];
let soma = 0


for(i=0; i <line.length; i++){
  let transfor = parseInt(line[i]);
  soma = soma + transfor;
}
console.log(soma-3);