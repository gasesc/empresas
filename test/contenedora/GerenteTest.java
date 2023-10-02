package contenedora;

import static org.junit.Assert.*;

import org.junit.Test;

public class GerenteTest {

	@Test
	public void test() {
		Gerente empleado1 =new Gerente("gaston", "escobar", true, 1,160, 10);
		double salarioEsperado=658000;
		double resultado=empleado1.calcularSalario();
		
		assertEquals(salarioEsperado, resultado , 0.01);
	}

}
