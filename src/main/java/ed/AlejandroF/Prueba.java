package ed.AlejandroF;

public class Prueba {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int a = calculadora.suma(2,2);
        int b = calculadora.resta(2,2);
        int c = calculadora.multiplica(2,2);
        int d = calculadora.diveix(2,2);
        System.out.println("El resultado es: " + (a+b+c+d));
    }
}
