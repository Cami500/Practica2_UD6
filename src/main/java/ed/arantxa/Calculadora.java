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
	/**
	 * Este método realiza la operación de elevar un numero a su potencia.
	 *
	 * @param a el número a elevar a una potencia
	 * @param n el exponente de la potencia
	 * @return el resultado de elevar "a" a la potencia "n"
	 */
	public int potencia ( int a , int n ){

		int t = 1;

		for ( int i = 0; i < n ; i++ ){
			t = t * a;
		}

		return t;
	}
	/**
	 * Este método comprueba si un número entero es par o impar.
	 *
	 * @param a el número entero a comprobar
	 * @return true si el número es par, false si es impar
	 */
	public boolean esPar ( int a ){

		boolean r;

		if ( a % 2 == 0) {
			r = true;
		} else {
			r = false;
		}

		return r;
	}
	/**
	 * Este método convierte un número decimal a su equivalente en binario.
	 *
	 * @param a el número decimal a convertir
	 * @return el número en su representación binaria como una cadena de caracteres
	 */
	public String decimalABinario(int a) {

		String r = "";
		int v = a;
		int v1;

		while (v > 0) {
			v1 = v % 2;
			r = v1 + r;
			v = v / 2;
		}
		return r;
	}
}

