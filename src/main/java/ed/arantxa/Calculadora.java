package ed.arantxa;

public class Calculadora {
	/**
	 * Esta clase representa una calculadora que realiza operaciones matemáticas básicas como la suma,
	 * la resta, la multiplicación y la división entre dos números enteros.
	 *
	 * La clase Calculadora es útil para realizar cálculos simples en programas informáticos que requieran
	 * funcionalidades matemáticas.
	 *
	 * @author Arantxa Gandia Sanchis
	 * @version 3.7
	 * @since 2.1 (junio de 2022)
	 */

	/**
	 * Realiza la operación de suma entre dos números.
	 *
	 * @param a el primer número entero
	 * @param b el segundo número entero
	 * @return el resultado de la suma entre a y b
	 */
	public int suma(int a, int b) {
		return a + b;
	}

	/**
	 * Realiza la operación de resta entre dos números.
	 *
	 * @param a el primer número entero
	 * @param b el segundo número entero
	 * @return el resultado de la resta entre a y b
	 */
	public int resta(int a, int b) {
		return a - b;
	}

	/**
	 * Realiza la operación multiplicacion entre dos números enteros.
	 *
	 * @param a el primer número entero
	 * @param b el segundo número entero
	 * @return el resultado de la multiplicacion entre a y b
	 */
	public int multiplica(int a, int b){
		return a*b;
	}

	/**
	 * Realiza la operación de division entre dos números enteros.
	 *
	 * @param a el primer número entero
	 * @param b el segundo número entero
	 * @return el resultado de la division entre a y b
	 * @throws ArithmeticException si el segundo parámetro es cero
	 */
	public int diveix(int a, int b) {
		return a/b;
	}

}

