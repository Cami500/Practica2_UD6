package ed.izan;

import java.util.InputMismatchException;

/**
 * @author Izan Blanes Aracil
 * @version 3.7
 * @version 2.1 junio de 2022;
 **/
public class Calculadora {
	//Esta clase permite realizar cálculos matemáticos entre dos números enteros.

	/*
	* La clase Calculadora permite realizar cálculos matemáticos entre dos números enteros. Además la clase contiene los
	* métodos de sumar, restar, multiplicar y dividir para que después, se llamen creando el objeto calculadora
	* dependiendo del constructor que se crea, porque estos métodos son objetos, es decir de la propia clase.
	*/

	/**
	 * Método que permite realizar la suma entre dos números enteros.
	 * @return La suma entre dos números.
	 * @throws InputMismatchException;
	 * @param a;
	 * @param b;
	 **/
	public int suma(int a, int b) {
		int suma = 0;
		try {
			suma = a + b;
		}catch (InputMismatchException e) {
			System.out.println("Dato introducido incorrecto");
		}
		return suma;
	}

	/**
	 * Método que permite realizar la resta entre dos números enteros.
	 * @return La resta entre dos números.
	 * @throws InputMismatchException;
	 * @param a;
	 * @param b;
	 **/
	public int resta(int a, int b) {
		int resta = 0;
		try {
			resta = a - b;
		}catch (InputMismatchException e) {
			System.out.println("Dato introducido incorrecto");
		}
		return resta;
	}

	/**
	 * Método que permite realizar la multiplicación entre dos números enteros.
	 * @return La multiplicación entre dos números.
	 * @throws InputMismatchException;
	 * @param a;
	 * @param b;
	 **/
	public int multiplica(int a, int b) throws InputMismatchException{
		int multiplicacion = 0;
		try {
			multiplicacion = a * b;
		}catch (InputMismatchException e) {
			System.out.println("Dato introducido incorrecto");
		}
		return multiplicacion;

	}

	/**
	 * Método que permite realizar la divisón entre dos números enteros. Si el número a dividir tanto en los parámetros
	 * a o b lanzará una excepción que indicará que el número a dividir no puede ser 0.
	 * @return La división entre dos números
	 * @throws InputMismatchException;
	 * @throws ArithmeticException;
	 * @param a;
	 * @param b;
	 **/
	public int diveix(int a, int b) {
		int division = 0;
		try {
			division = a / b;
		}catch (InputMismatchException e) {
			System.out.println("Dato introducido incorrecto");
		}catch (ArithmeticException ex) {
			System.out.println("No se puede dividir por cero en la división");
		}
		return division;
	}

}

