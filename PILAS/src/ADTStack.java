/**
 * @author Christopher Chiroy, Jose Ochoa, Diego de León
 * @category Hoja de Trabajo 2
 */
public interface ADTStack<E> {
	/**
	 *pre: lista puede o no contener datos
	 *post: Lista vacia
	 */
	public void empty();
	
	/**
	 *pre: verificar si lista esta vacia
	 *post: true si lista vacia, false si lista llena
	 */
	public boolean isEmpty();

	/**
	 *pre: recibe dato
	 *post: agrega dato a la lista
	 */
	public void push(E x) ;
	
	/**
	 *pre: retira el ultimo valor ingresado de la lista
	 *post: regresa el valor retirado de la lista
	 */
	public E pop() throws Exception;

	/**
	 *pre: cuanta cantidad de datos en la lista
	 *post: Devuelve cantidad de datos en la lista
	 */
	public int size();

	/**
	 *pre: lee el ultimo valor ingresado
	 *post: devuelve el ultimo valor ingresado
	 */
	public E peek() throws Exception;

}

