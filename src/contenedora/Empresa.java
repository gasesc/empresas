package contenedora;

import java.util.ArrayList;

public class Empresa {
	
	ArrayList<Empleado>empleados=new ArrayList<Empleado>();
	
	public void agergarEmpleado(Empleado empleado){
		empleados.add(empleado);
	}
	
	public double calcularSalarioTotalDeEmpleados() {
		double sumaDeSalarios=0.0;
		for (Empleado empleado : empleados) {
			sumaDeSalarios+=empleado.calcularSalario();
		}
		return sumaDeSalarios;
	}

}
