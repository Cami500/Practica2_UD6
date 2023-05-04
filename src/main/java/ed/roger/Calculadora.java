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

	/**
	 * Calcula la potencia de un número entero a la enésima potencia
	 * @param base la base de la potencia
	 * @param exponente el exponente de la potencia
	 * @return el resultado de elevar la base al exponente
	 */
	public int potencia(int base , int exponente ){

		int resultado = 1;

		for ( int i = 0; i < exponente ; i++ ){
			resultado = resultado * base;
		}

		return resultado;
	}

	/**
	 * Determina si un número entero es par o no
	 * @param numero el número entero a evaluar
	 * @return true si el número es par, false si el número es impar
	 */
	public boolean esPar(int numero){

		boolean resultado;

		if (numero % 2 == 0) {
			resultado = true;
		} else {
			resultado = false;
		}

		return resultado;
	}

	/**
	 * Convierte un número entero a binario
	 *
	 * @param numero el número entero a convertir
	 * @return la representación en binario del número como una cadena de caracteres
	 */
	public String convertirABinario(int numero){

		String resultado = "";
		int valor = numero;
		int bit;

		while (valor > 0) {
			bit = valor % 2;
			resultado = bit + resultado;
			valor = valor / 2;
		}

		return resultado;
	}

}

