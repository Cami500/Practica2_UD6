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


	/** Realiza la operación de suma entre dos números enteros.
	 * @param a el primer número entero
	 * @param b el segundo número entero
	 * @return la suma de a y b
	 */
	public int suma(int a, int b) {
		return a + b;
	}
	
	public int resta(int a, int b) {
		return a - b;
	}
	
	public int multiplica(int a, int b){
		return a*b;
	}
	
	public int diveix(int a, int b) {
		return a/b;
	}

}

