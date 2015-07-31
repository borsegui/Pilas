import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Christopher Chiroy, Jose Ochoa, Diego de León
 * @category Hoja de Trabajo 2
 */

public class TestStack {
	
	CtrlStack<Double> pila = new CtrlStack<Double>();

	/**
	 * Prueba de isEmpty para la pila
	 */
	@Test
	public void testIsEmpty() {
		assertEquals(true, pila.isEmpty());
	}
	
	/**
	 * prueva del push para la pila
	 */
	@Test
	public void testPush() {
		pila.push(2.5);
		assertEquals(false, pila.isEmpty());
	}
	
	/**
	 * prueba size para la pila
	 */
	@Test
	public void testSize(){
		int n = pila.size();
		assertEquals(0, n);
		
	}

}
