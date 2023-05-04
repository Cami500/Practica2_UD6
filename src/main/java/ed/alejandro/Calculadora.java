package ed.alejandro;

/**
 * La siguiente clase representa una calculadora que efectúa algunas operaciones aritméticas básicas.
 * 
 * La clase 'Calculadora' nos proporciona la funcionalidad para realizar cálculos aritméticos simples
 * como la resta, la multiplicación y la división entre dos números enteros. Permite a otras clases o
 * programas acceder a todas estas funciones para implementar comportamientos más complejos.
 *
 * @author Alejandro Pons Roca
 * @version 3.7
 * @since 2.1 (junio de 2022)
 */

public class Calculadora {
	
	/**
	 * Realiza la operación de suma entre dos números devolviendo su resultado
	 *
	 * @param a es el primer sumando
	 * @param b es el segundo sumando
	 * @return el resultado de la suma entre a y b
	 */
	public int suma(int a, int b) {
		return a + b;
	}
	
	/**
	 * Resta dos números enteros y devuelve el resultado.
	 * @param a es el primer minuendo
	 * @param b es el segundo sustraendo
	 * @return el resultado de la resta de a y b
	 */
	public int resta(int a, int b) {
		return a - b;
	}
	
	/**
	 * Multiplica dos números enteros y devuelve el resultado.
	 * @param a es el primer factor
	 * @param b es el segundo factor
	 * @return el resultado de la multiplicación de a por b
	 */
	public int multiplica(int a, int b){
		return a*b;
	}
	
	/**
	 * Realiza la operación de division entre dos números enteros.
	 *
	 * @param a es el dividendo
	 * @param b el el divisor
	 * @return el resultado de la division entre a y b
	 * @throws ArithmeticException si el divisor es cero
	 */
	public int diveix(int a, int b) {
		return a/b;
	}

}
