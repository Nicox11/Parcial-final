package Parcial;

public class NaveTripulada extends NaveEspacial  {

	private int capacidadTripulacion;
	
	private double alturaOrbital;
	
	public NaveTripulada(String nombre, double toneladasEmpuje, double toneladasPeso, double capacidadCarga,
			double altura, double potencia) {
		
		super(nombre, toneladasEmpuje, toneladasPeso, capacidadCarga, altura, potencia);
		
		
		this.capacidadTripulacion = capacidadTripulacion;
		
		this.alturaOrbital = alturaOrbital;
		
	}
	
	public int getCapacidadTriupulacion() {
		return capacidadTripulacion;
	}
	
	public double getAlturaOrbital() {
	return alturaOrbital;
	
	}
	
}




	
	
	
	

}
