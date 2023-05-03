package ed.karlos;
/**
 * Esta clase define una calculadora con cuatro métodos que realizan las operaciones básicas de suma, resta, multiplicación y división.
 *
 * @version 3.7
 * @since 2.1
 * @author Karlos Andrés Chávez Abrego
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
	 * Calcula el exponente de un número.
	 * @param base El número base.
	 * @param exponente El exponente.
	 * @return El resultado de la operación.
	 */
	public int exponente(int base , int exponente ){

		int resultado = 1;

		for ( int i = 0; i < exponente ; i++ ){
			resultado = resultado * base;
		}

		return resultado;
	}
	/**
	 * Verifica si un número es par.
	 * @param numero El número a verificar.
	 * @return true si el número es par, false en caso contrario.
	 */
	public boolean esPar(int numero ){

		boolean resultado;

		if ( numero % 2 == 0) {
			resultado = true;
		} else {
			resultado = false;
		}

		return resultado;
	}

	/**
	 * Convierte un número decimal a binario.
	 * @param numero El número a convertir.
	 * @return El número convertido a binario.
	 */
	public String conversorBinario(int numero){

		String resultado = "";
		int valor = numero;
		int valor1;

		while ( valor > 0) {
			valor1 = valor % 2;
			resultado = valor1 + resultado;
			valor = valor / 2;
		}
		return resultado;
	}



}

