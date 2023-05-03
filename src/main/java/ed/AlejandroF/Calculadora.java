package ed.AlejandroF;
/**
 * Esta clase define una calculadora con cuatro métodos que realizan las operaciones básicas
 * de suma, resta, multiplicación y división.
 *
 * @version 3.7
 * @since 2.1
 * @author Alejandro Fernandez Marti
 */

public class Calculadora {
	
	/**
	 * Devuelve la suma de dos números enteros.
	 *
	 * @param a El primer número entero.
	 * @param b El segundo número entero.
	 * @return El resultado de la suma de los dos números enteros.
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
	
	public int diveix(int a, int b) {
		return a/b;
	}

	/**
	 * Calcula la potencia de un número entero a elevado a la n-ésima potencia.
	 *
	 * @param a la base de la potencia.
	 * @param n el exponente de la potencia.
	 * @return la base elevada al exponente.
	 */
	public int calcularPotencia(int a , int n ){
		int t = 1;
		for ( int i = 0; i < n ; i++ ){
			t = t * a;
		}
		return t;
	}
	/**
	 * Verifica si un número entero es par o no.
	 *
	 * @param a el número a verificar.
	 * @return true si el número es par, false si es impar.
	 */
	public boolean esPar(int a ){
		boolean r;
		if ( a % 2 == 0) {
			r = true;
		} else {
			r = false;
		}
		return r;
	}
	/**
	 * Convierte un número entero en su representación binaria.
	 *
	 * @param a el número a convertir.
	 * @return la representación binaria del número como una cadena.
	 */
	public String convertirBinario(int a){
		String r = "";
		int v = a;
		int v1;
		while ( v > 0) {
			v1 = v % 2;
			r = v1 + r;
			v = v / 2;
		}
		return r;
	}

}

