package test_controlador;

import static org.junit.Assert.assertEquals;
import java.util.ArrayList;

import org.junit.Test;

import controlador.Funciones_Generos;
import modelo.Objeto_Pelicula;

class TestFunciones_Generos {

	@Test
	void testCalcularDisponible() {
		int resultadoSabado= 21780;
		int resultadoDomingo= 28800;
		Funciones_Generos.calcularDisponible(Objeto_Pelicula.alien, "sabado");
		Funciones_Generos.calcularDisponible(Objeto_Pelicula.alien, "domingo");
		
		assertEquals(Funciones_Generos.getDisponible_sabado(), resultadoSabado);
		assertEquals(Funciones_Generos.getDisponible_domingo(), resultadoDomingo);
	}
	
	@Test
	void testLimpiar() {
		ArrayList<Objeto_Pelicula> array_vacio = new ArrayList<Objeto_Pelicula>();
		Funciones_Generos.limpiarLista("sabado");
		assertEquals(Funciones_Generos.sabado_seleccionadas, array_vacio);
		assertEquals(Funciones_Generos.domingo_seleccionadas, array_vacio);

	}
	
	@Test 
	void testGetDisponible_sabado() {
		Funciones_Generos.setDisponible_sabado(2);
		assertEquals(2, Funciones_Generos.getDisponible_sabado());
	}
	
	@Test 
	void testGetDisponible_domingo() {
		Funciones_Generos.setDisponible_domingo(2);
		assertEquals(2, Funciones_Generos.getDisponible_domingo());
	}
}
