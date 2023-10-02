package contenedora;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmpleadoTemporalTest {

	@Test
	public void test() {
		EmpleadoTemporal empleado1 =new EmpleadoTemporal("gaston", "escobar", true, 0, 80);
		double salarioEsperado=161000;
		double resultado=empleado1.calcularSalario();
		
		assertEquals(salarioEsperado, resultado , 0.01);
	}

}
