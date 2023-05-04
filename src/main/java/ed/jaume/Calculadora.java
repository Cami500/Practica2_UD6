package ed.jaume;
/**
 * Esta clase define una calculadora con cuatro métodos que realizan las operaciones básicas de suma, resta, multiplicación y división.
 *
 * @version 3.7
 * @since 2.1
 * @author Jaume Moltó Gallego
 */

public class Calculadora {

	/**
	 * Creamos el constructor
	 */
	public Calculadora() {
	}

	/**
	 * Devuelve la suma de dos números enteros.
	 *
	 * @param a Es el primer número entero.
	 * @param b Es el segundo número entero.
	 * @return El resultado de la suma de los dos números enteros.
	 */
	public int suma(int a, int b) {
		return a + b;
	}

	/**
	 * Devuelve la resta de dos números enteros.
	 *
	 * @param a Es el primer número entero.
	 * @param b Es el segundo número entero.
	 * @return El resultado de la resta de los dos números enteros.
	 */
	
	public int resta(int a, int b) {
		return a - b;
	}




	/**
	 * Devuelve el resultado de la multiplicación de dos números enteros.
	 *
	 * @param a Es el primer número entero.
	 * @param b Ee el segundo número entero.
	 * @return El resultado de los dos números enteros.
	 */
	public int multiplica(int a, int b){
		return a*b;
	}

	/**
	 * Devuelve el resultado de la división de dos números enteros.
	 *
	 * @param a Es el primer número entero.
	 * @param b Es el segundo número entero tiene una excepción y es que no puede ser cero.
	 * @throws ArithmeticException Si el segundo número es cero.
	 * @return El resultado.
	 */
	
	public int diveix(int a, int b) {
		return a/b;
	}

}

