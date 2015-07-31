/**
Universidad del Valle de Guatemala
Algoritmos y Estructura de Datos
Sección: 10

Christopher Chiroy
Jose Ochoa
Diego de León
Hoja de Trabajo 2

 */



public interface ADTStack<E> {

	public void empty();

	public boolean isEmpty();

	public void push(E x) ;

	public E pop() throws Exception;

	public int size();

	public E peek() throws Exception;

}
//public interface ADTStack {
//
//	public void empty();
//
//	public boolean isEmpty();
//
//	public void push(double x) ;
//
//	public double pop() throws Exception;
//
//	public int size();
//
//	public double  peek() throws Exception;

//}

