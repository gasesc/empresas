package contenedora;

public class Gerente extends EmpleadoPermanente {
	protected double valarDeHora =4000.0;
	protected double salarioFamiliar=2000.0;
	protected double casado=1000.0;
	protected double antiguedad=1500.0;
	
	public Gerente(String nomnre, String apellido, boolean estaCasado, int cantidadDeHijos, double horasTrabajadas,
			double añosDeAntiguedad) {
		super(nomnre, apellido, estaCasado, cantidadDeHijos, horasTrabajadas, añosDeAntiguedad);
		
	}
	
	@Override
	public double calcularSalario() {
		double resultado=0.0;
		resultado=valarDeHora*horasTrabajadas+salarioFamiliar*cantidadDeHijos+añosDeAntiguedad*antiguedad;
		
		if(estaCasado) {
			resultado+=casado;
		}
		
		
		return resultado;
	}
	
	
	

}
