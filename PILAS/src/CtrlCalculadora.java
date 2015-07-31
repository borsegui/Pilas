/**
Universidad del Valle de Guatemala
Algoritmos y Estructura de Datos
Sección: 10

Christopher Chiroy
Jose Ochoa
Diego de León
Hoja de Trabajo 2

 */
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.Scanner;


/**
 * @author Christopher , jose Ochoa, Diego de León
 *
 */

public class CtrlCalculadora implements ADTCalculadora {
	
	/**
	 * Se crea la pila y las variables a utilziar
	 */
	private CtrlStack<Double> pila;
	private String c;

	public CtrlCalculadora(){
		pila = new CtrlStack<Double>();
		c="";
	}
	
	/**
	 *lee el texto qeu contiene los numero con notacion postfix
	 */
	@Override
	
	public void readFile(String file){
		String texto="";
		try{
			//FileReader lector=new FileReader("src/texto.txt");
			/**
			 * se crean parapoder leer el archivo txt
			 */
			FileReader lector=new FileReader(file);
			BufferedReader contenido=new BufferedReader(lector);
			while((texto=contenido.readLine())!=null)
			{
			System.out.println("operacion: "+ texto);
			c=texto;
			}
		}
		/**
		 *programación en caso de que exista un error
		 */
		catch(Exception e){
			System.out.println("Error al leer");

		}
	}

	@Override
	public double calcular() throws Exception {
		
		double n1, n2;
		/**
		 *este es el que va conparando si es un operando como +,-;/;*
		 */
		// TODO Auto-generated method stub
		for(int i=0; i<c.length(); i+=2){
			String valor = c.charAt(i)+"";
			
			if(!valor.equals("+") && !valor.equals("-") && !valor.equals("*") && !valor.equals("/")){
				
				double num = Double.parseDouble(valor);
				pila.push(num);
			}
			/**
			 *si el valor es igual a "+" procede a sacar n2 y n2 para sumarlos ymeterlos 
			 *nuevamente con el push
			 */
			else if(valor.equals("+")){
				n1= pila.pop();
				n2= pila.pop();
				pila.push(n2+n1);
			}
			/**
			 *si el valor es igual a "-" procede a sacar n2 y n2 para sumarlos ymeterlos 
			 *nuevamente con el push
			 */
			else if(valor.equals("-")){
				n1= pila.pop();
				n2= pila.pop();
				pila.push(n2-n1);
			}
			/**
			 *si el valor es igual a "*" procede a sacar n2 y n2 para sumarlos ymeterlos 
			 *nuevamente con el push
			 */
			else if(valor.equals("*")){
				n1= pila.pop();
				n2= pila.pop();
				pila.push(n1*n2);
			}
			/**
			 *si el valor es igual a "/" procede a sacar n2 y n2 para sumarlos ymeterlos 
			 *nuevamente con el push
			 */
			else if(valor.equals("/")){
				n1= pila.pop();
				n2= pila.pop();
				pila.push(n1/n2);
			}
		}
		return pila.pop();
		
	}
	
	public static void main(String args[]){
		/**
		 *se crea el objeto scanner para pdoer leer el teclado
		 */
		CtrlCalculadora calcu = new CtrlCalculadora();
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese direccion de archivo");
		String text = teclado.next();
			calcu.readFile(text);
		try {
			System.out.println(""+calcu.calcular());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			/**
			 *mensaje al usuario por si existe un error en alguna operacion
			 */
			System.out.println("Error al hacer la operacion");
		}
	}

}
