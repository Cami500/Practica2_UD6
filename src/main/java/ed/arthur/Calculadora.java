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

}

