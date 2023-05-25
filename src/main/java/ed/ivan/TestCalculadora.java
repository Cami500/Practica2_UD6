package ed.ivan;

public class TestCalculadora {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        System.out.println(calculadora.suma(1,2));
        System.out.println(calculadora.resta(2,4));
        System.out.println(calculadora.multiplica(3,4));
        System.out.println(calculadora.diveix(0,3));
        System.out.println(calculadora.operacionBucle(3,7));
        System.out.println(calculadora.esPar(5));
        System.out.println(calculadora.conversorBinario(20));
    }
}

