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
	 * @param a
	 * @param b
	 * @return
	 * @exception NumberFormatException
	 *  Por uso de un alfanumérico
	 */
	public int suma(int a, int b) {
		return a + b;
	}

	/**
	 * resta de dos parámetros para obtener la resta de ambos
	 * @param a
	 * @param b
	 * @return
	 * @exception NumberFormatException
	 * Por uso de un alfanumérico
	 */
	public int resta(int a, int b) {
		return a - b;
	}

	/**
	 * multiplicar ambos parámetros para obtener el producto de ambos
	 * @param a
	 * @param b
	 * @return
	 * @exception NumberFormatException
	 * Por uso de un alfanumerico
	 */
	public int multiplica(int a, int b){
		return a*b;
	}

	/**
	 * división de ambos parámetros para obtener la división de ambos
	 * @param a
	 * @param b
	 * @exception ArithmeticException
	 * Por uso del número 0 como divisor
	 * @return
	 */
	public int diveix(int a, int b){
		return a/b;
	}

}

