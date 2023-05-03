package ed.kico;

/** @kicoCarbonell La clase calculadora actua como una calculadora
 *  Es un conjunto de metodos que nos permite realizar operaciones aritmeticas básicas,
 *  con cuatro metodos definidos
 */
public class Calculadora {

	//Metodo suma realiza la suma de dos numeros enteros y devuelve el resultado
	//Parametros : a -> el primer numero que se desea sumar b -> el segundo numero que se desea sumar
	public int suma(int a, int b) {
		return a + b;
	}
	//Metodo resta realiza la resta de dos numeros enteros y devuelve el resultado
	//Parametros : a → el primer numero que se desea restar b → el segundo número que se desea restar
	public int resta(int a, int b) {
		return a - b;
	}
	//Metodo multiplica realiza la multiplicación de dos numeros enteros y devuelve el resultado
	//Parametros : a -> el primer numero que se desea multiplicar b -> el segundo numero que se desea multiplicar
	public int multiplica(int a, int b){
		return a*b;
	}
	//Metodo diveix realiza la division de dos numeros enteros y devuelve el resultado
	//Parametros : a -> el primer numero que se desea dividir b -> el segundo numero que se desea dividir
	public int diveix(int a, int b) {
		return a/b;
	}
	public static void main(String[] args) {
	Calculadora calculadora = new Calculadora();
	int resultadoSuma = calculadora.suma(2,2);
		System.out.println(resultadoSuma);
	int resultadoResta = calculadora.resta(2,2);
		System.out.println(resultadoResta);
	int resultadoMultiplica = calculadora.multiplica(2,2);
		System.out.println(resultadoMultiplica);
	int resultadoDiveix = calculadora.diveix(2,2);
		System.out.println(resultadoDiveix);
	}
	public int oper1 ( int a , int n ){

		int t = 1;

		for ( int i = 0; i < n ; i++ ){
			t = t * a;
		}

		return t;
	}
	public boolean oper2 ( int a ){

		boolean r;

		if ( a % 2 == 0) {
			r = true;
		} else {
			r = false;
		}

		return r;
	}
	public String oper3(int a){

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

