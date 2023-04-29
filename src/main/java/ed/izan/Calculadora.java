package ed.izan;

import java.io.IOException;
import java.util.InputMismatchException;

public class Calculadora {
	//Esta clase permite realizar cálculos matemáticos entre dos números enteros.

	/*
	* La clase Calculadora permite realizar cálculos matemáticos entre dos números enteros. Además la clase contiene los
	* métodos de sumar, restar, multiplicar y dividir para que después, se llamen creando el objeto calculadora
	* dependiendo del constructor que se crea, porque estos métodos son objetos, es decir de la propia clase.
	*/

	/**
	 * @author Izan Blanes Aracil
	 * @version 3.7
	 * @deprecated 2.1 junio de 2022;
	 **/

	/**
	 * Método que permite realizar una suma entre dos números enteros.
	 * @return la suma entre dos números.
	 * @throws InputMismatchException;
	 * @param a;
	 * @param b;
	 * **/
	public int suma(int a, int b) {
		int suma = 0;
		try {
			suma = a + b;
		}catch (InputMismatchException e) {
			System.out.println("Dato introducido incorrecto");
		}
		return suma;
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

