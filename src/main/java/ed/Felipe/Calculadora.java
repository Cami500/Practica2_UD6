package ed.Felipe;
/**
 * Esta clase define una calculadora
 * Contiene cuatro métodos que realizan las operaciones básicas de suma, resta, multiplicación y división.
 * @author Felipe Sánchez García
 * @version 3.7
 * @since 2.1
 */

public class Calculadora {

	/**
	 * Constructor
	 */
	public Calculadora() {
	}

	/**
	 * Devuelve la suma de dos números enteros.
	 * @param a El primer número entero.
	 * @param b El segundo número entero.
	 * @return El resultado de la suma de los dos números enteros.
	 */
	
	public int suma(int a, int b) {
		return a + b;
	}
	
	/**
	 * Devuelve la resta de dos números enteros.
	 * @param a El primer número entero.
	 * @param b El segundo número entero.
	 * @return El resultado de la resta de los dos números enteros.
	 */
	
	public int resta(int a, int b) {
		return a - b;
	}
	/**
	 * Devuelve el resultado de la multiplicación de dos números enteros.
	 * @param a El primer número entero.
	 * @param b El segundo número entero.
	 * @return El resultado de los dos números enteros.
	 */
	
	
	public int multiplica(int a, int b){
		return a*b;
	}
	
	/**
	 * Devuelve la división de dos números enteros.
	 * @param a El primer número entero.
	 * @param b El segundo número entero (no puede ser cero).
	 * @return El resultado.
	 * @throws ArithmeticException Si el segundo número es cero.
       */
	
	public int diveix(int a, int b) {
		return a/b;
	}

	public int oper1 ( int a , int n ){

		int t = 1;

		for ( int i = 0; i < n ; i++ ){
			t = t * a;
		}

		return t;
	}

	public boolean oper2 ( int a ){

		boolean r;

		if ( a % 2 == 0) {
			r = true;
		} else {
			r = false;
		}

		return r;
	}

	public String oper3(int a){

		String r = "";
		int v = a;
		int v1;

		while ( v > 0) {
			v1 = v % 2;
			r = v1 + r;
			v = v / 2;
		}
	}


}

