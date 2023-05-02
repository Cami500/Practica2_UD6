package ed.andreu;
	/**
	 * Esta clase sirve para una calculadora como en sus metodos uno sirva para somar dos numeros, otro metodo
	 sirve para restar dos numeros, otro para multiplicar dos numeros y otro para dividir dos numeros.
	 **/

	/**
	 * Andreu Puchades Pascual
	 * La versión actual de la clase (3.7)
	 * Está disponible desde la versión 2.1, junio de 2022.
	 **/

public class Calculadora {
	/**
	 * Este metodo sumo dos numeros que le pases y te retorna la suma.
	 * @param a = El primer numero
	 * @param b = El segundo numero
	 * @return = Tornara la suma de "a" y "b"
	 */
	public int suma(int a, int b) {
		return a + b;
	}

	/**
	 * Este metodo resta dos numeros que le pases y te retorna la resta.
	 * @param a = El primer numero
	 * @param b = El segundo numero
	 * @return = Tornara la resta de "a" y "b"
	 */
	public int resta(int a, int b) {
		return a - b;
	}

	/**
	 * Este metodo multiplica dos numeros que le pases y te retorna la multiplicación.
	 * @param a = El primer numero
	 * @param b = El segundo numero
	 * @return = Tornara la multiplicación de "a" y "b"
	 */
	public int multiplica(int a, int b){
		return a * b;
	}

	/**
	 * Este metodo divide dos numeros que le pases y te retorna la division.
	 * @param a = El primer numero
	 * @param b = El segundo numero
	 * @return = Tornara la division de "a" y "b"
	 * Una exception podria ser si "b" fuera 0, entonces se produciria un error.
	 */

	public int diveix(int a, int b) {
		return a / b;
	}
}