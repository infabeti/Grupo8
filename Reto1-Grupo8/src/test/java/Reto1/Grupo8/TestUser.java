package Reto1.Grupo8;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import funciones.User;

public class TestUser {
	private User administrador;
	private String user, password;
	private static ArrayList<User> lista_usuarios = new ArrayList<User>();
	
	
	@Test
	public void testGetPassword() {
		password = "admin";
		administrador= new User("admin","admin");
		String resultado = administrador.getPassword();
		 assertEquals(null, password, resultado);
	}
	
	@Test
	public void testGetUser() {
		user = "admin";
		administrador= new User("admin","admin");		
		String resultado = administrador.getUser();
		assertEquals(null, user, resultado);
	}

	@Test 
	public void testGetAdministrador() {
		administrador= new User("admin","admin");		
		User resultado = User.getAdministrador();
		//assertEquals(null, administrador, resultado);
		assertEquals(administrador, resultado);
	}
	
	@Test
	public void testGetLista_usuarios() {
		administrador= new User("admin","admin");
		ArrayList<User> lista = new ArrayList<User>();
		lista.add(administrador);
		ArrayList<User> resultado = User.getLista_usuarios();
		assertEquals(lista, resultado);
	}
	
	@Test
	public void testSetAdministrador() {
		administrador= new User("admin","admin");
		User.setAdministrador(administrador);
		assertEquals(administrador, User.getAdministrador());
	}
	@Test
	public void testSetPassword() {
		password="admin";
		administrador = new User(null, null);
		administrador.setPassword(password);
		assertEquals(password, administrador.getPassword());
	}
	@Test
	public void testSetUser() {
		user="admin";
		administrador = new User(null, null);
		administrador.setUser(user);
		assertEquals(user, administrador.getUser());
	}
	
	@Test
	public void testSetLista_usuarios() {
		ArrayList<User> lista = new ArrayList<User>();
		lista.add(administrador);
		User.setLista_usuarios(lista);
		assertEquals(lista, User.getLista_usuarios());
	}
}
