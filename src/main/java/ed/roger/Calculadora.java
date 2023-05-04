package ed.roger;

/**
 * Esta clase crea una calculadora capaz de realizar las operaciones
 * básicas de suma, resta, multiplicación y división.
 *
 * @version 3.7
 * @since 2.1, junio de 2022
 * @author Roger Moll Seguí
 */
public class Calculadora {

	/**
	 * Constructor de la clase calculadora
	 */
	public Calculadora() {
	}

	/**
	 * Suma y devuelve el resultado de dos numeros pasados como parámetro
	 *
	 * @param a El primer número entero a sumar
	 * @param b El segundo número entero a sumar
	 * @return El resultado de la suma de los dos números
	 */
	public int suma(int a, int b) {
		return a + b;
	}
	
	/**
	 * Resta y devuelve el resultado de dos numeros pasados como parámetro
	 *
	 * @param a El primer número entero a restar
	 * @param b El segundo número entero a restar
	 * @return El resultado de la suma de los dos números
	 */
	public int resta(int a, int b) {
		return a - b;
	}

	/**
	 * Multiplica y devuelve el resultado de dos numeros pasados como parámetro
	 *
	 * @param a El primer número entero a multiplicar
	 * @param b El segundo número entero a multiplicar
	 * @return El resultado de la multiplicación de los dos números
	 */
	public int multiplica(int a, int b){
		return a*b;
	}

	/**
	 * Divide y devuelve el resultado de dos numeros pasados como parámetro
	 *
	 * @param a El primer número entero a dividir
	 * @param b El segundo número entero a dividir
	 * @return El resultado de la división de los dos números
	 */
	public int diveix(int a, int b) {
		return a/b;
	}

}

