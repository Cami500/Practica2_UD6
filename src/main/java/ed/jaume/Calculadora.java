package ed.jaume;

/**
 * esta clase define una calculadora que realiza las operaciones de suma, resta,multipliación y division
 *
 * @version 3.7
 * @since 2.1
 * @author Jaume Miro Corcoles
 */

public class Calculadora {
	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();
		calculadora.suma(1,2);
		calculadora.resta(2,1);
		calculadora.multiplica(2,2);
		calculadora.diveix(10,2);
		calculadora.elevar(3,5);
		calculadora.esPar(4);
		calculadora.decimalABinario(3);

	}

	/**devulve la suma de dos numeros
	 *
	 * @param a es el primer número entero
	 * @param b es el segundo número entero
	 * @return devuelve la suma de param a mas el param b
	 */
	public int suma(int a, int b) {
		return a + b;
	}


	/** devuelve la resta de dos numeros
	 *
	 * @param a es el minuendo
	 * @param b es el sustraendo
	 * @return devuelve el resultado del minuendo menos el sustraendo
	 */
	public int resta(int a, int b) {
		return a - b;
	}

	/** devuelve la multiplicación de dos numeros
	 *
	 * @param a es el primer factor
	 * @param b es el segundo factor
	 * @return devuelve el producto de multiplicar los dos factores
	 */
	public int multiplica(int a, int b){
		return a*b;
	}

	/** devuelve la division de dos numeros
	 *
	 * @param a es el dividendo
	 * @param b es el divisor
	 * @return devuelve el resto de dividir el dividendo por el divisor
	 */
	public int diveix(int a, int b) {
		return a/b;
	}

	/** eleva un numero
	 *
	 * @param base el numero a elevar
	 * @param exponente al que elevas
	 * @return
	 */
	public int elevar(int base, int exponente) {

		int resultado = 1;

		for (int i = 0; i < exponente; i++) {
			resultado = resultado * base;
		}

		return resultado;
	}

	/** comprueba si es par
	 *
	 * @param numero
	 * @return
	 */
	public boolean esPar(int numero) {

		boolean resultado;

		if (numero % 2 == 0) {
			resultado = true;
		} else {
			resultado = false;
		}

		return resultado;
	}

	/** pasa de decimal a binario
	 *
	 * @param numero
	 * @return
	 */
	public String decimalABinario(int numero) {

		String resultado = "";
		int cociente = numero;
		int residuo;

		while (cociente > 0) {
			residuo = cociente % 2;
			resultado = residuo + resultado;
			cociente = cociente / 2;
		}

		return resultado;
	}

}

