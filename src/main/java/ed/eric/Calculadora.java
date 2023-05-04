package ed.eric;

/**
 * Para esta clase vamos a hacer una calculadora, la cual haremos las funciones basicas, como puede ser suma, resta, multiplicacion, division
 *
 * @version 3.7
 * @since 2.1
 * @author Eric Camps Palmer
 */
public class Calculadora {

	public static void main(String[] args) {

		// Crear objeto de la clase Calculadora
		Calculadora miCalculadora = new Calculadora();

		// Método suma
		int resultadoSuma = miCalculadora.suma(5, 3);
		System.out.println("5 + 3 = " + resultadoSuma);

		// Método resta
		int resultadoResta = miCalculadora.resta(5, 3);
		System.out.println("5 - 3 = " + resultadoResta);

		// Método multiplica
		int resultadoMultiplica = miCalculadora.multiplica(5, 3);
		System.out.println("5 * 3 = " + resultadoMultiplica);

		// Método diveix
		try {
			int resultadoDiveix = miCalculadora.diveix(10, 2);
			System.out.println("10 / 2 = " + resultadoDiveix);
		} catch (ArithmeticException e) {
			System.out.println("No se puede dividir entre 0");
		}

		// Método potencia
		int resultadoPotencia = miCalculadora.potencia(2, 3);
		System.out.println("2 elevado a la 3 = " + resultadoPotencia);

		// Método parImpar
		boolean esPar = miCalculadora.parImpar(4);
		System.out.println("El número 4 es par? " + esPar);

		// Método binario
		String resultadoBinario = miCalculadora.binario(10);
		System.out.println("El número 10 en binario es: " + resultadoBinario);
	}


	/**
	 * Este metodo se encargara de hacer la suma de dos valores enteros
	 * @param a Primer valor entero
	 * @param b Segundo valor entero
	 * @return La suma de los dos numeros enteros
	 */
	public int suma(int a, int b) {
		return a + b;
	}

	/**
	 * Este metodo se encargara de hacer la resta de dos valores enteros
	 * @param a Primer valor entero
	 * @param b Segundo valor entero
	 * @return La resta de los dos numeros enteros
	 */
	public int resta(int a, int b) {
		return a - b;
	}

	/**
	 * Este metodo se encargará de hacer la multiplicación de dos valores enteros
	 * @param a Primer valor entero
	 * @param b Segundo valor entero
	 * @return La multiplicación de los dos numeros enteros
	 */
	public int multiplica(int a, int b){
		return a*b;
	}

	/**
	 * Este metodo se encargara de hacer la división de dos valores enteros
	 * @param a Primer valor entero
	 * @param b Segundo valor entero
	 * @trows ArithmeticException ya que si el segundo valor no puede ser 0
	 * @return La división de los dos numeros enteros
	 */
	public int diveix(int a, int b) {
		return a/b;
	}


}

