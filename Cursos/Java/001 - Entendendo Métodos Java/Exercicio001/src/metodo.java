public class metodo {

    public static void main(String[]args){

        System.out.println(calculadora(2, '*', 3));
        System.out.println(cumprimento(18));
        System.out.println(emprestimo(2000, 1));
    }

    public static int calculadora(int num1, char op, int num2) {
        int result = 0;

        switch (op){
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                return 0;
        }

        return result;
    }

    public static String cumprimento(int horario){

        String mensagem;
        if(horario >= 5 && horario < 12){
            mensagem = "Bom dia!";
        }
        else if (horario >= 12 && horario < 18){
            mensagem = "Boa tarde!";
        }
        else {
            mensagem = "Boa noite!";
        }

        return mensagem;
    }

    public static double emprestimo(double valor, int parcela){

        float taxa = 0f;
        double valorTotal = valor;

        if(parcela > 12){
            System.out.println("O parcelamento maximo é até 12 vezes");
        }
        else if(parcela > 8){
            taxa = 1.10f;
        }
        else if(parcela > 4){
            taxa = 1.75f;
        }
        else{
            taxa = 1f;
        }

        valorTotal *= taxa;

        return valorTotal;
    }
}


