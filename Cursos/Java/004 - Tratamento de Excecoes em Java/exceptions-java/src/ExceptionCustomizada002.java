import javax.swing.*;

public class ExceptionCustomizada002 {

    public static void main(String[] args){
        int[] numerador = {4, 5, 8, 10};
        int[] denominador = {2, 4, 0, 2, 8};

        for(int i = 0; i < denominador.length; i++){

            try {
                if (numerador[i] % 2 != 0)
                    throw new DivisaoNaoExataException("Divisao nao exata!", numerador[1], denominador[i]);
                int resultado = numerador[i] / denominador[i];
                System.out.println(resultado);
            } catch (DivisaoNaoExataException e){
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, e.getMessage());
            } catch (ArithmeticException e){
                JOptionPane.showMessageDialog(null, "Impossivel dividir por 0");
                e.printStackTrace();
            } catch(ArrayIndexOutOfBoundsException e){
                JOptionPane.showMessageDialog(null, "O index tentou ultrapassar o limite do array!\n" + e.getMessage());
                e.printStackTrace();
            }
        }

        System.out.println("O programa continua...");
    }
}




