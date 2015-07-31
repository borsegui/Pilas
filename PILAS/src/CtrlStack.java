import java.util.ArrayList;


/**
 * @author Christopher Chiroy, Jose Ochoa, Diego de León
 * @category Hoja de Trabajo 2
 * @param <E>
 */
public class CtrlStack<E> implements ADTStack<E>{

	private ArrayList<E> list;
	private int posicion;
	
	/**
	 * se está creando un array y la variabale posicion en 0
	 */
	public CtrlStack(){
		list = new ArrayList<E>();
		posicion = 0;
	}
	@Override
	/**
	 *podemos limpiar la pila con este metodo
	 *pre: lista puede o no contener datos
	 *post: Lista vacia
	 */
	public void empty() {
		// TODO Auto-generated method stub
		list.clear();
	}

	@Override
	/**
	 *verificamos si la pila está vacia
	 *pre: verificar si lista esta vacia
	 *post: true si lista vacia, false si lista llena
	 */
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if (list.isEmpty())
			return true;
		else
			return false;
	}

	@Override
	/**
	 *puede colocar en la pila un valor determinado, mandarlo hacia abajo
	 *pre: recibe dato
	 *post: agrega dato a la lista
	 */
	public void push(E x) {
		// TODO Auto-generated method stub
		list.add(x);
		posicion++;
	}

	@Override
	/**
	 *puede sacar un elemento de la pila, lo manda haci arriba
	 *pre: retira el ultimo valor ingresado de la lista
	 *post: regresa el valor retirado de la lista
	 */
	public E pop() throws Exception {
		// TODO Auto-generated method stub
		E n =  list.get(posicion-1);
		list.remove(posicion-1);
		posicion-=1;
		return n;
	}

	@Override
	/**
	 *este provee el tamaño de la pila
	 *pre: cuanta cantidad de datos en la lista
	 *post: Devuelve cantidad de datos en la lista
	 */
	public int size() {
		// TODO Auto-generated method stub
		return list.size();
	}
	@Override
	/**
	 *se puede verficar el dato de hasta arriba
	 *pre: lee el ultimo valor ingresado
	 *post: devuelve el ultimo valor ingresado
	 */
	public E peek() throws Exception {
		// TODO Auto-generated method stub
		E n =  list.get(posicion-1);
		return n;
	}

}
