package ed.maria;

public class TestCalculadora {

    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
        System.out.println(calculadora.suma(2, 3));
        System.out.println(calculadora.resta( 39, 8));
        System.out.println(calculadora.multiplica(8, 9));
        System.out.println(calculadora.diveix(20, 5));
        System.out.println(calculadora.potencia(2, 3));
        System.out.println(calculadora.esParOImpar(44));
        System.out.println(calculadora.decimalABinario(84758));
    }
}
