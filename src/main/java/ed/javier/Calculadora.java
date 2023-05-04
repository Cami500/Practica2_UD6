package ed.javier;

/**
 * Esta clase se encarga de llevar a cabo los métodos de una calculadora, es decir, es capaz de sumar
 * restar, dividir y multiplicar con los parámeteros que le pasemos.
 *
 * @version 3.7
 * @since  2.1
 * @author Javier Guijarro
 * **/
public class Calculadora {

	/**
	 * Este método devuelve una suma del primer entero con el segundo
	 *
	 * @param a El primer número entero
	 * @param b El segundo número entero
	 * @return El resultado de la suma de los dos enteros
	 * **/
	public int suma(int a, int b) {
		return a + b;
	}

	/**
	 * Este método devuelve una resta del primer entero con el segundo
	 *
	 * @param a El primer número entero
	 * @param b El segundo número entero
	 * @return El resultado de la resta de los dos enteros
	 * **/
	public int resta(int a, int b) {
		return a - b;
	}

	/**
	 * Este método devuelve una multiplicación del primer entero con el segundo
	 *
	 * @param a El primer número entero
	 * @param b El segundo número entero
	 * @return El resultado de la multiplicación de los dos enteros
	 * **/
	public int multiplica(int a, int b){
		return a*b;
	}

	/**
	 * Este método devuelve una división del primer entero con el segundo
	 *
	 * @param a El primer número entero
	 * @param b El segundo número entero
	 * @return El resultado de la división de los dos enteros
	 * @exception ArithmeticException Se producirá si el segundo parámetro tiene valor de 0
	 * **/
	public int diveix(int a, int b) {
		return a/b;
	}

	/**
	 * Este método devuelve el resultado de elevar un número con otro
	 *
	 * @param base El primer número entero que lo utilizaremos como base
	 * @param exponente El segundo número entero que lo utilizaremos como exponente
	 * @return El resultado del primer número elevado al segundo
	 * **/
	public int potencia (int base , int exponente){

		int resultado = 1;

		for ( int i = 0; i < exponente ; i++ ){
			resultado = resultado * base;
		}

		return resultado;
	}

	/**
	 * Este método devuelve un booleano indicando si el número entero pasado es par
	 *
	 * @param numero El número entero que comprobaremos si es par
	 * @return El booleano que indica si el número es par
	 * **/
	public boolean esPar (int numero){

		boolean esPar;

		if (numero % 2 == 0) {
			esPar = true;
		} else {
			esPar = false;
		}

		return esPar;
	}

	/**
	 * Este método devuelve un String en forma binaria del número entero que le hemos pasado
	 *
	 * @param numero El número entero que pasaremos para pasar a binario
	 * @return El resultado del número pasado a binario en formato texto
	 * **/
	public String conversorBinario(int numero){

		String cadenaBinaria = "";
		int dividendo = numero;
		int resto;

		while (dividendo > 0) {
			resto = dividendo % 2;
			cadenaBinaria = resto + cadenaBinaria;
			dividendo = dividendo / 2;
		}

		return cadenaBinaria;
	}
}

