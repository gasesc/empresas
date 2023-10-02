package contenedora;

public class EmpleadoPermanente extends Empleado {
	
	protected double valarDeHora =3000.0;
	protected double salarioFamiliar=2000.0;
	protected double casado=1000.0;
	protected double antiguedad=1000.0;
	protected double añosDeAntiguedad;
	
	public EmpleadoPermanente(String nomnre, String apellido, boolean estaCasado, 
			                  int cantidadDeHijos,double horasTrabajadas, double añosDeAntiguedad) {
		super(nomnre, apellido, estaCasado, cantidadDeHijos, horasTrabajadas);
		this.añosDeAntiguedad=añosDeAntiguedad;
		
	}

	@Override
	public double calcularSalario() {
		double resultado=0.0;
		resultado=horasTrabajadas*valarDeHora+cantidadDeHijos*salarioFamiliar+antiguedad*añosDeAntiguedad;
		
		if(estaCasado) {
			resultado+=casado;
		}
		
		
		return resultado;
	}

	
	
	

}
