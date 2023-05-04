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

	/**
	 * Este metodo recibe una base y un exponente y muestra su resultado
	 * @param base Numero entero
	 * @param exponente Numero entero
	 * @return
	 */

	public int potencia ( int base , int exponente ){

		int resultado = 1;

		for ( int i = 0; i < exponente ; i++ ){
			resultado = resultado * base;
		}

		return resultado;

	}

	/**
	 * Este metod recibe un numero entero y comprueba si es par o impar
	 * @param num
	 * @return isPar que es un booleano que dice si el numero es par o impar en un true o false
	 */

	public boolean parImpar ( int num ){
		boolean isPar;

		if ( num % 2 == 0) {
			isPar = true;
		} else {
			isPar = false;
		}
		return isPar;
	}


	/**
	 * Este metodo recibe un parametro que es un numero entero y devuelve un string, que es su codigoBinario.
	 * Con la implementacion de un bucle while y sus respectivos calculos itera sobre el numero y va añadiendole 1 o 0.
	 * @param numero
	 * @return codigoBinario
	 */

	public String conversioABinari(int numero){

		String codigoBinario = "";
		int num1 = numero;
		int aux;

		while ( num1 > 0) {

			aux = num1 % 2;

			codigoBinario = aux + codigoBinario;

			num1 = num1 / 2;


		}

		return codigoBinario;

	}



}

