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

		/**
		 * Este método sirve para obtener la potencia del número pasado por parametro, y el numero va a iterar las veces que aparezca en el exponente (también pasado como parametro)
		 * dentro de un bucle for (y dentro del bucle se ira multiplicando el resultado que es 1 por el número pasado por parámetro las veces que le hemos indicado en el exponente).
		 * dentro del for el resultado que es 1 se va multiplicanto por el numero pasado como parametro.
		 * @param numero
		 * @param exponente
		 * @return retornará el resultado de la potencia
		 */

		public int potencia(int numero , int exponente ){

			int resultado = 1;

			for ( int i = 0; i < exponente ; i++ ){
				resultado = resultado * numero;
			}

			return resultado;
		}

		/**
		 * El funcionamiento de este método es para saber si el número pasado por parametro es para o impar, si es resultado
		 * del booleano es true significa que es par y si retorna false quiere decir que es impar.
		 * Para hayar el resultado usaremos un condicional (en este caso un if), donde comparamos que el numero pasado por parámetro
		 * dividido entre 2 es igual a 0 para retornar si es par.
		 * @param numero
		 * @return retornará si el número pasado por parámetro es par o no (true or false).
		 */


		public boolean siNumeroEsPar(int numero ){

			boolean esPar;

			if ( numero % 2 == 0) {
				esPar = true;
			} else {
				esPar = false;
			}

			return esPar;
		}

		/**
		 * Y por último este método, que se encarga de convertir un número decimal en binario.
		 * Para ello se dividirá constantemente el número entre 2 y cogeremos el resto para ir formando el número binario
		 * y guardarlo en la variable resto en cada iteración
		 * @param decimal
		 * @return nos retornará el numero binario.
		 */

		public String conversorDecimalABinario(int decimal){

			String resultado = "";
			int numero = decimal;
			int resto;

			while ( numero > 0) {
				resto = numero % 2;
				resultado = resto + resultado;
				numero = numero /	 2;
			}
			return resultado;
		}
}

