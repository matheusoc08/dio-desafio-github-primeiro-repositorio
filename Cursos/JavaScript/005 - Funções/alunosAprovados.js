function aprovados(alunos, media) {
    let alunosAprovados = [];
    
    for (i = 0; i < alunos.length; i++){
        const { nome, nota } = alunos[i];
        
        if (nota >= media) {
            alunosAprovados.push(nome);
        }
    }

    return alunosAprovados;
}

var alunos = [
    { nome: "carlos", nota: 6 },
    { nome: "beth", nota: 8 },
    { nome: "gabriel", nota: 9 },
    { nome: "gori", nota: 7 },
    { nome: "carla", nota: 4 }];

console.log(aprovados(alunos, 7));
