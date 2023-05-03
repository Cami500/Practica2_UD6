package ed.sergi;
/**
 * Calculadora es una clase que permite realizar operaciones aritméticas básicas.
 * <p>
 * Esta clase contiene métodos para sumar, restar, multiplicar y dividir dos números enteros.
 * En ella podremos realizar las operaciones que nos sean convenientes
 * </p>
 * @author Sergi
 * @version  3.7
 * @since 2.1, junio de 2022
 */
public class Calculadora {

	public static void main(String[] args) {
		int a = 2;
		String resultado = decimalABinario(a);
	}

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

	/**
	 * Calcula la potencia de un número entero.
	 * @param base la base de la potencia
	 * @param exponente el exponente de la potencia
	 * @return el resultado de elevar base en la potencia exponente
	 */
	public static int potencia ( int base , int exponente ){

		int t = 1;

		for ( int i = 0; i < exponente ; i++ ){
			t = t * base;
		}

		return t;
	}

	/**
	 * Determina si un número entero es par o no.
	 * @param a el número entero a comprobar
	 * @return true si a es par, false si no lo es
	 */
	public static boolean esPar( int a ){

		boolean resultado;

		if ( a % 2 == 0) {
			resultado = true;
		} else {
			resultado = false;
		}

		return resultado;
	}

	/**
	 * Convierte un número entero en binario.
	 * @param a el número entero a convertir
	 * @return una cadena con el valor binario de a
	 */
	public static String decimalABinario(int a){

		String binario = "";
		int cociente = a;
		int resto;

		while ( cociente > 0) {
			resto = cociente % 2;
			binario = resto + binario;
			cociente = cociente / 2;
		}

		return binario;
	}

}

