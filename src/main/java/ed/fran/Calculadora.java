package ed.fran;

public class Calculadora {
	// Calculadora que nos permte, sumar,restar, multiplicar, dividir.
	/*
	Applicación que nos permite realizar varias operaciones enteras;
	sumar
	restar
	multiplicar
	dividir
	Todas estas operaciones, son llevadas a cabo mediante dos números enteros
	@author Fran Gregori
	@version 3.7
	@since 2.1 junio/2022
	 */

	/*
	@description devolver la suma de dos números enteros pasados como parámetro
	@param int a
	@param int b
	@return devuele la suma de dos números enteros
	@throws error al introducir un tipo de dato no esperado, es decir,
	un tipo de dato superior al int o diferente al int, tales como String, char etc...
	No son de obligada captura, por lo tanto son de tipo RunTimeException
	 */
	public int suma(int a, int b) {
		return a + b;
	}

	/*
	@description devolver la resta de dos números enteros pasados como parámetro
	@param int a
	@param int b
	@return devuele la resta de dos números enteros
	@throws error al introducir un tipo de dato no esperado, es decir,
	un tipo de dato superior al int o diferente al int, tales como String, char etc...
	No son de obligada captura, por lo tanto son de tipo RunTimeException
	 */
	public int resta(int a, int b) {
		return a - b;
	}

	/*
	@description devolver la multpilicación de dos números enteros pasados como parámetro
	@param int a
	@param int b
	@return devuele la multiplicación de dos números enteros
	@throws error al introducir un tipo de dato no esperado, es decir,
	un tipo de dato superior al int o diferente al int, tales como String, char etc...
	No son de obligada captura, por lo tanto son de tipo RunTimeException
	 */
	public int multiplica(int a, int b){
		return a*b;
	}

	/*
	@description devolver la división de dos números enteros pasados como parámetro
	@param int a
	@param int b
	@return devuele la división de dos números enteros
	@throws error al introducir un tipo de dato no esperado, es decir,
	un tipo de dato superior al int o diferente al int, tales como String, char etc...
	Además de una posible opción, dividir un número entero,
	esto genera una excepción del tipo ArithmeticException, no es de obligada captura.
	No son es obligada captura, por lo tanto son de tipo RunTimeException
	 */
	public int diveix(int a, int b) {
		return a/b;
	}

}

