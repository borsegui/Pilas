/**
Universidad del Valle de Guatemala
Algoritmos y Estructura de Datos
Sección: 10

Christopher Chiroy
Jose Ochoa
Diego de León
Hoja de Trabajo 2

 */
import java.util.ArrayList;


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
	 */
	public void empty() {
		// TODO Auto-generated method stub
		list.clear();
	}

	@Override
	/**
	 *verificamos si la pila está vacia
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
	 */
	public void push(E x) {
		// TODO Auto-generated method stub
		list.add(x);
		posicion++;
	}

	@Override
	/**
	 *puede sacar un elemento de la pila, lo manda haci arriba
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
	 */
	public int size() {
		// TODO Auto-generated method stub
		return list.size();
	}

	@Override
	/**
	 *se puede verficar el dato de hasta arriba
	 */
	public E peek() throws Exception {
		// TODO Auto-generated method stub
		E n =  list.get(posicion-1);
		return n;
	}

}
