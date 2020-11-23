package controlador;

import vista.Frame_Generos;
import vista.Frame_Resumen;

public class Funciones_Resumen {
	
	public static void escribirResumen() {
		Frame_Resumen.peliculasVistasSabado.setText(Frame_Generos.peliculasVistasSabado.getText());
		Frame_Resumen.peliculasVistasDomingo.setText(Frame_Generos.peliculasVistasDomingo.getText());
		String tiempoEmitidoSabado = Funciones_Pelicula.secsToHours(Funciones_Generos.TIEMPO_TOTAL_SABADO-Funciones_Generos.getDisponible_sabado());
		String tiempoEmitidoDomingo = Funciones_Pelicula.secsToHours(Funciones_Generos.TIEMPO_TOTAL_DOMINGO-Funciones_Generos.getDisponible_domingo());
		Frame_Resumen.TiempoEmisionSabado.setText(tiempoEmitidoSabado);
		Frame_Resumen.TiempoEmisionDomingo.setText(tiempoEmitidoDomingo);
	}

}
