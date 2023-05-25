package ed.ivan;


/**
 * Esta clase define una calculadora con cuatro métodos que realizan las operaciones básicas de suma, resta, multiplicación y división.
 *
 * @version 3.7
 * @since 2.1
 * @author Ivan Juan Martinez
 */
public class Calculadora {

	/**
	 * Este metodo suma dos números enteros y devuelve el resultado.
	 *
	 * @param a El primer número entero.
	 * @param b El segundo número entero.
	 * @return El resultado de la suma de los dos números enteros.
	 */
	public int suma(int a, int b) {
		return a + b;
	}

	/**
	 * Este metodo resta dos números enteros y devuelve el resultado.
	 *
	 * @param a El primer número entero.
	 * @param b El segundo número entero.
	 * @return El resultado de la resta.
	 */

	public int resta(int a, int b) {
		return a - b;
	}

	/**
	 * Este metodo multiplica dos números enteros y devuelve el resultado.
	 *
	 * @param a El primer número entero.
	 * @param b El segundo número entero.
	 * @return El resultado de la multiplicacion.
	 */

	public int multiplica(int a, int b){
		return a*b;
	}

	/**
	 * Este metodo divide dos números enteros y devuelve el resultado. Si el segundo número es cero, lanza una excepción.
	 *
	 * @param a El primer número entero.
	 * @param b El segundo número entero.
	 * @throws ArithmeticException Si el segundo número es cero.
	 * @return El resultado de la division.
	 */

	public int diveix(int a, int b) {
		return a/b;
	}

	/**
	 * Un bucle en el que, hasta que i sea igual a n, el parametro t se multiplicará por el parametro a constantemente.
	 *
	 * @param a El primer número entero.
	 * @param n El segundo número entero.
	 * @return El resultado del bucle.
	 */
	public int operacionBucle(int a, int n){

		int t = 1;

		for ( int i = 0; i < n ; i++ ){
			t = t * a;
		}

		return t;
	}

	/**
	 * Si el parametro a es par, el parametro r será igual a true, sino, es false
	 *
	 * @param a El único número entero.
	 * @return El resultado de la operación.
	 */

	public boolean esPar(int a){

		boolean r;

		if (a % 2 == 0) {
			r = true;
		} else {
			r = false;
		}

		return r;
	}


	/**
	 * Si el parametro a/v es mayor a 0, hace una serie de operaciones.
	 *
	 * @param numero El único número entero.
	 * @return El resultado de la operación.
	 */
	public String conversorBinario(int numero){

		String resultadoFinal = "";
		int cociente = numero;
		int aux;

		while (cociente > 0) {
			aux = cociente % 2;
			resultadoFinal = aux + resultadoFinal;
			cociente = cociente / 2;
		}
		return resultadoFinal;
	}

}

