/**
Universidad del Valle de Guatemala
Algoritmos y Estructura de Datos
Secci�n: 10

Christopher Chiroy
Jose Ochoa
Diego de Le�n
Hoja de Trabajo 2

 */

import java.io.FileNotFoundException;



//public interface ADTCalculadora<P> {
//
//	public void readFile(String file) throws FileNotFoundException, Exception;
//
//	public P calcular() throws Exception;

	

/**
 * @author Christopher,jose,Alejandro
 *
 */
public interface ADTCalculadora {

	public void readFile(String file) throws FileNotFoundException, Exception;

	public double calcular() throws Exception;

	


}

