package Parcial;

public class NaveNoTripulada extends NaveEspacial {
	

	private Motor motor;
	
	public NaveNoTripulada(String nombre, double toneladasEmpuje, double toneladasPeso, double capacidadCarga,
	double altura, double potencia) {
		
		super(nombre, toneladasEmpuje, toneladasPeso, capacidadCarga, altura, potencia);
	
		this.motor = motor;
		
	}
	
	public Motor getMotor() {
		return motor;
		
	}
	
	}


