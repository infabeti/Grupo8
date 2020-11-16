package test_controlador;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import controlador.Funciones_Generos;
import controlador.Funciones_Pelicula;
import modelo.Objeto_Pelicula;
import vista.Frame_Generos;
import vista.Frame_Peliculas;

class TestFunciones_Pelicula {
	
	private int duracion_pelicula;
	
//	@Test
//	void testHoursToSecs() {
//		int resultado = 9540;
//		assertEquals(Funciones_Pelicula.hoursToSecs(2, 39), resultado);
//		assertEquals(Funciones_Pelicula.hoursToSecs("2 horas, 39 minutos."), resultado);
//	}
//	
//	@Test
//	void testearSecsToHours() {
//		String resultado = "1 horas, 57 minutos.";
//		assertEquals(Funciones_Pelicula.secsToHours(Objeto_Pelicula.alien.getDuracion()), resultado);
//	}
	
	@Test
	void testearAddPeli() {
		int totales_seleccionadas = Funciones_Generos.totales_seleccionadas.size();

		
		new Frame_Generos();
		Frame_Generos.frame_pelis = new Frame_Peliculas("Sci-Fi");
		Funciones_Pelicula.addPeli(Objeto_Pelicula.alien);

		int size_pelicula_despues_de_add = Objeto_Pelicula.peliculas_totales.size();

		assertEquals(totales_seleccionadas+1,size_pelicula_despues_de_add);
	}
	
	@Test
	void testearAddingPeli() {
		new Frame_Generos();
		Frame_Generos.frame_pelis = new Frame_Peliculas("Sci-Fi");
		
		///////////////////////////////////////////////////////////////////
		int totales_seleccionadas = Funciones_Generos.totales_seleccionadas.size();
		Funciones_Pelicula.addingPeli(Objeto_Pelicula.alien,"sabado");
		int size_pelicula_despues_de_add = Objeto_Pelicula.peliculas_totales.size();
		

		String resultado1 = Frame_Generos.tiempoSabado.getText();
		String resultado2 = Frame_Generos.peliculasVistasSabado.getText();
		
		assertEquals("6 horas, 3 minutos.", resultado1);
		assertEquals(totales_seleccionadas+1,size_pelicula_despues_de_add);
		assertEquals("Sci-Fi: Alien, el octavo pasajero", resultado2);

	}
	
}
