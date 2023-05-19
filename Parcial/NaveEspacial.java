package Parcial;

public abstract class NaveEspacial {

		private String nombre;
		
		private double toneladasEmpuje;
		
		private double toneladasPeso;
		
		private double capacidadCarga;
		
		private double altura;
		private double potencia;
		
		public NaveEspacial(String nombre, double toneladasEmpuje, double toneladasPeso,
		double capacidadCarga, double altura, double potencia) {
			
		this.nombre = nombre;
		
		
		this.toneladasEmpuje = toneladasEmpuje;
		
		this.toneladasPeso = toneladasPeso;
		
		this.capacidadCarga = capacidadCarga;
		
		this.altura = altura;
		
		
		this.potencia = potencia;
		}
		
		public String getNombre() {
		return nombre;
		}
		
		public double getToneladasEmpuje() {
		return toneladasEmpuje;
		}

		public double getToneladasPeso() {
		return toneladasPeso;
		}
		
		public double getCapacidadCarga() {
		return capacidadCarga;
		}
		
		public double getAltura() {
		return altura;
		}
		
		public double getPotencia() {
		return potencia;
		}
		
		}


