/**
 * @author Seccion 10
 */
/**
 * @author Andre marroquin
 * Gabriell paz
 * Andy fuentes
 * Seccion 10 estructura de datos
 */
public interface IPostfixCalculator {

    /**
     * @param _expresion
     * @return int
     * realiza la operacion de la expresion
     */
    boolean isOneItem(IStack operandos);

    /**
     * @param a
     * @param b
     * @return int
     * realiza la suma de dos numeros
     */
    int suma(int a, int b);

    /**
     * @param a
     * @param b
     * @return int
     * realiza la resta de dos numeros
     */
    int resta(int a, int b);

    /**
     * @param a
     * @param b
     * @return int
     *  realiza la multiplicacion de dos numeros
     */
    int multiplicacion(int a, int b);

    /**
     * @param a
     * @param b
     * @return int
     *   realiza la division de dos numeros
     */
    int division(int a, int b);
/**
     * @param a
     * @param b
     * @return int
     *   verifica los operadorea de la lista
     */
    boolean isOperator(String item);

    /**
     * @param a
     * @param b
     * @return int
     *  realiza la operacion de la lista
     */
    java.util.ArrayList<String> getItems(String _expresion);
}