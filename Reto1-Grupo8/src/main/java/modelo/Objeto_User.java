package modelo;

import java.util.ArrayList;

public class Objeto_User {
	
	private String user, password;
	private static ArrayList<Objeto_User> lista_usuarios = new ArrayList<Objeto_User>();
	private static Objeto_User administrador;
	
	static{
		administrador= new Objeto_User("admin","admin"); //creo el administrador en un bloque estático para no depender del main

	}
	public Objeto_User(String user, String password) {
		this.setUser(user);
		this.password = password;
		lista_usuarios.add(this);
	}
	
	
	
	public static Objeto_User getAdministrador() {
		return administrador;
	}



	public static void setAdministrador(Objeto_User administrador) {
		Objeto_User.administrador = administrador;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public static ArrayList<Objeto_User> getLista_usuarios() {
		return lista_usuarios;
	}



	public static void setLista_usuarios(ArrayList<Objeto_User> lista_usuarios) {
		Objeto_User.lista_usuarios = lista_usuarios;
	}



	public String getUser() {
		return user;
	}



	public void setUser(String user) {
		this.user = user;
	}
}
