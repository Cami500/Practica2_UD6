package ed.arthur;

/**
 * Esta clase sirve para realizar distintas operaciones matemáticas, como suma, resta, multiplicación y
 * división, con distintos valores.
 *
 * @author Arthur Dias Teixeira
 * @version 3.7
 */
public class Calculadora {

	/**
	 * Este método sirve para hacer la suma de dos valores a y b, como por ejemplo 5 + 1.
	 *
	 * @param a primer valor a sumar
	 * @param b segundo valor a sumar
	 * @return número entero, resultado de la suma
	 */
	public int suma(int a, int b) {
		return a + b;
	}

	/**
	 * Este método sirve para restar un valor a otro, es decir, restar "a" a "b", como por ejemplo 5 - 1.
	 *
	 * @param a primer valor a restar
	 * @param b segundo valor a restar, si este valor es mayor que el primero el resultado será negativo
	 * @return número entero, resultado de la resta
	 */
	public int resta(int a, int b) {
		return a - b;
	}

	/**
	 * Este método sirve para multiplicar dos valores entre sí, es decir, a * b, como por ejemplo 5 * 1.
	 *
	 * @param a primer valor a multiplicar
	 * @param b segundo valor a multiplicar
	 * @return número entero, resultado de la multiplicación
	 */
	public int multiplica(int a, int b){
		return a*b;
	}

	/**
	 * Este método sirve para calcular el resultado de dividir un valor a entre un valor b, como por ejemplo
	 * 5 / 1.
	 *
	 * @param a dividiendo
	 * @param b divisor
	 * @return número entero, resultado de la división
	 */
	public int diveix(int a, int b) {
		return a/b;
	}

	/**
	 * Este método calcula la potencia de un valor a elevado a uno n. Toma dos valores enteros a y n,
	 * y devuelve el resultado de a elevado a n como un entero.
	 *
	 * @param a base de la potencia
	 * @param n exponente de la potencia
	 * @return número entero resultado de la potencia
	 */
	public int potencia(int a , int n ){

		int t = 1;

		for ( int i = 0; i < n ; i++ ){
			t = t * a;
		}

		return t;
	}

	/**
	 * Este método determina si un valor a es par o no.
	 * Toma un valor a y devuelve un booleano true si a es par y false si a es impar.
	 *
	 * @param a valor a evaluar si es par o impar
	 * @return booleano true si a es par false si a es impar
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
	 * Este método convierte un valor a en su representación binaria en forma de String.
	 * Toma un valor a y devuelve un String que representa la forma binaria de a.
	 *
	 * @param a valor a convertir en binario
	 * @return cadena de caracteres con la forma binaria de a
	 */
	public String convertirBinario (int a){

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

