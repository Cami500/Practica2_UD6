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
	 * Constructor por defecto de la clase.
	 */
	public Calculadora() {}
	
	/**
	 * Realiza la operación de suma entre dos números devolviendo su resultado.
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
	public int multiplica(int a, int b) {
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
	
	/**
	 * Este método realiza la operación de elevar un numero a su potencia n.
	 *
	 * @param base es el número a elevar
	 * @param exponente es el exponente de la potencia
	 * @return el resultado de elevar "a" a la enésima potencia
	 */
	public static int potencia(int base, int exponente) {
	    int resultado = 1;

	    for (int contador = 0; contador < exponente; contador++) {
	        resultado = resultado * base;
	    }

	    return resultado; 
	}
	
	/**
	 * Este método comprueba si un número entero es par o impar.
	 *
	 * @param entero es el número entero a comprobar
	 * @return true si el número es par, false en caso contrario
	 */
	public static boolean esPar(int entero) {
	    boolean resultado;

	    if (entero % 2 == 0) {
	        resultado = true;
	    } else {
	        resultado = false;
	    }

	    return resultado;
	}
	
	/**
	 * Este método convierte un número decimal a su representación en base binaria.
	 *
	 * @param entero es el número decimal a convertir
	 * @return una cadena de caracteres que representa en binario el número entero recibido como argumento
	 */
	public static String decimalABinario(int entero) {
	    String representacionBinario = "";
	    int cociente = entero;
	    int resto;

	    while (cociente > 0) {
	        resto = cociente % 2;
	        representacionBinario = resto + representacionBinario;
	        cociente = cociente / 2;
	    }
	    
	    return representacionBinario;
	}
	
	/**
	 * Método principal de la aplicación para realizar las correspondientes pruebas y depuración.
	 * @param args son los argumentos recibidos por línea de comandos
	 */
	public static void main(String[] args) {
		int a = 2;
		int b = 3;
		
		int r1 = potencia(a, b);
		boolean r2 = esPar(a);
		String r3 = decimalABinario(b);
		
		System.out.printf("Resultado 1: %d, Resultado 2: %b, Resultado 3: %s", r1, r2, r3);
		
	}
	
}
