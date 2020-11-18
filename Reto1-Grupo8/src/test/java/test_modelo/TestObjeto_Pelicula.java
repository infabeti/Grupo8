package test_modelo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

import modelo.Objeto_Pelicula;

public class TestObjeto_Pelicula {

	@Test
	public void testGettersPeli() {
		String nombre = "nombrePeli";
		String genero = "generoPeli";
		int duracion = 14;
		Objeto_Pelicula peli = new Objeto_Pelicula(nombre, genero, duracion);
		assertEquals(nombre, peli.getNombre());
		assertEquals(genero, peli.getGenero());
		assertEquals(duracion, peli.getDuracion());
	}
	
//	@Test
//	public void testSetNombre() {
//		String nombre = "nombrePeli";
//		Objeto_Pelicula peli = new Objeto_Pelicula(null, null, 0);
//		peli.setNombre(nombre);
//		assertEquals(nombre, peli.getNombre());
//	}

}
