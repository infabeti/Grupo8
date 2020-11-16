package controlador;

import java.util.ArrayList;

import modelo.Objeto_Pelicula;
import vista.Frame_Generos;

public class Funciones_Generos {
	public static final int TIEMPO_TOTAL_SABADO=28800; 	//te cambio el nombre porque las constantes se suelen poner en mayúscula, luego para verlo es útil :)
	public static final int TIEMPO_TOTAL_DOMINGO=21600; //te cambio el nombre porque las constantes se suelen poner en mayúscula, luego para verlo es útil :)
	public static ArrayList<Objeto_Pelicula> totales_seleccionadas = new ArrayList<Objeto_Pelicula>();
	public static ArrayList<Objeto_Pelicula> sabado_seleccionadas = new ArrayList<Objeto_Pelicula>();
	public static ArrayList<Objeto_Pelicula> domingo_seleccionadas = new ArrayList<Objeto_Pelicula>();
	private static int disponible_sabado = TIEMPO_TOTAL_SABADO;  	//Se inicializa con su máximo valor
	private static int disponible_domingo = TIEMPO_TOTAL_DOMINGO;	//Se inicializa con su máximo valor


	
	
	
	
	public static void calcularDisponible(Objeto_Pelicula pelicula, String dia) {
		if(dia.equalsIgnoreCase("sabado")) {
			setDisponible_sabado((disponible_sabado-pelicula.getDuracion()));
			}
		else if (dia.equalsIgnoreCase("domingo")) {
			setDisponible_domingo((disponible_domingo-pelicula.getDuracion()));
			}
	}
	
	public static void limpiarLista(String dia) {
		if(dia.equalsIgnoreCase("sabado")) {s
			sabado_seleccionadas.clear();
			totales_seleccionadas.clear();
			totales_seleccionadas.addAll(domingo_seleccionadas);
			Frame_Generos.peliculasVistasSabado.setText("");
			disponible_sabado=TIEMPO_TOTAL_SABADO;
			Frame_Generos.tiempoSabado.setText(Funciones_Pelicula.secsToHours(TIEMPO_TOTAL_SABADO));
		}
		
		if(dia.equalsIgnoreCase("domingo")) {
			domingo_seleccionadas.clear();
			totales_seleccionadas.clear();
			totales_seleccionadas.addAll(sabado_seleccionadas);
			Frame_Generos.peliculasVistasDomingo.setText("");
			disponible_domingo=TIEMPO_TOTAL_DOMINGO;
			Frame_Generos.tiempoDomingo.setText(Funciones_Pelicula.secsToHours(TIEMPO_TOTAL_DOMINGO));
		}
	}






	public static int getDisponible_sabado() {
		return disponible_sabado;
	}






	public static void setDisponible_sabado(int disponible_sabado) {
		Funciones_Generos.disponible_sabado = disponible_sabado;
	}






	public static int getDisponible_domingo() {
		return disponible_domingo;
	}






	public static void setDisponible_domingo(int disponible_domingo) {
		Funciones_Generos.disponible_domingo = disponible_domingo;
	}
	
	
}
