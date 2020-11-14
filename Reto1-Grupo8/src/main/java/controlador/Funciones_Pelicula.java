package controlador;

import java.util.ArrayList;

import javax.swing.JTextArea;
import javax.swing.JTextField;

import modelo.Objeto_Pelicula;
import vista.Frame_Generos;
import vista.Frame_Peliculas;

public class Funciones_Pelicula {
//FUNCIONAMIENTO PELICULAS
	
	
	
	private static final Object genero = null;
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
	
	boolean seleccionando_sabado = true;
	public static void addPeli(Objeto_Pelicula added_peli) {
		
		//Manejando el Array
		if(!Funciones_Generos.totales_seleccionadas.isEmpty()) {
			
				if(Funciones_Generos.getDisponible_sabado()>=added_peli.getDuracion()) { // SI LA PELÍCULA CABE EN EL SÁBADO
					boolean genero_repetido = false;
					for(Objeto_Pelicula peli : Funciones_Generos.sabado_seleccionadas) { // SI NO SE REPITE EL GÉNERO

						if(peli.getGenero().equals(added_peli.getGenero())) {
							genero_repetido = true;
							////////////////////////////////////////////////////////7
							System.out.println("Ya hay una película de "+added_peli.getGenero()+" el sábado. No puedes seleccionar otra");
							Frame_Generos.frame_generos.setVisible(true);
							Frame_Generos.frame_pelis.dispose();
						}
					}
					
					if(!genero_repetido) 
						addingPeli(added_peli,"sabado");
					
				}
				else {
					if(Funciones_Generos.getDisponible_domingo()>=added_peli.getDuracion()) { // SI LA PELÍCULA CABE EN EL DOMINGO
						boolean genero_repetido = false;
						for(Objeto_Pelicula peli : Funciones_Generos.domingo_seleccionadas) { // SI NO SE REPITE EL GÉNERO
							if(peli.getGenero().equals(added_peli.getGenero())) {
								genero_repetido = true;
								////////////////////////////////////////////////////////7
								System.out.println("Ya hay una película de "+added_peli.getGenero()+" el domingo. No puedes seleccionar otra");
								Frame_Generos.frame_generos.setVisible(true);
								Frame_Generos.frame_pelis.dispose();
							}
						}
						if(!genero_repetido) 
							addingPeli(added_peli,"domingo");
	
					}

				}
			
				/////////////////////////////////////////////////////////////////////////
				Funciones_Generos.totales_seleccionadas.add(added_peli);
				Frame_Generos.frame_generos.setVisible(true);
				Frame_Generos.frame_pelis.dispose();
				
		}
		else {
			addingPeli(added_peli,"sabado");
			Funciones_Generos.totales_seleccionadas.add(added_peli);
			Frame_Generos.frame_generos.setVisible(true);
			Frame_Generos.frame_pelis.dispose();
			
		}

	}
	
	public static void addingPeli(Objeto_Pelicula added_peli, String dia) {
		//Calculando tiempo restante
		Funciones_Generos.calcularDisponible(added_peli, dia);
		int tiempo_restante;
		String pelis_seleccionadas, str_tiempo_restante;
		JTextField tiempoDia, tiempoPeliDia;
		JTextArea programacion;
		ArrayList<Objeto_Pelicula> lista_dia;
		if(dia.equalsIgnoreCase("sabado")) {
			tiempo_restante = Funciones_Generos.getDisponible_sabado();
			pelis_seleccionadas = Frame_Generos.peliculasVistasSabado.getText();
			tiempoDia = Frame_Generos.tiempoSabado;
			programacion = Frame_Generos.peliculasVistasSabado;
			lista_dia = Funciones_Generos.sabado_seleccionadas;
			tiempoPeliDia = Frame_Peliculas.tf_disponible_sabado;
		}
		else {
			tiempo_restante = Funciones_Generos.getDisponible_domingo();
			pelis_seleccionadas = Frame_Generos.peliculasVistasDomingo.getText();
			tiempoDia = Frame_Generos.tiempoDomingo;
			programacion = Frame_Generos.peliculasVistasDomingo;
			lista_dia = Funciones_Generos.domingo_seleccionadas;
			tiempoPeliDia = Frame_Peliculas.tf_disponible_domingo;
		}
		//Escribiendo
		
		str_tiempo_restante = secsToHours(tiempo_restante);
		tiempoDia.setText(str_tiempo_restante);
		tiempoPeliDia.setText(str_tiempo_restante);
		programacion.setText(pelis_seleccionadas+added_peli.getGenero()+": "+added_peli.getNombre()+"\n");
		lista_dia.add(added_peli);
		
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
