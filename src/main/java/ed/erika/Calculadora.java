package ed.erika;

/**
 * En esta clase se define una calculadora en la que se pueden realizar operaciones matemáticas básicas como la suma, resta, multiplicación y división de dos números enteros
 *
 * @author Érika Ballesteros Pascual
 * @version 3.7
 * @since 2.1
 */

public class Calculadora {

	/**
	 * Constructor de la clase Calculadora simple
	 */
	public Calculadora() {
	}

	/**
	 * Devuelve la suma de los dos números enteros que se le pasa al método.
	 * @param a Un número entero
	 * @param b Otro número entero
	 * @return El total de la suma de los dos números enteros que se han pasado
	 */
	
	public int suma(int a, int b) {
		return a + b;
	}

	/**
	 * Devuelve la resta de los dos números enteros que se le pasa al método.
	 *
	 * @param a Un número entero
	 * @param b Otro número entero
	 * @return El total de la resta de los números enteros que se han pasado como parámetro
	 */
	
	public int resta(int a, int b) {
		return a - b;
	}

	/**
	 * Devuelve la multiplicación de los dos números enteros que se le pasa al método.
	 *
	 * @param a Un número entero
	 * @param b Otro número entero
	 * @return El total de la multiplicación de los números enteros pasados como parámetros
	 */
	
	public int multiplica(int a, int b){
		return a*b;
	}

	/**
	 * Devuelve la división de los dos números enteros que se le pasa al método.
	 *
	 * @param a Un número entero
	 * @param b Un número entero
	 * @return El total de la división de los números enteros que se han pasado como parámetros
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

