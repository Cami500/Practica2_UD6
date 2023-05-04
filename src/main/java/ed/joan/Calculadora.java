package ed.joan;

/**
 * Basicamente es una clase que contine 4 metodos uno para dividir, otro para multiplicar, otro para sumar y por último uno para restar
 * @version  3.7
 * @since  2.1
 * @author Joan Company Richart
 */

public class Calculadora {
	/** contructor calculadora*/
	public Calculadora() {}

	/**
	 * Hace una suma con 2 números enteros.
	 * @param a El primer número entero.
	 * @param b El segundo número entero.
	 * @return És el resultado de la suma.
	 */

	public int suma(int a, int b) {
		return a + b;
	}

	/**
	 * Hace una resta de con dos números enteros.
	 * @param a El primer número entero.
	 * @param b El segundo número entero.
	 * @return És el resultado de la resta.
	 */
	
	public int resta(int a, int b) {
		return a - b;
	}
	/**
	 * Hace una multiplicación con dos números enteros.
	 * @param a El primer número entero.
	 * @param b El segundo número entero.
	 * @return El resultado de la multiplicación.
	 */
	
	
	public int multiplica(int a, int b){
		return a*b;
	}
	
	/**
	 * Hace una división de dos números enteros.
	 * @param a El primer número entero.
	 * @param b El segundo número entero (no puede ser cero).
	 * @throws ArithmeticException Si el segundo número es cero.
	 * @return El resultado de la division.
       */
	
	public int diveix(int a, int b) {
		return a/b;
	}

	/**
	 * Saca la potencia entre el número 1 y 2
	 * @param numero1 primer numero
	 * @param numero2 segundo numero
	 * @return saca la potencia
	 */

	public int sacarP(int numero1 , int numero2 ){


		int potencia1 = 1;

		for ( int i = 0; i < numero2 ; i++ ){
			potencia1 = potencia1 * numero1;
		}

		return potencia1;

	}

	/**
	 * Comprueba si el numero1 es par o impar
	 * @param numero1 el número par o impar
	 * @return retorna si el resulsultado es true o false
	 */
	public boolean esPar(int numero1 ){



		boolean falseotrue;

		if ( numero1 % 2 == 0) {
			falseotrue = true;
		} else {
			falseotrue = false;
		}

		return falseotrue;
	}

	/**
	 * Calcula el número 1 en binario
	 * @param numero1 el numero que se va a convertir
	 * @return retorna el número en binario
	 */
	public String cBinario(int numero1){


		String resultado = "";
		int valor = numero1;
		int valor1;

		while ( valor > 0) {
			valor1 = valor % 2;
			resultado = valor1 + resultado;
			valor = valor / 2;
		}
		return resultado;
	}
}

