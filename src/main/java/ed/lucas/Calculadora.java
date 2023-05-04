package ed.lucas;

/**
 * Realizar operaciones matemáticas básicas
 * En esta clase se puden ejecutar las operaciones matemáticas de:
 * suma, resta, multiplicación y división
 *
 * @author Lucas Juan Riquelme
 * Versión actual:
 * @version 3.7
 * Primera versión disponible:
 * @version 2.1 (junio de 2022)
 */
public class Calculadora {

	/**
	 * suma dos valores que se pasan por parámetros
	 *
	 * @param a operador 1
	 * @param b operador 2
	 * @return int
	 */
	public int suma(int a, int b) {
		return a + b;
	}

	/**
	 * resta dos valores que se pasan por parámetros
	 *
	 * @param a operador 1
	 * @param b operador 2
	 * @return int
	 */
	public int resta(int a, int b) {
		return a - b;
	}

	/**
	 * multiplica dos valores que se pasan por parámetros
	 *
	 * @param a operador 1
	 * @param b operador 2
	 * @return int
	 */
	public int multiplica(int a, int b){
		return a*b;
	}

	/**
	 * divide dos valores que se pasan por parámetros
	 *
	 * @param a operador 1
	 * @param b operador 2
	 * @return int
	 * @exception ArithmeticException error al dividir entre 0
	 */
	public int diveix(int a, int b) {
		return a/b;
	}

}

