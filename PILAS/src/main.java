import java.util.Scanner;

/**
 * @author Christopher Chiroy, Jose Ochoa, Diego de León
 * @category Hoja de Trabajo 2
 */
public class main {
	
	public static void main(String args[]){
		CtrlCalculadora calcu = new CtrlCalculadora();
		
			calcu.readFile("datos.txt");
		try {
			System.out.println(""+calcu.calcular());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Error al hacer la operacion");
		}
	}

}
