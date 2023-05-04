package ed.jaume;
/**
 * Esta clase define una calculadora con cuatro métodos que realizan las operaciones básicas de suma, resta, multiplicación y división.
 *
 * @version 3.7
 * @since 2.1
 * @author Jaume Moltó Gallego
 */

public class Calculadora {

	/**
	 * Creamos el constructor
	 */
	public Calculadora() {
	}

	/**
	 * Devuelve la suma de dos números enteros.
	 *
	 * @param a Es el primer número entero.
	 * @param b Es el segundo número entero.
	 * @return El resultado de la suma de los dos números enteros.
	 */
	public int suma(int a, int b) {
		return a + b;
	}

	/**
	 * Devuelve la resta de dos números enteros.
	 *
	 * @param a Es el primer número entero.
	 * @param b Es el segundo número entero.
	 * @return El resultado de la resta de los dos números enteros.
	 */
	
	public int resta(int a, int b) {
		return a - b;
	}

	/**
	 * Devuelve el resultado de la multiplicación de dos números enteros.
	 *
	 * @param a Es el primer número entero.
	 * @param b Ee el segundo número entero.
	 * @return El resultado de los dos números enteros.
	 */
	public int multiplica(int a, int b){
		return a*b;
	}

	/**
	 * Devuelve el resultado de la división de dos números enteros.
	 *
	 * @param a Es el primer número entero.
	 * @param b Es el segundo número entero tiene una excepción y es que no puede ser cero.
	 * @throws ArithmeticException Si el segundo número es cero.
	 * @return El resultado.
	 */
	
	public int diveix(int a, int b) {
		return a/b;
	}


	/**
	 *	Saca la potencia entre el parametro a y n
	 * @param num1 Es el primer número entero
	 * @param elevado Esl el segundo número entero o el elevado
	 * @return saca la potencia
	 */
	public int potencia(int num1 , int elevado ){

		int potencia = 1;

		for ( int i = 0; i < elevado ; i++ ){
			potencia = potencia * num1;
		}

		return potencia;
	}

	/**
	 * Dice si es par o no
	 * @param num1 Es el número entero
	 * @return true o false si es par o no
	 */
	public boolean parOImpar(int num1 ){

		boolean resultado;

		if ( num1 % 2 == 0) {
			resultado = true;
		} else {
			resultado = false;
		}

		return resultado;
	}

	/**
	 * Hace el cálculo del parametro a al binario
	 * @param num1 Es el número entero que queremos pasar a binario
	 * @return el número en binario
	 */

	public String pasarBinario(int num1){

		String r = "";
		int v = num1;
		int v1;

		while ( v > 0) {
			v1 = v % 2;
			r = v1 + r;
			v = v / 2;
		}
		return r;
	}


}

