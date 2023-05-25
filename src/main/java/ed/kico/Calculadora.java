package ed.kico;

/** La clase calculadora actua como una calculadora
 *  Es un conjunto de metodos que nos permite realizar operaciones aritmeticas básicas,
 *  con cuatro metodos definidos, suma, resta multiplicación y división.
 * @version 3.7
 * @since 2.1 (junio de 2022)
 * @author [Kico Carbonell]
 */
public class Calculadora {
	/**
	 * Este método realiza la operación de suma entre dos números enteros
	 * @param a El primer número que se sumará
	 * @param b El segundo número que se sumara.
	 * @return El resultado de la suma de a y b
	 */
	public int suma(int a, int b) {
		return a + b;
	}

	/**
	 * Este método realizara la resta de dos números enteros y devolvera el resultado.
	 * @param a El primer número que se restara.
	 * @param b El segundo número que se restara.
	 * @return El resultado de la resta entre a y b
	 */
	public int resta(int a, int b) {
		return a - b;
	}

	/**
	 * Este método realizara la multiplicación de dos números enteros y devolvera el resultado.
	 * @param a El primer número a multiplicar.
	 * @param b El segundo número a multiplicar.
	 * @return El resultado de la multiplicación de a y b.
	 */
	public int multiplica(int a, int b){
		return a*b;
	}

	/**
	 * Este método realiza la division entre dos números.
	 * @param a El dividendo que se dividira.
	 * @param b El divisor por el que se dividira 'a'.
	 * @return El resultado de la división de a entre b.
	 * @throws ArithmeticException Si el divisor es cero, se lanzará la excepción ArithmeticException
	 * Esta es una excepción que se lanza cuando ocurre un error durante la ejecución de una operación
	 * matemática
	 * como una division por cero, es una excepcion de tiempo de ejecución que pertenece
	 * al paquete de java.lang.
	 */
	public int diveix(int a, int b) {
		return a/b;
	}

	/**
	 * Calcula la potencia de un numero base elevado a la potencia exponente.
	 *
	 * @param base El número Base.
	 * @param exponente El exponente
	 * @return La potencia 'base' elevado a la potencia 'exponente' que es guardada en
	 * la variable resultado.
	 */
	public int potencia ( int base , int exponente ){
		int resultado = 1;
		for (int i = 0; i < exponente; i++ ){
			resultado = resultado * base;
		}
		return resultado;
	}
	/**
	 *Verifica si un número es par o impar.
	 * @param numero El número a verificar.
	 * @return true si el número es par, false si es impar.
	 */
	public boolean esPar ( int numero ){
		boolean resultado;
		if ( numero % 2 == 0) {
			resultado = true;
		} else {
			resultado = false;
		}
		return resultado;
	}

	/**
	 * Convierte un número entero o binario.
	 * @param numero El número entero a convertir.
	 * @return Una cadena de caracteres que representa el número en binario almacenada en la
	 * variable binario
	 */
	public String conversorDecimalABinario(int numero){
		String binario = "";
		int cociente = numero;
		int resto;
		while ( cociente > 0) {
			resto = cociente % 2;
			binario = resto + binario;
			cociente = cociente / 2;
		}
		return binario;
	}
}

