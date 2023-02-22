import java.util.Stack;

/**
 * @author 
 * Gabriel paz
 * Seccion 10 estructura de datos
 * Clase para la asignacion de Stack
 */

class StackFactory<E> {

    /**
     * Este método recibe la entrada de tipo numerico que indica el tipo de Stack a utilizar
     * @param opcion
     * @return El tipo de stack que se desea.
     */
    public IStack<Integer> getStack(int opcion) {
        if(opcion == 1){
            return new StackUsingArrayList<Integer>();
        }
        if(opcion == 2){
            return new StackUsingVector<Integer>();
        }
        
        return null;
    }

    /**
     * Este metodo recibe la entrada de tipo numerico que indica el tipo de lista a utilizar.
     * @param opcion
     * @return El tipo de lista que se desea.
     */
    public IStack<Integer> getList(int opcion){
        if(opcion == 1){
            return new StackUsingLinkedList<Integer>();
        }
        if(opcion == 2){
            return new StackUsingDoubleLinkedList<Integer>();
        }
        
        
        return null;
    }

}