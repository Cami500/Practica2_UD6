package ed.martin;

/**
 *Esta clase es un objeto calculadora que incluye 4 métodos públicos que hacen las funciones de la calculadora.
 *@author martin
 *@version 3.7
 *@since 2.1, junio de 2022.
 */

/**
 *La calculadora tiene 4 metodos básicos, suma: suma 2 numeros pasados por parámetros, resta: resta los 2 numeros pasados por parámetros
 multiplicación: multiplica los 2 números pasados por parametro y división divide los 2 números pasados por parámetros. Todos los parámetros son numeros enteros.
 *@author martin
 *@version 3.7
 *@since 2.1, junio de 2022.
 */


public class Calculadora {
	
	/**
	 * Realiza una suma de los números pasados como parámetro
	 * @param a valor entero que se suma
	 * @param b valor entero que se suma
	 * @return retorna un entero de la suma a+b
	 */
	
	public int suma(int a, int b) {
		return a + b;
	}
	
	
	/**
	 * Realiza una resta de los números pasados como parámetro
	 * @param a valor entero que se resta
	 * @param b valor entero que se resta
	 * @return retorna un entero de la resta a-b
	 */
	
	public int resta(int a, int b) {
		return a - b;
	}
	
	
	/**
	 * Realiza una multiplicación de los números pasados como parámetro
	 * @param a valor entero que se multiplica
	 * @param b valor entero que se multiplica
	 * @return retorna un entero de la multiplicación a*b
	 */
	
	public int multiplica(int a, int b){
		return a*b;
	}
	
	
	/**
	 * Realiza una división de los números pasados como parámetro
	 * @param a valor entero que se divide
	 * @param b valor entero que se divide
	 * @return retorna un entero de la división a/b
	 * @exception ArithmeticException esta excepción saltará cuando intentes dividir un número entre cero
	 */
	
	public int diveix(int a, int b) {
		return a/b;
	}

}

