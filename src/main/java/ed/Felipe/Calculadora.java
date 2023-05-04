package ed.Felipe;
/**
 * Esta clase define una calculadora
 * Contiene cuatro métodos que realizan las operaciones básicas de suma, resta, multiplicación y división.
 * @author Felipe Sánchez García
 * @version 3.7
 * @since 2.1
 */

public class Calculadora {

	/**
	 * Constructor
	 */
	public Calculadora() {
	}

	/**
	 * Devuelve la suma de dos números enteros.
	 * @param a El primer número entero.
	 * @param b El segundo número entero.
	 * @return El resultado de la suma de los dos números enteros.
	 */
	
	public int suma(int a, int b) {
		return a + b;
	}
	
	/**
	 * Devuelve la resta de dos números enteros.
	 * @param a El primer número entero.
	 * @param b El segundo número entero.
	 * @return El resultado de la resta de los dos números enteros.
	 */
	
	public int resta(int a, int b) {
		return a - b;
	}
	/**
	 * Devuelve el resultado de la multiplicación de dos números enteros.
	 * @param a El primer número entero.
	 * @param b El segundo número entero.
	 * @return El resultado de los dos números enteros.
	 */
	
	
	public int multiplica(int a, int b){
		return a*b;
	}
	
	/**
	 * Devuelve la división de dos números enteros.
	 * @param a El primer número entero.
	 * @param b El segundo número entero (no puede ser cero).
	 * @return El resultado.
	 * @throws ArithmeticException Si el segundo número es cero.
       */
	
	public int diveix(int a, int b) {
		return a/b;
	}

	/**
	 * Devuelve la potencia de dos números enteros.
	 * @param base El primer número entero.
	 * @param exponente El segundo número entero.
	 * @return El resultado.
	 * @throws ArithmeticException Si exponente es un número negativo.
	 */

	public int potencia ( int base , int exponente ){

		int resultado = 1;

		for ( int i = 0; i < exponente ; i++ ){
			resultado = resultado * base;
		}

		return resultado;
	}

	/**
	 * Devuelve un booleano indicando si un número es par o impar.
	 * @param n El número entero.
	 * @return El resultado.
	 */
	public boolean esPar ( int n ){

		boolean esPar;

		if ( n % 2 == 0) {
			esPar = true;
		} else {
			esPar = false;
		}

		return esPar;
	}

	/**
	 * Devuelve el resultado en binario de un número entero.
	 * @param n El número entero
	 * @return El resultado.
	 * @throws El número n no puede ser negativo.
	 */
	public String binario (int n){

		String resultado = "";
		int dividendo = n;
		int resto;

		while ( dividendo > 0) {
			resto = dividendo % 2;
			resultado = resto + resultado;
			dividendo = dividendo / 2;
		}
	}
}

