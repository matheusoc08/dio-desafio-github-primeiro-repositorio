//solucao 1
function palindromo(palavra) {
    if (!palavra)
        return;
    
    console.log(palavra.split("").reverse().join(""));

}

//solucao 2
function palindromo2(palavra) {
    if (!palavra) return;

    for (i = 0; i < palavra.length / 2 - 1; i++){
        if (palavra[i] !== palavra[palavra.length - 1 - i])
            return false;
    }

    return true;
}

palindromo("roma e amor");
palindromo2("o lobo ama o bolo");

console.log(palindromo2("roma"));

