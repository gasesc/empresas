package contenedora;

public class EmpleadoTemporal extends Empleado {
	
	protected double valarDeHora =2000.0;
	protected double salarioFamiliar=2000.0;
	protected double casado=1000.0;

	public EmpleadoTemporal(String nomnre, String apellido, boolean estaCasado, int cantidadDeHijos,
			double horasTrabajadas) {
		super(nomnre, apellido, estaCasado, cantidadDeHijos, horasTrabajadas);
	}
	@Override
	public double calcularSalario() {
		
		double resultado=0.0;
		resultado=horasTrabajadas*valarDeHora+cantidadDeHijos*salarioFamiliar;
		
		if(estaCasado) {
			resultado+=casado;
		}
		
		
		return resultado;
	}

	
	
}
