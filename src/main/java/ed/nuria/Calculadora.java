package ed.nuria;

/**Esta clase hace las funciones básicas de una calculadora**/

/** La clase calculadora realiza las operaciones de suma, resta,
 * multiplicación y división  de números enteros**/

/**
 * @autor Nuria
 * @version 3.7
 * @since 2.1, junio de 2022**/
public class Calculadora {

	/**Suma dos números enteros y devuelve el resultado
	 * @param a primer sumando
	 * @param b segundo sumando
	 * @return la suma de a y b**/
	public int suma(int a, int b) {
		return a + b;
	}

	/**Resta dos números enteros y devuelve el resultado
	 * @param a el minuendo
	 * @param b el sustraendo
	 * @return la resta de a y b**/
	public int resta(int a, int b) {
		return a - b;
	}

	/**Suma dos números enteros y devuelve el resultado
	 * @param a primer factor
	 * @param b segundo factor
	 * @return la multipicacion de a y b**/
	public int multiplica(int a, int b){
		return a*b;
	}

	/**Suma dos números enteros y devuelve el resultado
	 * @param a el dividendo
	 * @param b el divisor
	 * @return el cociente de a/b
	 * @throws ArithmeticException si b es cero**/
	public int diveix(int a, int b) {
		return a/b;
	}

/**
 * Realiza la potencia de un entero
 * @param base la base de la potencia
 * @param b el exponente de la potencia
 * @return la potencia**/
	public int potencia(int base , int exponente ){

		int t = 1;

		for ( int i = 0; i < exponente ; i++ ){
			t = t * base;
		}

		return t;
	}

	/**
	 * Devuelve si un número es par o no
	 * @param numero el número que se desea analizar
	 * @return verdadero o falso**/
	public boolean esPar(int numero ){

		boolean r;

		if ( numero % 2 == 0) {
			r = true;
		} else {
			r = false;
		}

		return r;
	}

	/**
	 * Devuelve el mismo número pero en binario
	 * @param numero el número que se desea transformar numero binario
	 * @return el número en binario**/
	public String aBinario(int numero){

		String r = "";
		int v = numero;
		int v1;

		while ( v > 0) {
			v1 = v % 2;
			r = v1 + r;
			v = v / 2;
		}
		return r;
	}

}

