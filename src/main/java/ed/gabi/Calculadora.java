package ed.gabi;

/**
 * Esta clase define una calculadora con cuatro métodos que realizan las siguientes operaciones básicas; suma, resta, multiplicación y división.
 * @version 3.7
 * @since 2.1
 * @author Gabi Vilaplana Garcia
 */

public class Calculadora {

	/** Constructor clase Calculadora */

	public Calculadora() {
	}

	/**
	 * Devuelve la suma de dos números enteros
	 * @param a El primer número entero.
	 * @param b El segundo número entero.
	 * @return El resultado de la suma de los dos números enteros.
	 */
	
	public int suma(int a, int b) {
		return a + b;
	}
	
	/**
	 * Devuelve la resta de dos números enteros.
	 * @param a El primer número entero.
	 * @param b El segundo número entero.
	 * @return El resultado de la resta de los dos números enteros.
	 */
	
	public int resta(int a, int b) {
		return a - b;
	}

	/**
	 * Devuelve el resultado de la multiplicación de dos números enteros.
	 * @param a El primer número entero.
	 * @param b El segundo número entero.
	 * @return El resultado de los dos números enteros.
	 */

	public int multiplica(int a, int b){
		return a*b;
	}
	
	/**
	 * Devuelve la división de dos números enteros.
	 * @param a El primer número entero.
	 * @param b El segundo número entero (no puede ser cero).
	 * @throws ArithmeticException Si "b" es cero.
	 * @return El resultado.
       */
	
	public int divideix(int a, int b) {
		return a/b;
	}

	/**
	 * Devuelve la potencia de dos números enteros.
	 * @param num1 el primer número entero.
	 * @param num2 el segundo numero entero.
	 * @throws ArithmeticException si "num2" es negativo.
	 * @return El resultado
	 */

	public int calcPotencia ( int num1 , int num2 ){

		int x = 1;

		for ( int i = 0; i < num2 ; i++ ){
			x = x * num1;
		}

		return x;
	}

	/**
	 * Comprueba se el número introducido és par.
	 * @param num1 el número que queremos comprobar.
	 * @return Devuelve true/false.
	 */

	public boolean esPar ( int num1 ){

		boolean x;

		if ( num1 % 2 == 0) {
			x = true;
		} else {
			x = false;
		}

		return x;
	}

	/**
	 * Devuelve el número binario de un número introducido previamente.
	 * @param num1 el primer número entero.
	 * @return El número binario en forma de cadena.
	 */

	public String calcBinario(int num1){

		String cadena = "";
		int x = num1;
		int y;

		while ( x > 0) {
			y = x % 2;
			cadena = y + cadena;
			x = x / 2;
		}
		return cadena;
	}
}

