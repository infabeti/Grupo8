package funciones;

import java.util.ArrayList;

import ventanas.Frame_Generos;
import ventanas.Frame_Peliculas;

public class Pelicula {
//FUNCIONAMIENTO PELICULAS
	
	public static ArrayList<Pelicula> peliculas_totales = new ArrayList<Pelicula>();
	//Drama
	public static Pelicula handia,lista_Schindler, cadena_perpetua, mdb;
	//Sci-Fi
	public static Pelicula space_odyssey,novia_Frankenstein, planeta_simios, alien;
	//Comedia
	public static Pelicula scary_movie,gran_lebowski, vida_brian, aterriza_como_puedas;
	//Terror
	public static Pelicula psicosis,el_resplandor, dracula, cisne_negro;

	
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
		//Utilizando el teorema del resto:
		int minutos = (int) Math.round((((segundos/3600d)-parte_entera)*60));
		return horas+" horas, "+minutos+" minutos.";
	}
	
	public static int hoursToSecs(int horas, int minutos) {
		int segundos = horas*3600+minutos*60;
		return segundos;
	}
	public static int hoursToSecs(String horas_y_minutos) {
		//Sacar hora de la cadena
		String hora_str = horas_y_minutos.substring(0,1);
		int horas_int = Integer.valueOf(hora_str);
		
		//Sacar minuto de la cadena
		int indice_inicio = horas_y_minutos.indexOf(", ")+2;
		int indice_final = horas_y_minutos.indexOf("minutos")-1;
		String minuto_str = horas_y_minutos.substring(indice_inicio,indice_final);
		int minutos_int = Integer.valueOf(minuto_str);		
		//Hacer la operación
		int segundos = horas_int*3600+minutos_int*60;
		return segundos;
	}
	public static void addPeli(Pelicula added_peli) {
		//Calculando tiempo restante
		String pelis_Sabado = Frame_Generos.peliculasVistasSabado.getText();
		int tiempo_actual = hoursToSecs(Frame_Generos.tiempoSabado.getText());
		int tiempo_peli = added_peli.getDuracion();
		int tiempo_restante = tiempo_actual-tiempo_peli;
		
		//Escribiendo en el JTextArea
		String str_tiempo_restante = secsToHours(tiempo_restante);
		Frame_Generos.tiempoSabado.setText(str_tiempo_restante);
		Frame_Generos.peliculasVistasSabado.setText(pelis_Sabado+added_peli.nombre+"\n"); //SUGERENCIA CAMBIARLO, EL ARRAY DE PELIS DE LA PROGRAMACIÓN NO TIENE NADA QUE VER CON EL TIMPO DISPONIBLE, DEBERÍAN ESTAR RELACIONADOS

		///////////////////////
		//Manejando el Array
		if(!Generos.sabado_seleccionadas.isEmpty()) {
			for(Pelicula peli : Generos.sabado_seleccionadas) {
				if(peli.genero.equals(added_peli.genero)) {
					System.out.println("No puedes seleccionar más de una película del mismo género");
					Frame_Generos.frame_generos.setVisible(true);
					Frame_Generos.drama.dispose();
				}
				else {
					Generos.sabado_seleccionadas.add(added_peli);
					Frame_Generos.frame_generos.setVisible(true);
					Frame_Generos.drama.dispose();
				}
			}
		}
		else {
			Generos.sabado_seleccionadas.add(added_peli);
			Frame_Generos.frame_generos.setVisible(true);
			Frame_Generos.drama.dispose();
			
		}

	}
	
	public static void main(String ar[]) {
		//PARA SABER DURACIONES (ORIENTATIVO)
//		System.out.println(hoursToSecs(2, 39));
//		System.out.println(secsToHours(alien.getDuracion()));
//		System.out.println(hoursToSecs("2 horas, 39 minutos."));
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
