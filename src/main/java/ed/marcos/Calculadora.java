package ed.marcos;
/**
 * Esta clase es una calculadora la cual puede hacer sumas, restas, multiplicaciones y divisiones pasándole los parámetros para que haga las operaciones.
 *
 * @version 3.7
 * @since 2.1, junio de 2022
 * @author Marcos Sanz Gómez
 */
public class Calculadora {
	/**
	 * Este es un constructor por defecto
	 */
	public Calculadora() {
	}

	/**
	 * Devuelve el total de sumar dos números.
	 *
	 * @param a El primer sumando.
	 * @param b El segundo sumando.
	 * @return El resultado de la suma de los dos sumandos.
	 */
	public int suma(int a, int b) {
		return a + b;
	}
	/**
	 * Devuelve la diferencia de restar dos números.
	 *
	 * @param a El minuendo.
	 * @param b El sustraendo.
	 * @return El resultado de la resta, la diferencia.
	 */
	public int resta(int a, int b) {
		return a - b;
	}
	/**
	 * Devuelve el producto de multiplicar de dos números.
	 *
	 * @param a El multiplicando.
	 * @param b El multiplicado.
	 * @return El resultado de la multiplicación, el producto.
	 */
	public int multiplica(int a, int b){
		return a*b;
	}
	/**
	 * Devuelve el cociente de dividir dos números.
	 *
	 * @param a El dividendo.
	 * @param b El divisor.
	 * @throws ArithmeticException Cuando el divisor es cero.
	 * @return El resultado de la división, el cociente.
       */
	public int diveix(int a, int b) {
		return a/b;
	}
}

