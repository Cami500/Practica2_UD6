package ed.pablo;

	/**
	 * En esta clase se incluyen 4 métodos que son públicos (y que trabajan con números enteros), y van a realizar las funciones de una calculadora.
	 * @author pablo marin aleixandre
	 * @version 3.7
	 * @since 2.1, junio de 2022.
	 */

	/**
	 * Nuestra calculadora tiene 4 metodos, uno que se encarga de realizar sumas (suma 2 numeros que son pasados por parámetros),
	 * la resta (resta los 2 numeros que también son pasados por parámetro),
	 * la multiplicación (multiplica 2 números que también son pasados por parametro),
	 * y por último, la división (que se encargaa de dividir 2 números que también son pasados por parámetros)
	 * y cabe recalcar que todos los número pasados por parámetros deben de ser numeros enteros.
	 * @author pablo marin aleixandre
	 * @version 3.7
	 * @since 2.1, junio de 2022
	 */

public class Calculadora {

		/**
		 * Aquí tenemos el constructor de la clase, y es obligado ponerlo, porque si no se pone nos daría un "warning"
		 */

		public Calculadora(){
			new Calculadora();
		}

	/**
	 * Este es el método de "suma", que se encarga de sumar los 2 valores enteros que son pasados por parámetro.
	 * @param a el primer valor (entero) que pasamos por parámetro
	 * @param b el segundo valor (entero) que pasamos por parámetro
	 * @return un valor que debe ser entero (resultante de la suma de a + b)
	 */

	public int suma(int a, int b) {
		return a + b;
	}

	/**
	 * Este es el método de "resta", que se encarga de restar los 2 valores enteros que son pasados por parámetro.
	 * @param a el primer valor (entero) que pasamos por parámetro
	 * @param b el segundo valor (entero) que pasamos por parámetro
	 * @return un valor que debe ser entero (resultante de la resta de a - b)
	 */
	
	public int resta(int a, int b) {
		return a - b;
	}

	/**
	 * Este es el método de "multiplicación", que se encarga de multiplicar los 2 valores enteros que son pasados por parámetro.
	 * @param a el primer valor (entero) que pasamos por parámetro
	 * @param b el segundo valor (entero) que pasamos por parámetro
	 * @return un valor que debe ser entero (resultante de la multiplicación de a * b)
	 */
	
	public int multiplica(int a, int b) {
		return a*b;
	}

	/**
	 * Este es el método de "división", que se encarga de dividir los 2 valores enteros que son pasados por parámetro.
	 * @param a el primer valor (entero) que pasamos por parámetro
	 * @param b el segundo valor (entero) que pasamos por parámetro
	 * @return un valor que debe ser entero (resultante de la división de a / b)
	 * @exception ArithmeticException y cabe recalcar que solamente aparecerá esta excepción cuando vayas a dividir un número (como ya hemos dicho, en este caso debe ser entero) entre cero
	 */
	
	public int diveix(int a, int b) {
		return a/b;
	}
}

