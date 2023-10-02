package contenedora;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmpresaTest {

	@Test
	public void test() {
		EmpleadoTemporal temporal =new EmpleadoTemporal("gaston", "escobar", true, 0, 80);
		EmpleadoPermanente empleado1 =new EmpleadoPermanente("gaston", "escobar", true, 2,80, 6);
		EmpleadoPermanente empleado2 =new EmpleadoPermanente("fernando", "lugo", false, 0,160, 4);
		Gerente gerente =new Gerente("gaston", "escobar", true, 1,160, 10);
		Empresa empresa=new Empresa();
		empresa.agergarEmpleado(empleado1);
		empresa.agergarEmpleado(empleado2);
		empresa.agergarEmpleado(gerente);
		empresa.agergarEmpleado(temporal);
		double valorEsperado= 1554000;
		double valorObtenido=empresa.calcularSalarioTotalDeEmpleados();
		assertEquals(valorEsperado, valorObtenido, 0.01);
		
		
	}

}
