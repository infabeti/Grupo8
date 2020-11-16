package test_modelo;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import modelo.Objeto_User;

public class TestObjeto_User {
	private Objeto_User administrador;
	private String user, password;
	private static ArrayList<Objeto_User> lista_usuarios = new ArrayList<Objeto_User>();
	
	
	@Test
	public void testGetPassword() {
		password = "admin";
		administrador= new Objeto_User("admin","admin");
		String resultado = administrador.getPassword();
		 assertEquals(password, resultado);
	}
	
	@Test
	public void testGetUser() {
		user = "admin";
		administrador= new Objeto_User("admin","admin");		
		String resultado = administrador.getUser();
		assertEquals(null, user, resultado);
	}

	@Test 
	public void testGetAdministrador() {
		administrador= new Objeto_User("admin","admin");		
		Objeto_User resultado = Objeto_User.getAdministrador();
		assertEquals(administrador, resultado);
	}
	
	@Test
	public void testGetLista_usuarios() {
		administrador= new Objeto_User("admin","admin");
		ArrayList<Objeto_User> lista = new ArrayList<Objeto_User>();
		lista.add(administrador);
		ArrayList<Objeto_User> resultado = Objeto_User.getLista_usuarios();
		assertEquals(lista, resultado);
	}
	
	@Test
	public void testSetAdministrador() {
		administrador= new Objeto_User("admin","admin");
		Objeto_User.setAdministrador(administrador);
		assertEquals(administrador, Objeto_User.getAdministrador());
	}
	@Test
	public void testSetPassword() {
		password="admin";
		administrador = new Objeto_User(null, null);
		administrador.setPassword(password);
		assertEquals(password, administrador.getPassword());
	}
	@Test
	public void testSetUser() {
		user="admin";
		administrador = new Objeto_User(null, null);
		administrador.setUser(user);
		assertEquals(user, administrador.getUser());
	}
	
	@Test
	public void testSetLista_usuarios() {
		ArrayList<Objeto_User> lista = new ArrayList<Objeto_User>();
		lista.add(administrador);
		Objeto_User.setLista_usuarios(lista);
		assertEquals(lista, Objeto_User.getLista_usuarios());
	}
}
