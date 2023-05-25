package ed.kico;
public class TestCalculadora {
    /**
     * Este main sirve para ejecutar y verificar que la clase calculadora
     * se ejecuta correctamente.
     * @param args Los parametros son el primer 'a'numero a realizar la operacion
     * y el segundo 'b' el segundo número que compaginara la operación.
     */
    public static void main(String[] args) {
    Calculadora calculadora = new Calculadora();
        System.out.println(calculadora.suma(4,5));
        System.out.println(calculadora.resta(5,2));
        System.out.println(calculadora.diveix(10,2));
        System.out.println(calculadora.multiplica(8,2));
    }
}
