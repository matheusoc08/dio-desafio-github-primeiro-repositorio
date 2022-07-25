public class main {

    public static void main(String []args){

        System.out.println("A area do quadrado eh: " + calcArea(4));
        System.out.println("A area do retangulo eh: " + calcArea(4, 5));
        System.out.println("A area do trapezio eh: " + calcArea(8, 4, 3));

    }

    public static double  calcArea(double lado){
        return (lado*lado);
    }

    public static double  calcArea(double base, double altura){
        return (base * altura);
    }

    public static double  calcArea(double baseMaior, double baseMenor, double altura){
        return (((baseMaior + baseMenor) * altura)/ 2);
    }
}
