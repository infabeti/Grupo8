package funciones;

import java.util.ArrayList;

import ventanas.Frame_Generos;

public class Generos {
	public static final int TIEMPO_TOTAL_SABADO=28800; 	//te cambio el nombre porque las constantes se suelen poner en mayúscula, luego para verlo es útil :)
	public static final int TIEMPO_TOTAL_DOMINGO=21600; //te cambio el nombre porque las constantes se suelen poner en mayúscula, luego para verlo es útil :)
	public static ArrayList<Pelicula> sabado_seleccionadas = new ArrayList<Pelicula>();
	private static int disponible_sabado = TIEMPO_TOTAL_SABADO;  	//Se inicializa con su máximo valor
	private static int disponible_domingo = TIEMPO_TOTAL_DOMINGO;	//Se inicializa con su máximo valor


	
	
	
	
	public static void calcularDisponible(Pelicula pelicula, String dia) {
		if(dia.equalsIgnoreCase("sabado"))
			setDisponible_sabado((disponible_sabado-pelicula.getDuracion()));
		else if (dia.equalsIgnoreCase("domingo"))
			setDisponible_sabado((disponible_domingo-pelicula.getDuracion()));
		

	}






	public static int getDisponible_sabado() {
		return disponible_sabado;
	}






	public static void setDisponible_sabado(int disponible_sabado) {
		Generos.disponible_sabado = disponible_sabado;
	}






	public static int getDisponible_domingo() {
		return disponible_domingo;
	}






	public static void setDisponible_domingo(int disponible_domingo) {
		Generos.disponible_domingo = disponible_domingo;
	}
	
	
}
