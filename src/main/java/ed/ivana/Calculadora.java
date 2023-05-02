package ed.ivana;

public class Calculadora {

	/**
	 * La clase Calculadora define un conjunto de metodos para realizar operaciones matematicas como;
	 * suma, resta, multiplicacion y division.
	 *
	 * @version 3.7
	 * @since 2.1(junio de 2022)
	 * @author Ivana Plamenova Mikinska
	 * */

	/**
	 * Suma dos numeros enteros.
	 *
	 * @param a El primer numero entero a sumar.
	 * @param b El segundo numero entero a sumar.
	 * @return La suma de a y b.
	 */
	public int suma(int a, int b) {
		return a + b;
	}

	/**
	 * Resta dos numeros enteros.
	 *
	 * @param a El primer numero entero.
	 * @param b El segundo numero entero que se resta del primer numero.
	 * @return La resta de a y b.
	 */
	
	public int resta(int a, int b) {
		return a - b;
	}

	/**
	 * Multiplica dos numeros enteros.
	 *
	 * @param a El primer numero entero a multiplicar.
	 * @param b El segundo numero entero a multiplicar.
	 * @return El resultado de la multiplicación de a por b.
	 */
	
	public int multiplica(int a, int b){
		return a*b;
	}

	/**
	 * Divide dos numeros enteros.
	 *
	 * @param a El primer número entero que se dividirá.
	 * @param b El segundo número entero que se utilizará como divisor.
	 * @return El resultado de la división de a entre b.
	 * @throws ArithmeticException si se intenta dividir por cero.
	 */
	public int diveix(int a, int b) {
		return a/b;
	}
}

