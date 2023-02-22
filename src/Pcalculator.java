import java.util.ArrayList;
/**
 * @author 
 * Gabriel paz
 * Seccion 10 estructura de datos
 * Clase principal del proyecto
 */
public class Pcalculator implements IPostfixCalculator {
    
    private static Pcalculator instance = null;

    /** 
     * @param operandos
     * @return boolean
     * verifica si la lista tiene un solo elemento
     */
    @Override
    public boolean isOneItem(IStack operandos) {
        return operandos.count() == 1;
    }

    
    /** 
     * @param a
     * @param b
     * @return int
     * realiza la suma de dos numeros
     */
    @Override
    public int suma(int a, int b) {
        return a + b;
    }

    
    /** 
     * @param a
     * @param b
     * @return int
     * realiza la resta de dos numeros
     */
    @Override
    public int resta(int a, int b) {
        return a - b;
    }

    
    /** 
     * @param a
     * @param b
     * @return int
     *  realiza la multiplicacion de dos numeros
     */
    @Override
    public int multiplicacion(int a, int b) {
        return a * b;
    }

    
    /** 
     * @param a
     * @param b
     * @return int
     *   realiza la division de dos numeros
     */
    @Override
    public int division(int a, int b) {
        return a / b;
    }

    
    /** 
     * @param item
     * @return boolean
     *    verifica si el item es un operador
     */
    @Override
    public boolean isOperator(String item) {
        return item.equals("+") || item.equals("-") || item.equals("*") || item.equals("/");
    }

    
    /** 
     * @param vocablo
     * @return ArrayList<String>
     *     retorna una lista con los datos de la expresion
     */
    @Override
    public ArrayList<String> getItems(String vocablo) {
        ArrayList<String> datos = new ArrayList<String>();
        String[] DatosEnLista = vocablo.split(" ");
        for (String dato : DatosEnLista) {
            datos.add(dato);
        }
        return datos;
    }

    public static Pcalculator getInstance() {
        if (instance == null) {
            instance = new Pcalculator();
        }
        return instance;
    }
    
    Pcalculator() {
    }
}
