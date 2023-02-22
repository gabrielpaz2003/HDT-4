
/**
 * @author
 * Gabriel paz
 * Seccion 10 estructura de datos
 * Codigo Utilizado de HT2 
 * Clase para crear un stack utilizando un ArrayList
 */

public class StackUsingLinkedList<T> implements IStack<T> {
    private Node<T> top;

    public StackUsingLinkedList() {
        top = null;
    }

    /** 
	 * @return int
	 * retorna el tamaño de la lista
	 */

    @Override
    public int count() {
        int count = 0;
        Node<T> node = top;
        while (node != null) {
            count++;
            node = node.getNext();
        }
        return count;
    }

    /** 
	 * @return boolean
	 * verifica si la lista esta vacia
	 */

    @Override
    public boolean isEmpty() {
        return top == null;
    }

    /** 
	 * @param value
	 * agrega un valor a la lista
	 */

    @Override
    public void push(T value) {
        Node<T> node = new Node<>(value);
        node.setNext(top);
        top = node;
    }

    /** 
	 * @return T
	 * retorna el valor de la lista
	 */

    @Override
    public T pull() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        T value = top.getValue();
        top = top.getNext();
        return value;
    }

    private static class Node<T> {
        private T value;
        private Node<T> next;

        public Node(T value) {
            this.value = value;
            next = null;
        }

        public T getValue() {
            return value;
        }

        public Node<T> getNext() {
            return next;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }
    }

}
