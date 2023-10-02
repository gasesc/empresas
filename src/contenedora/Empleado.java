package contenedora;

public abstract class Empleado {
	protected String Nomnre;
	protected String Apellido;
	protected boolean estaCasado;
	protected int cantidadDeHijos;
	protected double horasTrabajadas;
	
	public Empleado(String nomnre, String apellido, boolean estaCasado, int cantidadDeHijos, double horasTrabajadas) {

		Nomnre = nomnre;
		Apellido = apellido;
		this.estaCasado = estaCasado;
		this.cantidadDeHijos = cantidadDeHijos;
		this.horasTrabajadas = horasTrabajadas;
	}

	public abstract double calcularSalario();
	
	
	
	

}
