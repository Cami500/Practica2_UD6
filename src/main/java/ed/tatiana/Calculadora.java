package ed.tatiana;

/** Esta clase resuelve varias operaciones matemáticas.
 * La clase calculadora posee los métodos necesarios para realizar operaciones aritméticas
 * básicas con números enteros como suma, resta, multiplicación y división. Retornando
 * el resultado de dicha operación.
 * @author Tatiana Sanchez Carchano
 * @version 3.7
 * @since 2.1, 06/2022
 */
public class Calculadora {

		/**
		 * Crea una instancia de Calculadora.
		 */
	public Calculadora() {
			// ...
		}

		/** Realiza la operación de suma entre dos números enteros.
		 * @param a el primer número entero
		 * @param b el segundo número entero
		 * @return la suma de a y b
		 */
		public int suma ( int a, int b){
			return a + b;
		}

		/** Realiza la operación de resta entre dos números enteros.
		 * @param a el primer número entero
		 * @param b el segundo número entero
		 * @return el resultado de la resta de a y b
		 */
		public int resta ( int a, int b){
			return a - b;
		}

		/**Realiza la multiplicación entre dos números enteros.
		 * @param a el primer número entero
		 * @param b el segundo número entero
		 * @return el resultado de la multiplicación de a y b
		 */
		public int multiplica ( int a, int b){
			return a * b;
		}

		/** Realiza la operación de división entre dos números enteros.
		 * Si el segundo número es cero, se lanza una excepción ArithmeticException.
		 * @param a el primer número entero
		 * @param b el segundo número entero
		 * @return el resultado de la división de a entre b
		 * @throws ArithmeticException si el segundo número (b) es cero.
		 */
		public int diveix ( int a, int b){
			return a / b;
		}

	/** Calcula la potencia de un número
	 * @param a es la base de la potencia.
	 * @param n el exponente.
	 * @return el resultado de multiplicar a, n veces.
	 */
		public int obtenerPotencia(int a, int n ){

			int t = 1;

			for (int i = 0; i < n; i++) {
				t = t * a;
			}

			return t;
		}

	/** Determina si es o no es un número par.
	 * @param a el número a verificar.
	 * @return true si lo es o false si no lo es.
	 */
		public boolean esPar(int a ){

			boolean r;

			if (a % 2 == 0) {
				r = true;
			} else {
				r = false;
			}

			return r;
		}

	/** Convierte un número entero en su representación a binario.
	 * @param a el número entero que se va a convertir en binario.
	 * @return una cadena de texto que representa el número entero en su forma binaria.
	 */
		public String convertirabinario(int a){

			String r = "";
			int v = a;
			int v1;

			while (v > 0) {
				v1 = v % 2;
				r = v1 + r;
				v = v / 2;
			}
			return r;
		}

	}


