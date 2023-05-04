package ed.cintia;

/**
 *La clase Calculadora sirve para realizar las cuatro operaciones matemáticas elementales
 * y otras más específicas.
 * <p>
 * Esta clase proporciona métodos para poder llevar a cabo operaciones matemáticas simples
 * con dos números enteros (a, b) y obtener su resultado. También ofrece otras funcionalidades matemáticas avanzadas.
 * Las funcionalidades que se implementan en cada método son:
 * <ul>
 * 		<li>suma
 *		<li>resta
 * 		<li>multiplicación
 * 		<li>división
 * 		<li>cálculo de potencias
 * 		<li>verificación de número par
 * 		<li>conversor de número decimal a binario
 * </ul>
 *
 * @author Cintia Cantó Esteve
 * @version 3.7
 * @since 2.1 (June 2022)
 */
public class Calculadora {

	/**
	 * El método suma realiza la suma de dos números enteros y el resultado de la suma será otro número entero
	 * @param a		primer sumando
	 * @param b		segundo sumando
	 * @return		resultado de la suma a + b
	 */
	public int suma(int a, int b) {
		return a + b;
	}

	/**
	 * El método resta calcula la diferencia entre dos números enteros y su resultado será otro número entero
	 * @param a		minuendo
	 * @param b		sustraendo
	 * @return		resultado de la resta a - b
	 */

	public int resta(int a, int b) {
		return a - b;
	}

	/**
	 * El método multiplica calcula el producto de dos números enteros y su resultado será otro número entero
	 * @param a		multiplicador
	 * @param b		multiplicando
	 * @return		resultado del producto a * b
	 */
	public int multiplica(int a, int b){
		return a*b;
	}

	/**
	 * El método divideix calcula el cociente de la división entre dos números enteros,
	 * su resultado será otro número entero
	 * @param a		dividendo
	 * @param b		divisor
	 * @return		cociente de la división a/b
	 * @throws ArithmeticException si el divisor es cero
	 */
	public int diveix(int a, int b) {
		return a/b;
	}

	/**
	 * El método potencia calcula la potencia de dos números enteros,
	 * su resultado será otro número entero
	 * @param base		base de la potencia
	 * @param exponente	exponente de la potencia
	 * @return		resultado de la potencia base<sup>exponente</sup>
	 */
	public int potencia (int base , int exponente){

		int resultado = 1;

		for (int i = 0; i < exponente ; i++){
			resultado = multiplica(resultado,base);
		}

		return resultado;
	}

	/**
	 * El método esNumeroPar devuelve true o false según el entero
	 * introducido sea par o no
	 * @param numero	numero que queremos evaluar
	 * @return		<code>true</code> si el parámetro numero es un número par
	 * 				<code>false</code> si el parámetro numero es un número impar
	 */
	public boolean esNumeroPar(int numero){

		boolean esPar;

		if (numero % 2 == 0) {
			esPar = true;
		} else {
			esPar = false;
		}

		return esPar;
	}

	/**
	 * El método conversorBinario convierte un número entero a binario en formato texto
	 * @param numeroDecimal	numero decimal a convertir a binario
	 * @return				String que contiene el número decimal convertido a binario
	 */
	public String conversorBinario(int numeroDecimal){

		String numeroBinario = "";
		int dividendo = numeroDecimal;
		int resto;

		while (dividendo > 0) {
			resto = dividendo % 2;
			numeroBinario = resto + numeroBinario;
			dividendo = diveix(dividendo,2);
		}

		return numeroBinario;
	}
}

