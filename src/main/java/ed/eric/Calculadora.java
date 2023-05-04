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

	/**
	 * Este método llamado potencia toma dos valores enteros como entrada a y n, y devuelve el resultado de elevar a a la potencia n.
	 * @param a Primer valor entero
	 * @param n Segundo valor entero
	 * @return Este método devuelve el resultado de elevar el primer argumento a la potencia del segundo argumento.
	 */
	public int potencia ( int a , int n ){

		int t = 1;

		for ( int i = 0; i < n ; i++ ){
			t = t * a;
		}

		return t;
	}

	/**
	 * Este método llamado parImpar toma un valor entero a como entrada y devuelve un valor booleano (true/false) en función de si el número es par o no.
	 * @param a Valor entero
	 * @return Este método devuelve true si el número es par y false si es impar.
	 */
	public boolean parImpar ( int a ){

		boolean r;

		if ( a % 2 == 0) {
			r = true;
		} else {
			r = false;
		}

		return r;
	}

	/**
	 * Este método de Java llamado binario que toma un valor entero a como entrada
	 * @param a Valor entero
	 * @return Retorna la cadena de caracteres r
	 */
	public String binario(int a){

		String r = "";
		int v = a;
		int v1;

		while ( v > 0) {
			v1 = v % 2;
			r = v1 + r;
			v = v / 2;
		}
		return r;
	}
}
