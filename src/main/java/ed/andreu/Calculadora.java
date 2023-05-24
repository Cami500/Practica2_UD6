package ed.andreu;

/** Esta clase tiene la función de crear un objeto que realize las
 * funciones de una calculadora.
 * @author andreu
 * @version 3.7
 * @since 2.1, june de 2022
 */

/**
 * En esta clase podras realizar sumas, restas, multiplicaciones y divisiones
 * de todo tipo, los calculos en esta clase solo podrán ser de dos numeros
 * @author andreu
 * @version 3.7
 * @since 2.1, june de 2022
 */
public class Calculadora {
    /**
     * Constructor de la clase calculadora
     * */
    public Calculadora() {
    }

    /**
     * Hace la suma de los dos números pasados al metodo como parametro
     * @param a es el primer valor que se introduce para ser sumado
     * @param b es el segundo valor que se introduce para ser sumado
     * @return retorna la suma del parametro a y el parametro b
     * */
	public int suma(int a, int b) {
		return a + b;
	}

    /**
     * Hace la resta de los dos números pasados al metodo como parametro
     * @param a es el primer valor que se introduce para ser restado
     * @param b es el segundo valor que se introduce para ser restado
     * @return retorna la resta del parametro a y el parametro b
     * */
	public int resta(int a, int b) {
		return a - b;
	}

    /**
     * Hace la multiplicación de los dos números pasados al metodo como parametro
     * @param a es el primer valor que se introduce para ser multiplicado
     * @param b es el segundo valor que se introduce para ser multiplicado
     * @return retorna la multiplicación del parametro a y el parametro b
     * */
	public int multiplica(int a, int b){
		return a*b;
	}

    /**
     * Hace la división de los dos números pasados al metodo como parametro
     * @param a es el primer valor que se introduce para ser dividido
     * @param b es el segundo valor que se introduce para ser dividido
     * @return retorna la división del parametro a y el parametro b
     * */
	public int diveix(int a, int b) {
		return a/b;
	}

    /**
     * Hace la elevacion mediante la base y el exponente que se introducirá
     * pasado a parametro.
     * @param base es el número que se multiplicará en base al exponente
     * @param exponente se indica las veces que multiplicaremos la base
     * @return retorna la base introducida elevada al exponente introducido
     * */
    public int elevarNumero ( int base , int exponente ){

        int resultado = 1;

        for ( int i = 0; i < exponente ; i++ ){
            resultado = resultado * base;
        }

        return resultado;
    }

    /**
     * Este metodo hace la confirmación de sí el número pasado por
     * parametro es par.
     * @param numero es un valor que se pasa para confirmar si es par
     * @return retorna un booleano confirmando si es un número par o no
     * */
    public boolean esNumeroPar ( int numero ){

        boolean esNumeroPar;

        if ( numero % 2 == 0) {
            esNumeroPar = true;
        } else {
            esNumeroPar = false;
        }

        return esNumeroPar;
    }

    /**
     * Este metodo hace la conversión de un número decimal pasado por parametro
     * a binario.
     * @param numeroDecimal es el valor que se transformara a binario
     * @return el parametro transformado en binario
     * */
    public String convertirBinario(int numeroDecimal){

        String resultado = "";
        int numero = numeroDecimal;
        int resto;

        while ( numero > 0) {
            resto = numero % 2;
            resultado = resto + resultado;
            numero = numero / 2;
        }
        return resultado;
    }
	
}
