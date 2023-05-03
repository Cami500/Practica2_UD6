package ed.sergi;
/**
 * Calculadora es una clase que permite realizar operaciones aritméticas básicas.
 * <p>
 * Esta clase contiene métodos para sumar, restar, multiplicar y dividir dos números enteros.
 * En ella podremos realizar las operaciones que nos sean convenientes
 * </p>
 * @author Sergi
 * @version 3.7
 * @since 2.1, junio de 2022
 */
public class Calculadora {

	/**
	 * Suma dos números enteros y devuelve el resultado.
	 * @param a el primer sumando
	 * @param b el segundo sumando
	 * @return la suma de a y b
	 */
	public int suma(int a, int b) {
		return a + b;
	}

	/**
	 * Resta dos números enteros y devuelve el resultado.
	 * @param a el primer minuendo
	 * @param b el segundo sustraendo
	 * @return la resta de a y b
	 */
	public int resta(int a, int b) {
		return a - b;
	}

	/**
	 * Multiplica dos números enteros y devuelve el resultado.
	 * @param a el factor
	 * @param b el factor
	 * @return la multiplicación de a por b
	 */
	public int multiplica(int a, int b){
		return a*b;
	}

	/**
	 * Divide dos números enteros y devuelve el resultado.
	 * @param a el dividendo
	 * @param b el divisor
	 * @return el cociente de la división de a entre b
	 * @throws ArithmeticException si b es cero
	 */
	public int diveix(int a, int b) {
		return a/b;
	}

}

