package ed.joan;

/**
 * Basicamente es una clase que contine 4 metodos uno para dividir, otro para multiplicar, otro para sumar y por último uno para restar
 * @version  3.7
 * @since  2.1
 * @author Joan Company Richart
 */

public class Calculadora {
	/** contructor calculadora*/
	public Calculadora() {}

	/**
	 * Hace una suma con 2 números enteros.
	 * @param a El primer número entero.
	 * @param b El segundo número entero.
	 * @return És el resultado de la suma.
	 */

	public int suma(int a, int b) {
		return a + b;
	}

	/**
	 * Hace una resta de con dos números enteros.
	 * @param a El primer número entero.
	 * @param b El segundo número entero.
	 * @return És el resultado de la resta.
	 */
	
	public int resta(int a, int b) {
		return a - b;
	}
	/**
	 * Hace una multiplicación con dos números enteros.
	 * @param a El primer número entero.
	 * @param b El segundo número entero.
	 * @return El resultado de la multiplicación.
	 */
	
	
	public int multiplica(int a, int b){
		return a*b;
	}
	
	/**
	 * Hace una división de dos números enteros.
	 * @param a El primer número entero.
	 * @param b El segundo número entero (no puede ser cero).
	 * @throws ArithmeticException Si el segundo número es cero.
	 * @return El resultado de la division.
       */
	
	public int diveix(int a, int b) {
		return a/b;
	}
}

