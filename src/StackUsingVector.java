import java.util.Vector;

public class StackUsingVector<T> implements IStack<T> {

	private Vector<T> miVectorInterno;
	
	public StackUsingVector() {
		miVectorInterno = new Vector<T>(); 
	}
	
	
	/** 
	 * @return int
	 * retorna el tamaño del vector
	 */
	@Override
	public int count() {
		return miVectorInterno.size();
	}

	
	/** 
	 * @return boolean
	 * verifica si el vector esta vacio
	 */
	@Override
	public boolean isEmpty() {
		return miVectorInterno.isEmpty();
	}

	
	/** 
	 * @param value
	 * agrega un valor al vector
	 */
	@Override
	public void push(T value) {
		miVectorInterno.add(0, value);
	}

	
	/** 
	 * @return T
	 * retorna el valor del vector
	 */
	@Override
	public T pull() {
		return miVectorInterno.remove(0);
	}

}

