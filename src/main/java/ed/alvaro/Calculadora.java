package ed.alvaro;

/**
 * Esta clase Calculadora, suma, resta, multiplica y divide 2 numeros
 * @author Alvaro Lucas Perez
 * @version 3.7
 * @version 2.1 junio 2022
 */

public class Calculadora {

	/**
	 * Este método recibe 2 parámetros de tipo entero y devuelve la suma de estos dos
	 * @param a Numero entero
	 * @param b Numero entero
	 * @return a + b; Devuelve la suma de estos dos numeros
	 */
	public int suma(int a, int b) {
		return a + b;
	}

	/**
	 * Este método recibe 2 parámetros de tipo entero y devuelve la resta de estos dos
	 * @param a Numero entero
	 * @param b Numero entero
	 * @return a - b; Devuelve la resta de estos dos numeros
	 */
	
	public int resta(int a, int b) {
		return a - b;
	}

	/**
	 * Este método recibe 2 parámetros de tipo entero y devuelve la multiplicacion de estos dos
	 * @param a Numero entero
	 * @param b Numero entero
	 * @return a * b; Devuelve la multiplicacion de estos dos numeros
	 */
	
	public int multiplica(int a, int b){
		return a*b;
	}

	/**
	 * Este método recibe 2 parámetros de tipo entero y devuelve la división de estos dos
	 * @param a Numero entero
	 * @param b Numero enter
	 * @return a / b; Devuelve la división de estos dos numeros
	 * @exception java.lang.ArithmeticException este error podría ocurrir si se divivde un numero entre 0
	 */
	
	public int diveix(int a, int b) {
		return a/b;
	}



}

