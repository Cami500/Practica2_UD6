package ed.cintia;

/**
 *La clase Calculadora sirve para realizar las cuatro operaciones matemáticas elementales.
 * <p>
 * Esta clase proporciona métodos para poder llevar a cabo operaciones matemáticas simples
 * con dos números enteros (a, b) y obtener su resultado.
 * Las operaciones básicas que se ofrecen en cada método son:
 * <ul>
 * 		<li>suma
 *		<li>resta
 * 		<li>multiplicación
 * 		<li>división
 * </ul>
 * <p>
 * Cada método solo realiza una operación matemática,
 * requieren 2 parámetros que serán de tipo int (números enteros)
 * y como resultado de la operación se devolverá otro número entero (int)
 *
 * @author Cintia Cantó Esteve
 * @version 3.7
 * @since 2.1 (June 2022)
 */
public class Calculadora {

	/**
	 * El método suma realiza la suma de dos números enteros y el resultado de la suma será otro número entero
	 * @param a		primer sumando
	 * @param b		segundo sumando
	 * @return		resultado de la suma a + b
	 */
	public int suma(int a, int b) {
		return a + b;
	}

	/**
	 * El método resta calcula la diferencia entre dos números enteros y su resultado será otro número entero
	 * @param a		minuendo
	 * @param b		sustraendo
	 * @return		resultado de la resta a - b
	 */

	public int resta(int a, int b) {
		return a - b;
	}

	/**
	 * El método multiplica calcula el producto de dos números enteros y su resultado será otro número entero
	 * @param a		multiplicador
	 * @param b		multiplicando
	 * @return		resultado del producto a * b
	 */
	public int multiplica(int a, int b){
		return a*b;
	}

	/**
	 * El método divideix calculavel cociente de la división entre dos números enteros,
	 * su resultado será otro número entero
	 * @param a		dividendo
	 * @param b		divisor
	 * @return		cociente de la división a/b
	 * @throws ArithmeticException si el divisor es cero
	 */
	public int diveix(int a, int b) {
		return a/b;
	}
}

