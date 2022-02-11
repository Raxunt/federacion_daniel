package entidades;

import java.util.Scanner;


import utils.Datos;


public class Manager {
	private static final String Validacion = null;
	private long id;
	private String telefono;
	private String direccion;

	private DatosPersona persona;

	public Manager(long id, String telefono, String direccion) {
		super();
		this.id = id;
		this.telefono = telefono;
		this.direccion = direccion;
		this.persona = Datos.buscarPersonaPorId(id);
	}

	public Manager(long id, String telefono, String direccion, DatosPersona dp) {
		super();
		this.id = id;
		this.telefono = telefono;
		this.direccion = direccion;
		this.persona = dp;
	}

	public Manager() {
		
	}

	public static Manager nuevoManager() {
		Manager ret = new Manager();
		Scanner teclado;
		teclado = new Scanner(System.in);

		long idManager = 0;
		boolean idManagerValido = false;
		do {
			System.out.println("Introduzca el nombre del Manager");
			idManager = teclado.nextLong();
			//idManagerValido = Validacion.validarIdManager(idManager);
		} while (!idManagerValido);
		ret.setId(idManager);

		
//		teclado.close();
		return ret;
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public DatosPersona getPersona() {
		return this.persona;
	}

}
