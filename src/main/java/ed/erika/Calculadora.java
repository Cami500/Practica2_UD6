package ed.erika;
/**
 * Esta clase define una calculadora con cuatro métodos que realizan las operaciones básicas de suma, resta, multiplicación y división.
 *
 * @version 3.7
 * @since 2.1
 * @author Karlos Andrés Chávez Abrego
 */

/**
 * En esta clase se define una calculadora en la que se pueden realizar operaciones matemáticas básicas como la suma, resta, multiplicación y división de dos números enteros
 *
 * @author Érika Ballesteros Pascual
 * @version 3.7
 * @since 2.1
 */

public class Calculadora {
	
	/**
	 * Devuelve la suma de dos números enteros.
	 *
	 * @param a El primer número entero.
	 * @param b El segundo número entero.
	 * @return El resultado de la suma de los dos números enteros.
	 */

	/**
	 * Devuelve la suma de los dos números enteros que se le pasa al método.
	 * @param a Un número entero
	 * @param b Otro número entero
	 * @return El total de la suma de los dos números enteros que se han pasado
	 */
	
	public int suma(int a, int b) {
		return a + b;
	}
	
	/**
	 * Devuelve la resta de dos números enteros.
	 *
	 * @param a El primer número entero.
	 * @param b El segundo número entero.
	 * @return El resultado de la resta de los dos números enteros.
	 */

	/**
	 * Devuelve la resta de los dos números enteros que se le pasa al método.
	 *
	 * @param a Un número entero
	 * @param b Otro número entero
	 * @return El total de la resta de los números enteros que se han pasado como parámetro
	 */
	
	public int resta(int a, int b) {
		return a - b;
	}
	/**
	 * Devuelve el resultado de la multiplicación de dos números enteros.
	 *
	 * @param a El primer número entero.
	 * @param b El segundo número entero.
	 * @return El resultado de los dos números enteros.
	 */

	/**
	 * Devuelve la multiplicación de los dos números enteros que se le pasa al método.
	 *
	 * @param a Un número entero
	 * @param b Otro número entero
	 * @return El total de la multiplicación de los números enteros pasados como parámetros
	 */
	
	public int multiplica(int a, int b){
		return a*b;
	}
	
	/**
	 * Devuelve la división de dos números enteros.
	 *
	 * @param a El primer número entero.
	 * @param b El segundo número entero (no puede ser cero).
	 * @throws ArithmeticException Si el segundo número es cero.
	 * @return El resultado.
       */

	/**
	 * Devuelve la división de los dos números enteros que se le pasa al método.
	 *
	 * @param a Un número entero
	 * @param b Un número entero
	 * @return El total de la división de los números enteros que se han pasado como parámetros
	 */
	
	public int diveix(int a, int b) {
		return a/b;
	}

}

