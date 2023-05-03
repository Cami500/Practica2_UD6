package ed.andreu;

/** Esta clase tiene la función de crear un objeto que realize las
 * funciones de una calculadora.
 * @author andreu
 * @version 3.7
 * @since 2.1, june de 2022
 */

/**
 * En esta clase podras realizar sumas, restas, multiplicaciones y divisiones
 * de todo tipo, los calculos en esta clase solo podrán ser de dos numeros
 * @author andreu
 * @version 3.7
 * @since 2.1, june de 2022
 */
public class Calculadora {
	/**
	 * Constructor de la clase calculadora
	 * */
	public Calculadora() {
	}

	/**
	 * Hace la suma de los dos números pasados al metodo como parametro
	 * @param a es el primer valor que se introduce para ser sumado
	 * @param b es el segundo valor que se introduce para ser sumado
	 * @return retorna la suma del parametro a y el parametro b
	 * */
	public int suma(int a, int b) {
		return a + b;

	}
	/**
	 * Hace la resta de los dos números pasados al metodo como parametro
	 * @param a es el primer valor que se introduce para ser restado
	 * @param b es el segundo valor que se introduce para ser restado
	 * @return retorna la resta del parametro a y el parametro b
	 * */
	public int resta(int a, int b) {
		return a - b;

	}

	/**
	 * Hace la multiplicación de los dos números pasados al metodo como parametro
	 * @param a es el primer valor que se introduce para ser multiplicado
	 * @param b es el segundo valor que se introduce para ser multiplicado
	 * @return retorna la multiplicación del parametro a y el parametro b
	 * */
	public int multiplica(int a, int b){
		return a*b;

	}
	/**
	 * Hace la división de los dos números pasados al metodo como parametro
	 * @param a es el primer valor que se introduce para ser dividido
	 * @param b es el segundo valor que se introduce para ser dividido
	 * @return retorna la división del parametro a y el parametro b
	 * */

	public int diveix(int a, int b) {
		return a / b;

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


