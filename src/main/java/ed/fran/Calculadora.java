package ed.fran;

// Calculadora que nos permte, sumar,restar, multiplicar, dividir.

/**
 * Applicación que nos permite realizar varias operaciones enteras;
 * sumar
 * restar
 * multiplicar
 * dividir
 * Todas estas operaciones, son llevadas a cabo mediante dos números enteros
 *
 * @author Fran Gregori
 * @version 3.7
 * @since 2.1 junio/2022
 */
public class Calculadora {
    /**
     * Constructor de la clase, obligatorio ponerlo, ya que si no se pone nos da warning
     */
    public Calculadora() {
        new Calculadora();
    }

    /**
     * Devolver la suma de dos números enteros pasados como parámetro
     *
     * @param a de tipo entero
     * @param b de tipo entero
     * @return devuele la suma de dos números enteros
     * @throws RuntimeException Tipo de dato no esperado, es decir,
     *                          un tipo de dato superior al int o diferente al int, tales como String, char etc...
     *                          No son de obligada captura
     */
    public int suma(int a, int b) {
        return a + b;
    }

    /**
     * Devolver la resta de dos números enteros pasados como parámetro
     *
     * @param a de tipo entero
     * @param b de tipo entero
     * @return devuele la resta de dos números enteros
     * @throws RuntimeException Tipo de dato no esperado, es decir,
     *                          un tipo de dato superior al int o diferente al int, tales como String, char etc...
     *                          No son de obligada captura, por lo tanto son de tipo RunTimeException
     */
    public int resta(int a, int b) {
        return a - b;
    }

    /**
     * Devolver la mutpilicación de dos números enteros pasados como parámetro
     *
     * @param a de tipo entero
     * @param b de tipo entero
     * @return devuele la multpiplicacion de dos números enteros
     * @throws RuntimeException Tipo de dato no esperado, es decir,
     *                          un tipo de dato superior al int o diferente al int, tales como String, char etc...
     *                          O dividir entre 0, no son de obligada captura
     */
    public int multiplica(int a, int b) {
        return a * b;
    }

    /**
     * Devolver la división de dos números enteros pasados como parámetro
     *
     * @param a de tipo entero
     * @param b de tipo entero
     * @return devuele la división de dos números enteros
     * @throws RuntimeException error al introducir un tipo de dato no esperado, es decir,
     *                          un tipo de dato superior al int o diferente al int, tales como String, char etc...
     *                          Además de una posible opción, dividir un número entero,
     *                          esto genera una excepción del tipo ArithmeticException, no es de obligada captura.
     *                          No son es obligada captura, por lo tanto son de tipo RunTimeException
     */
    public int diveix(int a, int b) {
        return a / b;
    }


    public int duplicarValor(int valor, int iteraciones) {

        int resultado = 1;

        for ( int i = 0; i < iteraciones; i++ ) {
            resultado = resultado * valor;
        }

        return resultado;
    }


    public boolean esDivisibleEntre2(int numero) {

        boolean esDivisible;

        if ( numero % 2 == 0 ) {
            esDivisible = true;
        } else {
            esDivisible = false;
        }

        return esDivisible;
    }


    public String oper3(int a) {

        String r = "";
        int    v = a;
        int    v1;

        while ( v > 0 ) {
            v1 = v % 2;
            r  = v1 + r;
            v  = v / 2;
        }
    }

}

