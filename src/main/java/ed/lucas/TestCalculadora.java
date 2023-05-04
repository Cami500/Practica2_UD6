package ed.lucas;

public class TestCalculadora {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        System.out.println(calculadora.suma(2, 2));
        System.out.println(calculadora.resta(2, 2));
        System.out.println(calculadora.multiplica(2, 2));
        System.out.println(calculadora.diveix(2, 2));
    }
}
