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

}

