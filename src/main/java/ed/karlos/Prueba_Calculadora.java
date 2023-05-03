package ed.karlos;

public class Prueba_Calculadora {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int suma = calculadora.suma(2,3);
        int resta = calculadora.resta(2,3);
        int multiplicacion = calculadora.multiplica(2,3);
        int division = calculadora.diveix(2,3);
        System.out.println(suma);
        System.out.println(resta);
        System.out.println(multiplicacion);
        System.out.println(division);

    }
}
