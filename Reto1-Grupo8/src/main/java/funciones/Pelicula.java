package funciones;

import java.util.ArrayList;

public class Pelicula {
//FUNCIONAMIENTO PELICULAS
	
	public static ArrayList<Pelicula> peliculas_totales = new ArrayList<Pelicula>();
	//Drama
	static Pelicula handia,lista_Schindler, cadena_perpetua, mdb;
	//Sci-Fi
	static Pelicula space_odyssey,novia_Frankenstein, planeta_simios, alien;
	//Comedia
	static Pelicula scary_movie,gran_lebowski, vida_brian, aterriza_como_puedas;
	//Terror
	static Pelicula psicosis,el_resplandor, dracula, cisne_negro;

	
	//Declaración de datos
	static{
		
		//Drama
		ArrayList<Pelicula> pelis_Drama = new ArrayList<Pelicula>();
		handia = new Pelicula("Handia", "Drama", 6960);
		lista_Schindler = new Pelicula("La lista de Schindler", "Drama", 11820);
		cadena_perpetua = new Pelicula("Cadena Perpetua", "Drama", 8520);
		mdb = new Pelicula("Million Dollar Baby", "Drama", 7980);
		pelis_Drama.add(handia);
		pelis_Drama.add(lista_Schindler);
		pelis_Drama.add(cadena_perpetua);
		pelis_Drama.add(mdb);
		
		//Sci-Fi
		ArrayList<Pelicula> pelis_Sci_Fi = new ArrayList<Pelicula>();
		space_odyssey = new Pelicula("2001: Odisea en el espacio", "Sci-Fi", 8520);
		novia_Frankenstein = new Pelicula("La novia de Frankenstein", "Sci-Fi", 4500);
		planeta_simios = new Pelicula("El planeta de los simios", "Sci-Fi", 6900);
		alien = new Pelicula("Alien, el octavo pasajero", "Sci-Fi", 7020);
		pelis_Sci_Fi.add(space_odyssey);
		pelis_Sci_Fi.add(novia_Frankenstein);
		pelis_Sci_Fi.add(planeta_simios);
		pelis_Sci_Fi.add(alien);
		
		//Comedia
		ArrayList<Pelicula> pelis_Comedia = new ArrayList<Pelicula>();
		scary_movie = new Pelicula("Scary movie", "Comedia", 5400);
		gran_lebowski = new Pelicula("El gran Lebowsky", "Comedia", 7140);
		vida_brian = new Pelicula("La vida de Brian", "Comedia", 5640);
		aterriza_como_puedas = new Pelicula("Aterriza como puedas", "Comedia", 5280);
		pelis_Comedia.add(scary_movie);
		pelis_Comedia.add(gran_lebowski);
		pelis_Comedia.add(vida_brian);
		pelis_Comedia.add(aterriza_como_puedas);
		
		//Terror
		ArrayList<Pelicula> pelis_Terror = new ArrayList<Pelicula>();
		psicosis = new Pelicula("Psicosis", "Terror", 6540);
		el_resplandor = new Pelicula("El resplandor", "Terror", 8760);
		dracula = new Pelicula("Dracula", "Terror", 9300);
		cisne_negro = new Pelicula("Cisne negro", "Terror", 6600);
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
	public Pelicula(String nombre, String genero, int duracion) {
		super();
		this.nombre = nombre;
		this.genero = genero;
		this.duracion = duracion;
	}
	
	public static String secsToHours(int segundos){
		
		int horas = (int) Math.floor(segundos/3600);
		int parte_entera = (int)segundos/3600;
		int minutos = (int) Math.round((((segundos/3600d)-parte_entera)*60));
		return horas+" horas, "+minutos+" minutos.";
	}
	
	public static int hoursToSecs(int horas, int minutos) {
		int segundos = horas*3600+minutos*60;
		return segundos;
	}
	
	public static void main(String ar[]) {
		//PARA SABER DURACIONES (ORIENTATIVO)
//		System.out.println(hoursToSecs(1, 50));
//		System.out.println(secsToHours(alien.getDuracion()));
		
		//PARA IMPRIMIR LOS NOMBRES (ORIENTATIVO)
//		int cont = 0;
//		for(Pelicula peli : peliculas_totales) {
//			if (cont%4 == 0)
//				System.out.println("\n"+peli.getGenero().toUpperCase());
//			System.out.println(peli.getNombre());
//			cont++;
//		}
	}
}
