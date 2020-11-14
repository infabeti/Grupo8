package modelo;

import java.util.ArrayList;

import controlador.Funciones_Pelicula;

public class Objeto_Pelicula {
	public static ArrayList<Objeto_Pelicula> peliculas_totales = new ArrayList<Objeto_Pelicula>();
	//Drama
	public static Objeto_Pelicula handia,lista_Schindler, cadena_perpetua, mdb;
	//Sci-Fi
	public static Objeto_Pelicula space_odyssey,novia_Frankenstein, planeta_simios, alien;
	//Comedia
	public static Objeto_Pelicula scary_movie,gran_lebowski, vida_brian, aterriza_como_puedas;
	//Terror
	public static Objeto_Pelicula psicosis,el_resplandor, dracula, cisne_negro;

	
	//Declaración de datos
	static{
		
		//Drama
		ArrayList<Objeto_Pelicula> pelis_Drama = new ArrayList<Objeto_Pelicula>();
		handia = new Objeto_Pelicula("Handia", "Drama", 6960);
		lista_Schindler = new Objeto_Pelicula("La lista de Schindler", "Drama", 11820);
		cadena_perpetua = new Objeto_Pelicula("Cadena Perpetua", "Drama", 8520);
		mdb = new Objeto_Pelicula("Million Dollar Baby", "Drama", 7980);
		pelis_Drama.add(handia);
		pelis_Drama.add(lista_Schindler);
		pelis_Drama.add(cadena_perpetua);
		pelis_Drama.add(mdb);
		
		//Sci-Fi
		ArrayList<Objeto_Pelicula> pelis_Sci_Fi = new ArrayList<Objeto_Pelicula>();
		space_odyssey = new Objeto_Pelicula("2001: Odisea en el espacio", "Sci-Fi", 8520);
		novia_Frankenstein = new Objeto_Pelicula("La novia de Frankenstein", "Sci-Fi", 4500);
		planeta_simios = new Objeto_Pelicula("El planeta de los simios", "Sci-Fi", 6900);
		alien = new Objeto_Pelicula("Alien, el octavo pasajero", "Sci-Fi", 7020);
		pelis_Sci_Fi.add(space_odyssey);
		pelis_Sci_Fi.add(novia_Frankenstein);
		pelis_Sci_Fi.add(planeta_simios);
		pelis_Sci_Fi.add(alien);
		
		//Comedia
		ArrayList<Objeto_Pelicula> pelis_Comedia = new ArrayList<Objeto_Pelicula>();
		scary_movie = new Objeto_Pelicula("Scary movie", "Comedia", 5400);
		gran_lebowski = new Objeto_Pelicula("El gran Lebowsky", "Comedia", 7140);
		vida_brian = new Objeto_Pelicula("La vida de Brian", "Comedia", 5640);
		aterriza_como_puedas = new Objeto_Pelicula("Aterriza como puedas", "Comedia", 5280);
		pelis_Comedia.add(scary_movie);
		pelis_Comedia.add(gran_lebowski);
		pelis_Comedia.add(vida_brian);
		pelis_Comedia.add(aterriza_como_puedas);
		
		//Terror
		ArrayList<Objeto_Pelicula> pelis_Terror = new ArrayList<Objeto_Pelicula>();
		psicosis = new Objeto_Pelicula("Psicosis", "Terror", 6540);
		el_resplandor = new Objeto_Pelicula("El resplandor", "Terror", 8760);
		dracula = new Objeto_Pelicula("Dracula", "Terror", 9300);
		cisne_negro = new Objeto_Pelicula("Cisne negro", "Terror", 6600);
		pelis_Terror.add(psicosis);
		pelis_Terror.add(el_resplandor);
		pelis_Terror.add(dracula);
		pelis_Terror.add(cisne_negro);
		
		//Añadir pelis totales
		peliculas_totales.addAll(pelis_Drama);
		peliculas_totales.addAll(pelis_Sci_Fi);
		peliculas_totales.addAll(pelis_Comedia);
		peliculas_totales.addAll(pelis_Terror);

	}
	private String nombre, genero;
	private int duracion;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	public Objeto_Pelicula(String nombre, String genero, int duracion) {
		super();
		this.nombre = nombre;
		this.genero = genero;
		this.duracion = duracion;
	}

}
