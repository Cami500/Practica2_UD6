package ed.izan;

import java.util.Scanner;

public class TestCalculadora {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int primerNumero = solicitarNumeroEntero("Introduce un número: ");
        int segundoNumero = solicitarNumeroEntero("Introduce otro número: ");
        mostrarResultadosOperaciones(calculadora,primerNumero,segundoNumero);

        int operacion1 = calculadora.calcularPotencia(2,4);//Potencia
        boolean esPrimo = calculadora.esDivisibleEntreDos(4);//Numero primo
        String recogerNumeros = calculadora.calcularNumeroDecimalABinario(56);
    }

    /**
     * Método que permite solicitar un número entero indicando por mensaje al usuario que introduzca un número entero.
     * Si el número introducido es un tipo de dato distinto al de un número imprime el error y lo volverá a solicitarlo.
     * @return numero introducido por el usuario.
     * @param mensaje;
     **/
    private static int solicitarNumeroEntero (String mensaje) {
        do {
            System.out.print(mensaje);
            if (input.hasNextInt()) {
                return input.nextInt();
            }else{
                input.next();
            }
            System.out.println("¡Error! El dato introducido no es correcto introducelo de nuevo");
        }while (true);

    }

    /**
     * Método que permite mostrar toda la información imprimiendo por pantalla los resultados de los métodos que
     * contiene la clase Calculadora.
     * @param calculadora;
     * @param numeroUno;
     * @param numeroDos;
     **/
    private static void mostrarResultadosOperaciones (Calculadora calculadora, int numeroUno, int numeroDos) {
        System.out.println("La suma es: " +calculadora.suma(numeroUno, numeroDos));
        System.out.println("La resta es: " +calculadora.resta(numeroUno, numeroDos));
        System.out.println("La multiplicación es: " +calculadora.multiplica(numeroUno, numeroDos));
        System.out.println("La división es: " +calculadora.diveix(numeroUno, numeroDos));
    }
}
