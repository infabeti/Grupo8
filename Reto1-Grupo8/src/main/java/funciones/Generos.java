package funciones;

import java.util.ArrayList;

import ventanas.Frame_Generos;

public class Generos {
	
	public static ArrayList<Pelicula> sabado_seleccionadas = new ArrayList<Pelicula>();
	
	public int calcularSabado(int tiempoReproducidoSabado) {
		int tiempoRestanteSabado=0;	
		tiempoRestanteSabado=(Frame_Generos.TIEMPO_TOTAL_SABADO-tiempoReproducidoSabado);
		
		return tiempoRestanteSabado;
	}
	
	public int calcularDomingo(int tiempoReproducidoDomingo) {
		int tiempoRestanteDomingo=0;
		tiempoRestanteDomingo=(Frame_Generos.TIEMPO_TOTAL_DOMINGO-tiempoReproducidoDomingo);
		
		return tiempoRestanteDomingo;
	}
	
	

}
