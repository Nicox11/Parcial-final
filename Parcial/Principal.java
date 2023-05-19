package Parcial;

import java.util.Scanner;
import java.util.ArrayList;

public class Principal {
	
	private static final int MAX_NAVES = 9;
	private static NaveEspacial[] inventarioNaves = new NaveEspacial[MAX_NAVES];
	private static int contadorNaves = 0;
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean continuarPrograma = true;
		
		while (continuarPrograma) {
			System.out.println("Seleccione una de las opciones:");
			System.out.println("1. Crear una nave");
			System.out.println("2. Mostrar el inventario de naves");
			System.out.println("3. Salir");
			
			int opcion = scanner.nextInt();
			
			switch (opcion) {
            case 1:
                crearNave();
                break;
            case 2:
                mostrarInventario();
                break;
            case 3:
                continuarPrograma = false;
                break;
            default:
            	
            	System.out.println("Opcion invalida. Intentalo de nuevo.");
			
			
			}
		}
		
	}
	
	private static void crearNave() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Selecciona el tipo de nave que deseas:");
		System.out.println("1. Vehiculo Lanzadera");
		System.out.println("2. Nave No Tripulada");
		System.out.println("3. Nave Tripulada");
		
		int opcion = scanner.nextInt();
		
		switch (opcion) {
		case 1:
			crearVehiculoLanzadera();
			break;
		case 2:
			crearNaveNoTripulada();
			break;
		case 3:
			crearNaveTripulada();
			break;
			default:
				System.out.println("Opcion invalida. Intentalo de nuevo.");
		}
	}

	private static void crearVehiculoLanzadera() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese los datos del vehiculo lanzadera");
		
	}
		private static void crearNaveNoTripulada() {
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Ingrese los datos de la nave No Tripulada");
		}
		
		private static void crearNaveTripulada() {
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Ingrese los datos de la Nave Tripulada");
		}
		
		private static void mostrarInventario() {
			System.out.println("Inventario de naves");
			
			for (NaveEspacial nave : inventarioNaves) {
				if (nave != null) {
					System.out.println("Nombre: " + nave.getNombre());
				}
			}
		}
		
		private static void buscarNave() {
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Ingrese el nombre de la nave");
			String nombre = scanner.nextLine();
			
			boolean encontrada = false;
			
			for(NaveEspacial nave : inventarioNaves) {
				if (nave !=null && nave.getNombre().equalsIgnoreCase(nombre)) {
					
					System.out.println("Nave Encontada: ");
					System.out.println("Nombre: " + nave.getNombre());
					
					encontrada = true;
					
					break;
				}
			}
			if (!encontrada) {
				System.out.println("Nave no encontrada");
			}
		}
		private static void agregarNave(NaveEspacial nave) {
			if (contadorNaves < MAX_NAVES) {
				inventarioNaves[contadorNaves] = nave;
				contadorNaves++;
				System.out.println("Nave agregada al inventario");
			} else {
				System.out.println("Inventario de naves lleno");
			}
		}
}
