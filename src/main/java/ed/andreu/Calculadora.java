package ed.andreu;
/**
 * Esta clase sirve para una calculadora como en sus metodos uno sirva para somar dos numeros, otro metodo
 sirve para restar dos numeros, otro para multiplicar dos numeros y otro para dividir dos numeros.

 @author  Andreu Puchades Pascual
 @version La versión actual de la clase (3.7)
 @since Está disponible desde la versión 2.1, junio de 2022.
 **/

public class Calculadora {
	/**
	 * Este metodo sumo dos numeros que le pases y te retorna la suma.
	 * @param a = El primer numero
	 * @param b = El segundo numero
	 * @return = Tornara la suma de "a" y "b"
	 */
	public int suma(int a, int b) {
		return a + b;
	}

	/**
	 * Este metodo resta dos numeros que le pases y te retorna la resta.
	 * @param a = El primer numero
	 * @param b = El segundo numero
	 * @return = Tornara la resta de "a" y "b"
	 */
	public int resta(int a, int b) {
		return a - b;
	}

	/**
	 * Este metodo multiplica dos numeros que le pases y te retorna la multiplicación.
	 * @param a = El primer numero
	 * @param b = El segundo numero
	 * @return = Tornara la multiplicación de "a" y "b"
	 */
	public int multiplica(int a, int b){
		return a * b;
	}

	/**
	 * Este metodo divide dos numeros que le pases y te retorna la division.
	 * @param a = El primer numero
	 * @param b = El segundo numero
	 * @return = Tornara la division de "a" y "b"
	 * Una exception podria ser si "b" fuera 0, entonces se produciria un error.
	 @throws ArithmeticException Esta excepcion es cuando "b" fuera 0, entonces se produciria un error,
	 porque no se puede dividir un numeor entre 0 da error.
	 */

	public int diveix(int a, int b) {
		if(b == 0){
			System.out.println("No se puede dividir por 0");
			return 0;
		}

		return a / b;
	}

	/**
	 * Calcula la potencia de un número elevado a un exponente dado.
	 *
	 * @param base la base de la potencia.
	 * @param exponente el exponente de la potencia.
	 * @return el resultado de la potencia.
	 */
	public int calcularPotencia(int base, int exponente) {

		int resultado = 1;

		for (int i = 0; i < exponente; i++) {
			resultado *= base;
		}

		return resultado;
	}

	/**
	 * Determina si un número es par o impar.
	 *
	 * @param numero el número a evaluar.
	 * @return true si el número es par, false si es impar.
	 */
	public boolean esNumeroPar(int numero) {

		boolean resultado;

		if (numero % 2 == 0) {
			resultado = true;
		} else {
			resultado = false;
		}

		return resultado;
	}

	/**
	 * Convierte un número entero en base decimal a su equivalente en base binaria.
	 * @param decimal el número en base decimal a convertir.
	 * @return el número en base binaria como una cadena de caracteres.
	 */
	public String convertirDecimalABinario(int decimal) {
		String binario = "";
		int nuevo;

		while (decimal > 0) {
			nuevo = decimal % 2;
			binario = nuevo + binario;
			decimal = decimal / 2;
		}

		return binario;
	}
}