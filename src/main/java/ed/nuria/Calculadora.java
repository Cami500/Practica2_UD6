package ed.nuria;

/**Esta clase hace las funciones básicas de una calculadora**/

/** La clase calculadora realiza las operaciones de suma, resta,
 * multiplicación y división  de números enteros**/

/**
 * @autor Nuria
 * @version 3.7
 * @since 2.1, junio de 2022**/
public class Calculadora {

	/**Suma dos números enteros y devuelve el resultado
	 * @param a primer sumando
	 * @param b segundo sumando
	 * @return la suma de a y b**/
	public int suma(int a, int b) {
		return a + b;
	}

	/**Resta dos números enteros y devuelve el resultado
	 * @param a el minuendo
	 * @param b el sustraendo
	 * @return la resta de a y b**/
	public int resta(int a, int b) {
		return a - b;
	}

	/**Suma dos números enteros y devuelve el resultado
	 * @param a primer factor
	 * @param b segundo factor
	 * @return la multipicacion de a y b**/
	public int multiplica(int a, int b){
		return a*b;
	}

	/**Suma dos números enteros y devuelve el resultado
	 * @param a el dividendo
	 * @param b el divisor
	 * @return el cociente de a/b
	 * @throws ArithmeticException si b es cero**/
	public int diveix(int a, int b) {
		return a/b;
	}

}

