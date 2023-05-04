package ed.maria;

//Esta clase nos servirá para clacular ciertas operaciones.
// Aquí podremos sumar, restar, multiplicar y dividir entre dos números y obtener su resultado.

/**
 * @author Maria Ruiz Patón
 * @version 3.7
 * @version (disponible) 2.1
 */
public class Calculadora {

	/**
	 * suma dos parámetros para obtener la suma de ambos
	 * @param a parámetro 1 numero entero
	 * @param b parámetro 2 numero entero
	 * @return suma de ambos parámetros
	 * @exception NumberFormatException
	 *  Por uso de un alfanumérico
	 */
	public int suma(int a, int b) {
		return a + b;
	}

	/**
	 * resta de dos parámetros para obtener la resta de ambos
	 * @param a parámetro 1 numero entero
	 * @param b parámetro 2 numero entero
	 * @return resta de ambos parámetros
	 * @exception NumberFormatException
	 * Por uso de un alfanumérico
	 */
	public int resta(int a, int b) {
		return a - b;
	}

	/**
	 * multiplicar ambos parámetros para obtener el producto de ambos
	 * @param a parámetro 1 numero entero
	 * @param b parámetro 2 numero entero
	 * @return multiplicacion de ambos parámetros
	 * @exception NumberFormatException
	 * Por uso de un alfanumerico
	 */
	public int multiplica(int a, int b){
		return a*b;
	}

	/**
	 * división de ambos parámetros para obtener la división de ambos
	 * @param a parámetro 1 numero enteros
	 * @param b parámetro 2 numero entero
	 * @return division de ambos parámetros
	 * @exception ArithmeticException
	 * Por uso del número 0 como divisor
	 */
	public int diveix(int a, int b){
		return a/b;
	}

	/**
	 * Este método calcula la portencia de un número entero
	 * @param base base de la potencia
	 * @param exponente exponente de la potencia
	 * @return el resultado de la base elevada a la potencia
	 */
	public int potencia ( int base , int exponente ){
		int resultado = 1;
		for ( int i = 0; i < exponente ; i++ ){
			resultado = resultado * base;
		}
		return resultado;
	}

	/**
	 * Comprueba si el número pasado es un número par o impar
	 * @param num número entero num comprobar
	 * @return true si es par, false si es impar
	 */
	public boolean esParOImpar ( int num ){
		boolean resultado;
		resultado = num % 2 == 0;

		return resultado;
	}

	/**
	 *  Pasa un número entero num binario
	 * @param num numero entero
	 * @return binario del numero entero
	 */
	public String decimalABinario(int num){
		StringBuilder resultado = new StringBuilder();
		int resto = num;
		int resto1;

		while ( resto > 0) {
			resto1 = resto % 2;
			resultado.insert(0, resto1);
			resto = resto / 2;
		}
		return resultado.toString();
	}

}

