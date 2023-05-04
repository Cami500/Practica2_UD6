package ed.lucas;

/**
 * Realizar operaciones matemáticas básicas
 * En esta clase se puden ejecutar las operaciones matemáticas de:
 * suma, resta, multiplicación y división
 *
 * @author Lucas Juan Riquelme
 * Versión actual:
 * @version 3.7
 * Primera versión disponible:
 * @version 2.1 (junio de 2022)
 */
public class Calculadora {

	/**
	 * Suma dos valores que se pasan por parámetros
	 *
	 * @param a operador 1
	 * @param b operador 2
	 * @return int
	 */
	public int suma(int a, int b) {
		return a + b;
	}

	/**
	 * Resta dos valores que se pasan por parámetros
	 *
	 * @param a operador 1
	 * @param b operador 2
	 * @return int
	 */
	public int resta(int a, int b) {
		return a - b;
	}

	/**
	 * Multiplica dos valores que se pasan por parámetros
	 *
	 * @param a operador 1
	 * @param b operador 2
	 * @return int
	 */
	public int multiplica(int a, int b){
		return a*b;
	}

	/**
	 * Divide dos valores que se pasan por parámetros
	 *
	 * @param a operador 1
	 * @param b operador 2
	 * @return int
	 * @exception ArithmeticException error al dividir entre 0
	 */
	public int diveix(int a, int b) {
		return a/b;
	}

	/**
	 * Calcula la potencia de un número.
	 *
	 * @param base el número a elevar
	 * @param exponente la potencia a la que elevar
	 * @return int
	 */
	public int calcularPotencia(int base, int exponente) {
		int resultado = 1;
		for (int i = 0; i < exponente; i++) {
			resultado *= base;
		}
		return resultado;
	}

	/**
	 * Indica si un número es par o impar
	 *
	 * @param num El número a verificar
	 * @return true si el número es par, false si es impar
	 */
	public boolean esPar(int num) {
		boolean esPar;

		esPar = num % 2 == 0;

		return esPar;
	}

	/**
	 * Convierte un número entero a binario
	 *
	 * @param decimal numero entero a convertir
	 * @return String
	 */
	public String decimalABinario(int decimal){

		StringBuilder binario = new StringBuilder();
		int cociente = decimal;
		int residuo;

		while (cociente > 0) {
			residuo = cociente % 2;
			binario.insert(0, residuo);
			cociente = cociente / 2;
		}

		return binario.toString();
	}

}