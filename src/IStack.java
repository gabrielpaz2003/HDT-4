/**
     * @author MAAG
     *
     */

/**
 * @author Andre marroquin
 * Gabriell paz
 * Andy fuentes
 * Seccion 10 estructura de datos
 */
    public interface IStack<T> {
/**
 * @param _expresion
 * @return int
 * retorna el tamaño de la lista
 */
        int count();
/**
 * @param _expresion
 * @return int
 * verifica si la lista esta vacia
 */

        boolean isEmpty();
/**
 * @param _expresion
 * @return int
 * verifica el push
 */

        void push(T value);

        /**
         * @param _expresion
         * @return int
         * verifica el pull
         */
        T pull();

    }
