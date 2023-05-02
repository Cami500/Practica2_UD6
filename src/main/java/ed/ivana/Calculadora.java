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

	/**
	 * Calcula la potencia de un número entero elevado a una potencia entera.
	 *
	 * @param base La base de la potencia.
	 * @param exponente Él exponente de la potencia.
	 * @return Él resultado de la operación de la potencia.
	 */

	public int calculaPotencia(int base , int exponente ){

		int resultado = 1;

		for ( int i = 0; i < exponente ; i++ ){
			resultado = resultado * base;
		}

		return resultado;
	}

	/**
	 * Comprueba si un número entero es par o impar.
	 *
	 * @param numero El numero entero a comprobar.
	 * @return Si el numero es par, devuelve true y si es impar, devuelve false.
	 */

	public boolean esNumeroPar(int numero ){

		boolean esPar;

		if ( numero % 2 == 0) {
			esPar = true;
		} else {
			esPar = false;
		}

		return esPar;
	}

	/**
	 * Convierte un número entero en su representación binaria.
	 *
	 * @param decimal El numero entero a convertir.
	 */

	public void covertirDecimalABinario(int decimal) {

		String binario = "";
		int valor = decimal;
		int resto;

		while (valor > 0) {
			resto = valor % 2;
			binario = resto + binario;
			valor = valor / 2;
		}
	}
}

