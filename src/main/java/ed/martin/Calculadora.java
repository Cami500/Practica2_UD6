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
	
	
	/**
	 * El método es para sacar la potencia de numero pasado como parametro, este recorre un for de longitud del eponente
	 * dentro del for el resultado que es 1 se va multiplicanto por el numero pasado como parametro.
	 * @param num numero que queremos saber la potencia
	 * @param exponente numero que recorre el for, por lo tanto es el exponente
	 * @return retorna la potencia del numero pasado como parametro.
	 */
	
	public int potencia ( int num , int exponente ){

	    int result = 1;

	    for ( int i = 0; i < exponente ; i++ ){
	        result = result * num;
	    }

	    return result; 
	}


	/**
	 * Con este método sabremos si el número pasado como parametro es para o impar, si es true es par y si retorna false es impar
	 * Para saber el resultado en un if comparamos que el numero modulo de 2 es igual a 0 para retornar si es par.
	 * @param num numero que queremos saber si es par
	 * @return true si es par o false si es impar
	 */
	
	public boolean isPar ( int num ){

	    boolean isPar;

	    if ( num % 2 == 0) {
	        isPar = true;
	    } else {
	        isPar = false;
	    }

	    return isPar;
	}


	/**
	 * Convierte un número entero en su representación en binario.
	 * @param decimal numero del cual queremos saber el binario
	 * @return cadena String con el binario de 1s y 0s
	 */
	
	public String decimal2Binary(int decimal){

	    String result = "";
	    int num = decimal;
	    int resto;

	    while ( num > 0) {
	        resto = num % 2;
	        result = resto + result;
	        num = num / 2;
	    }
	    return result;
	}

}
