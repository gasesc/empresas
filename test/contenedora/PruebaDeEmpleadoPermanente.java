package contenedora;

import static org.junit.Assert.*;

import org.junit.Test;

public class PruebaDeEmpleadoPermanente {

	@Test
	public void calcularSalarioDeEmpleadoPermanente() {
		EmpleadoPermanente empleado1 =new EmpleadoPermanente("gaston", "escobar", true, 2,80, 6);
		double salarioEsperado=251000;
		double resultado=empleado1.calcularSalario();
		EmpleadoPermanente empleado2 =new EmpleadoPermanente("fernando", "lugo", false, 0,160, 4);
		double resultado2=empleado2.calcularSalario();
		double resultadoEsperado2=484000;
		assertEquals(salarioEsperado, resultado , 0.01);
		assertEquals(resultadoEsperado2, resultado2 , 0.01);
	}

}
