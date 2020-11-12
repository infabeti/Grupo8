package funciones;

import java.util.ArrayList;

public class User {
	
	private String user, password;
	private static ArrayList<User> lista_usuarios = new ArrayList<User>();
	private static User administrador;
	
	static{
		administrador= new User("admin","admin"); //creo el administrador en un bloque estático para no depender del main

	}
	public User(String user, String password) {
		this.setUser(user);
		this.password = password;
		lista_usuarios.add(this);
	}
	
	
	
	public static User getAdministrador() {
		return administrador;
	}



	public static void setAdministrador(User administrador) {
		User.administrador = administrador;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public static ArrayList<User> getLista_usuarios() {
		return lista_usuarios;
	}



	public static void setLista_usuarios(ArrayList<User> lista_usuarios) {
		User.lista_usuarios = lista_usuarios;
	}



	public String getUser() {
		return user;
	}



	public void setUser(String user) {
		this.user = user;
	}
}
