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

	/**
	 * Devuelve el valor de multiplicar un numero un numero de veces consecutivo.
	 *
	 * @param num es el numero que vamos a multiplicar.
	 * @param repeticiones es el numero de veces que vamos a multiplicar.
	 * @return El resultado de multiplicación consecutiva de num.
	 */
	public int multiplicarSucesivamente(int num, int repeticiones) {

		int total = 1;
		for ( int i = 0; i < repeticiones; i++ ) {
			total = total * num;
		}
		return total;
	}

	/**
	 * Devuelve true/false de si el numero introducido es par o impar.
	 *
	 * @param num es el numero que vamos a comprobar.
	 * @return Si es par(ture) o impar(false).
	 */
	public boolean esPar( int num ){
		boolean esPar;
		if ( num % 2 == 0) {
			esPar = true;
		} else {
			esPar = false;
		}
		return esPar;
	}

	/**
	 * Devuelve un numero binario del numero que le pasamos en decimal.
	 * Se usa un algoritmo que usando el residuo y el cociente podemos sacar el numero binario, este se almacenara en un string que es numBinario.
	 *
	 * @param num es el numero que vamos a comprobar.
	 * @return El numero en binario de num.
	 */
	public String decimalAbinario(int num){

		String numBinario = "";
		int cociente = num;
		int residuo;

		while (cociente > 0) {
			residuo = cociente % 2;
			num = residuo + num;
			cociente = cociente / 2;
		}
		return numBinario;
	}
}

