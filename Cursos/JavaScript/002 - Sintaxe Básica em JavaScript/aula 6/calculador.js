function calculadora() {
    const operacao = Number(prompt('Escolha uma operacao:\n 1- Soma (+)\n 2- Subtracao (-)\n3- Multiplicacao (*)\n4- Divisao (/)\n5- Modulo divisao (%)\n6- Potenciao (**)'));
    //console.log(operacao);

    if (!operacao || operacao >= 7) {
        alert('Operacao inválida');
        calculadora();
    } else {

        let n1 = Number(prompt('Insira o primeiro valor:'));
        let n2 = Number(prompt('Insira o segundo valor:'));
        let resultado;

        if (!n1 || !n2) {
            alert('Erro - Parametros inválidos');
            calculadora();
        } else {
        
            // if (operacao == 1) {
            //     soma();
            // } else if (operacao == 2) {
            //     subtracao();
            // } else if (operacao == 3) {
            //     multiplicacao();
            // } else if (operacao == 4) {
            //     divisao();
            // } else if (operacao == 5) {
            //     modulo();
            // } else if (operacao == 6) {
            //     potencia();
            // } else {
            //     alert('Opcao invalida');
            //     calculadora();
            // }

            switch (operacao) {
                case 1:
                    soma();
                    break;
                case 2:
                    subtracao();
                    break;
                case 3:
                    multiplicacao();
                    break;
                case 4:
                    divisao();
                    break;
                case 5:
                    modulo();
                    break;
                case 6:
                    potencia();
                    break;
                default:
                    alert('Opcao invalida!');
                    calculadora();
            }

            function soma() {
                resultado = n1 + n2;
                alert(`${n1} + ${n2} = ${resultado}`);
            }

            function subtracao() {
                resultado = n1 - n2;
                alert(`${n1} - ${n2} = ${resultado}`);
            }

            function multiplicacao() {
                resultado = n1 * n2;
                alert(`${n1} * ${n2} = ${resultado}`);
            }

            function divisao() {
                resultado = n1 / n2;
                alert(`${n1} / ${n2} = ${resultado}`);
            }

            function modulo() {
                resultado = n1 % n2;
                alert(`O resto de ${n1} / ${n2} é ${resultado}`);
            }

            function potencia() {
                resultado = n1 ** n2;
                alert(`${n1} ^ ${n2} = ${resultado}`);
            }

            function novaOperacao() {
                let opcao = prompt('Deseja realizar uma nova operacao?\n1- Sim\n2- Nao');
                if (opcao == 1) {
                    calculadora();
                } else if (opcao == 2) {
                    alert('Ate mais');
                } else {
                    alert('Digite uma opcao válida!');
                    novaOperacao();
                }
            }

            novaOperacao();
        }
    }
}

calculadora();



