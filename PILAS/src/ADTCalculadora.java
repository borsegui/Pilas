/**
import java.io.FileNotFoundException;

/**
 * @author Christopher Chiroy, Jose Ochoa, Diego de León
 * @category Hoja de Trabajo 2
 */
public interface ADTCalculadora {

	/**
	 *pre: lee la operacion en archivo de texto
	 *post: guarda la cadena en un atributo
	 */
	public void readFile(String file) throws FileNotFoundException, Exception;

	/**
	 * pre: recibe cadena con la operacion
	 * post: resultado de la operacion
	 */
	public double calcular() throws Exception;

	


}
